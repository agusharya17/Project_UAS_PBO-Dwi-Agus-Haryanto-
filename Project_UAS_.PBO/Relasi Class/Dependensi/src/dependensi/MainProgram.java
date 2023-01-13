package relasiclass;

public class MainProgram {
    public static void main(String[]args){
        
        // Membuat object Mesin
        Komputer Mesin = new Komputer();
        
        /* Memanggil atribut dan nilai*/
        Mesin.merk = "with GTX 4090MX";
        Mesin.Keluaran = 2022;
        
        Manusia Agus = new Manusia();
        
        Agus.merk = "Asus ROG";
        Agus.Mesin = Mesin;
        Agus.powerON();
        Agus.run();
        Agus.powerOFF();
    }
}
