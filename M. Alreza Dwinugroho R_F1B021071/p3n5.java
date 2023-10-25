/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class p3n5 {
    String hari;
String bulan;
int tanggal;
int tahun;
public p3n5() {
this.hari = "Sabtu";
this.tanggal = 11;
this.bulan = "November";
this.tahun = 2002;
}
public static void main(String[] args) {
p3n5 lahir1 = new p3n5();
System.out.println("Hari: " + lahir1.hari);
System.out.println("Tanggal: " +lahir1.tanggal);
System.out.println("Bulan: " +lahir1.bulan);
System.out.println("Tahun: " +lahir1.tahun);
}
}

