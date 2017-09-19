
package com.redcode.demo.service;

import com.redcode.demo.SpringbootElasticsearchApplication;
import com.redcode.demo.entity.Article;
import com.redcode.demo.entity.Author;
import com.redcode.demo.entity.Tutorial;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;


/**
 * Created by zhiyu.zhou on 2017/9/13.
 */

@RunWith(SpringRunner.class)
@SpringBootApplication
//@SpringBootTest(classes = SpringbootElasticsearchApplication.class)
//@ContextConfiguration(classes = AppConfig.class)
public class IarticleServiceTest {

    @Autowired
    private IarticleService articleServiceImpl;

    @Test
    public void save() throws Exception {

        Author author = new Author();
        author.setId(2l);
        author.setName("cat2");
        author.setDescription("java dev2");

        Tutorial tutorial = new Tutorial();
        tutorial.setId(2l);
        tutorial.setName("es course2");

        Article article = new Article();
        article.setId(1l);
        article.setAbstracts("spring es data2");
        article.setTutorial(tutorial);
        article.setAuthor(author);
        article.setContent("2article content test this tutorial tell you how to integrete springboot with spring-data-elastics2");
        article.setPostTime(new Date());
        article.setClickCount(2l);

        articleServiceImpl.save(article);
    }
}
