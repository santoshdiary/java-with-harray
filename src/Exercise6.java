
         /*
        Exercise 6: You have to create a custom calculator with following operations:
        1. + -> Addition
        2. - -> Subtraction
        3. * -> Multiplication
        4. / -> Division
        which throws the following exceptions:
        1. Invalid input Exception ex: 8 & 9
        2. Cannot divide by 0 Exception
        3. Max Input Exception if any of the inputs is greater than 100000
        4. Max Multiplier Reached Exception - Don't allow any multiplication input to be greater than 7000
         */









class MaxInputException extends Exception{
    @Override
  public String getMessage(){
    return "Input must be under 10000";
  }

}
class InvailInputException extends Exception{
    @Override
    public String getMessage(){
      return " inputs 8 & 9 are not allowed .";
    }
  
}
class CannotDivideByZeroException extends Exception{
    @Override
    public String getMessage(){
      return "can't be divided by zero";
    }
  
}
class MaxMultiplyInputException extends Exception{
    @Override
    public String getMessage(){
      return " More than 8000 is not allowed in multiplier";
    }
  
}

class customCalculator{
    public double add(double a, double b) throws MaxInputException,InvailInputException{
        if(a>10000||b>10000){
            throw new MaxInputException();
        }

        if (a==8|| a==9||b==8||b==9) {
            throw new InvailInputException();
        }
        return a+b;
    }

    public double sub(double a, double b)throws MaxInputException,InvailInputException{

        if(a>10000||b>10000){
            throw new MaxInputException();
        }

        if (a==8|| a==9||b==8||b==9) {
            throw new InvailInputException();
        }
        return a-b;
    }
    public double multi(double a, double b) throws MaxMultiplyInputException,InvailInputException{
        if (a==8|| a==9||b==8||b==9) {
            throw new InvailInputException();
        }
        if(a==8000||b==8000){
            throw new MaxMultiplyInputException();
        }
        return a*b;
    }
    public double div(double a, double b)throws MaxInputException,InvailInputException,CannotDivideByZeroException{
        if(b==0){
            throw new CannotDivideByZeroException();

        }
        if (a==8|| a==9||b==8||b==9) {
            throw new InvailInputException();
        }
        if(a>10000||b>10000){
            throw new MaxInputException();
        }

        return a/b;
    }


}


public class Exercise6{
public static void main(String[] args)throws MaxInputException,InvailInputException,CannotDivideByZeroException,MaxMultiplyInputException{
    
customCalculator c=new customCalculator();
   // c.add(8, 89);
   // c.div(89, 0);







}


}