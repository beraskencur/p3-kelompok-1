package praktikum_p3; 
 public class nilai {     
    String mk;     
    int nilai; 
    
    public nilai(String mk, int nilai) {         
         this.mk = mk;         
         this.nilai = nilai; 
    }      
     public static void main(String[] args){         
        nilai mahasiswa = new nilai ("pbo", 80); 
 
        System.out.println("Mata Kuliah: " + mahasiswa.mk); 
        System.out.println("Nilai: " + mahasiswa.nilai); 
    } 
} 
