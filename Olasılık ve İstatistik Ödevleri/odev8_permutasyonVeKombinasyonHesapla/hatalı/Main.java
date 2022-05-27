package odev8_permutasyonVeKombinasyonHesapla;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// n sayısını belirleyelim
		Scanner reader = new Scanner(System.in);
		System.out.print("n Sayısını Girin: ");
		double n = reader.nextInt();
		System.out.println("n sayısı= " + n);

		// r sayısını belirleyelim
		Scanner reader2 = new Scanner(System.in);
		System.out.print("r Sayısını Girin: ");
		double r = reader2.nextInt();
		System.out.println("r sayısı= " + r);

		// nPr permütasyonunu hesaplayalım
		double nPr = fact(n) / fact(n - r);

		System.out.println("n'nin r'li permütasyonu: " + n + "P" + r + " = " + nPr);
	

	// nCr kombinasyonunu hesaplayalım
		double nCr = fact(n) / fact(r) * fact(n - r);

		System.out.println("n'nin r'li kombinasyonu: " + n + "C" + r + " = " + nCr);
	}

	// faktöriyel hesaplayan fonksiyon yazalım
	static double fact(double x) {
		double f = 1;
		for (int i = 1; i <= x; i++) {
			f = f * i;
		}
		return f;
	}

}
