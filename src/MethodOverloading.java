public class MethodOverloading {
    // Method Overloading is also known as "compile time polymorphism  Or static polymorphism" because which method will be executed, decided at the time of compilition.
     static void  sum(){

         System.out.println("It's static method");
    }

    static void sum(int a,int b){
        System.out.println(a+b);

    }

    public static void main(String[] args) {

         sum();
         sum(8,9);

    }
}
