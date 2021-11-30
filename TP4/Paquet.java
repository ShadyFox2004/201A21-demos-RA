import java.util.ArrayList;

public class Paquet {
    private ArrayList<Carte> paquet = new ArrayList<Carte>();

    Paquet(boolean estRempl) {
        if (estBrasser) {
            remplirPaquet();
        };
    }

    /**
     * Retourne le nombre de carte dans le paquet.
     */
    public int getNombreDeCartes() {
        return paquet.size();
    }

    /**
     * Retourne true si le paquet est vide.
     */
    public boolean estVide() {
        return getNombreDeCartes() == 0;
    }

    /**
     * Change l'ordre des cartes.
     */
    private void melanger() {
        for (int carteIndex = 0; carteIndex < paquet.size(); carteIndex++) {
            permuter(carteIndex, Util.getInt(paquet.size()));
        }
    }

    /**
     * Echange carte1 et carte2
     *
     * @param carte1Index
     * @param carte2Index
     */
    private void permuter(int carte1Index, int carte2Index) {
        Carte premiereCarte = paquet.get(carte1Index);
        Carte deuxiemeCarte = paquet.get(carte2Index);

        paquet.set(carte2Index, premiereCarte);
        paquet.set(carte2Index, deuxiemeCarte);
    }

    public Carte piger() {

    }

    /**
     * Ajoute les 52 carte au paquet;
     */
    private void remplirPaquet() {
        for (String couleur : Carte.COULEURS_VALIDES) { //  Pour chaque couleurs
            for (int valeur = 1; valeur < 13; valeur++) {  //  Chaque valeure
                paquet.add(new Carte(valeur, couleur));
            }
        }
    }
}
