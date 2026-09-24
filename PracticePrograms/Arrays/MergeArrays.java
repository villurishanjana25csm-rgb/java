public class MergeArrays {
    public static void main(String[] args) {

        int[] a = {10, 20, 30};
        int[] b = {40, 50, 60};

        int[] c = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            c[a.length + i] = b[i];
        }

        for (int x : c) {
            System.out.print(x + " ");
        }
    }
}
