public class Birou {
    private Sertar sertar1;
    private Sertar sertar2;
    private double latime;
    private double lungime;
    private double inaltime;

    public Birou(Sertar sertar1, Sertar sertar2, double latime, double lungime, double inaltime) {
        this.sertar1 = sertar1;
        this.sertar2 = sertar2;
        this.latime = latime;
        this.lungime = lungime;
        this.inaltime = inaltime;
    }

    public void tipareste() {
        System.out.println("Birou:");
        sertar1.tipareste();
        sertar2.tipareste();
        System.out.println("Latime: " + latime);
        System.out.println("Lungime: " + lungime);
        System.out.println("Inaltime: " + inaltime);
    }
}