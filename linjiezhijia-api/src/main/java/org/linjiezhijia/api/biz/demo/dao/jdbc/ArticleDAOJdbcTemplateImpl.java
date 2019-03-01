package org.linjiezhijia.api.biz.demo.dao.jdbc;

import java.util.HashMap;
import java.util.Map;

import org.linjiezhijia.api.biz.demo.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ArticleDAOJdbcTemplateImpl implements ArticleDAO {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    @Override
    public Long insertArticle(Article article) {
        String sql = "insert into tb_article(title,summary,user_id,create_time,public_time,update_time,status) "
                     + "values(:title,:summary,:userId,:createTime,:publicTime,:updateTime,:status)";
        Map<String, Object> param = new HashMap<>();
        param.put("title", article.getTitle());
        param.put("summary", article.getSummary());
        param.put("userId", article.getUserId());
        param.put("status", article.getStatus());
        param.put("createTime", article.getCreateTime());
        param.put("publicTime", article.getPublicTime());
        param.put("updateTime", article.getUpdateTime());
        return (long) jdbcTemplate.update(sql, param);
    }

}
