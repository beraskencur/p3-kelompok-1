class pasien{
    String nama;
    String pnyakit;
    String alamat;
    String kelamin;
    String tglobat;
    String lahir;
    String obat;
    int harga;
    int biji;
    int umur;
    int bayar;
    int biaya;
    

    public pasien (String n, String p, String a, String k, String t, String l, String o){
        System.out.println("Nama Pasien = "+n);
        this.nama=n;
        System.out.println("Penyakit yang diidap Pasien = "+p);
        this.pnyakit=p;
         System.out.println("Alamat Pasien = "+a);
        this.alamat=a;
         System.out.println("Jenis Kelamin Pasien = "+k);
        this.kelamin=k;
         System.out.println("Tanggal Berobat Pasien = "+t);
        this.tglobat=t;
         System.out.println("Tanggal Lahir Pasien = "+l);
        this.lahir=l;
         System.out.println("Obat yang diterima Pasien = "+o);
        this.obat=o;
       
    }
    public pasien (int u, int b, int bia){
         System.out.println("umur Pasien = "+u);
        this.umur=u;
        System.out.println("Banyak Obat yang diterima Pasien = "+b);
        this.biji=b;
        System.out.println("Jumlah pembayaran pemriksaan = "+bia);
        this.biaya=bia;
    } 
    public int jual(){
        harga=3000*biji;
        return harga;
    }
    public int total(){
        jual();
        bayar = harga+biaya;
        return bayar;
    }
}
public class indiv {
    public static void main (String [] args){
        pasien ejak = new pasien("M. Alreza Dwinugroho Ramadhan", "Pusing", "Jl. Gili Air 1 No. 57", "Pria", "7 November 2023","11 November 2002","Paramex");
        pasien ejak1 = new pasien(20,5,100000);
        System.out.println("Total Harga Yang dibayar = "+ejak1.total());
    }
   
}
