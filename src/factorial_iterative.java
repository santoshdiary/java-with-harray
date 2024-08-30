public class factorial_iterative {
    public  void fatorial(int positiveInteger){
        int fact=1;

        if(positiveInteger==0){
            System.out.println("Factorial of given Number is: 1");
            return ;
        }
        for(int i=positiveInteger;i>0;i--){
           fact*=i;
        }
        System.out.println("Factorial of given Number is:"+fact);

    }
    public static void main(String[] args) {
      factorial_iterative f= new factorial_iterative();
      f.fatorial(0);
    }
}
