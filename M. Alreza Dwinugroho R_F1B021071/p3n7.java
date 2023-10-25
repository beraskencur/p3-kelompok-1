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
public class p3n7 {
    int hitungDebit;
public p3n7(int volume, int waktu) {
hitungDebit = volume / waktu;
}
public int hitungDebit() {
return hitungDebit;
}
public static void main(String[] args) {
Scanner input = new
Scanner(System.in);
System.out.println("Volume air: ");
int volume = input.nextInt();
System.out.println("Waktu: ");
int waktu = input.nextInt();
p3n7 nilai = new p3n7(volume, waktu);
System.out.println("Debit air: " +nilai.hitungDebit);
}
}

