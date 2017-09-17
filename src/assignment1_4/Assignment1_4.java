package assignment1_4;

import java.util.Scanner;

/**
 * @author MANJUNATH, This class is to implement type casting between different
 *         variables.
 */

public class Assignment1_4 {

	public static void main(String[] args) {
		// Main method starts
		// TODO Auto-generated method stub
		byte b;
		short s;
		int i;
		long l;
		float f;
		double d;

		Scanner input = new Scanner(System.in); // Taking input from the user through console

		System.out.println("Enter the BYTE variable");
		b = input.nextByte();

		System.out.println("Enter the SHORT variable");
		s = input.nextShort();

		i = b + s;
		System.out.println("Integer value - Sum of Byte and Short:: \n" + i); // Displays Int value

		l = s + i;
		System.out.println("Long value - Sum of Short and Int:: \n" + l); // Displays LONG value

		f = i + l;
		System.out.println("Float Value - Sum of Int and Long:: \n" + f); // Displays FLOAT value

		d = l + f;
		System.out.println("Double Value - Sum of Long and Float:: \n" + d); // Displays Double value

		input.close();
	}

}
