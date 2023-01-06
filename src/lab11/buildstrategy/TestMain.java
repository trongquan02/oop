package lab11.buildstrategy;

public class TestMain {
    public static void main(String[] args) {
        BuildContext buildContext = new BuildContext(new Skyscraper());
        System.out.println("Yêu cầu một tòa nhà chọc trời: " + buildContext.executeStrategy(" trung tâm thành phố"));

        buildContext = new BuildContext(new House());
        System.out.println("Yêu cầu một tòa nhà: " + buildContext.executeStrategy(" ngoại ô"));
        System.out.println("Yêu cầu một tòa nhà: " + buildContext.executeStrategy(" song hong"));
        buildContext = new BuildContext(new Mall());
        System.out.println("Yêu cầu một trung tâm mua sắm: " + buildContext.executeStrategy(" trung tâm thành phố"));

        System.out.println("---------------------------------");
        System.out.println("Chương trình này được đăng tại Freetuts.net");
    }
}
