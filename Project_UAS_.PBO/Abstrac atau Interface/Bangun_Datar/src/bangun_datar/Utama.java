package bangun_datar;

public class Utama {
    public static void main(String[] args){
        // Buat Objek dari Class Bangun_Datar
        BangunDatar bulat = new Lingkaran(10);
        BangunDatar atap_rumah = new Segitiga(7,12);
        BangunDatar kotak = new Persegi(10,5);
        
        // Memanggil Method Gambar
        bulat.gambar();
        atap_rumah.gambar();
        kotak.gambar();
        
        // Mencetak Luas Bangunan
        System.out.println("\nLuas Lingkaran: " + bulat.luas());
        System.out.println("Luas Segitiga: " + atap_rumah.luas());
        System.out.println("Luas Persegi: " + kotak.luas()); 
        
    }
}
