

class MyEmployee{
    private int id;  // this data member only used by the help of this class' method
    //  because it is private. if it is used outside of this class it will throw an error.

    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}
public class AccessModifier {
    public static void main(String[] args) {
        MyEmployee harry = new MyEmployee();
        //harry.id = 45;
        // harry.name = "CodeWithHarry"; //--> Throws an error due to private access modifier
        harry.setName("CodeWithHarry");
        System.out.println(harry.getName());
        harry.setId(234);
        System.out.println(harry.getId());
    }
}
