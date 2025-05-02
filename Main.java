public class Main {
    public static void main(String[] args) {
        String[] words = {"the", "red", "fox", "the", "red"};
        WordPairList list = new WordPairList(words);
        System.out.println(list);            // Optional: see all pairs
        System.out.println(list.numMatches()); // Expected output: 2
    }
}
