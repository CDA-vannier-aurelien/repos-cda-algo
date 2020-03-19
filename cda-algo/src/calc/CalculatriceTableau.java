package calc;

import java.util.Arrays;

public class CalculatriceTableau {

	public static int sommeElements(int[] tabInt) {
		int somme = 0;
		for (int i = 0; i < tabInt.length; i++) {
			somme = somme + tabInt[i];
		}
		return somme;

	}

	public static int plusPetitElement(int[] tabInt) {

		int a = tabInt[0];
		int petit = 0;
		for (int i = 1; i < tabInt.length; i++) {
			if (a > tabInt[i]) {
				a = tabInt[i];
			}
			petit = a;
		}
		return petit;
	}

	public static long sommeElementsDeuxTableaux(int[] tabInt, int[] tabInt2) {
//			Version longue
//		long somme = 0;
//		for (int i = 0; i < tabInt.length; i++) {
//			somme = somme + tabInt[i];
//		}
//
//		long somme2 = 0;
//		for (int i2 = 0; i2 < tabInt2.length; i2++) {
//			somme2 = somme2 + tabInt2[i2];
//		}
//		long somme3 = somme + somme2;
//		return somme3;
		// Version courte

		return CalculatriceTableau.sommeElements(tabInt) + CalculatriceTableau.sommeElements(tabInt2);

	}

	public static int[] triAscendant2(int[] tabInt) {
		Arrays.parallelSort(tabInt);
		return tabInt;
	}
	
//	public static String triAscendant(int[] a) {	// Solution de wei très bien
//	    int i;
//	    int j;
//	    for (i = 0; i < 5; i++) {
//	        for (j = (i + 1); j < 5; j++) {
//	            if (a[i] > a[j]) {
//	                a[j] = a[j] + a[i];
//	                a[i] = a[j] - a[i];
//	                a[j] = a[j] - a[i];
//	            }
//	        }
//	    }
//	    return (Arrays.toString(a));
//	}

	public static int[] triAscendant(int[] tabInt) {

		for (int i = 0; i < tabInt.length; i++) {
			int x = 0;
			int j = 0;
			while (j < tabInt.length) {
				if (tabInt[i] < tabInt[j]) {
					x = tabInt[j];
					tabInt[j] = tabInt[i];
					tabInt[i] = x;
				}
				j++;
			}
		}
		return tabInt;
	}
	public static int[] triAscendantDeuxTableaux(int[] tabInt, int[] tabInt2) {
		int[] tabInt3 = new int[tabInt.length + tabInt2.length];

		for (int a = 0; a < tabInt.length; a++) {
			tabInt3[a] = tabInt[a];
		}

		for (int b = 0; b < tabInt2.length; b++) {
			tabInt3[b + tabInt2.length] = tabInt2[b];
		}

		tabInt3= CalculatriceTableau.triAscendant(tabInt3);
		return tabInt3;
	}

	public static boolean conjonction(boolean[] tabBool) {
		boolean a = true;
		for (int i = 0; a && i < tabBool.length; i++) { // a&&i permet de sortir dès que a est false
			a = a && tabBool[i]; // encore mieux on écrit a&=tabBool[i];
		}
		return a;
	}

	public static boolean conjonction2(boolean[] tabBool) {
		for (int i = 0; i < tabBool.length; i++) {
			if (!tabBool[i])
				;
		}
		return false;
	}

	public static long nombreDElementsPair(int[] tabInt) {
		long a = 0;

		for (int i = 0; i < tabInt.length; i++) {
			if (tabInt[i] % 2 == 0) {
				a++;
			}
		}
		return a;
	}

	public static boolean chercheSiUnElementExiste(int param, int[] tabInt) {

		boolean a = true;

		for (int i = 0; i < tabInt.length; i++) {
			a = (param == tabInt[i]);
			if (a) {
				break;
			}
		}
		return a;
	}

	public static int[] mettreZeroDansLesCasesAIndicesImpair(int[] tabInt) {

		for (int i = 0; i < tabInt.length; i++) {
			if (i % 2 == 1) {
				tabInt[i] = 0;
			}
		}
		return tabInt;
	}

	public static int[] decalerLesElementsTableauDUneCase(int[] tabInt) {

		int c = tabInt[tabInt.length - 1];
		int[] tabInt2;
		tabInt2 = new int[tabInt.length];
		int i = 0;

		while (i < tabInt.length - 1) {
			tabInt2[i + 1] = tabInt[i];
			i++;
		}
		tabInt2[0] = c;
		return tabInt2;
	}
}