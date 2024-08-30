public class VariableArguments {
//    static int add(int a,int b){
//        return a+b;
//    }
//    static int add(int a,int b,int c){
//        return a+b+c;
//    }
//    static int add(int a,int b,int c,int d){
//        return a+b+c+d;
//    }

    static int add(int ...arr){
        // int []arr , available all parameter  in array ;
        int result=0;
        for(int a:arr){
            result+=a;
        }

        return result;
    }
    public static void main(String[] args) {
//        System.out.println("sum of given no.="+add(8,23));
//        System.out.println("sum of given no.="+add(8,23,8));
//        System.out.println("sum of given no.="+add(8,23,8,56));
//
// this is the worst way to calculate sum of multiple argument so,there is a solution is:


        //Variable Arguments ninza technique




        System.out.println("sum of given no.="+add(8,23));
        System.out.println("sum of given no.="+add(8,23,8));
        System.out.println("sum of given no.="+add(8,23,8,56));


    }
}
