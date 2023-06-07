public class Employee {
    private String name;
    private int dob;
    private int jd;

     Employee(String name,int dob,int jd){
        this.name=name;
        this.dob=dob;
        this.jd=jd;
    }
    public void setName(String name){this.name=name;}
    public void setDob(int dob){this.dob=dob;}
    public void setJd(int jd){this.jd=jd;}

    public int getDob() {
        return dob;
    }

    public String getName() {
        return name;
    }

    public int getJd() {
        return jd;
    }

//    public void checkS(Employee e2){
//        if(this.jd.getYear()<= e2.getJd().getYear()){
//            if(this.jd.getMonth() <= e2.getJd().getMonth()){
//                if(this.jd.getDay() <= e2.getJd().getDay()){
//                    System.out.println(this.name+" is Senior");
//                }
//                else{
//                    System.out.println(e2.getName()+" is Senior");
//                }
//            }
//            else{
//                System.out.println(e2.getName()+" is Senior");
//            }
//        }
//        else{
//            System.out.println(e2.getName()+" is Senior");
//        }
//    }

}
