package com.norton.array;

import java.util.Scanner;

/**
 * 
 * @author EOturakci
 *
 */

public class Arrayler {

	public static void main(String[] args) {
		// int AnArray[] = new int[5];
		// for (int i = 0; i < AnArray.length; i++) {
		// AnArray[i] = (int) Math.pow(i, 2);
		// }
		//
		// for (int i = 0; i < AnArray.length; i++) {
		// System.out.println(AnArray[i]);
		// }
		//

		Scanner oku = new Scanner(System.in);

		double[] AnArrayDouble = new double[3];

		for (int i = 0; i < AnArrayDouble.length; i++) {
			AnArrayDouble[i] = oku.nextDouble();
		}

		for (int i = 0; i < AnArrayDouble.length; i++) {
			System.out.println(AnArrayDouble[i]);
		}

	}

}
