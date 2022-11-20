package StarEvolution;

public class Star {


     //cree une matrice de chiffre ou 1.0 reprensente * et 2.0 reprendre " ";
    public static int[][] prePlaceStar(int[][] zone_none, int modulo) {
        int[][] zone_star = new int[zone_none.length][zone_none[0].length];
        for(int i = 0; i<zone_none.length; i+=1) {
            for(int y = 0; y<zone_none[0].length; y+=1) {

                if((MainStar.random.nextInt(100))%modulo == 0) {
                    zone_star[i][y] = MainStar.star;
                } else {
                    zone_star[i][y] = MainStar.voids;
                }

                if(MainStar.hastag==zone_none[i][y]) {
                    zone_star[i][y] = MainStar.hastag;
                }
            }
        }
        return zone_star;
    }

    //convertie la matrice de chiffre en caractere;
    public static String[][] placeStar(int[][] zone_star) {
        String[][] t = new String[zone_star.length][zone_star[0].length];
        for(int i = 0; i<zone_star.length; i+=1) {
            for(int y = 0; y<zone_star[0].length; y+=1) {
                if(zone_star[i][y] == MainStar.star) {
                    t[i][y] = "*";
                } else {
                    t[i][y] = " ";
                }

                if(MainStar.hastag==zone_star[i][y]) {
                    t[i][y] = "#";
                }
            }
        }
        return t;
    }

    public static int[][] prePlaceStarNext(int[][] postT, int[][] co) {
        int[][] t = postT;
        
        
        for(int z = 0; z<co.length; z+=1) {

            if(co[z][0] == -1 && co[z][1] == -1) {
                continue;
            }
            if(co[z][0] == -2 && co[z][1] == -2) {
                continue;
            }
            if(co[z][0] == 0 && co[z][1] == 0) {
                break;
            }

            for(int i = 0; i<postT.length; i+=1) {

                for(int y = 0; y<postT[0].length; y+=1) {

                    //System.out.println("i= "+ i+" y= "+y+"   co_actuel: x=" + co[z][0] + " y="+ co[z][1]);
                    if(co[z][0] == i && co[z][1] == y) {
                            //System.out.println("star i=" + i + " y= " + y);
                            t[i][y] = MainStar.star;
                            //System.out.println("t = "+t[i][y]);
    
                    } 

                    if(i == 0 || y == 0 || i == postT.length-1 || y == postT[0].length-1) {
                        t[i][y] = MainStar.hastag;
                    }
                }
            }

        }
        return t;
    }

    public static int[][] Star_next(int[][] star_on_n, int n) {
        return Star.prePlaceStarNext(Other.makeZone(n), Other.allco(star_on_n));
    }

}
