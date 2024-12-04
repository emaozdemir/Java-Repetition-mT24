package Abstract;
public class Book {
    // Field'lar
    private String title;
    private int pageCount;
    private boolean isDigital;

    // Parametreli Constructor
    public Book(String title, int pageCount, boolean isDigital) {
        this.title = title; // Parametre olarak gelen title kullanılmalı
        this.pageCount = pageCount; // Parametre olarak gelen pageCount kullanılmalı
        this.isDigital = isDigital; // Parametre olarak gelen isDigital kullanılmalı
    }

    // Default Constructor
    public Book() {
        this.title = "Unknown";
        this.pageCount = 0;
        this.isDigital = false;
    }

    // getFormat() methodu
    public String getFormat() {
        if (isDigital==true) {
            return "Digital";
        } else {
            return "Physical"; // Doğru terim olarak "Physical" kullanılmalı
        }
    }

    // getTitle() methodu ekleyelim (ek bilgi görmek için)
    public String getTitle() {
        return title;
    }

    // getPageCount() methodu ekleyelim (ek bilgi görmek için)
    public int getPageCount() {
        return pageCount;
    }

    // Test etmek için main metodu
    public static void main(String[] args) {
        // Parametreli constructor kullanarak obje oluşturma
        Book book1 = new Book("Java Programming", 300,false);
        System.out.println("Title: " + book1.getTitle());
        System.out.println("Page Count: " + book1.getPageCount());
        System.out.println("Format: " + book1.getFormat());

        // Default constructor kullanarak obje oluşturma
        Book book2 = new Book();
        System.out.println("\nTitle: " + book2.getTitle());
        System.out.println("Page Count: " + book2.getPageCount());
        System.out.println("Format: " + book2.getFormat());
    }
}
