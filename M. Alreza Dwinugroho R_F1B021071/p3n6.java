/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class p3n6 {
   String judul;
int halaman;
public p3n6(String judul, int halaman) {
this.judul = judul;
this.halaman = halaman;
}
public static void main(String[] args) {
Scanner input = new
Scanner(System.in);
System.out.println("Judul buku: ");
String judul = input.nextLine();
System.out.println("Halaman buku: ");
int halaman = input.nextInt();
p3n6 myBook = new p3n6(judul,halaman);
System.out.println("Informasi Buku:");
System.out.println("Judul: " +myBook.judul);
System.out.println("Halaman: " +myBook.halaman);
}
}

