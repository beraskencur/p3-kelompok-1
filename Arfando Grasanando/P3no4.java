package p3no4;
class mobil {
    private String nama;
    private int tahun;
    
public mobil() {
nama = "GTR SUPRA UWUUU";
}

public mobil(int tahun) {
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
}

public class P3no4{
public static void main(String[] args) {
mobil mbl1 = new mobil();
mobil mbl2 = new mobil(2023);
System.out.println("Jenis mobil: " +
mbl1.getNama());
System.out.println("Tahun mobil: " +
mbl2.getTahun());
}
}