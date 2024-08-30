

abstract class Pen{
    abstract void write();
    abstract void refill();
}

class FountainPen extends Pen{
    void write(){
        System.out.println("Write");
    }
    void refill(){
        System.out.println("Refill");
    }
    void changeNib(){
        System.out.println("Changing the nib");
    }
}
class Monkey{
    void jump(){
        System.out.println("Jumping...");
    }
    void bite(){
        System.out.println("Biting...");
    }
}

interface BasicAnimal{
    void eat();
    void sleep();
}

class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("Hello sir!");
    }

    @Override
    public void eat() {
        System.out.println("Eating");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping");
    }
}
abstract class Telephone{
    abstract public void ring();
    
    abstract public void lift();
        
    abstract public void disconnect();
        
 
}

class Smart_Phone extends Telephone{

public void ring(){
    System.out.println("Ringing ......");
}
public  void  lift(){

    System.out.println(" Lifting.......");

}
public  void disconnect(){
    System.out.println("Disconntecting......");
 

}
public void clickPhoto(){
    System.out.println("Photo has been clicked.....");
}

public void musicPlay(){
    System.out.println("Playing music........");
}

}

interface tvRemote{

public void pressOk();
public void powerOff();
public void powerOn();

}
interface smartTvRemote extends tvRemote{
    public void playYoutube();
    public void playNetfix();

}
class Tv implements smartTvRemote,tvRemote{
    
     public void pressOk(){
        System.out.println("pressing ok button.....");
    }
     public void powerOn(){
        System.out.println("pressing on button.....");
    }
    public void powerOff(){
        System.out.println("pressing poer Off button.....");
    }
    public void playYoutube(){
        System.out.println("playing youtube...");
    }
    public void playNetfix(){
        System.out.println("plaing Netflix....");
    }
  
}

public class chapter11PractiseSet {
    public static void main(String[] args) {
        // Q 6+7
        
        Tv tv=new Tv();
        tv.playNetfix();


        // Q1 + Q2
        FountainPen pen = new FountainPen();
        pen.changeNib();

        // Q3
        Human harry = new Human(); 
        harry.sleep();

        // Q5
        Monkey m1 = new Human();// here m1 is reference of Monkey class but,object is Human class that means Human class only call monkey class' method...
        m1.jump();
        m1.bite();
        // m1.speak(); --> Cannot use speak method because the reference is monkey which does not have speak method

        BasicAnimal lovish = new Human();
        // lovish.speak(); --> error
        lovish.eat();
        lovish.sleep();

        // Q4.

        Smart_Phone sc=new Smart_Phone();
        sc.disconnect();
        sc.clickPhoto();


        Telephone t=new Smart_Phone();
        t.lift();
      //t.clickPhoto() ; //--> It will throgh error because the reference is Telephone which does ot have clickPhoto method..

    }   
}