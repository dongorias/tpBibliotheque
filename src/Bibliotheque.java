/**
 * AGOKOLI DON ARIAS
 * NDOUMBE DIEYE
 * **/

public class Bibliotheque {
    private int tailleTableau;
    private Document tableauDeDocument[];

    public Bibliotheque(int tailleTableau) {
        this.tailleTableau = tailleTableau;
        this.tableauDeDocument = new Document[this.tailleTableau];
    }


    public void ajouterDocument(Document document[]) {
        for (int i = 0; i < this.tailleTableau; i++) {
            this.tableauDeDocument[i] = document[i];
        }
    }

    public void supprimerUnDocument(int index) {

        // Vérifier que l'index est valide
        if (index >= 0 && index < this.tailleTableau) {

            // Créer le nouveau tableau avec une taille réduite
            Document[] nouveauTableau = new Document[this.tailleTableau - 1];

            // Variable pour suivre la position dans le nouveau tableau
            int j = 0;

            // Copier tous les éléments sauf celui à supprimer
            for (int i = 0; i < this.tailleTableau; i++) {
                // Si ce n'est pas l'index à supprimer, copier l'élément
                if (i != index) {
                    nouveauTableau[j] = this.tableauDeDocument[i];
                    j++;
                }
            }
            this.tailleTableau = this.tailleTableau -1;
            this.tableauDeDocument = nouveauTableau;
        }

    }


    public void afficherListeDocument() {
        for (Document document : this.tableauDeDocument) {
            document.afficher();
        }
    }

    public Document[] rechercheParNomAuteur(String auteur) {
        int compteur = 0;

        // Parcourir le tableau pour trouver le nombre d'occurence du nom de l'auteur
        for (int i = 0; i < this.tailleTableau; i++) {

            if (this.tableauDeDocument[i] instanceof Livre livre) {
                if (livre.getNomAuteur().equals(auteur)) {
                    compteur++;
                }
            }
        }

        int[] indexAuteurFind = new int[compteur];

        // Remplir le tableau des index

        int positionResultat = 0;
        for (int i = 0; i < this.tailleTableau; i++) {
            if (this.tableauDeDocument[i] instanceof Livre livre) {
                if (livre.getNomAuteur().equals(auteur)) {
                    indexAuteurFind[positionResultat] = i;
                    positionResultat++;
                }
            }
        }

        Document[] resultat = new Document[compteur];

        // Parcourir le tableau d'index
        for (int i = 0; i < indexAuteurFind.length; i++) {
            resultat[i] = this.tableauDeDocument[indexAuteurFind[i]];

        }

        return resultat;

    }


}
