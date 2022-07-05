public class Main {
    public static final int NUMBER_OF_TREADS = 5;

    public static void main(String[] args) {
        final CarDealer carDealer = new CarDealer();
        for (int i = 0; i < NUMBER_OF_TREADS; i++) {
            if (i == 0) {
                new Thread(null, carDealer::acceptCars, "Audi car factory").start();
            } else {
                new Thread(null, carDealer::sellCars, i + " buyer").start();
            }
        }
    }
}
