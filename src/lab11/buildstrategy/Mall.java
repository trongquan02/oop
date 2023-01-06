package lab11.buildstrategy;

public class Mall implements Strategy {
    @Override
    public String build(String location) {
        return "xay dung mot trung tam mua sam o" + location + ".";
    }
}
