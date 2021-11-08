package animalFarm;

public class Chicken {
    private String nama_depan;
    private int umur;

    public Chicken(String nama_depan, int umur) {
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
    public int calculateProductPerDay(){
        if (this.umur<6){
            return 2;
        }else if (this.umur <12){
            return 1;
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
