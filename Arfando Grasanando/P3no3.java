package p3no3;
class P3 { 
    String mk;
    int nilai;
    
public P3(String mk, int nilai) { 
    this.mk = mk;
    this.nilai = nilai;
}
}

public class P3no3{
public static void main(String[] args) { 
    P3 mahasiswa = new P3("Basis Data", 100); 
    System.out.println("Mata Kuliah: " +mahasiswa.mk);
    System.out.println("Nilai: " + mahasiswa.nilai);
}
}

