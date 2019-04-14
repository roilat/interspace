package org.linjiezhijia.api.biz.blog.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;
import org.linjiezhijia.api.common.BaseEntity;

/**
 * 博客附件
 * 
 * @author roilat-J
 * @version $Id: BlogAttachment.java, v 0.1 2019年3月7日 下午4:40:45 roilat-J Exp $
 */
@Entity
@Table(name = "T_BLOG_ATTACHMENT") 
@DynamicUpdate
public class BlogAttachment extends BaseEntity {
    /**  */
    private static final long serialVersionUID = -7723588296853965328L;

    /**
     *博客ID
     */
    private Integer           blogId;

    /**
     *附件全限定名（包括路径和名称）
     */
    private String            savePath;

    /**
     *附件名称
     */
    private String            name;

    /**
     *附件类型(暂未定义)
     */
    private String            type;

    public Integer getBlogId() {
        return blogId;
    }

    public void setBlogId(Integer blogId) {
        this.blogId = blogId == null ? new Integer(0) : blogId;
    }

    public String getSavePath() {
        return savePath;
    }

    public void setSavePath(String savePath) {
        this.savePath = savePath == null ? "" : savePath.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? "" : name.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? "" : type.trim();
    }

    @Override
    public String toString() {
        return "BlogAttachment [blogId=" + blogId + ", savePath=" + savePath + ", name=" + name
               + ", type=" + type + ", id=" + id + ", createDt=" + createDt + ", updateDt="
               + updateDt + ", creator=" + creator + ", updator=" + updator + ", state=" + state
               + "]";
    }
    
}