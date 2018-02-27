import edu.princeton.cs.algs4.StdOut;

/**
 * 1.3.4
 * Write a stack client Parentheses that reads in a text stream from standard input
 * and uses a stack to determine whether its parentheses are properly balanced.
 * For example, your program should print true for [()]{}{[()()]()} and false for [(]).
 *
 * @author <a href="mailto:piotr@piotrovski.com">Piotr Piotrowski</a>
 */
public class Ex_1_3_4 {

    public static void main(String[] args) {
        if (!Parentheses.test("[()]{}{[()()]()}")) {
            StdOut.println("string: [()]{}{[()()]()} is balanced");
        }
        if (Parentheses.test("[(])")) {
            StdOut.println("string: [(]) is not balanced");
        }
    }

}

class Parentheses {

    static boolean test(String stringToTest) {
        FixedCapacityStackOfStrings s = new FixedCapacityStackOfStrings(
                stringToTest.length());
        String currentCharacter;
        String previousCharacter = "";
        for (int i = 0; i < stringToTest.length(); i++) {
            currentCharacter = "" + stringToTest.charAt(i);
            if (!"".equals(previousCharacter) && reverse(previousCharacter)
                    .equals(currentCharacter)) {
                s.pop();
                if (!s.isEmpty()) {
                    previousCharacter = s.pop();
                    s.push(previousCharacter);
                }
                continue;
            }
            s.push(currentCharacter);
            previousCharacter = currentCharacter;
        }
        return s.isEmpty();
    }

    private static String reverse(String str) {
        if ("(".equals(str)) {
            return ")";
        } else if ("[".equals(str)) {
            return "]";
        } else if ("{".equals(str)) {
            return "}";
        } else {
            return "";
        }
    }

}
