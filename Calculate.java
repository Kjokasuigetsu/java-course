public class Calculate {
	public static void main(String[] arg) {
		System.out.println("Calculate...");
		int first = Integer.valueOf(arg[0]);
		int second = Integer.valueOf(arg[1]);
		int sum = first + second;
		int chastnoe = first - second;
		double umn = first * second;
		double del = first / second;
		System.out.println("Sum: " + sum);
		System.out.println("Chastnoe: " + chastnoe);
		System.out.println("Umnojenie: " + umn);
		System.out.println("Delenie: " + del);
	}
}