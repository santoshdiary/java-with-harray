class cylinder{

     private int radius; // private data member only used by the method of this class , outside of this class is used then it will through error
    private int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    // or by the help of constructor------

    public cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public double surfaceArea(){
        return (2*Math.PI*radius*height+2*Math.PI*radius*radius);
    }
    public double volume(){
        return Math.PI*radius*radius*height ;
    }

}

class Ractangle{
   private int length;

   private int breath;


    public Ractangle() {
        this.length = 4;
        this.breath = 5;
    }
    //here Rectangle constructor overloaded(same method , different parameters)
    public Ractangle(int length, int breath) {
        this.length = length;
        this.breath = breath;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreath() {
        return breath;
    }

    public void setBreath(int breath) {
        this.breath = breath;
    }


}

class sphere{
  private   int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double surfaceArea(){
        return 4*Math.PI*radius*radius;
    }
    public double volume(){
        return (double) 4 /3*Math.PI*radius*radius*radius;
    }
}
public class accessModifierPracticeSet
{
    public static void main(String[] args) {

        cylinder mycylinder =new cylinder(5 ,25);
//        mycylinder.setHeight(25);
//        mycylinder.setRadius(5);
        System.out.println("surface area:"+ mycylinder.surfaceArea());
        System.out.println("volume :"+ mycylinder.volume());


        Ractangle rectangle=new Ractangle();
      //  Ractangle rectangle=new Ractangle(4,5);
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getBreath());

        sphere s=new sphere();
        s.setRadius(5);
        System.out.println(s.getRadius());
        System.out.println("surface Area of sphere is:"+s.surfaceArea());
        System.out.println("volume of sphere is:"+s.volume());
    }


}
