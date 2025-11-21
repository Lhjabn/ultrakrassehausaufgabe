package h1;

public class H1_main {
    public static void main(String[] args) {
        int[] myArray = {5,6,7,10};
        int b = myArray.length;
        int i = 0;
        int e = b-1;
        int z = 0;
        while(i<b/2) {
            z = myArray[i];
            myArray[i] = myArray[e];
            myArray[e] = z;
            i++;
            e--;
        }
        System.out.println(myArray[1]);
        for(int f = 0; f < myArray.length; f++){
            System.out.print(myArray[f]);
        }
    }
}
