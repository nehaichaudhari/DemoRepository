package com.string1;

public class StringMethods {
	public static void main(String[] args) {
		String str="java is fun.";//0,1,2,3,4=5
		System.out.println(str.length());
		System.out.println(str.length()-1);//in array length is the property and in string it is a function
		
		//charAt- perticular index la kuthl character aahe
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(str.length()-1));
		
		//concate and +
		String s1="hello";
		String s2 = "world";
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		
		//substring- string part
		System.out.println(str.substring(1));
		System.out.println(str.substring(1,6));
		
		//contains- is it present or not
		System.out.println(str.contains("ava"));
		System.out.println(str.contains("orl"));
		
		String w1 = "hi";
		String w2 = "Hi";
		System.out.println(w1==w2);
		System.out.println(w1.equals(w2));
		
		System.out.println(w1.equalsIgnoreCase(w2));
		
		//uppercase lowercase
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		
		//indexOf, lastIndexOf
		System.out.println(str.indexOf('a'));
		System.out.println(str.lastIndexOf('a'));
		System.out.println(str.indexOf("fun"));
		
		//isEmpty
		System.out.println(str.isEmpty());
		
		String s="";
		System.out.println(s.isEmpty());
		
		//trim
		String st = " java   ";
		System.out.println(st.length());
		
		st = st.trim();
		System.out.println(st+st.length());
		
		//compareTo-- return int
		// it will return difference
		//equals : boolean : true/false
		
		System.out.println("Shivani".compareTo("Shivani"));//return 0
		System.out.println("Megha".compareTo("Neetu"));//M<N by 1 then -1
		System.out.println("Neetu".compareTo("Megha"));//N<M by -1 then 1
		System.out.println("Megha".compareTo("Parul"));//-2
		//positive if 1st ascii char is greater
		//negative if 1st ascii is smaller
		//same then 0
		//also called as lexographical comparison
		
		String a1="Java";
		String a2 = "Phython";
		System.out.println(a1.length()>a2.length());
		System.out.println(a1.compareTo(a2));
		System.out.println(a1.compareTo(a2)>0);
	}

}
