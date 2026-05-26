public class MainStringHW7 {
    public static void main(String[] args) {
        printCapitals("Hello Course QA 84");

        printLastReverse("Hello course QA 84");

        String s = "ccbbbddddda";
        System.out.println(maxSameChars(s));
    }

    public static void printCapitals(String s) {

//        StringBuilder result = new StringBuilder();
//        for (int i = 0; i< s.length(); i++){
//            char ch =s.charAt(i);
//            if (Character.isUpperCase(ch));
//        }

        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            //prüfen: ob buchsabe ist und grosse Buchstabe
            if (Character.isUpperCase(ch)) {
                result += ch;
            }
        }
        System.out.println(result);
    }

    public static void printLastReverse(String s) {
        String[] words = s.split(" ");
        String result = "";
        for (int i = words.length - 1; i >= 0; i--) {
            String word = words[i];
            char lastChar = word.charAt(word.length() - 1);
            result += lastChar;
        }
        System.out.println(result);
    }

    public static int maxSameChars(String s) {
        int max = 1;
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
                if (count > max) {
                    max = count;
                } else {
                    count = 1;
                }
            }
        }
        return max;
    }
}
/*
 2. public static void printCapitals(String s)//raspe4atatj perwujü bukwu
    s-> " Hello course QA 84"
    output:
    "HCQA"

     3.
    public static void printLastReverse(String s)
    s-> " Hello course QA 84"
    output:
    "4Aeo"

     ADVANCED N1

        0123456789
    s->"ccbbbdddda"
    return 5
 */