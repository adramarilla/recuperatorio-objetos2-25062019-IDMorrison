package ar.edu.unahur.obj2.ejercicio3;

public class NewsAgency {

    private String news;
    private NewsChannel10 newsChannel10;
    private NewsChannel11 newsChannel11;
    private NewsPortal newsPortal;
    private Radio900 radio900;

    public NewsAgency(NewsChannel10 newsChannel10, NewsChannel11 newsChannel11, NewsPortal newsPortal, Radio900 radio900) {
        this.newsChannel10 = newsChannel10;
        this.newsChannel11 = newsChannel11;
        this.newsPortal = newsPortal;
        this.radio900 = radio900;
    }

    public void setNews(String news) {
        this.news = news;
        newsChannel10.changeNews(news);
        newsChannel11.setNews(news);
        newsPortal.update(news);
        radio900.updateNews(news);
    }
}
