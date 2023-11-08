/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

class Motogp {
     String nama;
     String merek;
     int speed;

    public void Nama(String n) {
        nama = n;
    }

    public void Merek(String m) {
        merek = m;
    }

    public void Speed(int s) {
        speed = s;
    }

    public void tampil() {
        System.out.println("Nama: " + nama);
        System.out.println("Merk: " + merek);
        System.out.println("Speed: " + speed);
    }
}

public class TugasP3 {
    public static void main(String[] args) {
        Motogp agus = new Motogp();
        agus.Nama("Rossii");
        agus.Merek("Yamaha");
        agus.Speed(300);
        agus.tampil();
    }
}

