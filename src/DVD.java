/**
 * AGOKOLI DON ARIAS
 * NDOUMBE DIEYE
 * **/


public class DVD implements  Document{
    private String titre;
    private int duree;
    private String domaine;

    public DVD(String titre, int duree, String domaine) {
        this.titre = titre;
        this.duree = duree;
        this.domaine = domaine;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public String getDomaine() {
        return domaine;
    }

    public void setDomaine(String domaine) {
        this.domaine = domaine;
    }

    public void afficher(){
        System.out.println("DVD=>" + "titre: " + this.titre + "duree" + this.duree + "domaine" + this.domaine);
    }


}
