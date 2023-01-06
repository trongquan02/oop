package lab13.Iterator;

public class ProductCatalog implements Iterable {
    private String[] productCatalog;
    private final int SIZE = 100;

    public int length;

    public ProductCatalog() {
        productCatalog = new String[100];
        length = -1;
    }

    @Override
    public Iterator iterator() {
        return new ProductIterator(productCatalog, length);
    }

    public ProductCatalog add(String value) {
        if (length <= this.productCatalog.length - 1) {
            productCatalog[++length] = value;
            return this;
        }
        return this;
    }

}
