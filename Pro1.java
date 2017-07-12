package guvi;

public class Pro1 {
	public void call(int a,int b,double c){
		double vol;
		vol=a*b*c;
		System.out.println("volume is"+vol);
	}
	public static void main(String[] args){
		Pro1 s=new Pro1();
		s.call(30,40,8.9);
		
	}
}
