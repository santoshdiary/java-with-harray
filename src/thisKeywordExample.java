/* this keyword used to clarification between instance and local variable , since "this " keyword
refers current object that's why it refers local variable */

class A{
    int a;          // instance variable
    A(int a){       // here "a" is local variable
       this.a=a;    // if we don't write"this" then JVM gets confused b/w instance and local variable
                    // and gives only default value of int.
    }
    void show(){
        System.out.println(a);
    }

}
public class thisKeywordExample {
    public static void main(String[] args) {
        A r=new A(100);
        r.show();
    }

}
