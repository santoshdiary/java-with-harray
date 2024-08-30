import java.util.Scanner;

public class ArrayPractiseSet {

    public static void main(String[] args) {
        // problem 1
        float sum=0;
        float [] marks={67.5f,55.6f,66.2f,56.8f,89.5f};

//
////      by for loop
//        for(int i=0; i<=4; i++){
////            System.out.println(marks[i]);
//            sum=sum+marks[i];
//
//        }
//
//
//        //by for loop-each loop
//        float sum1=0;
//        System.out.println(sum);
//        for(float element:marks){
//            sum1=sum1+element;
//        }
//        System.out.println(sum1);



//        //problem 2
//        System.out.println("Enter marks which you want to check , that is in array or not:");
//        Scanner sc=new Scanner(System.in);
//       float num=sc.nextFloat();
//        boolean IsInArray=false;
//        for(float element:marks){
//            if(num==element){
//                IsInArray=true;
//                break;
//            }
//        }
//          if(IsInArray){
//            System.out.println("Marks is Available in Array");
//            }else{
//             System.out.println("Marks is not Available in Array");
//          }

        // problem #3;

//        float sum1=0;
//        System.out.println(sum);
//        for(float element:marks){
//            sum1=sum1+element;
//        }
//        System.out.println(" The Average of give marks is:"+(sum1/marks.length));



        // problem #4;


        // sum of two matrix

//        int[][] mat1={ {4,7,2,}
//                      ,{3,2,6}};
//        int[][] mat2={ {4,7,2,}
//                      ,{3,2,6}};
//        int [][] result=new int [2][3];
//
//
//        for(int i=0;i<mat1.length;i++){      //row number times
//            for(int j=0;j<mat1[i].length;j++){  // column number times
//                result[i][j]=mat1[i][j]+mat2[i][j];
//            }
//        }
//
//        for(int i=0;i<mat1.length;i++){      //row number times
//            for(int j=0;j<mat1[i].length;j++) {  // column number times
//                System.out.print(result[i][j]+" ");
//            }
//            System.out.println();
//        }

//problem #5;
       // reverse an array element: we use swapping mechanism for this task

//        int [] arr={3,2,5,9,5};
//        int l=arr.length;
//        int n=Math.floorDiv(arr.length,2);
//        for(int i=0;i<n;i++){
//            //swap a[i] and a[l-1-i]
//            int temp=arr[i];
//            arr[i]=arr[l-1-i];
//            arr[l-1-i]=temp;
//        }
//        for(int element:arr){
//            System.out.print(element+" ");
//        }

//problem #6;    max number in any array

        int [] arr={3,2,5,9,5};
        int max=arr[0];//let assume first element of array is max
        for(int e:arr){
            if(e>max){
                max=e;
            }
        }
        System.out.println("Maximum Number in Array:"+max);


//problem #7: checking Array is shorted(ascending order) or not
//int [] arr={89,3,7,233,67,};
//boolean isSorted=true;
//for(int i=0;i<arr.length-1;i++){
//    if (arr[i] > arr[i+1]) {
//
//        isSorted=false;
//        break;
//    }
//}
//if(isSorted){
//    System.out.println("Array is sorted.");
//}else{ System.out.println("Array is  not sorted.");
//}


    }
}
