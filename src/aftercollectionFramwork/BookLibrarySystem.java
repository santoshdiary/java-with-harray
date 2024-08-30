package aftercollectionFramwork;


import java.sql.SQLOutput;
import java.util.ArrayList;

class MyBook {
    public String BookName,Author;
    MyBook(String BookName, String Author){
        this.BookName=BookName;
        this.Author=Author;
    }
    @Override
    public String toString(){
        return "BookName:"+BookName+" "+"Author:"+Author;
    }
}
class Library{
    public ArrayList<MyBook> book;
    Library(ArrayList<MyBook>book){
        this.book=book;
    }
    public void addBook(MyBook book){
        System.out.println("BOOK:"+ book +" has been added in library");
    this.book.add(book);
    }
    public void issueBook(MyBook book,String To_issue){
        System.out.println("BOOK:"+book+" is issued to "+ To_issue);
        this.book.remove(book);
    }
    public void returnBook(MyBook kitab){
        System.out.println("BOOK: "+kitab+ " has been returned");
        this.book.add(kitab);
    }



}
public class BookLibrarySystem {
    public static void main(String[] args) {
      ArrayList<MyBook> b=new ArrayList<>(); // creating an  Arraylist whose type is MyBook class.

      MyBook b1=new MyBook("thought of the day 1 ","Santosh1"); // creating obj of MyBook class so that we can pass it,through the ArrayList's add method.
      b.add(b1);                                                                // passing the obj of MyBook class in ArrayList's add() method.

        MyBook b2 =new MyBook("thought of the day 2 ","Santosh2");
        b.add(b2);
        MyBook b3 =new MyBook("thought of the day 3 ","Santosh3");
        b.add(b3);
        MyBook b4 =new MyBook("thought of the day 4","Santosh4");
        b.add(b4);

        System.out.println(b);
        Library l=new Library(b);
        l.issueBook(b1,"Aman");
        System.out.println(b);
        l.addBook(new MyBook("LIFE OF VILLAGE", "PANKAJ THRIPATHI"));
        System.out.println(b);


    }
}
