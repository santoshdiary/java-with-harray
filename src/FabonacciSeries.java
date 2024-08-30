public class FabonacciSeries {
    public void fabonacci(int nthTerm){
    int firstTerm=0;
    int secondTerm=1;


        for(int i=1;i<=nthTerm;i++){

            System.out.print(firstTerm +",");

            int nextTerm=firstTerm+secondTerm;
            firstTerm=secondTerm;
            secondTerm=nextTerm;


        }
    }
    public static void main(String[] args) {
    FabonacciSeries f=new FabonacciSeries();
    f.fabonacci(10);
    }
}
