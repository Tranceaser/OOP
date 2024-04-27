import javax.swing.JOptionPane;

public class Exercise5 {
	public static void main(String[] args) {
		String strNum1, strNum2;

		strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number",
				JOptionPane.INFORMATION_MESSAGE);

		strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ", "Input the second number",
				JOptionPane.INFORMATION_MESSAGE);

		double num1 = Double.parseDouble(strNum1);
		double num2 = Double.parseDouble(strNum2);

		double sum, difference, product, quotient;

		sum = num1 + num2;
		difference = Math.abs(num1 - num2);
		product = num1 * num2;

		JOptionPane.showMessageDialog(null, "Sum of two number is: " + sum, "Sum of two number",
				JOptionPane.INFORMATION_MESSAGE);

		JOptionPane.showMessageDialog(null, "Difference between two number is: " + difference,
				"Difference between two number", JOptionPane.INFORMATION_MESSAGE);

		JOptionPane.showMessageDialog(null, "Product of two number is: " + product, "Product of two number",
				JOptionPane.INFORMATION_MESSAGE);

		if (num2 == 0) {
			JOptionPane.showMessageDialog(null, "Divisor ERROR", "Quotient of two number",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			quotient = num1 / num2;
			JOptionPane.showMessageDialog(null, "Quotient of two number is: " + quotient, "Quotient of two number",
					JOptionPane.INFORMATION_MESSAGE);
		}

		System.exit(0);
	}
}
