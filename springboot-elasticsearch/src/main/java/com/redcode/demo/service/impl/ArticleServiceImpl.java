package com.redcode.demo.service.impl;

import com.redcode.demo.entity.Article;
import com.redcode.demo.repository.ArticleSearchRepository;
import com.redcode.demo.service.IarticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhiyu.zhou on 2017/9/13.
 */
@Service//("articleServiceImpl")
public class ArticleServiceImpl implements IarticleService {

    @Autowired
    private ArticleSearchRepository articleSearchRepository;

    @Override
    public void save(Article article) {

        articleSearchRepository.save(article);

    }
}
