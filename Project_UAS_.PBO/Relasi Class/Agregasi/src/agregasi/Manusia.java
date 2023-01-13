package agregasi;
public class Manusia {
    public String merk;
    public Komputer Mesin;
    
    public Manusia (Komputer e){
        Mesin = e;
    }

    public void powerON(){
        Mesin.powerON();
    }
    
    public void powerOFF(){
        Mesin.powerOFF();
    }
    
    public void run(){
        System.out.println("Komputer sedang menyala - aktive by Manusia");
    }
}
