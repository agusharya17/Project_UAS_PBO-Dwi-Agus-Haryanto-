package pegawai;

public class ManajerBeraksi {
    public static void main(String[] args){
        
        // Membuat Object 1
        Manager indri = new Manager();
         /* memanggil atribut dan memberi nilai*/
        indri.setNama("Indri Lestari");
        indri.setGajiPokok (5500000.00);
        indri.setTunjangan (500000.00);
        // untuk menampilkan hasilnya
        System.out.println("Nama        : " + indri.getNama());
        System.out.println("Gaji Pokok  : " + indri.getGajiPokok());
        System.out.println("Tunjangan   : " + indri.getTunjangan());
        
   
        // Membuat Object 2
        Manager yanto = new Manager();
        /* memanggil atribut dan memberi nilai*/
        yanto.setNama ("Yanto Suyanto");
        yanto.setGajiPokok (5500000.00);
        yanto.setTunjangan (550000.00);
        // untuk menampilkan hasilnya
        System.out.println("Nama        : " + yanto.getNama());
        System.out.println("Gaji Pokok  : " + yanto.getGajiPokok());
        System.out.println("Tunjangan   : " + yanto.getTunjangan());
    }
}
