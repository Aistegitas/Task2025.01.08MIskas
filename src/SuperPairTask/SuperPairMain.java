package SuperPairTask;

public class SuperPairMain {
    public static void main(String[] args) {

    SuperPair<String, String, Integer> pair1 = new SuperPair<>("Laba", "Diena", 2025);
    SuperPair<String, Boolean, Double> pair2 = new SuperPair<>("Test", true, 99.99);


    System.out.println(pair1);
    System.out.println(pair2);

    //Trecias parametras ne skaicius:
    //SuperPair<String, Integer, Boolean> pair3 = new SuperPair<>("Test", 2, false);
    }
}
