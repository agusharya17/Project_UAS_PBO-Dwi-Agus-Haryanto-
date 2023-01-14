package uas_oop;

public class DataPribadi extends Aku{
    protected int Umur;
    
    public DataPribadi (String Nama, int NIM, int Umur){
        super (Nama, NIM);
        this.Umur = Umur;
    }
    @Override
    public void getInfo(){
        System.out.println("Nama :" + Nama);
        System.out.println("Usia :" + Umur);
    }

}
