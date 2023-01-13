package relasiclass;

public class Manusia {
    public String merk;
    public Komputer Mesin;
    
    public void powerON(){
        Mesin.powerON();
    }
    
    public void powerOFF(){
        Mesin.powerOFF();
    }
    
    public void run(){
        System.out.println("Komputer sedang dijalankan- active by Manusia");
    }
}
