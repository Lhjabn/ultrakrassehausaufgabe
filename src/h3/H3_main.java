package h3;

public class H3_main {
    public static void main(String[] args) {
        int[][] einheiten = new int[2][15];
        einheiten[0][0] = 50000;
        einheiten[0][1] = 20000;
        einheiten[0][2] = 10000;
        einheiten[0][3] = 5000;
        einheiten[0][4] = 2000;
        einheiten[0][5] = 1000;
        einheiten[0][6] = 500;
        einheiten[0][7] = 200;
        einheiten[0][8] = 100;
        einheiten[0][9] = 50;
        einheiten[0][10] = 20;
        einheiten[0][11] = 10;
        einheiten[0][12] = 5;
        einheiten[0][13] = 2;
        einheiten[0][14] = 1;
        einheiten[1][0] = 0;
        einheiten[1][1] = 0;
        einheiten[1][2] = 0;
        einheiten[1][3] = 0;
        einheiten[1][4] = 0;
        einheiten[1][5] = 0;
        einheiten[1][6] = 0;
        einheiten[1][7] = 0;
        einheiten[1][8] = 0;
        einheiten[1][9] = 0;
        einheiten[1][10] = 0;
        einheiten[1][11] = 0;
        einheiten[1][12] = 0;
        einheiten[1][13] = 0;
        einheiten[1][14] = 0;
        int input = 0;
        int i = 0;
        int z = 1;
        int finput = input;
        while(finput>0) {
            while (einheiten[0][i]<=finput) {
                einheiten[1][i] = z;
                finput = finput-einheiten[0][i];
                z++;
                System.out.println(finput);
            }
            z = 1;
            i++;
        }
        for (int[] x : einheiten)
        {
            for (int y : x)
            {
                System.out.print(y + " ");
            }
            System.out.println();
        }



    }
}
