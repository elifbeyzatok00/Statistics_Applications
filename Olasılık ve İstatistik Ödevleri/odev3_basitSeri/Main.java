package odev3_basitSeri;

import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		int i, s = 0;

		// sınırlarını bizim belirlediğimiz örneklem kümesinden kaç tane sayı seçmek istediğimizi belirleyelim
		Scanner reader = new Scanner(System.in);
		System.out.print("Dizide kaç tane sayı istiyorsanız sayı adedini girin: ");
		int num = reader.nextInt();
		

		//kullanıcıdan sayıları alarak dizimizi oluşturalım
		int dizi[] = new int[num];
		Scanner sc = new Scanner(System.in);

		System.out.print( num + " " + "tane sayı girin: ");
		System.out.print(" ");

		for (i = 0; i < dizi.length; i++) {
			dizi[i] = sc.nextInt();
		}

		System.out.print("Dizimiz: ");
		for (int sayi : dizi) {

			System.out.print( sayi + " ");

		}

		System.out.println(""); 
		
		//oluşturduğumuz dizinin elemanlarını bir fonksiyonla küçükten büyüğe sıralayalım
		System.out.println("oluşturduğumuz dizinin elemanlarını küçükten büyüğe sıralayalım: "); 
		//System.out.println(sort(dizi)); 
		
		Arrays.sort(dizi); 

	    for (int i1 = 0; i1 < dizi.length; i1++) {
	       System.out.println(dizi[i1]);
	    }

	    
	}
	
	/*
	//oluşturduğumuz dizinin elemanlarını küçükten büyüğe sıralayan bir fonksiyon yazalım
	public static int sort (int [] dizi){
	    int temp = 0;
	    for (int i = 0; i < dizi.length-1; i++)
	    {
	        if(dizi[i] > dizi[i+1])
	        {
	            temp=dizi[i];
	            dizi[i]=dizi[i+1];
	            dizi[i+1]=temp;
	            i=-1;
	            
	        }
	    }
		return temp;
		
	}

	*/
	
}
