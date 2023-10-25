package p3no6;
import java.util.Scanner;

class buku { String judul;
int halaman;
public buku(String judul, int halaman) { this.judul = judul;
this.halaman = halaman;
}
}

public class P3no6{
public static void main(String[] args) { Scanner input = new
Scanner(System.in);
System.out.println("Judul buku: "); String judul = input.nextLine();
System.out.println("Halaman buku: "); int halaman = input.nextInt();
buku myBook = new buku(judul, halaman);

System.out.println("Informasi Buku:"); System.out.println("Judul: " +
myBook.judul);
System.out.println("Halaman: " + myBook.halaman);
}
}
}
