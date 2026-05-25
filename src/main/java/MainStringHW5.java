public class MainStringHW5 {
    public static void main(String[] args) {

        boolean res = isPalindrome("a rosa upala na lapu asora");
        if (res == true)
            System.out.println("palindrome");
        else
            System.out.println("not palindrome");

        String str = "Hello world";
        char sym = 'l';
        printCharIndex(str, sym);

        String sentence = "Hello course QA84";
        System.out.println("  # 1: ");
        printSentenceReverse1(sentence);
        System.out.println("# 2: ");
        printSentenceReverse2(sentence);
        boolean rs = isPalindrome("Level");
        System.out.println(rs);


    }

    public static boolean isPalindrome(String str) {
        str = str.replace(" ", "");
//
        str = str.replace(" ", "");
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String rev = sb.toString();
        return str.equalsIgnoreCase(rev);
    }
    public static void printCharIndex(String str, char sym){
        for (int i = 0; i< str.length(); i ++){
            if(str.charAt(i) == sym){
                System.out.print(i + "");
            }
        }
    }
    public static void printSentenceReverse1(String sentence){
        String[]words = sentence.split(" ");
        for (int i = words.length -1; i >= 0; i--){
            System.out.println(words [i]);
        }
    }
    public static void printSentenceReverse2(String sentence){
        String[] words = sentence.split(" ");
        for (int i = words.length -1; i >= 0; i--){
            String word = words[i];
            String reversed = "";
            for (int j = word.length() - 1; j >= 0; j--){
                reversed += word.charAt(j);
            }
            System.out.println(reversed);
        }
    }


}

/* HW5
public class Palindrome

  public static boolean isPalindrome(String str){
         }
public static void main(String[] args){
    boolean res = isPalindrome("a roza upala na lapu azora");


   //  1#  public static void printCharIndex(String str, char sym)
        012345678910
str  = "hello world" sum = 'l'
output:
2 3 9

#1
public static void printSentenceReverse1(String sentence) // V
sentence -> "Hello course QA 84"
output:
84
QA
course
Hello

#2 advanced
public static void printSentenceReverse2(String sentence)// V
sentence -> "Hello course QA 84"
48
AQ
esruoc
olleH


#3 advanced
public static boolean isPalindrom(String str)
str -> "Level"

#4advanced ***
public static boolean isPalindrom(String str)
str -> "Name now one man";

 */






