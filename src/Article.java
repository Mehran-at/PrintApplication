public class Article {
    private String text;
    private String title;
    public Article (String title, String text) {
        this.text = text;
        this.title = title;
    }
    public String getText() {
        return text;
    }
    public String getTitle() {
        return title;
    }
}

