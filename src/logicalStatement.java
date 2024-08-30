public class logicalStatement {

    public static void main(String[] args) {
        boolean a= true ;
        boolean b= false;
        boolean c = true;

        if(a && b && c){
            System.out.println("Y");
        }else{

            System.out.println("N");
        }


        if(a || b || c){
            System.out.println("Y");
        }else{

            System.out.println("N");
        }
    }
}
