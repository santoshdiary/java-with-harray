

class Practice13 extends Thread{
    public void run(){
        int i=1;
        while(i<=10){

            try{
                Thread.sleep(200);
            }
            catch (Exception e){
                System.out.println(e);
            }
            System.out.println("Good Morning!");
            i++;
        }
    }
}
class Practice13b extends Thread{
     public void run(){
         int i=1;
        while(i<=10){

            System.out.println("Welcome");
            i++;
       }
    }
}
public class practiceSet13 {
    public static void main(String[] args) {
        Practice13 p1 = new Practice13();
        Practice13b p2 = new Practice13b();
//        p1.start();

        p1.setPriority(5);
        p2.setPriority(9);
        p1.getPriority();
        p2.getPriority();
        System.out.println(p2.getState());
        p2.start();
        // current thread's reference in java-- currentThread()
        System.out.println(Thread.currentThread().getPriority());

    }
}


