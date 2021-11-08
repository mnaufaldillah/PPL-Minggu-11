package Pizza;


public class Pizza{
    private String toppings;

    public Pizza(String toppings) {
        this.setTopping(toppings);
    }
    public void setTopping(String toppings) {
            this.toppings = toppings;
    }
    
    public String getTopping() {
        return toppings;
    }
}
