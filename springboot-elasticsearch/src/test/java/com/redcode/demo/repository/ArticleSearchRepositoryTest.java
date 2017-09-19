package com.redcode.demo.repository;

import com.redcode.demo.SpringbootElasticsearchApplication;
import com.redcode.demo.entity.Article;
import com.redcode.demo.entity.Author;
import com.redcode.demo.entity.Tutorial;
import org.elasticsearch.index.query.QueryStringQueryBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.Iterator;


/**
 * Created by zhiyu.zhou on 2017/9/13.
 */
@RunWith(SpringRunner.class)
@SpringBootApplication
//@SpringBootTest(classes = SpringbootElasticsearchApplication.class)
//@SpringBootApplication
public class ArticleSearchRepositoryTest {

    @Autowired
    private ArticleSearchRepository articleSearchRepository;

    @Test
    public void save() throws Exception {

        Author author = new Author();
        author.setId(3l);
        author.setName("cat3");
        author.setDescription("java dev3");

        Tutorial tutorial = new Tutorial();
        tutorial.setId(3l);
        tutorial.setName("es course3");

        Article article = new Article();
        article.setId(3l);
        article.setAbstracts("spring es data3");
        article.setTutorial(tutorial);
        article.setAuthor(author);
        article.setContent("3article content test this tutorial tell you how to integrete springboot with spring-data-elastics3");
        article.setPostTime(new Date());
        article.setClickCount(3l);

        articleSearchRepository.save(article);
    }

    @Test
    public void search() throws Exception {
        String queryString = "springboot";  //key word
        QueryStringQueryBuilder builder = new QueryStringQueryBuilder(queryString);
        Iterable<Article> searchResult = articleSearchRepository.search(builder);
        Iterator<Article> iterator = searchResult.iterator();
        while (iterator.hasNext()) {
            System.out.println("Article" + iterator.next().toString());
        }
    }
}