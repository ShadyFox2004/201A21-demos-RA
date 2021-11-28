public class Embarquement {
    private AvionArrayList avion;

    public Embarquement() {
        int nbPassagerAEmbarquer = Util.lireEntierValide("Combien de passager dans l'avion ? ", 0, 5000);
        avion = new AvionArrayList(nbPassagerAEmbarquer);

        for (int i = 0; i < nbPassagerAEmbarquer; i++) {
            embarquerUnPassager();
        }

        System.out.println(avion);
    }

    private void embarquerUnPassager() {
        int poids;
        int age;
        boolean poidEtAgeEstValide;

        do {
            poids = Util.lireEntier("Quel est le poids du passager ? ");
            age = Util.lireEntierValide("Quel est l'age du passager ? ", 0, 200);
            poidEtAgeEstValide = Passager.ageEstValide(age) && Passager.poidsEstValide(poids);

            if (!poidEtAgeEstValide)
                System.out.println("Le poids et l'age doit être positif!");
        }
        while (!poidEtAgeEstValide);

        avion.ajouterPassager(new Passager(poids, age));
    }

    public static void main(String[] args) {
        new Embarquement();
    }
}
