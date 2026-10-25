import java.util.Scanner;

public class first{

    public static void main(String[] args) {
        String pattern = "Fi_er".toLowerCase();
        String input = "feber:filer:filter:fibre:fiber:fixer:tailor:offer".toLowerCase();

        String[] words = input.split(":");
        StringBuilder result = new StringBuilder();

        for (String word : words) {

            if (word.length() != pattern.length()) {
                continue;
            }

            boolean match = true;

            for (int i = 0; i < pattern.length(); i++) {
                if (pattern.charAt(i) != '_'
                        && pattern.charAt(i) != word.charAt(i)) {
                    match = false;
                    break;
                }
            }

            if (match) {
                if (result.length() > 0) {
                    result.append(":");
                }

                result.append(word.toUpperCase());
            }
        }

        if (result.length() > 0) {
            System.out.println(result);
        }
    }
}
