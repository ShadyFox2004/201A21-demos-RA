public class Passager
{
    public static final int POIDS_DEFAUT = 300;
    public static final int AGE_DEFAUT = 50;

    private int poids;
    private int age;

    //Constructeur par défaut
    public Passager()
    {
        this(POIDS_DEFAUT, AGE_DEFAUT);
    }

    public Passager(int poids, int age)
    {
        setPoids(poids);
        setAge(age);
    }

    public int getPoids()
    {
        return poids;
    }

    public void setPoids(int poids)
    {
        if (!poidsEstValide(poids))
            throw new IllegalArgumentException("Un poids négatif n'est pas valide.");
        this.poids = poids;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        if (!ageEstValide(age))
            throw new IllegalArgumentException("Un age négatif n'est pas valide.");
        this.age = age;
    }

    public static boolean poidsEstValide(int poids)
    {
        return 0 <= poids;
    }

    public static boolean ageEstValide(int age)
    {
        return 0 <= age;
    }

    @Override
    public String toString()
    {
        return "Passager{" +
                "poids=" + poids +
                ", age=" + age +
                '}';
    }

    ///////////////////////////// PAS MONTRER ÇA POUR LE MOMENT//////////////////////
    /**
     //     * Retourne Vrai si le passager reçu en argument est plus pesant que l'objet courant.
     //     * @param passager
     //     * @return Vrai si le passager reçu en argument est plus pesant que l'objet courant
     //     */
//    public boolean estPlusPesant(Passager passager) {
//        boolean estPlusLourd;
//        estPlusLourd = this.poids < passager.getPoids();
//        return estPlusLourd;
//    }
//
//    /**
//     * Retourne Vrai si le passager reçu en argument est plus vieux que l'objet courant.
//     * @param passager
//     * @return Vrai si le passager reçu en argument est plus vieux que l'objet courant
//     */
//    public boolean estPlusVieux(Passager passager) {
//        boolean estPlusVieux;
//        estPlusVieux = this.age < passager.getAge();
//        return estPlusVieux;
//    }
//
//    /**
//     * Retourne Vrai si le passager1 est plus vieux que le passager2
//     * @param passager1
//     * @param passager2
//     * @return Vrai si le passager1 est plus vieux que le passager2
//     */
//    public static boolean estPlusVieux(Passager passager1, Passager passager2) {
//        boolean estPlusVieux;
//        estPlusVieux = passager1.estPlusVieux(passager2);
//        return estPlusVieux;
//    }


}
