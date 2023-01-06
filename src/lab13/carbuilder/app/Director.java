package lab13.carbuilder.app;

import lab13.carbuilder.builders.Builder;
import lab13.carbuilder.cars.CarType;
import lab13.carbuilder.cars.Engine;
import lab13.carbuilder.cars.GPS;
import lab13.carbuilder.cars.TripComputer;

public class Director {
    public void makeSportsCar(Builder builder) {
        builder.reset()
                .setCarType(CarType.SPORTS_CAR)
                .setSeats(2)
                .setEngine(new Engine(3.0, 0))
                .setTripComputer(new TripComputer())
                .setGPS(new GPS());
    }

    public void makeSUV(Builder builder) {
        builder.reset()
                .setCarType(CarType.Suv)
                .setSeats(4)
                .setEngine(new Engine(2.5, 0))
                .setTripComputer(new TripComputer())
                .setGPS(new GPS());

    }
}