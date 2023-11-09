import java.util.Random;

public class RandomSentence2 {
    public static void main(String[] args) {
        String[] article = { "the", "a", "one", "some", "any" };
        String[] noun = { "boy", "girl", "dog", "town", "car" };
        String[] verb = { "drove", "jumped", "ran", "walked", "skipped" };
        String[] preposition = { "to", "from", "over", "under", "on" };

        Random rand = new Random();

        for (int i = 0; i < 20; i++) {
            String sentence = capitalize(article[rand.nextInt(article.length)]);
            sentence += " " + noun[rand.nextInt(noun.length)];
            sentence += " " + verb[rand.nextInt(verb.length)];
            sentence += " " + preposition[rand.nextInt(preposition.length)];
            sentence += " " + article[rand.nextInt(article.length)];
            sentence += " " + noun[rand.nextInt(noun.length)] + ".";
            System.out.println(sentence);
        }
    }

    static String capitalize(String s) {
        return s.substring(0, 1).toUpperCase() + s.substring(1);
    }
}
