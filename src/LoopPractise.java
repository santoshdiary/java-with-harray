import java.util.Scanner;

public class LoopPractise {

    public static void main(String[] args) {
        // problem 1;

//        for(int i=4;i>=1;i--){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // problem 2;

//        System.out.println("Enter n Number for sum of even number:");
        Scanner sc =new Scanner(System.in);
//        int n=sc.nextInt();
//
//        int m=0;
//        for(int i=1;i<=n;i++){
//            m=m+2*i;
//        }
//        System.out.println("Sum of n even number is :"+m);

        // problem 3;
//
//        System.out.println("Which Number's table you want to print:");
//        int n=sc.nextInt();
//        for(int i=1;i<=10;i++){
//            System.out.println(n+"*"+i+"="+n*i);
//        }
//

// problem 5;
//        System.out.println("Enter a Number for factorial :");
//        int n=sc.nextInt();
//        int fact=1;
//        for(int i=1;i<=n;i++){
//         fact=fact*i;
//
//        }
//        System.out.println( "factorial is:"+fact);
        // problem 6;

//        for(int i=1;i<=5;i++){
//            System.out.println(5);
//        }

// problem 7;
//
        int n=8;// 8's table
        int sum=0;
        for(int i=1;i<=10;i++){
            sum=sum+n*i;
        }
        System.out.println("sum of 8 table :"+sum);

    }
}
