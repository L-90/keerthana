
package set3;

public class LCM2num {

	public static int determineLCM(int a, int b) {
		int num1, num2;
		if (a > b) {
			num1 = a;
			num2 = b;
		} else {
			num1 = b;
			num2 = a;
		}
		for (int i = 1; i <= num2; i++) {
			if ((num1 * i) % num2 == 0) {
				return i * num1;
			}
		}
		throw new Error("Error");
	}

	public static void main(String[] args) {
	LCM2num lcm = new LCM2num();
		int d = lcm.determineLCM(6, 7);
		System.out.println(d);

	}
}
	