public class Main {
    public static void main(String[] args) {

        int niz[] = {55, 8, 9, 10, 56, 78};
        int min = niz[0];
        int max = niz[0];
        for (int i = 1; i < niz.length; i++) {
            if (niz[i] < min)
                min = niz[i];
            if (niz[i] > max)
                max = niz[i];
        }
        System.out.println("Minimalna vrednost ovog niza je:" + min);
        System.out.println("Maksimanlan vrednost ovog niza je:" + max);
    }
}