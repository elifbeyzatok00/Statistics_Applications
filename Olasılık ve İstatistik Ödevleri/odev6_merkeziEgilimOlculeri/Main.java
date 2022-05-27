package odev6_merkeziEgilimOlculeri;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int i, s = 0;

		// sınırlarını bizim belirlediğimiz örneklem kümesinden kaç tane sayı seçmek
		// istediğimizi belirleyelim
		Scanner reader = new Scanner(System.in);
		System.out.print("Dizide kaç tane sayı istiyorsanız sayı adedini girin: ");
		int num = reader.nextInt();

		// kullanıcıdan sayıları alarak dizimizi oluşturalım
		int dizi[] = new int[num];
		Scanner sc = new Scanner(System.in);

		System.out.print(num + " " + "tane sayı girin: ");
		System.out.print(" ");

		for (i = 0; i < dizi.length; i++) {
			dizi[i] = sc.nextInt();
		}

		System.out.print("Dizimiz: ");
		for (int sayi : dizi) {

			System.out.print(sayi + " ");

		}

		System.out.println(" ");

		// oluşturduğumuz dizinin elemanlarını bir fonksiyonla küçükten büyüğe
		// sıralayalım
		System.out.print("oluşturduğumuz dizinin elemanlarını küçükten büyüğe sıralayalım: ");

		Arrays.sort(dizi);

		for (int i1 = 0; i1 < dizi.length; i1++) {
			System.out.print(dizi[i1] + " ");
		}

		System.out.println(" ");

		// Aritmetik ortalamayı hesaplayalım
		int toplam = 0;
		for (int i1 = 0; i1 < dizi.length; i1++) {
			toplam = toplam + dizi[i1];
		}
		int diziBoyut = dizi.length;
		float ortalama = (toplam / diziBoyut);
		System.out.format("Dizi ortalaması(Aritmetik ortalama): " + ortalama);

		System.out.println();

		// medyanı hesaplayalım
		System.out.println("Medyan: " + medyan(dizi));

		// mod hesaplayalım
		System.out.println("Mod: " +  mode(dizi, num));
	}

	private static String mod(int[] dizi) {
		// TODO Auto-generated method stub
		return null;
	}

	// meydan hesaplayalayan fonksiyon yazalım
	public static double medyan(int[] dizi) {

		// diziyi küçükten büyüğe sıralayalım
		Arrays.sort(dizi);

		double medyan;

		// dizide kaç tane eleman var belirleyelim
		int diziElemanSayisi = dizi.length;

		// dizinin eleman sayısı çift mi tek mi ?
		if (diziElemanSayisi % 2 == 0) { // eleman sayısı çiftse ortadaki elemanların ortalamasını hesaplayalım
			int ortadakiElemanlarinOrtalamasi = dizi[diziElemanSayisi / 2 - 1] + dizi[diziElemanSayisi / 2];
			// dizi elemanları yazılımda 0dan başladığı için n/2 için n/2 -1 ; n/2 +1 için
			// n/2 yazdık

			medyan = ((double) ortadakiElemanlarinOrtalamasi) / 2;
		} else {
			// eleman sayısı tekse ortadaki eleman medyan alınır
			medyan = (double) dizi[dizi.length / 2];
		}
		return medyan;
	}

	// mod hesaplayalayan fonksiyon yazalım
	public static int mode(int diziAdı[], int diziElemanAdedi) {
		int maxValue = 0, maxCount = 0, i, j;

		for (i = 0; i < diziElemanAdedi; ++i) {
			int count = 0;
			for (j = 0; j < diziElemanAdedi; ++j) {
				if (diziAdı[j] == diziAdı[i])
					++count;
			}

			if (count > maxCount) {
				maxCount = count;
				maxValue = diziAdı[i];
			}
		}
		return maxValue;

	}

}