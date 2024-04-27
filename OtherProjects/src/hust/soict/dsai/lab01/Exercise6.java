import java.util.Scanner;

public class Exercise6 {
	// First degree equation
	public static String firstDegreeEquation(float a, float b) {
		if (a == 0) {
			if (b == 0) {
				return "Infinity solution !";
			} else {
				return "The equation has no solution !";
			}
		} else {
			double result = (-b) / a;
			String finalResult = Double.toString(result);
			return finalResult;
		}
	}

	// First degree system equation
	public static void firstDegreeSystem(float a11, float a12, float a21, float a22, float b1, float b2) {
		float detA = (a11 * a22) - (a21 * a12);
		if (detA == 0) {
			if (a11 / a21 == a12 / a22 && a11 / a21 == b1 / b2) {
				System.out.println("INFINITY SOLUTION");
			} else {
				System.out.println("NO SOLUTION");
			}
		} else {
			double dbX, dbY;
			dbX = (b1 * a22 - b2 * a12) / detA;
			dbY = (b2 * a11 - b1 * a21) / detA;

			String x, y;
			x = Double.toString(dbX);
			y = Double.toString(dbY);

			System.out.println("x = " + x + "|" + "y = " + y);
		}
	}

	// Second degree equation
	public static void secondDegreeEquation(float a, float b, float c) {
		float delta;
		delta = b * b - 4 * a * c;

		if (delta < 0) {
			System.out.println("The equation has no solution !!");
		}
		if (delta == 0) {
			System.out.println("The equation has uniqe solution x = " + (-b / (2 * a)));
		}
		if (delta > 0) {

			System.out.println("x1 = " + ((-b + Math.sqrt(delta)) / (2 * a)));
			System.out.println("x2 = " + ((-b - Math.sqrt(delta)) / (2 * a)));
		}

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int type;

		System.out.println("What is your equation type ?");
		System.out.print("type = ");
		type = scanner.nextInt();

		if (type == 1) {
			float a, b;

			System.out.print("a = ");
			a = scanner.nextFloat();
			System.out.print("b = ");
			b = scanner.nextFloat();

			System.out.println("x = " + firstDegreeEquation(a, b));
		}
		if (type == 2) {
			float a11, a12, a21, a22, b1, b2;

			System.out.print("a11 = ");
			a11 = scanner.nextFloat();
			System.out.print("a12 = ");
			a12 = scanner.nextFloat();
			System.out.print("a21 = ");
			a21 = scanner.nextFloat();
			System.out.print("a22 = ");
			a22 = scanner.nextFloat();
			System.out.print("b1 = ");
			b1 = scanner.nextFloat();
			System.out.print("b2 = ");
			b2 = scanner.nextFloat();

			firstDegreeSystem(a11, a12, a21, a22, b1, b2);
		}
		if (type == 3) {
			float a, b, c;
			System.out.print("a = ");
			a = scanner.nextFloat();
			System.out.print("b = ");
			b = scanner.nextFloat();
			System.out.print("c = ");
			c = scanner.nextFloat();

			secondDegreeEquation(a, b, c);
		}
		scanner.close();
	}

}
