package allJavaProgram;

import AdvanceJava.Main;
import multipleclasses.Employeee;

public abstract class hotel implements Main {

    String first = "Abhilash";
    String last = "Thabethi";

    public abstract void order(String items,double cost);
    public void items(){
        System.out.println("fg");
    }
    public  abstract void item();

    public String name(){String name="";
        return name;}

    void concat(){

        String name = first+last;
    }



    public static void main(String args[]){
        hotel ht = new Employeee();
        //Employeee Empl = new Employeee();

        // Object cannot be instantiated for interface
        //Main ma = new Main();
        //hotel h = new hotel();
        ht.order("ch",90.0);
        ht.items();
        ht.method1();
        ht.item();
        ht.concat();

        ((Employeee)ht).concatname();

    }


}
