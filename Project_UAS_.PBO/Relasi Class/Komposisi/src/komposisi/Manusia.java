package komposisi;
public class Manusia {
    public String merk;
    public Komputer Mesin;
    
    public Manusia(String merkMesin, int Keluaran){
        Mesin = new Komputer();
        Mesin.merk = merkMesin;
        Mesin.Keluaran = Keluaran;
    }
    
    public void powerON(){
        Mesin.powerON();
    }
    public void powerOFF(){
        Mesin.powerOFF();
    }
    
    public void run(){
        System.out.println("Komputer sedang berjalan- active by Manusia");
    } 
}
