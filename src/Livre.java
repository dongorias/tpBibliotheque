/**
 * AGOKOLI DON ARIAS
 * NDOUMBE DIEYE
 * **/

import java.util.ArrayList;
import java.util.Objects;

public class Livre implements Document{
    private String nomAuteur;
    private String titre;
    private String editeur;
    private String anneeEdition;

    public Livre(String nomAuteur, String titre, String editeur, String anneeEdition) {
        this.nomAuteur = nomAuteur;
        this.titre = titre;
        this.editeur = editeur;
        this.anneeEdition = anneeEdition;
    }

    public String getNomAuteur() {
        return nomAuteur;
    }

    public void setNomAuteur(String nomAuteur) {
        this.nomAuteur = nomAuteur;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getEditeur() {
        return editeur;
    }

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }

    public String getAnneeEdition() {
        return anneeEdition;
    }

    public void setAnneeEdition(String anneeEdition) {
        this.anneeEdition = anneeEdition;
    }

    public ArrayList<Document> rechercherParNomAuteur(String nomAuteur, ArrayList<Document> documents) {
            ArrayList<Document> response = new ArrayList<>();
            for (Document d : documents) {
                if(d instanceof Livre livre){
                    if(Objects.equals(nomAuteur, livre.nomAuteur)){
                        response.add(d);
                    }

                }
            }
            return  response;
    }



    public void afficher() {
        System.out.println("Auteur=>" + nomAuteur + "Titre: " + titre + " Éditeur: " + editeur + " Année d'édition: " + anneeEdition);
    }



}
