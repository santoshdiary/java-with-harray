public class pattern3 {
    public static void main(String[] args) {


        int n=5;

//        for(int i=1;i<=n;i++){
//
//            for(int j=1;j<=n-i;j++){
//
//                System.out.print(" ");
//
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(j+" ");
//
//            }
//            System.out.println();
//        }


//for(int i=1;i<=n;i++){
//    for(int j=1;j<=n-i+1;j++){
//        System.out.print(j);
//    }
//    System.out.println();
//}


//int number=1;
//for(int i=1;i<=5;i++){
//    for(int j=1;j<=i;j++){
//        System.out.print(number+" ");
//        number ++;
//    }
//    System.out.println();
//}
//


        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
              int sum=i+j;
               if(sum%2==0){ //when sum of row and column is even.
                   System.out.print("1 ");
               }
               else{

                   System.out.print("0 ");
               }
            }
            System.out.println();
        }







    }
}
