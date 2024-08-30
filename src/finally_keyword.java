


public class finally_keyword {
    public static int greet(){
        try{
            int a = 50;
            int b = 10;
            int c = a/b;
            return c;
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Cleaning up resources...This is the end of this function");
        }
        return -1;
    }

    public static void main(String[] args) {
        int k = greet();
        System.out.println(k);
        int a = 7;
        int b = 9;
        while(true){
            try{
                System.out.println(a/b);
            }
            catch (Exception e){
                System.out.println(e);
                break;
            }
            finally{        // finally block used to execute the code
                         // whatever exception is handled or not .
                        // here when b will become 0 then a/b will
                        // be not possible still finally block executed.
                System.out.println("I am finally for value of b = " + b);
            }
            b--;
        }

//        try{
//            System.out.println(50/3);
//        }
//        finally {
//            System.out.println("Yes this is finally");
//        }
    }
}
