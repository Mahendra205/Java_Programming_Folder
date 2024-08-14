package String;

public class charAtMethod {
    public static void findLetters(String fullName) {
        for (int i = 0; i < fullName.length(); i++) {
            System.out.print(fullName.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String firstName = "Mahendra";
        String lastName = "Betal";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        findLetters(fullName);

    }
}
