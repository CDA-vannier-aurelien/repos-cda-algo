package mots;



public class MotsUtils {//test

	public static String inverser(String str) {

//		char[] tabSwap = new char[str.length()];
//		
//		int j = tabSwap.length - 1;
//		
//		char x;
//
//		for (int i = 0; i < tabSwap.length; i++) { /*
//													 * Mettre string dans un tableau
//													 */
//			tabSwap[i] = str.charAt(i);
//		}
//
//		for (int i = 0; i < j;) {
//
//			x = tabSwap[i];
//			tabSwap[i] = tabSwap[j];
//			tabSwap[j] = x;
//		
//			i++;							// comme on ne peut pas mettre trop de chose dans le for on peut mettre
//			j--;							// les incrémentations et décrémentations à la fin du bloc	
//		}
//
//		String str2 = Arrays.toString(tabSwap);
//		
//		
////		
		String str2 = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			str2 = str2 + str.charAt(i);

		}
		return str2;
	}

	public static String caracteresCommuns(String str, String str2) {
		String str3 = "";

//		if (str.length() <= str2.length()) {
//			x = str;
//			str = str2;
//			str2 = x;
//		}
		for (int i = 0; i <= str.length() - 1; i++) {
			System.out.println("1 - i : " + i);
			for (int j = 0; j <= str2.length() - 1; j++) {
				System.out.println("2 - j : " + j);
//				boolean jePasse = false;
//				for (int k = 0; k <= str3.length() - 1; k++) {
//					System.out.println("3 - k : "+k);
//					System.out.println("4 - i : " + i);
//					System.out.println("5 - str3 :" + str3);
//					if(i>=str.length()) {
//						jePasse = true;
//						break;
//					}
//					if (str.charAt(i) == str3.charAt(k)) {
//						i++;
//						jePasse = true;
//						break;
//					}
//					
//
//				}
				char caractereEnCoursPremierMot = str.charAt(i);
				char caractereEnCoursDeuxiemeMot = str2.charAt(j);

				boolean existeDeja = str3.indexOf(caractereEnCoursPremierMot) != -1;

				if (caractereEnCoursPremierMot == caractereEnCoursDeuxiemeMot && !existeDeja) {
					str3 = str3 + str.charAt(i);
					break;

				}
			}
		}

		return str3;
	}

	public static boolean estUnPalindrome(String str) {

		boolean estUnPalyndrome = true;
		int j = str.length() - 1;

		for (int i = 0; i < j;) {
			if (str.charAt(i) == str.charAt(j)) {
				estUnPalyndrome = true;
			} else {
				estUnPalyndrome = false;
			}
			i++;
			j--;
		}
		return estUnPalyndrome;
	}

	public static int sommeChiffresDansMot(String str) {
		int resultat = 0;

		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {

				String digit = Character.toString(str.charAt(i));
				resultat += Integer.parseInt(digit);
			}
		}
		return resultat;
	}

	/**
	 * créer une methode qui prend en parametre un entier strictement positif et qui
	 * affiche ceci si parametre est 4 alors affiche 83 si parametre est 11 alors
	 * affiche 2210 si parametre est 23 alors affiche 4622
	 * 
	 * 
	 * réponse est n le nombre. n*2puisn-1
	 */

	public static String devinette(int a) {

		int b = a * 2;
		int c = a - 1;
		String str = Integer.toString(b);
		String str2 = Integer.toString(c);

		String str3 = str + str2;
		return str3;
	}

	public static String devinerAlgo(int a) {
		String str = Integer.toString(a);
		return str;
	}

//	public static int binaire(String str) {
//
//		int[] tabInt = new int[str.length()];
//		int j = 0;
//
//		for (int i = str.length() - 1; i >= 0; i--) {
//			tabInt[j] = Character.getNumericValue(str.charAt(i));
//			j++;
//			System.out.println(Arrays.toString(tabInt));
//		}
//		for (int i = 0; i < tabInt.length; i++) {
//			tabInt[i] = tabInt[i] * (int)(2.Math.pow(i));
//		}
//		int a = CalculatriceTableau.sommeElements(tabInt);
//		return a;
//	}

	public static long sommeUnicodes(String str) {
		long unicode = 0;
		for (int i = 0; i < str.length(); i++) {
			unicode += Character.getNumericValue(str.charAt(i));
		}
		return unicode;
	}

	public static String exercice29(int parama, int paramb) {
		String str = "";
		int i = 1;
		while (i <= paramb) {
			if (parama % 2 == 0) {
				parama--;
			} else {
				str += parama+2+", ";
				parama += 2;
				i++;
			}
		}

		return str;
	}
	
////	 Méthode 30 algoBizarre T=somme de tous les chiffres E=somme des entiers, D = Somme des décimales
//	public static String algoBizarre(float a) {
//		String chaine = Float.toString(a);
//		String chaine2 = "";
//		String chaine3 = "";
//		int total = 0;
//		int totalEntiers = 0;
//		int totalDecimales = 0;
//		int index = chaine.indexOf('.');
//
//		for (int i = 0; i < index; i++) {
//			chaine2 += chaine.charAt(i);
//			totalEntiers = MotsUtils.sommeChiffresMotInt(chaine2);
//		}
//		for (int i = index + 1; i < chaine.length(); i++) {
//			chaine3 += chaine.charAt(i);
//			totalDecimales = MotsUtils.sommeChiffresMotInt(chaine3);
//			System.err.println(totalDecimales);
//		}
//		total = totalEntiers + totalDecimales;
//		return "T" + total + "E" + totalEntiers + "D" + totalDecimales;
//	}
//	si paramètre est 'iDp' alors affiche 9416
//	si paramètre est 'BaA' alors affiche 211
//	si paramètre est 'AfPa' alors affiche 16161
//	si paramètre est 'Za' alors affiche 261
	// Méthode 31 lettre --> position dans l'alphabet a ou A = 1; b=2 c=3...

	public static String algoAlphabet(String mot) {
		mot = mot.toLowerCase();
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String resultat = "";
		for (int i = 0; i < mot.length(); i++) {
			resultat += alphabet.indexOf(mot.charAt(i)) + 1;
		}
		return resultat;
	}
//Exo32
//	si paramètre est aze3rt alors affiche azerrrt
//	si paramètre est 2abc1f alors affiche aabcf
//	si paramètre est xE3 alors affiche xE
//	si paramètre est a12b alors affiche abbbbbbbbbbbb
//	si paramètre est e4Ry alors affiche eRRRRy

	public static String alphaNum(String mot) {
		String result = "";
		String nombre = "";
		for (int i = 0; i < mot.length() - 1; i++) {
			if (Character.isDigit(mot.charAt(i))) {
				nombre += mot.charAt(i);

				for (int j = 0; j < Character.getNumericValue(mot.charAt(i)); j++) {
					result += mot.charAt(i + 1);
				}
			}

			result += mot.charAt(i);
		}
		return result;
	}

	// Exo33 Affichage des étoiles

	public static String affichageEtoiles(int a) {
		String res = "";
		String saut = "\n";
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a - i; j++) {
				res += "*";
			}
			res += saut;
		}
		return res;
	}

	// Méthode EXO23 afficherNombreOccurence
	public static void afficherNombreOccurence(String mot) {
		// Fonctionne mais affiche a=5 a=4 a=3....

		mot = mot.toLowerCase();
		int cpt = 1;
		String test = "";
		for (int i = 0; i < mot.length(); i++) {
			if (test.indexOf(mot.charAt(i)) == -1) {

				for (int j = i + 1; j < mot.length(); j++) {
					if (mot.charAt(i) == mot.charAt(j)) {
						cpt++;
						// Utiliser indexOf == -1
					}
				}
			}
			System.out.println(mot.charAt(i) + " : " + cpt);
			cpt = 1;
		}

	}
}