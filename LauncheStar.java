package StarEvolution;

import java.lang.Thread;

public class LauncheStar {

    public static void Sib(int n, int m, int k, int modul) throws InterruptedException {
        int[][] star_on_n = Star.prePlaceStar(Other.makeZone(n), modul); 
        aff.aff2str(Star.placeStar(star_on_n));
        Thread.sleep(k);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        for(int i = 0; i<m; i+=1){
            int[][] tar_next_tab  = Star.Star_next(star_on_n, n);
            aff.aff2str(Star.placeStar(tar_next_tab));
            star_on_n = tar_next_tab;
            Thread.sleep(k);
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }
}
