public class coffe {
    String minuman;
    String makanan;
    int harga;
    int jumlah;
    
    public coffe() {

    }

    public coffe(String minuman, String makanan, int harga, int jumlah) {
        this.makanan = makanan;
        this.minuman = minuman;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public int tampil() {
        harga=harga*jumlah;
        
        System.out.println("minuman: " + minuman);
        System.out.println("makanan: " + makanan);
        System.out.println("Harga: " + harga);
        return harga;
    }

    public static void main(String[] args) {
        coffe jos = new coffe("caffe latte", "mix platter", 55000, 2);

        System.out.println("menu ");
        jos.tampil();
    }
}
