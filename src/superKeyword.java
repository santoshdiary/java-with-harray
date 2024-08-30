/*  super keyword used to access super class variable, method &  constructor through subclass object */

//  variable example related to super keyword
class C{
   int a=10;

}
class D extends C{
    int a=20;
    void show(){
        System.out.println(a); // it prints sub class variable
        System.out.println(super.a); // it prints super class variable
    }

}


// method example related to superkeyword


class method{

   public  void show(){
        System.out.println("I'm super class method");
    }
        }

class method1 extends method{
@Override
   public void show(){

super.show();       // it is used to call super class method "show()" .
        System.out.println("I'm sub class method");
    }
}



//constructor example related to superkeyword

class shreya{
    shreya(){
        System.out.println("I'm superclass constructor");
    }
}
class sonu extends shreya{
    sonu(){
         super();   // it is automatic written whether we write or not and call superclass constructor. in "default constructor" case only.
        System.out.println("I'm sub class constructor");
    }
}

public class superKeyword {

    public static void main(String[] args) {


//        D c=new D();
//        c.show();


//    method1 m=new method1();
//    m.show();

    sonu su=new sonu();



    }
}
