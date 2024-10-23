/**
 * AGOKOLI DON ARIAS
 * NDOUMBE DIEYE
 * **/

public class Revues implements Document{
    private String numero;
    private String titre;
    private String domaine;
    private String anneeEdition;

    public Revues(String numero, String titre, String domaine, String anneeEdition) {
        this.numero = numero;
        this.titre = titre;
        this.domaine = domaine;
        this.anneeEdition = anneeEdition;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDomaine() {
        return domaine;
    }

    public void setDomaine(String domaine) {
        this.domaine = domaine;
    }

    public String getAnneeEdition() {
        return anneeEdition;
    }

    public void setAnneeEdition(String anneeEdition) {
        this.anneeEdition = anneeEdition;
    }

    public void afficher(){
        System.out.println("Revues =>" + "Numero: " + this.numero + " titre: " + this.titre + "domaine: " + this.domaine + " anneeEdition: " + this.anneeEdition);
    }


}
