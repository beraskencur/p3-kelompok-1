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
public class p3n9 {
    double energiPotensial;
final double gravitasi = 9.81;
public p3n9(double massa, double tinggi) {
energiPotensial = massa * gravitasi * tinggi;
}
public double getEnergiPotensial() {
return energiPotensial;
}
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Massa benda: ");
double massa = input.nextDouble(); 
//\Menggunakan nextDouble untuk input nilaidesimal
System.out.println("Tinggi: ");
double tinggi = input.nextDouble(); 
//Menggunakan nextDouble untuk input nilaidesimal
p3n9 energi = new p3n9(massa,tinggi);
double hasilEnergiPotensial = energi.getEnergiPotensial();
    System.out.println("Hasil energi ptensial : "+hasilEnergiPotensial);
}
}
