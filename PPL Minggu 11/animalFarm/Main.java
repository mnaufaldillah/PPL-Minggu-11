package animalFarm;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Chicken[] chicken = new Chicken[6];
        Sheep[] sheep = new Sheep[6];
        chicken[0] = new Chicken ("Siska", 10);
        chicken[1] = new Chicken ("Chika", 11);
        chicken[2] = new Chicken ("Ali", 13);
        chicken[3] = new Chicken ("Bayu", 1);
        chicken[4] = new Chicken ("Chiki", 5);
        chicken[5] = new Chicken ("Kate", 9);
        sheep[0] = new Sheep ("Sisi", 10);
        sheep[1] = new Sheep ("Ciko", 14);
        sheep[2] = new Sheep ("Alo", 5);
        sheep[3] = new Sheep ("Bapo", 13);
        for (int i=0;i<3;i++){
        System.out.println(chicken[i].getName() +" "+ chicken[i].getAge() + " bulan dapat menghasilkan " +chicken[i].productPerDay()
            +" telur per hari"+"\n"+ sheep[i].getName() +" "+ sheep[i].getAge() + " bulan dapat menghasilkan " +sheep[i].productPerDay()
            +" ml susu per hari");
        }
        for (int i=3;i<6;i++){
            System.out.println(chicken[i].getName() +" "+ chicken[i].getAge() + " bulan dapat menghasilkan " +chicken[i].productPerDay()
            +" telur per hari");
        }
        }
    }