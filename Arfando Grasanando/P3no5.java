package p3no5;	
class birthday {
String hari;
String bulan;
int tanggal;
int tahun;

public birthday() {
this.hari = "Kamis";
this.tanggal = 27;
this.bulan = "July";
this.tahun = 2000;
}
}

public class P3no5{
public static void main(String[] args) {
birthday lahir1 = new birthday();
System.out.println("Hari: " + lahir1.hari);
System.out.println("Tanggal: " +lahir1.tanggal);
System.out.println("Bulan: " +lahir1.bulan);
System.out.println("Tahun: " +lahir1.tahun);
}
}

