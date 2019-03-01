package org.linjiezhijia.api.biz.blog.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity//jpa
@Table(name = "T_BLOG_LINK")//jpa
public class BlogLink {
    /**
     *
     * This field corresponds to the database column t_blog_link.ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     *

     * This field corresponds to the database column t_blog_link.SOURCE
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    private String source;

    /**
     *

     * This field corresponds to the database column t_blog_link.ADDRESS
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    private String address;

    /**
     *

     * This field corresponds to the database column t_blog_link.SNAPSHOOT
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    private String snapshoot;

    /**
     *

     * This field corresponds to the database column t_blog_link.CREATE_DT
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    private Date createDt;

    /**
     *

     * This field corresponds to the database column t_blog_link.UPDATE_DT
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    private Date updateDt;

    /**
     *

     * This field corresponds to the database column t_blog_link.CREATOR
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    private String creator;

    /**
     *

     * This field corresponds to the database column t_blog_link.UPDATOR
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    private String updator;

    /**
     *

     * This field corresponds to the database column t_blog_link.STATE
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    private String state;

    /**
     * 
     * This method returns the value of the database column t_blog_link.ID
     *
     * @return the value of t_blog_link.ID
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * This method sets the value of the database column t_blog_link.ID
     *
     * @param id the value for t_blog_link.ID
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * This method returns the value of the database column t_blog_link.SOURCE
     *
     * @return the value of t_blog_link.SOURCE
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public String getSource() {
        return source;
    }

    /**
     * 
     * This method sets the value of the database column t_blog_link.SOURCE
     *
     * @param source the value for t_blog_link.SOURCE
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    /**
     * 
     * This method returns the value of the database column t_blog_link.ADDRESS
     *
     * @return the value of t_blog_link.ADDRESS
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public String getAddress() {
        return address;
    }

    /**
     * 
     * This method sets the value of the database column t_blog_link.ADDRESS
     *
     * @param address the value for t_blog_link.ADDRESS
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 
     * This method returns the value of the database column t_blog_link.SNAPSHOOT
     *
     * @return the value of t_blog_link.SNAPSHOOT
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public String getSnapshoot() {
        return snapshoot;
    }

    /**
     * 
     * This method sets the value of the database column t_blog_link.SNAPSHOOT
     *
     * @param snapshoot the value for t_blog_link.SNAPSHOOT
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public void setSnapshoot(String snapshoot) {
        this.snapshoot = snapshoot == null ? null : snapshoot.trim();
    }

    /**
     * 
     * This method returns the value of the database column t_blog_link.CREATE_DT
     *
     * @return the value of t_blog_link.CREATE_DT
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public Date getCreateDt() {
        return createDt;
    }

    /**
     * 
     * This method sets the value of the database column t_blog_link.CREATE_DT
     *
     * @param createDt the value for t_blog_link.CREATE_DT
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public void setCreateDt(Date createDt) {
        this.createDt = createDt;
    }

    /**
     * 
     * This method returns the value of the database column t_blog_link.UPDATE_DT
     *
     * @return the value of t_blog_link.UPDATE_DT
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public Date getUpdateDt() {
        return updateDt;
    }

    /**
     * 
     * This method sets the value of the database column t_blog_link.UPDATE_DT
     *
     * @param updateDt the value for t_blog_link.UPDATE_DT
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public void setUpdateDt(Date updateDt) {
        this.updateDt = updateDt;
    }

    /**
     * 
     * This method returns the value of the database column t_blog_link.CREATOR
     *
     * @return the value of t_blog_link.CREATOR
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 
     * This method sets the value of the database column t_blog_link.CREATOR
     *
     * @param creator the value for t_blog_link.CREATOR
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * 
     * This method returns the value of the database column t_blog_link.UPDATOR
     *
     * @return the value of t_blog_link.UPDATOR
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public String getUpdator() {
        return updator;
    }

    /**
     * 
     * This method sets the value of the database column t_blog_link.UPDATOR
     *
     * @param updator the value for t_blog_link.UPDATOR
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public void setUpdator(String updator) {
        this.updator = updator == null ? null : updator.trim();
    }

    /**
     * 
     * This method returns the value of the database column t_blog_link.STATE
     *
     * @return the value of t_blog_link.STATE
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public String getState() {
        return state;
    }

    /**
     * 
     * This method sets the value of the database column t_blog_link.STATE
     *
     * @param state the value for t_blog_link.STATE
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}