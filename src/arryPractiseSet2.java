public class arryPractiseSet2 {
    public static void main(String[] args) {
        int [] marks={2,6,9,3,14,};

        int min=marks[0];  //let the first element is minimum
        for(int i=0;i<=marks.length-1;i++){

            if(marks[i]<min){
                min=marks[i];
            }
        }
        System.out.println("min number in array is :"+min);
    }
}
