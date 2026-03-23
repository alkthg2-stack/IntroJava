import java.util.ArrayList;

public class Main {
    static void main() {
        System.out.println("--Exercice 8--");
        
        ArrayList<Float> notes = new ArrayList<Float>();

        notes.add((float)12.5);
        notes.add((float)13);
        notes.add((float)15);

        System.out.println("Affichage du contenue de la liste : "+notes);

        notes.set(1,15F);

        notes.add((float)12);
        notes.add((float)15);
        notes.add((float)16);

        System.out.println("Vérification des éléments de la liste : "+notes);

        float somme = 0;

        for(int i=0; i < notes.size(); i++){
            somme = somme + notes.get(i) ;
        }

        int len = notes.size();
        float moyenne_notes = somme/len;

        System.out.println("La moyenne des notes de cette liset est de "+moyenne_notes );

        }
    }
