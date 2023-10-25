public class p3n4 {
private String nama;
private int tahun;
public p3n4() {
nama = "Brio";
}
public p3n4(int tahun) {
this.tahun = tahun;
}
public String getNama() {
return nama;
}
public void setNama(String nama) {
this.nama = nama;
}
public int getTahun() {
return tahun;
}
public void setTahun(int tahun) {
this.tahun = tahun;
}
public static void main(String[] args) {
p3n4 mbl1 = new p3n4();
p3n4 mbl2 = new p3n4(2023);
System.out.println("Jenis mobil: " +mbl1.getNama());
System.out.println("Tahun mobil: " +mbl2.getTahun());
}
}