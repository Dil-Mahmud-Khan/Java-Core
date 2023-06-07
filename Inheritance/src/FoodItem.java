public class FoodItem {
    double price;
    String name;

    public FoodItem(){}

    public FoodItem(double price,String name){
        this.price=price;
        this.name=name;

    }
    public void setPrice(double price){this.price=price;}
    public void setName(String name){this.name=name;}

    public double getPrice(){return price;}
    public String getName(){return name;}

    public void showDetails(){
        System.out.println("Food Items");
        System.out.print("Food Name: "+name);
        System.out.print("Price:"+price);
    }

}
