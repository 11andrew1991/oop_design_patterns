package carapp.carimpl;

public class CarDirector {

    public Car createCar(CarBuilder builder) {
        builder.buildExteriorStyle();
        builder.buildInteriorStyle();
        builder.buildEngine();
        builder.buildYear();

        return builder.getCar();
    }
}
