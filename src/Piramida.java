public class Piramida {
    private int n;

    public Piramida(int n) {
        this.n = n;
    }

    public void afisare() {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Piramida piramida = new Piramida(5);
        piramida.afisare();
    }
}
