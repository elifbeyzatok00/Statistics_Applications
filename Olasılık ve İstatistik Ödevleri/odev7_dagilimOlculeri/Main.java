package odev7_dagilimOlculeri;

import java.util.Arrays;
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
		int[] dizi = new int[num];
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

		// ortalama,Varyans,standart sapma,OMS ve DK hesaplayalım
		Hesapla(dizi);

	}

	// ortalama, Varyans, standart sapma, OMS ve DK hesaplayan fonksiyon
	public static double Hesapla(int[] dizi) {
		double toplam = 0.0, varyans = 0.0, standartSapma = 0.0, oms = 0.0, dk = 0.0;
		int length = dizi.length;

		for (double sayi : dizi) {
			toplam += sayi;
		}

		double ortalama = toplam / length;
		System.out.println("Dizinin ortalaması= " + ortalama);

		for (double sayi : dizi) {
			varyans += (Math.pow(sayi - ortalama, 2)) / (length - 1);
		}
		System.out.println("Var(x)=S^2= " + varyans);

		standartSapma = Math.sqrt(varyans);
		System.out.println("Sx=  " + standartSapma);

		for (double sayi : dizi) {
			oms += (Math.abs(sayi - ortalama)) / length;
		}
		System.out.println("OMS= " + oms);

		 dk = standartSapma / ortalama;
		System.out.println("DK= standartSapma(Sx) / ortalama = " + standartSapma +" / "+ ortalama +" = "+ dk);

		return 0;
	}

}
