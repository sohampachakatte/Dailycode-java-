package String.hw;

public class compression {
    public static void main(String[] args) {
        StringBuilder sd = new StringBuilder("");
        String var = "aabbccdd";
        for (int i = 0; i < var.length(); i++) {
            int count = 1;
            while (i + 1 < var.length() && var.charAt(i) == var.charAt(i + 1)) {
                count++;
                i++;
            }
            sd.append(var.charAt(i));
            if (count > 1) {
                sd.append(count);
            }
        }
        System.out.println(sd);
    }
}
