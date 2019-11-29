package cn.roilat.interspace.api.biz.demo.dao.jdbc;

import cn.roilat.interspace.api.biz.demo.model.Article;

/**
 * 需要注意的是，mybatis会描述到这个类，致使beanFactory有两个对象articleDAO和articleDAOJdbcTemplateImpl,如果注入的是前者，因为没有相应的xml配置，会导致方法不可用
 * 
 * @author roilat-J
 * @version $Id: ArticleDAO.java, v 0.1 2019年2月21日 下午6:45:10 roilat-J Exp $
 */
public interface ArticleDAO {
    Long insertArticle(Article article);
}
