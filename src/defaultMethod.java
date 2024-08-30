// What is the need of default method ?
// It is compulsory that which class implements the interface class must implement all the method of interface class .incase we don't want ot implement some method of interface class then we can  define that method in interface class through the default method ..

interface MyCamera{
    void takeSnap();
    void recordVideo();
    private void greet(){       // when default method's logic is large then we can use private   method , but note that private method isn't used outside the interface class. 
        System.out.println("Good Morning");
    }
    default void record4KVideo(){   // deault mehod
        greet();
        System.out.println("Recording in 4k...");
    }
}

interface MyWifi{ 
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting... ");
    }

}

class MySmartPhone extends MyCellPhone implements MyWifi, MyCamera{
    public void takeSnap(){
        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("Taking snap");
    }
//    public void record4KVideo(){
//        System.out.println("Taking snap and recoding in 4k");
//    }
    public String[] getNetworks(){
        System.out.println("Getting List of Networks");
        String[] networkList = {"Harry", "Prashanth", "Anjali5G"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to " + network);
    }
}
public class defaultMethod {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        ms.record4KVideo();
        // ms.greet(); --> Throws an error!
        String[] ar = ms.getNetworks();
        for (String item: ar) {
            System.out.println(item);
        }
    }
    
}
