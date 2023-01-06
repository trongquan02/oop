package lab13.carbuilder.app;

import lab13.carbuilder.builders.CarBuilder;
import lab13.carbuilder.builders.ManualBuilder;
import lab13.carbuilder.cars.Car;
import lab13.carbuilder.cars.Manual;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.makeSportsCar(builder);

        Car car = builder.getProduct();
        System.out.println(car.getCarType());


        ManualBuilder manualBuilder = new ManualBuilder();

        director.makeSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("car manual built: " + carManual.print());
    }
}