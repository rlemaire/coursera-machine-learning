import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 */
public class QuizzClusteringWeek2 {
    public static double distanceEuclidienne(int[] vector1, int[] vector2) {
        double acc = 0;
        for (int i = 0; i < vector1.length; i++) {
            acc += (vector1[i] - vector2[i]) * (vector1[i] - vector2[i]);
        }
        return Math.sqrt(acc);
    }

    public static double normalization(int[] vector) {
        return Math.sqrt(Arrays.stream(vector).map(i -> i * i).sum());
    }

    public static double cosineDistance(int[] vector1, int[] vector2) {
        double acc = 0;
        for (int i = 0; i < vector1.length; i++) {
            acc += (vector1[i] * vector2[i]);
        }
        return acc / (normalization(vector1) * normalization(vector2));
    }

    public static void main(String ... args) {
        String sentence1 = "the quick brown fox jumps over the lazy dog";
        String sentence2 = "a quick brown dog outpaces a quick fox";
        List<String> words = new ArrayList<>();
        List<String> words1 = Arrays.asList(sentence1.split(" "));
        List<String> words2 = Arrays.asList(sentence2.split(" "));

        words.addAll(words1);
        Arrays.asList(sentence2.split(" ")).stream()
                .filter(w -> !words.contains(w))
                .forEach(w -> words.add(w));

        System.out.println(words);
        int[] vector1 = new int[words.size()];
        int[] vector2 = new int[words.size()];

        for (int i = 0; i < words.size(); i++) {
            if (words1.contains(words.get(i))) {
                vector1[i]++;
            }
            if (words2.contains(words.get(i))) {
                vector2[i]++;
            }
        }
        System.out.println(Arrays.toString(vector1));
        System.out.println(Arrays.toString(vector2));
        System.out.println(distanceEuclidienne(vector1, vector2));
        System.out.println(cosineDistance(vector1, vector2));
    }

}
