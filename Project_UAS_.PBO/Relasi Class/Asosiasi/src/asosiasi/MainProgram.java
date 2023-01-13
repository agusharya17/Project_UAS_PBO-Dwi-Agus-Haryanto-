package asosiasi;

public class MainProgram {
    public static void main(String[]args){
        
        // Membuat object Komputer
        Komputer Mesin = new Komputer();
        
        /* Memanggil atribut dan nilai */
        Mesin.merk = "Asus ROG 1";
        Mesin.Keluaran = 2020;
        
        Manusia Agus = new Manusia();
        
        Agus.merk = "GTX 100";
        Agus.Mesin = Mesin;
        Agus.powerON();
        Agus.run();
        Agus.powerOFF();
    } 
}
