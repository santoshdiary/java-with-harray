public class thisKeyword {
void show(){
    System.out.println(this);
}


    public static void main(String[] args) {
        thisKeyword r=new thisKeyword();
        System.out.println(r);
        r.show();

        // here r, and this give same output that means it refers same object;
    }
}
