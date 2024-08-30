// by implementing Runnable interface.


class myclass implements Runnable{ // here Runnable is predefined interface class which consist run method..
    public void run(){
        for(int i=1; i<=1000;i++){
            System.out.println("I'm a thread 1.......");
        }
    }
}
class myclass2 implements Runnable{ // 
    public void run(){
        for(int i=1; i<=1000;i++){
            System.out.println("I'm a thread 2.......");
        }
    }
}
public class mutliThreading2 {
    public static void main(String[] args) {
        myclass bullet1=new myclass();
        Thread gun1=new Thread(bullet1); // since start method is under Thread class instead of Runnable interface class,so we also need to make object of thread class and pass the reference of run's class 

        myclass2 bullet2=new myclass2();
        Thread gun2=new Thread(bullet2);

        gun1.start();
        gun2.start();

    }
    
}
