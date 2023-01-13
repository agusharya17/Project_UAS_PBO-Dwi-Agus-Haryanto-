package pegawai;

public class Programmer extends Pegawai{
    private double bonus;
    
    // setter 
    public void setBonus(double bonus){
        this.bonus = bonus;
    }
    
    // getter
    public double getBonus(){
        return this.bonus;
    }
    
    /**
     *
     */
    @Override
    public void cetakInfo(){
        System.out.println("Bonus       : " + this.bonus);
    }
    
    public void cetakBonus(){
        System.out.println("Bonus       : " + this.bonus);
    }
}
