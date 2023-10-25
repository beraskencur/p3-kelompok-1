import java.util.Scanner;
public class nomor7 {
int hitungDebit;

public nomor7(int volume, int waktu) {
    hitungDebit = volume / waktu;
}

public int hitungDebit() {
    return hitungDebit;
}
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Volume air: ");
int volume = input.nextInt();

System.out.print("Waktu: ");
int waktu = input.nextInt();

nomor7 nilai = new nomor7(volume, waktu);
System.out.println("Debit air: " + nilai.hitungDebit);
}
}