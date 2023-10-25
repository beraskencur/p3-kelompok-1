import java.util.Scanner;

public class nomor6 {
String judul;
int halaman;

public nomor6(String judul, int halaman) {
this.judul = judul;
this.halaman = halaman;
}
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Judul buku: ");
String judul = input.nextLine();

System.out.print("Halaman buku: ");
int halaman = input.nextInt();

nomor6 myBook = new nomor6(judul,halaman);
System.out.println("");
System.out.println("Informasi Buku:");
System.out.println("Judul: " + myBook.judul);
System.out.println("Halaman: " + myBook.halaman);
}
}