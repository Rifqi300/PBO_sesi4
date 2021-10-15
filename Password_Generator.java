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

public class Password_Generator {
  public static String charLib = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ3";
  public static String[] LETTER_TABLE = charLib.split("");

  public static void main(String[] args) {
    String inputan;
    String ubah_Input;
    Scanner input = new Scanner(System.in);
    System.out.println("=======================Tugas PBO Sesi 4======================");
    System.out.println("=============================No 3============================");
    System.out.println("");
    System.out.print(" Masukkan Kata : ");

    inputan = input.next();
    ubah_Input = ubah_Input(inputan);
    System.out.println(" ----------------------------------------------------------- ");
    System.out.println(" Perubahan Inputan Menjadi  : " + ubah_Input);
    System.out.println("");
    System.out.println("====================Muhammad Rifqi Darmawan==================");
    System.out.println("=========================Reguler TI20A=======================");
    System.out.println("");
  }

  public static String ubah_Input(String inputan) {
    String hasil_baru = "";
    for ( int i = 0; i < inputan.length(); i++) {
      Character huruf = new Character(inputan.charAt(i));
      Character E_kecil = new Character('e');
      Character E_besar = new Character('E');
      int kode_huruf = (int) huruf;
      char huruf_baru = (char) (kode_huruf + 1);
      if (Character.isUpperCase(huruf)) {
        hasil_baru += huruf_baru + "" + Character.toLowerCase(huruf_baru);
      } else if (huruf.equals(E_kecil) || (huruf.equals(E_besar))) {
        hasil_baru += '3';
      } else {
        hasil_baru += Character.toUpperCase(huruf_baru);
      } 
    }
    return hasil_baru;
  }
}