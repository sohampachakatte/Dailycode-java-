package String;

public class trial {
    public static void main(String[] args) {
        StringBuilder sd = new StringBuilder();

        String str = "a, Man is A Boy";
        String str2 = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetterOrDigit(str.charAt(i))) {
                sd.append(str.charAt(i));
            }
        }
        System.out.println(sd.toString());
    }
}