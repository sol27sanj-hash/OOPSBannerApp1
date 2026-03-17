import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Step 1: Create Map
        Map<Character, String[]> map = new HashMap<>();

        // Step 2: Add patterns
        map.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        map.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        map.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        // Step 3: Word to print
        String word = "OOPS";

        // Step 4: Print banner
        for (int i = 0; i < 5; i++) {   // rows
            for (int j = 0; j < word.length(); j++) {
                char ch = word.charAt(j);

                // Get pattern from map
                String[] pattern = map.get(ch);

                System.out.print(pattern[i] + "  ");
            }
            System.out.println();
        }
    }
}