package komposisi;

public class Komputer implements Laptop{
    public String merk;
    public int Keluaran;
    
    @Override
    public void powerON(){
        System.out.println("Start--Laptop dinyalakan...");
    }
    
    @Override
    public void powerOFF(){
        System.out.println("ShuttingDown--Laptop dimatikan...");
    }
}
