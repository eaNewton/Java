public class Addit {
	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("Usage: java Addit <num1> <num2>");
			return;
		}
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int sum = num1 + num2;
		System.out.println(sum);
	}
}