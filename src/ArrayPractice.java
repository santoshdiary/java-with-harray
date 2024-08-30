import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {

        // there are three ways to declare an Array in java
        // 1. Declare and  then memory allocation.
        int [] marks ;
        marks=new int[45];

        // 2. Declaration and memory allocation at the same time.
        int [] Marks=new int[5];
        // 3. Declaration and initialisation at the same time.
        int []mARKS= {56,45,78,} ;


        //System.out.println(Arrays.toString(mARKS));
        //here toString() function , to make this array into a String for printing together


        System.out.println(mARKS[2]);
        //it's used to print individual array element

    }
}
