package org.linjiezhijia.api.biz.blog.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity//jpa
@Table(name = "T_BLOG_CATEGORY")//jpa
public class BlogCategory {
    /**
     *
     * This field corresponds to the database column t_blog_category.ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     *

     * This field corresponds to the database column t_blog_category.TYPE
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    private String type;

    /**
     *

     * This field corresponds to the database column t_blog_category.CODE
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    private String code;

    /**
     *

     * This field corresponds to the database column t_blog_category.PATH
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    private String path;

    /**
     *

     * This field corresponds to the database column t_blog_category.LEVEL
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    private Short level;

    /**
     *

     * This field corresponds to the database column t_blog_category.ORDER_NUM
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    private Short orderNum;

    /**
     *

     * This field corresponds to the database column t_blog_category.COUNTS
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    private Integer counts;

    /**
     *

     * This field corresponds to the database column t_blog_category.DESCRIPTION
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    private String description;

    /**
     *

     * This field corresponds to the database column t_blog_category.P_CODE
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    private String pCode;

    /**
     *

     * This field corresponds to the database column t_blog_category.CREATE_DT
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    private Date createDt;

    /**
     *

     * This field corresponds to the database column t_blog_category.UPDATE_DT
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    private Date updateDt;

    /**
     *

     * This field corresponds to the database column t_blog_category.CREATOR
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    private String creator;

    /**
     *

     * This field corresponds to the database column t_blog_category.UPDATOR
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    private String updator;

    /**
     *

     * This field corresponds to the database column t_blog_category.STATE
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    private String state;

    /**
     * 
     * This method returns the value of the database column t_blog_category.ID
     *
     * @return the value of t_blog_category.ID
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * This method sets the value of the database column t_blog_category.ID
     *
     * @param id the value for t_blog_category.ID
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * This method returns the value of the database column t_blog_category.TYPE
     *
     * @return the value of t_blog_category.TYPE
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * This method sets the value of the database column t_blog_category.TYPE
     *
     * @param type the value for t_blog_category.TYPE
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * 
     * This method returns the value of the database column t_blog_category.CODE
     *
     * @return the value of t_blog_category.CODE
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public String getCode() {
        return code;
    }

    /**
     * 
     * This method sets the value of the database column t_blog_category.CODE
     *
     * @param code the value for t_blog_category.CODE
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * 
     * This method returns the value of the database column t_blog_category.PATH
     *
     * @return the value of t_blog_category.PATH
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public String getPath() {
        return path;
    }

    /**
     * 
     * This method sets the value of the database column t_blog_category.PATH
     *
     * @param path the value for t_blog_category.PATH
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    /**
     * 
     * This method returns the value of the database column t_blog_category.LEVEL
     *
     * @return the value of t_blog_category.LEVEL
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public Short getLevel() {
        return level;
    }

    /**
     * 
     * This method sets the value of the database column t_blog_category.LEVEL
     *
     * @param level the value for t_blog_category.LEVEL
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public void setLevel(Short level) {
        this.level = level;
    }

    /**
     * 
     * This method returns the value of the database column t_blog_category.ORDER_NUM
     *
     * @return the value of t_blog_category.ORDER_NUM
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public Short getOrderNum() {
        return orderNum;
    }

    /**
     * 
     * This method sets the value of the database column t_blog_category.ORDER_NUM
     *
     * @param orderNum the value for t_blog_category.ORDER_NUM
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public void setOrderNum(Short orderNum) {
        this.orderNum = orderNum;
    }

    /**
     * 
     * This method returns the value of the database column t_blog_category.COUNTS
     *
     * @return the value of t_blog_category.COUNTS
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public Integer getCounts() {
        return counts;
    }

    /**
     * 
     * This method sets the value of the database column t_blog_category.COUNTS
     *
     * @param counts the value for t_blog_category.COUNTS
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public void setCounts(Integer counts) {
        this.counts = counts;
    }

    /**
     * 
     * This method returns the value of the database column t_blog_category.DESCRIPTION
     *
     * @return the value of t_blog_category.DESCRIPTION
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public String getDescription() {
        return description;
    }

    /**
     * 
     * This method sets the value of the database column t_blog_category.DESCRIPTION
     *
     * @param description the value for t_blog_category.DESCRIPTION
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * 
     * This method returns the value of the database column t_blog_category.P_CODE
     *
     * @return the value of t_blog_category.P_CODE
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public String getpCode() {
        return pCode;
    }

    /**
     * 
     * This method sets the value of the database column t_blog_category.P_CODE
     *
     * @param pCode the value for t_blog_category.P_CODE
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public void setpCode(String pCode) {
        this.pCode = pCode == null ? null : pCode.trim();
    }

    /**
     * 
     * This method returns the value of the database column t_blog_category.CREATE_DT
     *
     * @return the value of t_blog_category.CREATE_DT
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public Date getCreateDt() {
        return createDt;
    }

    /**
     * 
     * This method sets the value of the database column t_blog_category.CREATE_DT
     *
     * @param createDt the value for t_blog_category.CREATE_DT
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public void setCreateDt(Date createDt) {
        this.createDt = createDt;
    }

    /**
     * 
     * This method returns the value of the database column t_blog_category.UPDATE_DT
     *
     * @return the value of t_blog_category.UPDATE_DT
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public Date getUpdateDt() {
        return updateDt;
    }

    /**
     * 
     * This method sets the value of the database column t_blog_category.UPDATE_DT
     *
     * @param updateDt the value for t_blog_category.UPDATE_DT
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public void setUpdateDt(Date updateDt) {
        this.updateDt = updateDt;
    }

    /**
     * 
     * This method returns the value of the database column t_blog_category.CREATOR
     *
     * @return the value of t_blog_category.CREATOR
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 
     * This method sets the value of the database column t_blog_category.CREATOR
     *
     * @param creator the value for t_blog_category.CREATOR
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * 
     * This method returns the value of the database column t_blog_category.UPDATOR
     *
     * @return the value of t_blog_category.UPDATOR
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public String getUpdator() {
        return updator;
    }

    /**
     * 
     * This method sets the value of the database column t_blog_category.UPDATOR
     *
     * @param updator the value for t_blog_category.UPDATOR
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public void setUpdator(String updator) {
        this.updator = updator == null ? null : updator.trim();
    }

    /**
     * 
     * This method returns the value of the database column t_blog_category.STATE
     *
     * @return the value of t_blog_category.STATE
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public String getState() {
        return state;
    }

    /**
     * 
     * This method sets the value of the database column t_blog_category.STATE
     *
     * @param state the value for t_blog_category.STATE
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}