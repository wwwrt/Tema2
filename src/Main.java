public class Main {
    public static void main(String[] args) {
        Sertar sertar1 = new Sertar(50, 30, 10);
        Sertar sertar2 = new Sertar(50, 30, 10);
        Birou birou = new Birou(sertar1, sertar2, 120, 60, 75);
        birou.tipareste();
    }
}