package StarEvolution;
import java.util.*;
import java.util.Scanner;

public class MainStar {

    static Random random = new Random();

    public static int hastag = 8;
    public static int star = 1;
    public static int voids = 2;
    
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez taille du ciel: ");
        int taille_sky = sc.nextInt();
        System.out.println("Entrez nombre de pas de temps: ");
        int nb_pas_temps = sc.nextInt();
        System.out.println("Entrez durer du pas de temps (ms): ");
        int durer_pas_temps = sc.nextInt();
        System.out.println("Quantité étoile:\n (plus la valeur est élever moin y'en aura, max 100(int) ) ");

        //generation étoile est aléatoire, donc on a 1/modulo d'avoir une etoile;
        int modulo = sc.nextInt();
        if(modulo>=100) {
            modulo = 99;
        }
        sc.close();
        LauncheStar.Sib(taille_sky, nb_pas_temps, durer_pas_temps, modulo);
    }
}