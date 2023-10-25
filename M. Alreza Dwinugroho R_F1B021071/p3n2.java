public class p3n2{
String nim;
int kelompok;
String nama;
String Hobi;
String Mk;
public p3n2(){
}
public p3n2 (String nama, String nim, int kelompok, String Hobi, String Mk) {
this.nama=nama;
this.nim=nim;
this.kelompok=kelompok;
this.Hobi=Hobi;
this.Mk=Mk;
}
public static void main(String[] args) {
p3n2 mahasiswa = new p3n2("M. Alreza Dwinugroho R", "F1B021071", 1, "Mancing", "PBO");
System.out.println("Nama: " +mahasiswa.nama);
System.out.println("NIM: " +mahasiswa.nim);
System.out.println("Kelompok: " +mahasiswa.kelompok);
System.out.println("Hobi: " +mahasiswa.Hobi);
System.out.println("Mata kuliah: " +mahasiswa.Mk);
}
}