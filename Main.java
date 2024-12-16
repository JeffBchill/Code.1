class Main
	public static void main(String[]) {
		{new Main()).init();
	}
	
	void print(Object o) { System.out.println(o); }
	void print(Object o) { System.out.println(o); }
	
	void init() {
	
		String phrase = "Help";
		String level1 = encode(phrase);
		String level2 = reverse(level1);
	
		char[] origin = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', ', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		char[] basic_latin = {'0x0000', '0x0001', '0x0002', '0x0003', '0x0004', '0x0005', '0x0006', '0x0007', '0x0008', '0x0009', '0x0010', '0x0011', '0x0012', '0x0013', '0x0014', '0x0015', '0x0016', '0x0017', '0x0018', '0x0019', '0x0020', '0x0021', '0x0022', '0x0023', '0x0024', '0x0025', '0x0026'};
		String level3 = subEncrypt(level2.toUpCase(), origin, basic_latin);
	
		print("origin: + phrase
		print("Level 1 (Shift +2): " +level1);
		print("Level 2 (Reverse): " +level2);
		print("Level 3 (Substitude to Basic Latin): " +level3);
		
		String dc3 = subEncrypt(level3, basic_latin, origin);
		String dc2 = reverse(dc3);
		String dc1 = reverse(dc2);
		print("Decrypted (Level 3 -> Level 2 -> Level: " + dc1);
		String encode(String txt) {
			String bid = "";
			int ascii;
			char ch = '\0';
			for (int x = 0; x <= txt.length() - 1; x++) {
				ch = txt.charAt(x);
					ascii = (int) ch;
					ascii += 2;
					bid += (char) ascii;
				} else {
					bid += ch;
				}
			}
			return bid;
	}
	
	String dc(String txt) {
		String bid = "";
		int ascii;
		char ch = '\0';
		for (int x = 0; x <= txt.length() - 1; x++ {
		ch=txt.charAt(x);
		ascii=(int)ch;
		ascii-=1;
		bld+= (char)ascii;
		}
	return bld;
	}
	
	String subEncryption(String s, char[] sub, char[] sub2){
    String bld="";
    char ch ='\0';
    int index=0;
    for(int x=0; x<=s.length()-1; x++){
      ch=s.charAt(x);
      index=indexOf(ch,sub);
      if(index!=-1){
        bld+=sub2[index];
      }
      else{
        bld+=ch;
      }
    }
    return bld;
  }
  
  int indexOf(char ch, char[] arry){
    for(int x=0; x<=arry.length-1; x++){
      if(arry[x]==ch){
        return x;
      }
    }
    return -1;
  }
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}