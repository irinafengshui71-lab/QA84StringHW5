public class MainSrtingMethods {

    public static void main(String[] args) {

        String s = "hello ";
        boolean res = s.contains("k");
        System.out.println(res);

        int i = s.indexOf('l');
        System.out.println("i = " + i);

        i = s.lastIndexOf("h");
        System.out.println("i = " + i);

        s = "";
        res = s.isBlank(); // pusto
        System.out.println(res);

        res = s.isEmpty(); // pusto nicht ->NULL
        System.out.println(res);

        int n = Integer.parseInt("12");
        String st = String.valueOf(12);
        int count = findChar("hello",'l');

        System.out.println("Count =" + count);

        res = isPalindrome("level");
        if (res == true)
            System.out.println("palindrome");
        else
            System.out.println("not palindrome");


    }
    public static boolean isPalindrome(String str) {
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            char ci = str.charAt(i);
            char cj = str.charAt(j);
            if (ci != cj);
        }
                return false;
        }


        public static int findChar (String str,char sym){
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                char curr = str.charAt(i);
                if (curr == sym)
                    count++;
            }
            return count;
        }
    }

/*
public class Palindrome {


    public static boolean isPalindrome(String str){
        for (int i = 0, j = str.length()-1; i<j; i++, j-- ){

            if (str.charAt(i) == ' ' ) {
                i++;

            }
                if (str.charAt(j) == ' ' ){
                    j--;

            }
            char bi = str.charAt(i);
            char bj = str.charAt(j);
            if (bi != bj)
               return false;
        }
        return true;

    }
public static void main(String[] args){
    boolean res = isPalindrome("a roza upala na lapu azora");
    System.out.println(res);

  1#  public static void printCharIndex(String str, char sym)
        012345678910
str  = "hello world" sum = 'l'
output:
2 3 9

2# try to write isPalindrome()
 */


