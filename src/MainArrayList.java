/**
 * AGOKOLI DON ARIAS
 * NDOUMBE DIEYE
 * **/


import java.util.ArrayList;

public class MainArrayList {
    public static void main(String[] args) {

        System.out.println("/**\n" +
                " * AGOKOLI DON ARIAS\n" +
                " * NDOUMBE DIEYE\n" +
                " * **/");

        // Instanciation des class Livre, Dvd et Revues
        Livre livre = new Livre("Victor Hugo", "Les Misérables", "Librairie Générale Française", "1862");
        DVD dvd = new DVD("Inception", 148, "Science-Fiction");
        Revues revue = new Revues("ISSN-1234-5678", "Revue des Sciences", "Sciences", "2023");

        // Creation d'un tableau dynamic de document
        ArrayList<Document> arrayList  = new ArrayList<>();

        // Creation d'une instance de bibliotheque
        BibliothequeWithArrayList bibliotheque = new BibliothequeWithArrayList(arrayList);

        // Ajout des document dans la bibliotheque
        bibliotheque.ajouterDocument(livre);
        bibliotheque.ajouterDocument(dvd);
        bibliotheque.ajouterDocument(revue);

        System.out.println("\nAvant supression");
        // Affichage des documents a la bibliotheque
        bibliotheque.afficherListeDocument();

        System.out.println();

        // Affichage d'un documents de la bibliotheque
        bibliotheque.supprimerUnDocument(dvd);

        System.out.println("Apres supression");
        bibliotheque.afficherListeDocument();

       //Recherche d'un document par nom auteur
       ArrayList<Document> resultat = bibliotheque.rechercheParNomAuteur("Victor Hugo");

       System.out.println("\nResultats recherche : ");
       for (Document d : resultat) {
           d.afficher();
       }



    }
}