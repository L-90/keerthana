package set3;

public class Stringreverse {

	
	public static void main(String[] args) {
		String stroriginal="HelloWorld";
		System.out.println("originalStirng:"+stroriginal);
		stroriginal=new StringBuffer(stroriginal).reverse().toString();
		System.out.println("Reversed string is"+stroriginal);
	}
}