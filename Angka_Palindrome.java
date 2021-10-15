/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class Angka_Palindrome {
  public static void main(String[] args) {
    int angka;
    int angka_Palindrome;
    Scanner input = new Scanner(System.in);
    System.out.println("=======================Tugas PBO Sesi 4======================");
    System.out.println("=============================No 2============================");
    System.out.println("");
    System.out.print(" Masukkan Angka : ");
    angka = input.nextInt();

    if (angka <= 9) {
      angka_Palindrome = 11;
    }
    angka_Palindrome = Palindrome_terdekat(angka);
    System.out.println(" ----------------------------------------------------------- ");
    System.out.println(" Angka Palindrome Terdekat Selanjutnya adalah : " + angka_Palindrome);
    System.out.println("");
    System.out.println("====================Muhammad Rifqi Darmawan==================");
    System.out.println("=========================Reguler TI20A=======================");
    System.out.println("");
  }

  public static int Palindrome_terdekat(int nomor) {
    int angka_Palindrome = 0;
    while (!Palindrome_OK(nomor)) {
      nomor++;
    }
    return nomor;
  }

  public static boolean Palindrome_OK(int nomor) {
    int ulang_Nomor = ulang_Nomor(nomor);
    return ulang_Nomor == nomor;
  }

  public static int ulang_Nomor(int number) {
    int ulang_Nomor = 0;
    while (number != 0) {
      int Number_tetap = number % 10;
      ulang_Nomor = ulang_Nomor * 10 + Number_tetap;
      number = number / 10;
    }
    return ulang_Nomor;
  }
}