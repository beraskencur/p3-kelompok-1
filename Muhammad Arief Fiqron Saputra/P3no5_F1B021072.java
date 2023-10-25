public class birthday {
String hari;
String bulan;
int tanggal;
int tahun;

public birthday() {
this.hari = "Senin";
this.tanggal = 10;
this.bulan = "Mei";
this.tahun = 2003;
}

public static void main(String[] args) {
birthday lahir1 = new birthday();
System.out.println("Hari: " + lahir1.hari);
System.out.println("Tanggal: " + lahir1.tanggal);
System.out.println("Bulan: " + lahir1.bulan);
System.out.println("Tahun: " + lahir1.tahun);
}
}
