import java.util.Scanner;
public class p3n8 {
    int hitungKecepatan;
public p3n8(int jarak, int waktu) {
hitungKecepatan = jarak / waktu;
}
public int hitungKecepatan() {
    return hitungKecepatan;
}
public static void main(String[] args) {
Scanner input = new
Scanner(System.in);
System.out.println("Jarak tempuh: ");
int jarak = input.nextInt();
System.out.println("Waktu tempuh: ");
int waktu = input.nextInt();
p3n8 hasil = new p3n8(jarak,waktu);
System.out.println("Kecepatan tempuh: "+ hasil.hitungKecepatan());
}
}


