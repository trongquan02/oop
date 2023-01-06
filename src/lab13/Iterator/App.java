package lab13.Iterator;

public class App {
    public static void main(String[] args) {
        ProductCatalog productCatalog = new ProductCatalog();
        productCatalog.add("Apple")
                .add("Banana")
                .add("Grapes")
                .add("Coconut")
                .add("Lemon")
                .add("Melon")
                .add("Orange");
        Iterator it = productCatalog.iterator();
        while (it.hashNext()) {
            String product = (String) it.next();
            if (product.equals("Orange")) {
                it.remove();
            } else {
                System.out.print(product + " ");
            }
        }
    }
}
