package StarEvolution;

public class Other {

    public static int[][] makeZone(int alpha) {
        int[][] zone_none = new int[alpha][alpha];
        for(int i = 0; i<alpha; i+=1) {
            for(int y = 0; y<alpha; y+=1) {
                if(i == 0 || y == 0 || i == alpha-1 || y == alpha-1) {
                    zone_none[i][y] = MainStar.hastag;
                } else {
                    zone_none[i][y] = MainStar.voids;
                }
            }
        }
        return zone_none;
    }

    public static int[][] allco(int[][] t) {
        int count = 0;
        int[][] allcoo = new int[(t.length-2)*(t.length-2)][2];
        for(int i = 1; i<t.length-1; i+=1) {
            for(int y = 1; y<t[0].length-1; y+=1) {
                    allcoo[count][0] = deplaceCoordonneStar(t, i, y)[0];
                    allcoo[count][1] = deplaceCoordonneStar(t, i, y)[1];
                    if((allcoo[count][0] != -1 && allcoo[count][1] != -1) && (allcoo[count][0] != -2 && allcoo[count][1] != -2)) {
                    }
                    count+=1;
            }
        }
        return allcoo;
    }

    public static int[] deplaceCoordonneStar(int[][] t, int placeX, int placeY) {
        
        int count = 0;
        int[][] where = new int[8][2];
            if(t[placeX][placeY] == 2) {
                int[] tempcoordonnee = new int[2];
                tempcoordonnee[0] = -1;
                tempcoordonnee[1] = -1;
                return tempcoordonnee;
            }
                if(2 == t[placeX+1][placeY]) {
                    where[count][0] = placeX+1;
                    where[count][1] = placeY;
                    count +=1;
                }
                if(2 == t[placeX+1][placeY+1]) {
                    where[count][0] = placeX+1;
                    where[count][1] = placeY+1; 
                    count +=1;
                }
                if(2 == t[placeX+1][placeY-1]) {
                    where[count][0] = placeX+1;
                    where[count][1] = placeY-1; 
                    count+=1;
                }
                if(2 == t[placeX-1][placeY]) {
                    where[count][0] = placeX-1;
                    where[count][1] = placeY;
                    count+=1;
                }
                if(2 == t[placeX-1][placeY-1]) {
                    where[count][0] = placeX-1;
                    where[count][1] = placeY-1; 
                    count +=1;
                }
                if(2 == t[placeX-1][placeY+1]) {
                    where[count][0] = placeX-1;
                    where[count][1] = placeY+1; 
                    count +=1;
                }
                if(2 == t[placeX][placeY-1]) {
                    where[count][0] = placeX;
                    where[count][1] = placeY-1; 
                    count+=1;
                }
                if(2 == t[placeX][placeY+1]) {
                    where[count][0] = placeX;
                    where[count][1] = placeY+1; 
                    count+=1;
        }

        int[] coordonnee = new int[2];
        if(count !=0 ) {
            int isthis = MainStar.random.nextInt(count);
            coordonnee[0] = where[isthis][0];
            coordonnee[1] = where[isthis][1];
        } else {
            coordonnee[0] = -2;
            coordonnee[1] = -2;
        }
        return coordonnee;
    }
    
}
