public class FeeCalculator {
	public static void main(String[] args) {
		while (true) {
			System.out.print("Enter number of checks: ");
			int number = Integer.parseInt(System.console().readLine());
			if (number < 20) {
				double fees1 = number * .10;
				System.out.println("Monthly fee: $" + fees1);
			} else if (number >= 20 && number <= 39) {
				double fees2 = number * .08;
				System.out.println("Monthly fee: $" + fees2);
			} else if (number >= 40 && number <= 59) {
				double fees3 = number * .06;
				System.out.println("Monthly fee: $" + fees3);
			} else {
				double fees4 = number * .04;
				System.out.println("Monthly fee: $" + fees4);
			}
		}
	}
}