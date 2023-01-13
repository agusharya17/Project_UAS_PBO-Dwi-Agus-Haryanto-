package pegawai;

public class Pegawai {
    private String nama;
    private double gajiPokok;
    
    // setter
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setGajiPokok(double gajiPokok){
        this.gajiPokok = gajiPokok;
    }
    
    // getter
    public String getNama(){
        return this.nama;
    }
    
    public double getGajiPokok(){
        return this.gajiPokok;
    }
    
    
    public void cetakInfo(){
        System.out.println("Nama            : " + this.nama);
        System.out.println("Gaji Pokok      : " + this.gajiPokok);
    }

}
