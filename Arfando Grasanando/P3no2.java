package p3no2;
class P3 {
String nama;
String nim;
int kelompok;

public P3(String nama, String nim, int
kelompok) {
this.nama = nama;
this.nim = nim;
this.kelompok = kelompok;
}
}

public class P3no2{
public static void main(String[] args) {
P3 mahasiswa = new P3("Arfando Grasanando","F1B019150", 1);
System.out.println("Nama: " +mahasiswa.nama);
System.out.println("NIM: " +mahasiswa.nim);
System.out.println("Kelompok: " +mahasiswa.kelompok);
}
}