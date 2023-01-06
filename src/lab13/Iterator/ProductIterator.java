package lab13.Iterator;

public class ProductIterator implements Iterator {
    private String[] productCatalog;
    private int length;

    private int currentPostion = 0;

    public ProductIterator(String[] productCatalog, int length) {
        this.productCatalog = productCatalog;
        this.length = length;
    }

    @Override
    public Boolean hashNext() {
        return this.currentPostion <= this.length && this.currentPostion <= this.productCatalog.length - 1;
    }

    @Override
    public Object next() {
        String value = this.productCatalog[currentPostion++];
        return value;
    }

    @Override
    public void remove() {
        if (currentPostion > length) {
            return;
        }

        for (int i = currentPostion; i <= length; i++) {
            productCatalog[i] = productCatalog[i + 1];
        }
        length--;
    }

}
