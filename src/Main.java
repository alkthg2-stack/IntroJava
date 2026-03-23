public class Main {
    static void main() {
        System.out.println("--Exercice 2--");

        String prenom = "Pierre";
        String nom = "Dupont";
        int annee_naissance = 2002;
        int age = 2026 - annee_naissance;
        String nomComplet = prenom + " " + nom;

        System.out.println(nomComplet+" est né en "+annee_naissance+" il a donc "+age+" ans.");
      
    }
}