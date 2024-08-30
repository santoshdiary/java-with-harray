// see Notes for complete clarity of access modifier.


class C1{
    public int x = 5;
    protected int y =45;
    int z = 6;              // default modifier..
    private int a = 78;
    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}
public class AccessModifierAdvance {
    public static void main(String[] args) {
        C1 c = new C1();
         c.meth1();
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
        // System.out.println(c.a); --> it will through an error because it "a" is private data memeber that  only used by C1 class only. we can't access individual private memeber. 
    }  
}
