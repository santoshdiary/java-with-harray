// max priority thread executed most

/*MIN_PRIORITY: Minimum priority that a thread can have. Value is 1.
NORM_PRIORITY: This is the default priority automatically assigned by
JVM to a thread if a programmer does not explicitly set the priority of
that thread. Value is 5.
MAX_PRIORITY: Maximum priority that a thread can have. Value is 10.*/




class MyThr1 extends Thread{
     MyThr1(String name){
        super(name);
    }
    public void run(){
        int i = 34;

        while(true){
//            System.out.println("I am a thread");
            System.out.println("Thank you: " + this.getName());
        }

    }
}

public class Thread_Priority {
    public static void main(String[] args) {
        // Ready Queue: T1 T2 T3 T4 T5
        MyThr1 t1 = new MyThr1("Harry1");
        MyThr1 t2 = new MyThr1("Harry2");
        MyThr1 t3 = new MyThr1("Harry3");
        MyThr1 t4 = new MyThr1("Harry4");
        MyThr1 t5 = new MyThr1("Harry5 (most Important)");
        // assigning the priority of thread .
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
