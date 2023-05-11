public class Book {
    private String author;
    private String title;
    private String series;
    private double piece;
    private int quantity;

    public Book(String author, String title, String series, int quantity,double piece) {
        this.author = author;
        this.title = title;
        this.series = series;
        this.piece = piece;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Kitab{" +
                "Yazıçı='" + author + '\'' +
                ", Adı='" + title + '\'' +
                ", Seriyası='" + series + '\'' +
                ", Qiyməti=" + piece +
                ", Miqdarı=" + quantity +
                '}';
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {this.series = series;}

    public double getPiece() {return piece;}

    public void setPiece(int piece) {
        this.piece = piece;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
