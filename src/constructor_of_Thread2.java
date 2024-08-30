class AB implements Runnable{

    public void run(){
        for(int i=1;i<=1000;i++){
            System.out.println(" Hello I'm runnable thread");
        }
    }
}
public class constructor_of_Thread2 {
    public static void main(String[] args) {
        AB t=new AB();
        Thread myThread=new Thread(t,"santosh");
        myThread.start();

    }

}
