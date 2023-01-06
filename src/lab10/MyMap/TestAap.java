package lab10.MyMap;

public class TestAap {
    public static void main(String[] args) {
        MyMap map = new MyHashMap();
        map.put(1, "a");
        map.put(2, "b");
        System.out.println(map.contains(1));
        System.out.println(map.size());
        System.out.println(map);
    }
}
