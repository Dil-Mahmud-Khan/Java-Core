public class Pizza extends FoodItem{
    String size;     // initializing property

    public Pizza()     //this an empty constructor
    {
        super();
    }

    public Pizza(String name,double price,String size){
        super(price,name);
        this.size=size;

    }

    public void setSize(String size){this.size=size;}
    public String getSize(){return size;}

    public void showDetails()  // showDetails method to print all items
    {
        System.out.println("Food Item");
        System.out.println("Food Name : "+name);
        System.out.println("Price : "+price);
        System.out.println("Size : "+size);
    }

}
