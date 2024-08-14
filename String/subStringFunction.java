package String;

public class subStringFunction {
    public static String createSubstString(String str, int si, int ei) {
        String subs = "";
        for (int i = si; i < ei; i++) {
            subs += str.charAt(i);
        }
        return subs;
    }

    public static void main(String[] args) {
        String str = "mahendra";
        // java in built substring method
        // System.out.println(str.substring(0, 5));
        System.out.println(createSubstString(str, 0, 5));
    }
}
