import java.util.Scanner;
public class Printer {
    public void print(Article article) {
        System.out.println("Print " + article.getTitle());
        System.out.println("Print " + article.getText());
    }
}
