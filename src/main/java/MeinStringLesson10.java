public class MeinStringLesson10 {

    public static void main(String[] args){

        String s = "hello";
        s = " Hallo world ";
        //
        s = s.toUpperCase();
        String s1 = s.toUpperCase();
        System.out.println(s);

        s = s.toLowerCase();
        System.out.println(s);

        s =s.replace('l','T');
        System.out.println(s);

        s = s.trim(); //s.strip() neue
        System.out.println(s);

        String s2 = s.substring(6);
        System.out.println(s2);

        s1 = s.substring(3,8);
        System.out.println(s2);

        s = "Hello curs QA";
        String[]ar = s.split(" ");
        for (String st: ar){
            System.out.println(st);
        }
        String s4 = "Hello world";
        char[] ar1 = s4.toCharArray();
        for (char sym: ar1){
            System.out.print(sym + " ");
        }
        String s5 = "bey";
        boolean res = s5.equals("");
        System.out.println(res);
        res = s5.equalsIgnoreCase("BYE");
        System.out.println(res);



    }
}
