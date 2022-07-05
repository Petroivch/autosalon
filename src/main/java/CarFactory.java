import java.util.Random;

public class CarFactory {

    public static final int TIME_ASSEMBLY_CAR = 3400;
    private static final String carBrand = "Audi";
    private static final String[] carModels = {"A3", "A6", "RS6"};
    private static final int[] enginePowers = {150, 250, 650};

    public Car assembleTheCar() {
        int modelNumber = getCarModelRandom();
        String carModel = carModels[modelNumber];
        int enginePower = enginePowers[modelNumber];
        try {
            Thread.sleep(CarFactory.TIME_ASSEMBLY_CAR);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new Car(carBrand, carModel, enginePower);
    }

    private int getCarModelRandom() {
        return new Random().nextInt(carModels.length);
    }
}