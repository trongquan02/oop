package lab11.buildstrategy;

public class Skyscraper implements Strategy {

    @Override
    public String build(String location) {
        return "xay dung mot toa nha choc troi trong" + location + ".";
    }
}
