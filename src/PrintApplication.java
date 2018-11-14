//
public class PrintApplication {
    public static void main(String[] args) {
        Article article = new Article("How to win what you want", "Text hereeeee");
        Printer printer = new Printer();
        printer.print(article);
    }
}
