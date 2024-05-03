public class test15_3_1 {
    public static void main(String[] args) {

        Book book = new Book(Genre.CULTURE,"日本の祭り","斎藤");
        System.out.println(book);

    }
}
enum Genre {
    LITERATURE,
    SCIENCE,
    CULTURE
}