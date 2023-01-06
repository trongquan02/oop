package lab13.carbuilder.builders;

import lab13.carbuilder.cars.CarType;
import lab13.carbuilder.cars.Engine;
import lab13.carbuilder.cars.GPS;
import lab13.carbuilder.cars.TripComputer;

public interface Builder {
    Builder setCarType(CarType carType);

    Builder reset();

    Builder setSeats(int seats);

    Builder setEngine(Engine engine);

    Builder setTripComputer(TripComputer tripComputer);

    Builder setGPS(GPS gps);
}
