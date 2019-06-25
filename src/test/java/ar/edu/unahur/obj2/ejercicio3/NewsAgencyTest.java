package ar.edu.unahur.obj2.ejercicio3;

import org.testng.annotations.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.testng.Assert.*;

public class NewsAgencyTest {

    @Test
    public void testSetNews() {
        NewsChannel10 newsChannel10 = new NewsChannel10();
        NewsChannel11 newsChannel11 = new NewsChannel11();
        NewsPortal newsPortal = new NewsPortal();
        Radio900 radio900 = new Radio900();

        List<NewsMedia> newsMedia = Stream.of(newsChannel10, newsChannel11, newsPortal, radio900).collect(Collectors.toList());
        NewsAgency newsAgency = new NewsAgency(newsMedia);

        String news = "Extra Extra !";
        newsAgency.setNews(news);

        assertEquals(newsChannel10.getNews(), news );
        assertEquals(newsChannel11.getNews(), news );
        assertEquals(newsPortal.getNews(), news );
        assertEquals(radio900.getNews(), news );


    }
}