import java.util.*;

class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("1.ADD");
		System.out.println("2.Substract");
		System.out.println("3.Multiply");
		System.out.println("4.Divide");
		System.out.println("5.Modular");
		System.out.println("choose the operation:");
		// storing the what they can perform operation
		int option = sc.nextInt();
		
		// read first number and second number
		System.out.println("enter first number:");
		double first = sc.nextDouble();
		// read the second number 
		
		System.out.println("enter second number: ");
		double second = sc.nextDouble();
		
		double result;
		// given an input parametares are perform some oprations which type of op can
		// perform
		switch (option) {
		case 1:
			result = add(first, second);
			System.out.printf("%.2f + %.2f = %.2f%n", first, second, result);
			break;
		case 2:
			result = substract(first, second);
			System.out.printf("%.2f - %.2f = %.2f%n", first, second, result);
			break;
		case 3:
			result = multiply(first, second);
			System.out.printf("%.2f * %.2f = %.2f%n", first, second, result);
			break;
		case 4:
			try {
				result = divide(first, second);
				System.out.printf("%.2f / %.2f = %.2f%n", first, second, result);
			} catch (ArithmeticException e) {
				System.err.println("Cannot divide by 0.");
			}
			break;
		case 5:
			result = modular(first, second);
			System.out.printf("%.2f + %.2f = %.2f%n", first, second, result);
			break;
		default:
			System.out.println("invalid input ");

		}

	}

	// i want to write methods to perform actions like add sub
	public static double add(double x, double y) {
		return x + y;
	}

	public static double substract(double x, double y) {
		return x - y;
	}

	public static double multiply(double x, double y) {
		return x * y;
	}

	public static double divide(double x, double y) {
		if (y == 0) {
			throw new ArithmeticException("con't devide by 0");
		} else {
			return x / y;
		}

	}

	public static double modular(double x, double y) {
		return x % y;
	}

}
