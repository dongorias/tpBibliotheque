/**
 * AGOKOLI DON ARIAS
 * NDOUMBE DIEYE
 * **/

public class Main {
    public static void main(String[] args) {

        System.out.println("/**\n" +
                " * AGOKOLI DON ARIAS\n" +
                " * NDOUMBE DIEYE\n" +
                " * **/");

        // Instanciation des class Livre, Dvd et Revues
        Livre livre = new Livre("Victor Hugo", "Les Misérables", "Librairie Générale Française", "1862");
        DVD dvd = new DVD("Inception", 148, "Science-Fiction");
        Revues revue = new Revues("ISSN-1234-5678", "Revue des Sciences", "Sciences", "2023");


        // Creation d'un tableau de document avec initialisation avec les valeurs
        Document [ ] documents = {livre, dvd, revue};


        // Creation d'une instance de bibliotheque avec 3 comme taille de document
        Bibliotheque bibliotheque = new Bibliotheque(3);

        // Ajout des documents a la bibliotheque
        bibliotheque.ajouterDocument(documents);

        System.out.println("\nAvant supression");
        // Affichage des documents a la bibliotheque
        bibliotheque.afficherListeDocument();

        System.out.println();

        // Affichage d'un documents a la bibliotheque
        bibliotheque.supprimerUnDocument(1);

        System.out.println("Apres supression");
        bibliotheque.afficherListeDocument();

       //Recherche d'un document par nom auteur
       Document [] resultat = bibliotheque.rechercheParNomAuteur("Victor Hugo");

       System.out.println("\nResultats recherche : ");
       for (int i = 0; i < resultat.length; i++) {
           resultat[i].afficher();
       }



    }
}