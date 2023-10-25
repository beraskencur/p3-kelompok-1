package p3no7;
import java.util.Scanner;

class debit { 
    int hitungDebit;

public debit(int volume, int waktu) { 
    hitungDebit = volume / waktu;
}

public int hitungDebit() { 
    return hitungDebit;
}
}

public class P3no7{
public static void main(String[] args) { 
    Scanner input = new Scanner(System.in); 
    System.out.println("Volume air: "); 
    int volume = input.nextInt(); System.out.println("Waktu: ");
    int waktu = input.nextInt();

    debit nilai = new debit(volume, waktu); 
    System.out.println("Debit air: " +nilai.hitungDebit);
}
}
