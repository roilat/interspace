package org.linjiezhijia.api.biz.blog.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //jpa
@Table(name = "T_BLOG_ARTICLE") //jpa
public class BlogArticle {
    /**
     *主键
     */

    private Integer id;

    /**
     *类目编码
     */
    private String  code;

    /**
     *博客内容
     */
    private String  content;
    /**
     *博客标题
     */
    private String  title;

    /**
     *文章封面（一个url）
     */
    private String  cover;

    /**
     *内容来源(字典待定)
     */
    private String  source;

    /**
     *附件列表(将ID逗号分开)
     */
    private String  attachments;

    /**
     *是否公开(1可以,0不可以)
     */
    private String  ifPublish;

    /**
     *是否评论(1可以,0不可以)
     */
    private String  ifComment;

    /**
     *创建日期
     */
    private Date    createDt;

    /**
     *更新日期
     */
    private Date    updateDt;

    /**
     *创建人
     */
    private String  creator;

    /**
     *更新人
     */
    private String  updator;

    /**
     *记录状态(1有效,0删除)
     */
    private String  state;

    @Id
    @GeneratedValue
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover == null ? null : cover.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getAttachments() {
        return attachments;
    }

    public void setAttachments(String attachments) {
        this.attachments = attachments == null ? null : attachments.trim();
    }

    public String getIfPublish() {
        return ifPublish;
    }

    public void setIfPublish(String ifPublish) {
        this.ifPublish = ifPublish == null ? null : ifPublish.trim();
    }

    public String getIfComment() {
        return ifComment;
    }

    public void setIfComment(String ifComment) {
        this.ifComment = ifComment == null ? null : ifComment.trim();
    }

    public Date getCreateDt() {
        return createDt;
    }

    public void setCreateDt(Date createDt) {
        this.createDt = createDt;
    }

    public Date getUpdateDt() {
        return updateDt;
    }

    public void setUpdateDt(Date updateDt) {
        this.updateDt = updateDt;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public String getUpdator() {
        return updator;
    }

    public void setUpdator(String updator) {
        this.updator = updator == null ? null : updator.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    @Override
    public String toString() {
        return "BlogArticle [id=" + id + ", code=" + code + ", content=" + content + ", title="
               + title + ", cover=" + cover + ", source=" + source + ", attachments=" + attachments
               + ", ifPublish=" + ifPublish + ", ifComment=" + ifComment + ", createDt=" + createDt
               + ", updateDt=" + updateDt + ", creator=" + creator + ", updator=" + updator
               + ", state=" + state + "]";
    }
    
}