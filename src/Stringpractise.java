public class Stringpractise {
    public static void main(String[] args) {

String str=new String("SANTOSH HANSDIHA");
        System.out.println(str.toLowerCase());


        String str2="santosh  kumar";
        str2=str2.replace(" " ,"_" );
        System.out.println(str2);
        // problem 3

        String letter="Dear <|name|> , Thanks a lot.";
        letter=letter.replace("<|name|>","Harry");
        System.out.println(letter);
        //problem 4
        String str3="My friend I  always be thankful to you";
        System.out.println(str3.indexOf(" "));
        System.out.println(str3.indexOf("  "));
        System.out.println(str3.indexOf("   "));
        // -1 result shows that triple space is not in this string because string
         //   index start with 0

            // problem 5
            String myletter= "Dear Harry \n\t This is Java course is nic,\n\tthanks";
            System.out.println(myletter);



    }
}
