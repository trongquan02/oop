package lab13.smarthomebuilder;

public class App {
    public static void main(String[] args) {
        SmartHome smart = new SmartHome.SmartHomeBuilder()
                .withName("kho")
                .withSerialNumber(3627)
                .withAddressName("qua")
                .withAddressNumber("14a")
                .withCity("a")
                .withCountry("VietNam")
                .withPostalCode("1300")
                .withDoor1PortNum(342)
                .withDoor2PortNum(343)
                .withLight1PortNum(211)
                .withLight2PortNum(212)
                .withMicrowavePortNum(11)
                .withTvPortNum(12)
                .withWaterHeaterPortNum(13)
                .build();
        System.out.println(smart);
    }
}