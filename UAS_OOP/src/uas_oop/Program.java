package uas_oop;
public class Program{
    private String Nama;
    private int Sem;
    private DataPribadi DataPribadi;
    
    public Program (String Nama, int Sem){
        this.Nama = Nama;
        this.Sem = Sem;
    }
    
    public void setDataPribadi (DataPribadi){
        this.DataPribadi = DataPribadi;
    }
    
    public String getNama(){
        return Nama;
    }
    
    public int getSem(){
        return Sem;
    }
}