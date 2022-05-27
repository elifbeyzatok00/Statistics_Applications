package odev4_frekansSayisiVer;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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

		System.out.println("");

		// oluşturduğumuz dizinin elemanlarını bir fonksiyonla küçükten büyüğe
		// sıralayalım
		System.out.println("oluşturduğumuz dizinin elemanlarını küçükten büyüğe sıralayalım: ");

		Arrays.sort(dizi);

		for (int i1 = 0; i1 < dizi.length; i1++) {
			System.out.println(dizi[i1]);
		}

		System.out.println("");
		
		// dizide tekrar eden elemanları yazdıralım, frekans sayısı verelim (Xi , fi)
		System.out.println( "Xi:"    + "  " + "fi:" );
		System.out.println("");
		Set<Integer> nums = new HashSet<Integer>();

		for (int i1 = 0; i1 < dizi.length; i1++) {
			if (nums.contains(dizi[i1]))
				continue;
			int count = 1;
			for (int j = i1 + 1; j < dizi.length; j++) {
				if (dizi[i1] == dizi[j]) {
					count++;
				}

			}
			/*
			System.out.println("Dizide " + dizi[i1] + " sayısından " + count + " tane var");
			nums.add(dizi[i1]);
			*/
			
			/*
			System.out.println( "Xi:"    + "  " + "fi:" );
			System.out.println("");
			System.out.println( dizi[i1] + "  " + count );
			nums.add(dizi[i1]); 
			*/
			
			System.out.println( dizi[i1] + "    " + count );
			nums.add(dizi[i1]); 
		}
	}

}
