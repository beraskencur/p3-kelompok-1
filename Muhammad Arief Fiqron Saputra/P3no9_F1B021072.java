import java.util.Scanner;

public class nomor9 {
double energiPotensial;
final double gravitasi = 9.81;
public nomor9(double massa, double tinggi) {
energiPotensial = massa * gravitasi * tinggi;
}

public double getEnergiPotensial() {
return energiPotensial;
}

public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Massa benda: ");
double massa = input.nextDouble(); 

System.out.print("Tinggi: ");
double tinggi = input.nextDouble(); 

nomor9 energi = new nomor9(massa,tinggi);
double hasilEnergiPotensial = energi.getEnergiPotensial();
    System.out.println("");
    System.out.println("Energi Potensial:" +hasilEnergiPotensial);
    }
}