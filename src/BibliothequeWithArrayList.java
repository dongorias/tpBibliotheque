import java.util.ArrayList;

public class BibliothequeWithArrayList {
    private final ArrayList<Document> arrayListDocument;


    public BibliothequeWithArrayList(ArrayList<Document> arrayList) {
        this.arrayListDocument = arrayList;
    }


    public void ajouterDocument(Document document) {
        this.arrayListDocument.add(document);
    }

    public void supprimerUnDocument(Document document) {

        this.arrayListDocument.remove(document);

    }


    public void afficherListeDocument() {
        for (Document document : this.arrayListDocument) {
            document.afficher();
        }

    }

    public ArrayList<Document> rechercheParNomAuteur(String auteur) {
        ArrayList<Document> response = new ArrayList<>();
        for (Document document : this.arrayListDocument) {
            if (document instanceof Livre livre) {
                if (livre.getNomAuteur().equals(auteur)) {
                    response.add(livre);
                }
            }
        }
        return response;
    }

}
