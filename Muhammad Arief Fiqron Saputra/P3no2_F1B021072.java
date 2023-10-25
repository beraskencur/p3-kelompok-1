public class Identitas{     
    String nim;     
    int kelompok; 
    private final String nama;
 
    public Identitas (String nama, int kelompok, String nim) { 
        this.nama = nama;
        this.kelompok= kelompok;
        this.nim = nim;
    }
    
    public static void main(String[] args) { 
        Identitas mahasiswa = new Identitas("Yadut", 1, "F1B021072"); 
 
        System.out.println("Nama: " + mahasiswa.nama); 
        System.out.println("NIM: " + mahasiswa.nim); 
        System.out.println("Kelompok: " + mahasiswa.kelompok); 
         
    } 
} 
