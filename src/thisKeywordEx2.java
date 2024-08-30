/* this keyword also used to call default constructor which  is described bellow---
* we can also call parameterised constructor through passing parameter on "this " keyword*/
 class B{
    B(){
        System.out.println("It is default constructor");
    }
    B(int a){

        this();
        System.out.println("It is Parameterized constructor");
    }

 }
 public class thisKeywordEx2 {
     public static void main(String[] args) {
         B b=new B(100);



         /* firstly executed default constructor because when we pass 100 through the
         object then it call parametrised constructor but simultaneously there "this()"
         keyword call the default construct ,eventually  firstly execute default
         and then parameterised constructor
         */

     }

}
