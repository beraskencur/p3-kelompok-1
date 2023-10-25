import java.util.Scanner;
public class P2N3 {
public static void main(String[]   
args) {
Scanner input = new Scanner(System.in);
System.out.print("Masukkan nilai Variabel 1: ");
double var1 = input.nextDouble();
System.out.print("Masukkan nilai Variabel 2: ");
double var2 = input.nextDouble();
double volume = calculateVolume(var1, var2);
System.out.println("Volume: " + volume);
}
public static double
calculateVolume(double var1, double var2)
{
double volume = (var1 * var2) /
3;
return volume;
}
}