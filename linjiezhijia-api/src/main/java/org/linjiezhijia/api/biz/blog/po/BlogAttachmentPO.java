package org.linjiezhijia.api.biz.blog.po;

import java.util.Date;

import org.linjiezhijia.api.common.query.BasePO;

public class BlogAttachmentPO extends BasePO {
    /**
     *
     */
    private Integer id;

    /**
     *
     */
    private Integer blogId;

    /**
     *
     */
    private String  savePath;

    /**
     *
     */
    private String  name;

    /**
     *
     */
    private String  type;

    /**
     *
     */
    private Date    createDt;

    /**
     *
     */
    private Date    updateDt;

    /**
     *
     */
    private String  creator;

    /**
     *
     */
    private String  updator;

    /**
     *
     */
    private String  state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBlogId() {
        return blogId;
    }

    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    public String getSavePath() {
        return savePath;
    }

    public void setSavePath(String savePath) {
        this.savePath = savePath;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    @Override
    public String toString() {
        return "BlogAttachment [id=" + id + ", blogId=" + blogId + ", savePath=" + savePath
               + ", name=" + name + ", type=" + type + ", createDt=" + createDt + ", updateDt="
               + updateDt + ", creator=" + creator + ", updator=" + updator + ", state=" + state
               + "]";
    }

}