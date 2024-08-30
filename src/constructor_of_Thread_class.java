class MyThr extends Thread{
     MyThr(String name){      // second no. of thread of Notes.
        super(name);
    }
    public void run(){
        int i = 34; // just for code no any meaning
        System.out.println("Thank you");
//        while(true){
//            System.out.println("I am a thread");
//        }
    }
}


public class constructor_of_Thread_class {

    public static void main(String[] args) {
        MyThr t1 = new MyThr("Harry");
        MyThr t2 = new MyThr("Ram Candr");
        t1.start();
        t2.start();
        System.out.println("The id of the thread t is " + t1.getId());
        System.out.println("The name of the thread t is " + t1.getName());
        System.out.println("The id of the thread t is " + t2.getId());
        System.out.println("The name of the thread t is " + t2.getName());
        // JVM by default gives name & ID of thread, however we can give custom name of thread.
        // and print name of thread by using .getName() & .getId()
    }
}




