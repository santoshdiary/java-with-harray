import java.util.Scanner;

public class santosh {
        public static void main(String[] args) {
               int s1, s2, s3, s4, s5, sum;

                String name;

                Scanner scanner = new Scanner(System.in);

                System.out.println("Enter Name of Student :");
                name = scanner.nextLine();


                System.out.println("Enter Marks of Maths :");
                s1 = scanner.nextInt();

                if(s1>100){
                        System.out.println("Marks should be under 100");
                        System.exit(0);
                }

                System.out.println("Enter Marks of Science :");
                s2 = scanner.nextInt();
                if(s2>100){
                        System.out.println("Marks should be under 100");
                        System.exit(0);
                }

                System.out.println("Enter Marks of Social Science :");
                s3 = scanner.nextInt();
                if(s3>100){
                        System.out.println("Marks should be under 100");
                        System.exit(0);
                }

                System.out.println("Enter Marks of English :");
                s4 = scanner.nextInt();
                if(s4>100){
                        System.out.println("Marks should be under 100");
                        System.exit(0);
                }

                System.out.println("Enter Marks of Computer Science :");
                s5 = scanner.nextInt();
                if(s5>100){
                        System.out.println("Marks should be under 100");
                        System.exit(0);
                }
          

                sum = s1 + s2 + s3 + s4 + s5;
         double percentage= (double) sum /500*100;

         //when we divide integer type of data then return value is also  integer type therefore we need declare "sum" as double because
            // percentage is double type.


                System.out.println("Name of Student: " + name+" ");
                System.out.print("Percentage: " + percentage);
        }
}
