package util;

import java.util.Scanner;
import java.util.Locale;

public class AndreLSVieira {

	public static void main(String[] args) {
		Scanner an = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.println("ENTER THE N� OF PEOPLE TO BE MEAS. AND THE AGE RANGE REQUIRED: ");

		int pip = an.nextInt();
		int ag = an.nextInt();
		int age = ag;

		double[] vect = new double[pip];
		System.out.println("ARE YOU AT THE MINIMUM AGE TO PARTICIPATE IN THE SURVEY, (Y/N)? ");
		char response = an.next().charAt(0);
		if (response == 'y') {
			System.out.println("ENTER THE NUMBER OF HEIGHTS TO BE MEASURED: ");

			for (int i = 0; i < pip; i++) {

				vect[i] = an.nextDouble();
			}
		} else {
			System.out.println("ONLY PERSONS OVER THE AGE OF 18 ARE ALLOWED. ");
		}

		double sum = 0.0;
		for (int i = 0; i < pip; i++) {
			sum += vect[i];
		}

		double avg = sum / pip;
		if (avg < 1.00 && avg >= 0.43) {
			System.out.printf("AGE: %d STATURE TOO LOW: %.2f\n", age, avg);
		} else if (avg < 1.80 && avg > 0.50) {
			System.out.printf("AGE: %d AVERAGE HEIGHT: %.2f%n", age, avg);
		} else if (avg >= 1.80 && avg < 2.50) {
			System.out.printf("AGE: %d VERY TALL STATURE: %.2f%n", age, avg);
		} else {
			System.out.println("THANK YOU FOR YOUR PARTICIPATION ");
		}
		an.close();

	}

}
