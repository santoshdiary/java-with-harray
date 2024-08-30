public class recursion {

    // factorial(0) = 1
    // factorial(n) = n * n-1 *....1
    // factorial(5) = 5 * 4 * 3 * 2 * 1 = 120
    // =>factorial(n) = n * factorial(n-1)

    static int factorial_iterative(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            int product = 1;
            for (int i=1;i<=n;i++){ // 1 to n
                product *= i;
            }
            return product;
        }
    }

   // second method
    static int factorial(int n){  // recursive method block : factorial (n) to factorial(n-1)
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }

    //another example of recursive method

    //sum(n)=1+2+3+4.....(n-1)+n
    //sum(n)= sum(n-1) + n

    static int sum(int b){
        if( b>0){       //base condition for recursion,for termination of recursive method
            return b+sum(b-1);
        }else{
            return 0;
        }
    }




    // those method who call itself again & again called recursive method.
    // here "factorial" is recursive method . syntax in copy
    public static void main(String[] args) {
        int x =10;
        System.out.println("The value of factorial x is: " + factorial(x));
        System.out.println("The value of factorial x is: " + factorial_iterative(x));

        System.out.println("sum of n natural numbers is:"+sum(9));


    }
}


