package day32;

public class CharacterActions {

    public static void main(String[] args) {
        printAtoZ();
        printZtoA();
        printAlphabetInRange('a', 'f');
        printAlphabetInRange('G', 'B');
        printAlphabetInRange('A', 'A');
        printAlphabetInRange('a', 'A');
        printAlphabetInRange('Z', 'a');




    }
    public static void  printAlphabetInRange(char beginning, char ending){
        if (beginning< ending) {
            System.out.println("WE NEED TO INCREMENT FORM " + beginning + "till" + ending);
            for (char iChar = beginning; iChar <= ending; iChar++) {
                System.out.println(iChar + " ");
            }
            System.out.println();
        }else if(beginning>ending) {
            System.out.println("WE NEED TO DECREMENT FROM " +beginning +"till" +ending) ;

        }

    }


    public static void printAtoZ() {
        for (char iChar = 'A'; iChar <= 'Z'; iChar++) {
            System.out.print(iChar+" ");
        }
        System.out.println();
    }
    public static void printZtoA(){
        for (char iChar = 'Z'; iChar <= 'A'; iChar++)  {
            System.out.print(iChar + " ");

        }
        System.out.println();
    }
}
