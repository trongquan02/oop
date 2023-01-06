package lab5.authorandbook2;

import lab5.authorandbook.Author;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = 0;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        int length = authors.length;
        String str = "";
        for (int idx = 0; idx < length; idx++) {
            if (idx == length - 1) {
                str += "Author[name = " + authors[idx].getName() + ", email = "
                        + authors[idx].getEmail() + ", gender = " + authors[idx].getGender() + "]";
            } else {
                str += "Author[name = " + authors[idx].getName() + ", email = "
                        + authors[idx].getEmail() + ", gender = " + authors[idx].getGender() + "], ";
            }
        }
        return "Book[name = " + name + ", authors = {" + str + "}, price = "
                + price + ", qty = " + qty + "]";
    }

    public String getAuthorNames() {
        String str = "";
        for (int idx = 0; idx < authors.length; idx++) {
            if (idx == 0) {
                str += authors[idx].getName();
            } else {
                str += ", " + authors[idx].getName();
            }
        }
        return str;
    }

}
