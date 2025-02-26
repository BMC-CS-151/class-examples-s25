public class ContainsLetter {

    public static boolean containsLetter(String letter, String word) {
        if (word.length() == 0) {
            return false;
        }

        String curChar = word.substring(word.length()-1);
        if (curChar.equals(letter)) {
            return true;
        }
        //return containsLetter(letter, word.substring(0, word.length()-1));
        return containsLetter(letter, word);
    }

    public static void main(String[] args) {
        System.out.println(containsLetter("l", "hello"));
        System.out.println(containsLetter("@", "@@@@"));
        System.out.println(containsLetter("l", ""));
    }
}
