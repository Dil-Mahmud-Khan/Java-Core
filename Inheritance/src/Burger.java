public class Burger extends FoodItem {
    int numberOfPatties;

    public Burger(){
         super();
    }
    public Burger(String name, double price, int numberOfPatties){
        super(price,name);
        this.numberOfPatties=numberOfPatties;
    }

    public void setNumberOfPatties(int numberOfPatties){this.numberOfPatties=numberOfPatties;}
    public int getNumberOfPatties(){return numberOfPatties;}

    public void showDetails(){
        System.out.println("Food Items");
        System.out.println("Food Name: "+name);
        System.out.println("Price:"+price);
        System.out.println("Number of Patties:"+numberOfPatties);
    }



}
