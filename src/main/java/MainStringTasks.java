public class MainStringTasks {
    public static void main(String[] args) {
        printSentenceReverse("Hello course QA");

}
        public static void printSentenceReverse(String s){

            String[] ar = s.split("");
            for (int i = ar.length - 1; i >= 0; i--) {
                System.out.print(ar[i] + " ");
            }
            System.out.println();

    }
}

/*

#1
public static void printSentenceReverse1(String sentence)
sentence -> "Hello course QA 84"
output:
84
QA
course
Hello

#2 advanced
public static void printSentenceReverse2(String sentence)
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

// HW6

public static boolean isPalindrom(String str){
    if (str == null)
        return false;
    str = str.trim();
    str = str.toLowerCase();

    for (int i = 0,j = str.length()-1;i < j;i++,j--){
        char ci = str.charAt(i);
        char cj = str.charAt(j);
        if (ci != cj)
            return false;
    }
    return true;
}
HW/7

HW -> ADVANCED N1

        0123456789
    s->"ccbbbdddda"
    return 5

    2. public static void printCapitals(String s)//raspe4atatj perwujü bukwu
    s-> " Hello course QA 84"
    output:
    "HCQA"
    3.
    public static void printLastReverse(String s)
    s-> " Hello course QA 84"
    output:
    "4Aeo"

    4.
    .  ADVANCED *****
public static String insertFrom(String s, int index, String ins)
     012345678910
s-> "Hello world"
ins- > "my "
index -> 6

result str -> "Hello my world" to return




 */