import java.util.Scanner;
public class nomor8 {
int hitungKecepatan;

public nomor8(int jarak, int waktu) {
hitungKecepatan = jarak / waktu;
}

public int hitungKecepatan() {
return hitungKecepatan;
}

public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Jarak tempuh: ");
int jarak = input.nextInt();

System.out.print("Waktu tempuh: ");
int waktu = input.nextInt();

nomor8 hasil = new nomor8(jarak,waktu);
System.out.println("Kecepatan tempuh: "+ hasil.hitungKecepatan());
}
}