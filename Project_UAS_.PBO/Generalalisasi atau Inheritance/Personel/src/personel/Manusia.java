package personel;
public class Manusia {
    String nama;
    String jenisKelamin;
    int umur;
    String alamat;
    
    public void cetakInfo(){
        System.out.println("Nama            : " + this.nama);
        System.out.println("Jenis Kelamin   : " + this.jenisKelamin);
        System.out.println("Umur            : " + this.umur);
        System.out.println("Alamat          : " + this.alamat);
    }
}
