public class Box extends Rectangle{
    protected double z;
    public Box(){}
    public Box(double x,double y,double z){
        super(x,y);
        this.z=z;
    }


    public void setZ(double z) {
        this.z = z;
    }

    public double getZ() {
        return z;
    }
    public double getArea(){
        return getX()*getY();
    }
    public double getVolume(){
        return getX()*getY()*z;
    }

    public void showDetails(){
        System.out.println("X: "+x);
        System.out.println("Y: "+getY());
        System.out.println("Z: "+z);
        System.out.println("Volume: "+getVolume());

    }

}
