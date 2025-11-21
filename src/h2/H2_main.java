package h2;

public class H2_main {
    public static void main(String[] args) {
        int n = 299;
        int f = n;
        int digits = 0;
        int d = 0;
        int[] a = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        while (f / 10 >= 1) {
            System.out.println(f);
            if (f > 0) {
                System.out.println(f % 10);
                d = f % 10;
            }

            f = f / 10;
            digits++;
            a[a.length -digits] = d;
        }
        System.out.println("auschleife" + f);
        digits++;
        a[a.length -digits] = f;
        for(int l = 0; l < a.length - digits; l++){
            a[l] = 0;
        }
        for (int z = 0; z < a.length; z++) {
            System.out.print(a[z]);

        }

        System.out.println(   "  länge " + a.length);
    }
}
