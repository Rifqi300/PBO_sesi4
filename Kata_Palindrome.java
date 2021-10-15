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

public class Kata_Palindrome {
  public static void main(String[] args) {
    String Kalimat = "";
    String Kalimat_terbalik = "";
    Scanner input = new Scanner(System.in);
    System.out.println("=======================Tugas PBO Sesi 4======================");
    System.out.println("=============================No 1============================");
    System.out.println("");
    System.out.print(" Masukkan Kata atau Kalimat : ");
    
    Kalimat = input.nextLine();
    Kalimat_terbalik = Terbalik(Kalimat);
    System.out.println(" ----------------------------------------------------------- ");
    if (Kalimat.toLowerCase().equals(Kalimat_terbalik.toLowerCase())) {
      System.out.println(" Kalimat Yang Anda Masukkan Termasuk Palindrome");
    } else {
      System.out.println(" Kalimat Yang Anda Masukkan Bukan Termasuk Palindrome");
    }
    System.out.println("");
    System.out.println("====================Muhammad Rifqi Darmawan==================");
    System.out.println("=========================Reguler TI20A=======================");
    System.out.println("");
  }

  public static String Terbalik(String balikinObj) {
    String terbalik_StringObj = "";
    for (int i = balikinObj.length() - 1; i >= 0; i--) {
      terbalik_StringObj += balikinObj.substring(i, i + 1);
    }
    return terbalik_StringObj;
  }
}