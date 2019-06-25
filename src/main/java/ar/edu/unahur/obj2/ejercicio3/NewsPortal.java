package ar.edu.unahur.obj2.ejercicio3;

public class NewsPortal implements NewsMedia {

    private String news;

    public String getNews() {
        return news;
    }

    @Override
    public void updateNews(String news) {
        this.news = news;
    }
}
