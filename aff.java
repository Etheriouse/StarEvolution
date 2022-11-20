package StarEvolution;

public class aff {
    
    public static void aff2str(String[][] tab) {
        for(int i = 0; i<tab.length; i+=1) {
            for(int y = 0; y<tab[0].length; y+=1) {
                System.out.print(tab[i][y] + " ");
            }
            System.out.println();
        }
    
    }

    public static void aff2i(int[][] tab) {
        for(int i = 0; i<tab.length; i+=1) {
            for(int y = 0; y<tab[0].length; y+=1) {
                System.out.print(tab[i][y] + " ");
            }
            System.out.println();
        }
    }

    public static void aff2d(double[][] tab) {
        for(int i = 0; i<tab.length; i+=1) {
            for(int y = 0; y<tab[0].length; y+=1) {
                System.out.print(tab[i][y] + " ");
            }
            System.out.println();
        }
    }

}
