package org.linjiezhijia.api.biz.blog.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity//jpa
@Table(name = "T_BLOG_ATTACHMENT")//jpa
public class BlogAttachment {
    /**
     *

     * This field corresponds to the database column t_blog_attachment.ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     *
     */
    private Integer blogId;

    /**
     *

     * This field corresponds to the database column t_blog_attachment.SAVE_PATH
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    private String savePath;

    /**
     *

     * This field corresponds to the database column t_blog_attachment.NAME
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    private String name;

    /**
     *

     * This field corresponds to the database column t_blog_attachment.TYPE
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    private String type;

    /**
     *

     * This field corresponds to the database column t_blog_attachment.CREATE_DT
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    private Date createDt;

    /**
     *

     * This field corresponds to the database column t_blog_attachment.UPDATE_DT
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    private Date updateDt;

    /**
     *

     * This field corresponds to the database column t_blog_attachment.CREATOR
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    private String creator;

    /**
     *

     * This field corresponds to the database column t_blog_attachment.UPDATOR
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    private String updator;

    /**
     *

     * This field corresponds to the database column t_blog_attachment.STATE
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    private String state;

    /**
     * 
     * This method returns the value of the database column t_blog_attachment.ID
     *
     * @return the value of t_blog_attachment.ID
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * This method sets the value of the database column t_blog_attachment.ID
     *
     * @param id the value for t_blog_attachment.ID
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * This method returns the value of the database column t_blog_attachment.BLOG_ID
     *
     * @return the value of t_blog_attachment.BLOG_ID
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public Integer getBlogId() {
        return blogId;
    }

    /**
     * 
     * This method sets the value of the database column t_blog_attachment.BLOG_ID
     *
     * @param blogId the value for t_blog_attachment.BLOG_ID
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    /**
     * 
     * This method returns the value of the database column t_blog_attachment.SAVE_PATH
     *
     * @return the value of t_blog_attachment.SAVE_PATH
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public String getSavePath() {
        return savePath;
    }

    /**
     * 
     * This method sets the value of the database column t_blog_attachment.SAVE_PATH
     *
     * @param savePath the value for t_blog_attachment.SAVE_PATH
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public void setSavePath(String savePath) {
        this.savePath = savePath == null ? null : savePath.trim();
    }

    /**
     * 
     * This method returns the value of the database column t_blog_attachment.NAME
     *
     * @return the value of t_blog_attachment.NAME
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * This method sets the value of the database column t_blog_attachment.NAME
     *
     * @param name the value for t_blog_attachment.NAME
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 
     * This method returns the value of the database column t_blog_attachment.TYPE
     *
     * @return the value of t_blog_attachment.TYPE
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * This method sets the value of the database column t_blog_attachment.TYPE
     *
     * @param type the value for t_blog_attachment.TYPE
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * 
     * This method returns the value of the database column t_blog_attachment.CREATE_DT
     *
     * @return the value of t_blog_attachment.CREATE_DT
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public Date getCreateDt() {
        return createDt;
    }

    /**
     * 
     * This method sets the value of the database column t_blog_attachment.CREATE_DT
     *
     * @param createDt the value for t_blog_attachment.CREATE_DT
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public void setCreateDt(Date createDt) {
        this.createDt = createDt;
    }

    /**
     * 
     * This method returns the value of the database column t_blog_attachment.UPDATE_DT
     *
     * @return the value of t_blog_attachment.UPDATE_DT
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public Date getUpdateDt() {
        return updateDt;
    }

    /**
     * 
     * This method sets the value of the database column t_blog_attachment.UPDATE_DT
     *
     * @param updateDt the value for t_blog_attachment.UPDATE_DT
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public void setUpdateDt(Date updateDt) {
        this.updateDt = updateDt;
    }

    /**
     * 
     * This method returns the value of the database column t_blog_attachment.CREATOR
     *
     * @return the value of t_blog_attachment.CREATOR
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 
     * This method sets the value of the database column t_blog_attachment.CREATOR
     *
     * @param creator the value for t_blog_attachment.CREATOR
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * 
     * This method returns the value of the database column t_blog_attachment.UPDATOR
     *
     * @return the value of t_blog_attachment.UPDATOR
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public String getUpdator() {
        return updator;
    }

    /**
     * 
     * This method sets the value of the database column t_blog_attachment.UPDATOR
     *
     * @param updator the value for t_blog_attachment.UPDATOR
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public void setUpdator(String updator) {
        this.updator = updator == null ? null : updator.trim();
    }

    /**
     * 
     * This method returns the value of the database column t_blog_attachment.STATE
     *
     * @return the value of t_blog_attachment.STATE
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public String getState() {
        return state;
    }

    /**
     * 
     * This method sets the value of the database column t_blog_attachment.STATE
     *
     * @param state the value for t_blog_attachment.STATE
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}