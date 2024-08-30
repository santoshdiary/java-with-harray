// Abstract class is "imaginary" class which is doesn't exist but,in our thought.
// Abstract class is defined so that further some other class  inherit it and  implement it.
// Abstract class must contain at least one Abstract Method...
// since Abstract class is "imaginary" that's why we can't create an "object" of it.
// Abstract method is only declared, not implemented on same class.
//  eg. -- It is used when we have same functionality but different action.ffor example we have phone class which has different type of functionality like On,Off,PlayMusic,ShowCalaner etc. therefore  we can creat a  abstract method and then extends these feature in other class according to different kinds of phone's requiremen




abstract class Parent2{ // Abstract class which contain at least one abstract method.
    public Parent2(){
        System.out.println("Mai base2 ka constructor hoon");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet(); // abstract methods
    abstract public void greet2(); 
}

class Child2 extends Parent2{
    @Override
    public void greet(){
        System.out.println("Good morning");
    }
    @Override
    public void greet2(){
        System.out.println("Good afternoon");
    }
}

abstract class Child3 extends Parent2{
    public void th(){
        System.out.println("I am good");
    }
}
public class AbstractClass {

    public static void main(String[] args) {
        //Parent2 p = new Parent2(); -- error
        Child2 c = new Child2();
        //Child3 c3 = new Child3(); -- error
    }



}


