import java.util.Random;

public class Util {
    private static Random rng = new Random();

    public static int trouverStr(String maChaine, String[] tab) {
        int indexDeLaChaine;
        for (int i = 0; i < tab.length; i++) {
            if (maChaine.equalsIgnoreCase(tab[i])) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Fourni un nombre aleatoire
     * @return
     */

    public static int getInt(int max) {
        return rng.nextInt(max);
    }
}
