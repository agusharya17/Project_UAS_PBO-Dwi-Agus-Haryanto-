package asosiasi;
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
        System.out.println("Komputer sedang menyala- active by Manusia");
    }
}
