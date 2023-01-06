package lab13.smarthomebuilder;

public class SmartHome {
    private final String name;
    private final int serialNumber;
    private final String addressName;
    private final String addressNumber;
    private final String city;
    private final String country;
    private final String postalCode;
    private final int light1PortNum;
    private final int light2PortNum;
    private final int door1PortNum;
    private final int door2PortNum;
    private final int microwavePortNum;
    private final int tvPortNum;
    private final int waterHeaterPortNum;

    private SmartHome(SmartHomeBuilder smartHomeBuilder) {
        this.name = smartHomeBuilder.name;
        this.serialNumber = smartHomeBuilder.serialNumber;
        this.addressName = smartHomeBuilder.addressName;
        this.addressNumber = smartHomeBuilder.addressNumber;
        this.city = smartHomeBuilder.city;
        this.country = smartHomeBuilder.country;
        this.postalCode = smartHomeBuilder.postalCode;
        this.light1PortNum = smartHomeBuilder.light1PortNum;
        this.light2PortNum = smartHomeBuilder.light2PortNum;
        this.door1PortNum = smartHomeBuilder.door1PortNum;
        this.door2PortNum = smartHomeBuilder.door2PortNum;
        this.microwavePortNum = smartHomeBuilder.microwavePortNum;
        this.tvPortNum = smartHomeBuilder.tvPortNum;
        this.waterHeaterPortNum = smartHomeBuilder.waterHeaterPortNum;
    }

    public static class SmartHomeBuilder {
        private String name;
        private int serialNumber;
        private String addressName;
        private String addressNumber;
        private String city;
        private String country;
        private String postalCode;
        private int light1PortNum;
        private int light2PortNum;
        private int door1PortNum;
        private int door2PortNum;
        private int microwavePortNum;
        private int tvPortNum;
        private int waterHeaterPortNum;

        public SmartHomeBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public SmartHomeBuilder withSerialNumber(int serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }

        public SmartHomeBuilder withAddressName(String addressName) {
            this.addressName = addressName;
            return this;
        }

        public SmartHomeBuilder withAddressNumber(String addressNumber) {
            this.addressNumber = addressNumber;
            return this;
        }

        public SmartHomeBuilder withCity(String city) {
            this.city = city;
            return this;
        }

        public SmartHomeBuilder withCountry(String country) {
            this.country = country;
            return this;
        }

        public SmartHomeBuilder withPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public SmartHomeBuilder withLight1PortNum(int light1PortNum) {
            this.light1PortNum = light1PortNum;
            return this;
        }

        public SmartHomeBuilder withLight2PortNum(int light2PortNum) {
            this.light2PortNum = light2PortNum;
            return this;
        }

        public SmartHomeBuilder withDoor1PortNum(int door1PortNum) {
            this.door1PortNum = door1PortNum;
            return this;
        }

        public SmartHomeBuilder withDoor2PortNum(int door2PortNum) {
            this.door2PortNum = door2PortNum;
            return this;
        }

        public SmartHomeBuilder withMicrowavePortNum(int microwavePortNum) {
            this.microwavePortNum = microwavePortNum;
            return this;
        }

        public SmartHomeBuilder withTvPortNum(int tvPortNum) {
            this.tvPortNum = tvPortNum;
            return this;
        }

        public SmartHomeBuilder withWaterHeaterPortNum(int waterHeaterPortNum) {
            this.waterHeaterPortNum = waterHeaterPortNum;
            return this;
        }

        public SmartHome build() {
            return new SmartHome(this);
        }
    }

}


