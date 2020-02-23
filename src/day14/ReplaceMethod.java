package day14;

public class ReplaceMethod {
    public static void main(String[] args) {
        String message = " I love Pumpkin, Pumpkin is FUN ";
        message.replace(" Pumpkin " , "Java ");
        System.out.println(message);

        String messsage = " I love Pumpkin, Pumpkin is FUN ";
        message = message.replace(" Pumpkin " , " Java ");
        System.out.println(message);

        // what if i want to replace space from everywhere
        String message2 = "Happy Thanks Giving to All!!!";
        message2 = message2.replace("Thanks Giving ", "Thanksgiving");
        System.out.println("message2 = " + message2);



    }
}
