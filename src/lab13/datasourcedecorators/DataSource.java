package lab13.datasourcedecorators;

public interface DataSource {
    void writeData(String data);

    String readData();
}
