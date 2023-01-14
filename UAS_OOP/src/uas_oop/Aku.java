package uas_oop;

public abstract class Aku {
    protected String Nama;
    protected int NIM;
    
    public Aku (String Nama, int NIM){
        this.Nama = Nama;
        this.NIM = NIM;
    }
    
    public abstract void getInfo();
}