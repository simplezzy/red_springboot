package com.redcode.demo.repository;

import com.redcode.demo.entity.Article;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by zhiyu.zhou on 2017/9/13.
 */
@Repository
public interface ArticleSearchRepository extends ElasticsearchRepository<Article, Long> {
}
