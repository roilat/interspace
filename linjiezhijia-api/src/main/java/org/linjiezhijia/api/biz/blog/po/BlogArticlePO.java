package org.linjiezhijia.api.biz.blog.po;

import java.util.Date;

import org.linjiezhijia.api.common.query.BasePO;

public class BlogArticlePO extends BasePO{
    /**
     *
     */
    private Integer id;

    /**
     *
     */
    private String code;

    /**
     *
     */
    private String title;

    /**
     *
     */
    private String cover;

    /**
     *
     */
    private String source;

    /**
     *
     */
    private String attachments;

    /**
     *
     */
    private String ifPublish;

    /**
     *
     */
    private String ifComment;

    /**
     *
     */
    private Date createDt;

    /**
     *
     */
    private Date updateDt;

    /**
     *
     */
    private String creator;

    /**
     *
     */
    private String updator;

    /**
     *
     */
    private String state;

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
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getAttachments() {
        return attachments;
    }

    public void setAttachments(String attachments) {
        this.attachments = attachments;
    }

    public String getIfPublish() {
        return ifPublish;
    }

    public void setIfPublish(String ifPublish) {
        this.ifPublish = ifPublish;
    }

    public String getIfComment() {
        return ifComment;
    }

    public void setIfComment(String ifComment) {
        this.ifComment = ifComment;
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
        this.creator = creator;
    }

    public String getUpdator() {
        return updator;
    }

    public void setUpdator(String updator) {
        this.updator = updator;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}