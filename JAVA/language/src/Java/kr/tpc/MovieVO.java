package Java.kr.tpc;

public class MovieVO {
    private String title;
    private int price;
    private String author;
    private int level;
    private float time;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public float getTime() {
        return this.time;
    }

    public void setTime(float time) {
        this.time = time;
    }

    public MovieVO() {
        // default constructor
    }

    // overload constructor
    public MovieVO(String title, int price, String author, int level, float time) {
        this.title = title;
        this.price = price;
        this.author = author;
        this.level = level;
        this.time = time;
    }

    @Override
    public String toString() {
        return "MovieVO [author=" + author + ", level=" + level + ", price=" + price + ", time=" + time + ", title="
                + title + "]";
    }

}
