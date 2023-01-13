package pegawai;

public class ProgrammerBeraksi {
    public static void main(String[] args){
        
        // Membuat object 1
        Programmer agung = new Programmer();
        /* memanggil atribut dan memberi nilai*/
        agung.setNama ("Agung Nugroho");
        agung.setGajiPokok (4500000.00);
        agung.setBonus (400000.00);
        // untuk menampilkan hasilnya
        System.out.println("Nama        : " + agung.getNama());
        System.out.println("Gaji Pokok  : " + agung.getGajiPokok());
        System.out.println("Bonus       : " + agung.getBonus());
        
        
        // Membuat object 2
        Programmer udin = new Programmer();
        /* memanggil atribut dan memberi nilai*/
        udin.setNama ("Udin Samsuddin");
        udin.setGajiPokok (4700000.00);
        udin.setBonus (450000.00);
        // untuk menampilkan hasilnya
        System.out.println("Nama        : " + udin.getNama());
        System.out.println("Gaji Pokok  : " + udin.getGajiPokok());
        System.out.println("Bonus       : " + udin.getBonus());
       
    }
    
}
