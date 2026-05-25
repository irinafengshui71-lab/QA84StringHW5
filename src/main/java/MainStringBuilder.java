public class MainStringBuilder {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Hello ");
        sb.append(" world ");// dopisywaet slovo /dobowljaet w konze
        System.out.println(sb);
       // sb.delete(2,6);//ubiraet wnutri stroki
        //System.out.println(sb);
       // sb.insert(2, "llo ");//dobowljaet wnutri stroki
        //System.out.println(sb);
       // sb.insert(0, "Hi");
       // System.out.println(sb);

        //sb.replace(0,2,"Bye ");//Perepisiwaet 4astj stroki
        //System.out.println(sb);
       // sb.delete(2,sb.length());//udaljaet
       // System.out.println(sb);
        sb.reverse();//wywodit naoborot
        System.out.println(sb);
        String st = "Hello course ";//rasworot stroki
        StringBuilder sbl = new StringBuilder(st);
        sbl.reverse();
        //System.out.println(sbl);
        st = sbl.toString();
        System.out.println(st);
        boolean res = isPalindrome("l eveL");
        System.out.println(res);

    }
public static boolean isPalindrome(String s){

       // s= s.trim();
       // s = s.toLowerCase();
        s = s.replace(" ", "");
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String rev = sb.toString();
        return s.equalsIgnoreCase(rev);

}
}
