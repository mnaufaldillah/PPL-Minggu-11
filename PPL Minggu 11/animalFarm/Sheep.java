package animalFarm;


public class Sheep {
    private String nama_depan;
    private int umur;

    public Sheep(String nama_depan, int umur) {
        this.setAge(umur);
        this.setName(nama_depan);
    }
    public void setName(String nama_depan) {
            this.nama_depan = nama_depan;
    }
    
    public void setAge(int umur) {
            this.umur = umur;
    }
    public double productPerDay(){
       return calculateProductPerDay();
    }


    private int calculateProductPerDay(){
        if (this.umur<8){
            return 500;
        }else if (this.umur <12){
            return 250;
        }else {
            return 0;
        }
    }
     
    
    public String getName() {
        return nama_depan;
    }

    public int getAge() {
        return umur;
    }
}