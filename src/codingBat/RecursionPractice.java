package codingBat;

public class RecursionPractice {

    public static void main(String[] args) {
        System.out.println(pairStar("anne"));
        System.out.println(countAbc("abcdabcabcaba"));
        System.out.println(countHi("ahixhi"));
        System.out.println(strCount("catcowcat", "cow"));
        System.out.println(bunnyEars(3));
        System.out.println(triangle(5));
        System.out.println(count8(888));
    }

    public static String pairStar(String str){
        if (str.length() <= 1)
            return str;

        if (str.charAt(0) == str.charAt(1))
            return str.charAt(0) + "*" + pairStar(str.substring(1));

        return str.charAt(0) + pairStar(str.substring(1));

    }

    public static int countAbc(String str){
        if (str.length() < 3)
            return 0;

        if (str.substring(0, 2).equals("ab")) {
            if (str.charAt(2) == 'a')
                return 1 + countAbc(str.substring(2));
            if (str.charAt(2) == 'c')
                return 1 + countAbc(str.substring(3));
        }

        return countAbc(str.substring(1));
    }

    public static int countHi(String str){
        if(str.length() <= 1)
            return 0;

        if(str.length() > 2 && str.substring(0, 3).equals("xhi"))
            return countHi(str.substring(3));

        if(str.substring(0, 2).equals("hi"))
            return 1 + countHi(str.substring(2));

        return countHi(str.substring(1));
    }

    public static int strCount(String str, String sub){
        if (str.length()<sub.length()) return 0;
        if (str.substring(0,sub.length()).equals(sub)) return 1 + strCount(str.substring(sub.length()),sub);
        return strCount(str.substring(1), sub);
    }

    public static int bunnyEars(int bunnies){
        if (bunnies==0) {
            return 0;
        }  else {
         return 2 + bunnyEars(bunnies-1);}
    }

    public static int triangle(int rows){
        if (rows==0) {
            return 0;
        }else {
            return rows + triangle(rows-1);
        }

    }

    public static int count8(int n){
        if(n == 0)
            return 0;
        if(n % 10 == 8)
        {
            if(n / 10 % 10 == 8)
                return 2+count8(n/10);
            return 1+count8(n/10);
        }
        return count8(n/10);
    }

}
