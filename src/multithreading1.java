// Multithreading -- multithreading in java allows concurrent execution of two or more parts of a program for maximum utilization of CPU.
// there are two ways to creat a thread in java 
// 1. by extending Thread class
// 2. by implementing Runnable interface



// Thread:- thread a predefined class in java.lang package which is basic unit of CPU that well known for independ execution.

class mythread extends Thread{
@Override
public void run(){                       // here run method is predefined method which defined in Thread class.
    int i=0;                             // run method is block that execute our code which we want.
    while(i<1000){
        System.out.println("my cooking thread is running");
        System.out.println("I'm happy!");
        i++;
    }
}

}
class mythread1 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<1000){
            System.out.println("my chating thread is running");
            System.out.println("I'm super excited!");
            i++;
        }
    }
}

public class multithreading1 {
    public static void main(String[] args) {
        mythread t=new mythread();
        mythread1 t1=new mythread1();

        t.start(); // here start() method is used to start run method.. 
        t1.start();
        // since, we  have defined two thread therefore these are executed simultaneously . It is the benefit of thread that our CPU not become idle. 

// usually the execution of any program start with main (method) thread and one by one other child class thead start execute but, in the case of threading multiple thread are executed simultaneously.....therefore the maximum utilization will possible. 
        

    }
    
}
