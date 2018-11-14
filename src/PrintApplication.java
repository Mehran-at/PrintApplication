public class PrintApplication {
    public static void main(String[] args) {
        Article article = new Article("Mehran", "Jan");
        Printer printer = new Printer();
        printer.print(article);
    }
}
