package Term2.week5term2;

public class Book {
    private String name;
    private Author author;
    private double price;
    private int qty;
    
    public Book (String Name, Author authorOfAuthor, double Price){
        name=Name;
        author = authorOfAuthor;      
        price =Price;
        
            
    }
    public Book (String Name, Author authorOfAuthor, double Price,int QTY){
        name=Name;
        author = authorOfAuthor;      
        price =Price;
        qty = QTY;
        ;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
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

    public String toString() {
    
        return String.format("Book[Name=%s,  %s ,price=%f ,qty=%d]", name, author, price,qty);
    }
    
}

