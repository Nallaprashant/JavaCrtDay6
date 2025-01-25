package crt6;

public class StringSwapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name1 = "Ram";
		String name2 = "Arun";
		System.out.println("Before Swapping....");
		System.out.println("name1------"+name1);
		System.out.println("name2------"+name2);
		
		
		name2 = name2+name1;//amArun
		name1 = name2.substring(0, name2.length()-name1.length());//arun
		name2 = name2.substring(name1.length());
		
		
	   System.out.println("Afters Swapping....");
		System.out.println("name1------"+name1);
		System.out.println("name2------"+name2);
		
		
		
		
	}

}