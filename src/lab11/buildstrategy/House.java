package lab11.buildstrategy;

public class House implements Strategy {
    @Override
    public String build(String location) {
        return "xay dung mot toa nha trong" + location + ".";
    }
}
