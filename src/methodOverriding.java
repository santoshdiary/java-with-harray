// method overriding is also known as "run time polymorphism or Dyanmic polymorephism "

class A1{
    public int a;
    public int harry(){
        return 4;
    }
    public void meth2(){
        System.out.println("I am method 2 of class A");
    }
}

class B1 extends A1{
    @Override
    public void meth2(){
       // super.meth2();  // it is used when we want to call superclass meth2 .
        System.out.println("I am method 2 of class B");
    }
    public void meth3(){
        System.out.println("I am method 3 of class B");
    }
}
public class methodOverriding {
    public static void main(String[] args) {
//        A1 a = new A1();
//        a.meth2();

         B1 b = new B1();
       
        b.meth2();
    }
}
