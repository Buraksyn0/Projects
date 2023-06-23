package Giris;

import java.util.Scanner;

public class NotOrtalamasiHesaplayanProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mat,fizik,kimya,turkce,tarih,muzik;
        int toplam;
        double ortalama;
        String sonuc;

        System.out.println("Lütfen matematik notunuzu giriniz: ");
        mat=scanner.nextInt();
        System.out.println("Matematik Notunuz: "+mat);

        System.out.println("Lütfen fizik notunuzu giriniz: ");
        fizik= scanner.nextInt();
        System.out.println("Fizik Notunuz: "+fizik);


        System.out.println("lütfen kimya notunuzu giriniz: ");
        kimya = scanner.nextInt();
        System.out.println("Kimya Notunuz: "+kimya);

        System.out.println("Lütfen türkçe notunuzu giriniz: ");
        turkce=scanner.nextInt();
        System.out.println("Türkçe Notunuz: "+turkce);

        System.out.println("Lütfen tarih notunuz giriniz: ");
        tarih=scanner.nextInt();
        System.out.println("Tarih Notunuz: "+tarih);

        System.out.println("Lütfen müzik notunuzu giriniz: ");
        muzik=scanner.nextInt();

        toplam=mat+fizik+kimya+turkce+tarih+muzik;
        ortalama=toplam/6.0;

        System.out.println("Not Ortalamanız: "+ortalama);

        sonuc=(ortalama>=60) ? "Sınıfı Geçtiniz!" : "Sınıfta Kaldınız!";
        System.out.println(sonuc);











    }


}
