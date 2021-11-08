package Pizza;



public class Main
{
    public static void main(String[] args){
        Pizza pizza1 = new Pizza("mozzarella and cheese");
        Pizza pizza2 = new Pizza("beef, mushroom, cheese");
        System.out.println("Pizza 1 toppings: " + pizza1.getTopping());
        System.out.println("Pizza 2 toppings: " + pizza2.getTopping());
    }
}
