

class Circle{
    public int radius;
    Circle(){    // just for default constructor analysis
        System.out.println("I am non parameterised constructor of circle");
    }
    Circle(int r){
        System.out.println("I am circle parameterized constructor");
        this.radius = r;
    }

    public double area(){
        System.out.println("area of circle:");
        return Math.PI*this.radius*this.radius;
    }
}

class Cylinder1 extends Circle{
    public int height;
    Cylinder1(int r, int h){
        super(r);                // it calls super class parameterised constructor.
        System.out.println("I am cylinder1 parameterized constructor");
        this.height = h;
    }
    public double volume(){
        System.out.println("volume of cylinder:");
        return Math.PI*this.radius*this.radius*this.height;
    }
}
class Rectangle1{
    public int length;
    public int width;
    Rectangle1(int l,int w){
        this.length=l;
        this.width=w;
    }
    public int area(){
        System.out.println("area of rectangle:");
        return length*width;
    }


}
class Cuboid extends Rectangle1{
    public int height;
    Cuboid(int l,int w,int h){
        super(l,w);
        this.length=l;
        this.width=w;
        this.height=h;
    }
    public int volume(){
        System.out.println("volume of cuboid:");
        return height*width*length;

    }



}



public class chapeter10 {
    public static void main(String[] args) {
        // Problem 1

//        Cylinder1 obj = new Cylinder1(12, 4);
//        System.out.println(obj.area());
//
// Rectangle1 r= new Rectangle1(6,9);
//        System.out.println(  r.area());
Cuboid c=new Cuboid(8,9,3);
        System.out.println(c.area());
        System.out.println(c.volume());


    }
}
