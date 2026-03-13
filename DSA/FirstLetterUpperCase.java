public class FirstLetterUpperCase {

    public static String toUpperCase(String str) {

        StringBuffer sb = new StringBuffer("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {

            if (str.charAt(i - 1) == ' ' && i < str.length()) {
                sb.append(Character.toUpperCase(str.charAt(i)));
            } 
            else {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "hi i am ilma";
        System.out.println(toUpperCase(s));
    }
}