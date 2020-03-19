package calc;

import java.util.Random;

public class Calculatrice {
	public static int addition(int x, int y) {
		return x + y;
	}

	public static int soustraction(int x, int y) {
		return x - y;
	}

	public static int multiplication(int x, int y) {
		return x * y;
	}

	public static int max(int x, int y) {
		if (x < y)
			;
		return x;
	}

	public static char signe(int x) {
		if (x < 0) {
			return '-';
		}
		return '+';
	}

	public static long factorielle(int x) {
//		int i = 1;
//		long n = 1;
//		do {
//			n = n * i;
//			i++;
//		} while (i < x + 1);
//		return n;

		long n = 1;
		for (int i = 1; i < x + 1; i++) {
			n = n * i;
		}
		return n;
	}

	public static boolean conjonction(boolean a, boolean b) {
		return a && b;
	}

	public static boolean disjonction(boolean a, boolean b) {
		return a || b;
	}

	public static boolean negation(boolean a) {
		return !a;
	}
	
	public static int aleatoireInferieur(int a) {
//		int result = (int) (a * Math.random());
//		return result;
//	}
		Random nombreAlea = new Random();
		int test;
		do {
			test = nombreAlea.nextInt();
		} while (test > a);
		return test;
	}

}
