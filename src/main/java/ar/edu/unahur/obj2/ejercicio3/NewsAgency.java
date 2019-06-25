package ar.edu.unahur.obj2.ejercicio3;

import java.util.List;

public class NewsAgency {

    private String news;
    private List<NewsMedia> newsMediaList;

    public NewsAgency(List<NewsMedia> newsMediaList) {
        this.newsMediaList = newsMediaList;
    }

    public void setNews(String news) {
        this.news = news;
        updateNewsMedia();
    }

    private void updateNewsMedia() {
        newsMediaList.forEach(newsMedia -> newsMedia.updateNews(news));
    }
}
