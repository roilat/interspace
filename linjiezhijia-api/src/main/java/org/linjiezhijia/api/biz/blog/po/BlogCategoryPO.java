package org.linjiezhijia.api.biz.blog.po;

import java.util.Date;

import org.linjiezhijia.api.common.query.BasePO;

public class BlogCategoryPO extends BasePO{
    /**
     *
     */
    private Integer id;

    /**
     *
     */
    private String type;

    /**
     *
     */
    private String code;

    /**
     *
     */
    private String path;

    /**
     *
     */
    private Short level;

    /**
     *
     */
    private Short orderNum;

    /**
     *
     */
    private Integer counts;

    /**
     *
     */
    private String description;

    /**
     *
     */
    private String pCode;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Short getLevel() {
        return level;
    }

    public void setLevel(Short level) {
        this.level = level;
    }

    public Short getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Short orderNum) {
        this.orderNum = orderNum;
    }

    public Integer getCounts() {
        return counts;
    }

    public void setCounts(Integer counts) {
        this.counts = counts;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getpCode() {
        return pCode;
    }

    public void setpCode(String pCode) {
        this.pCode = pCode;
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
        return "BlogCategory [id=" + id + ", type=" + type + ", code=" + code + ", path=" + path
               + ", level=" + level + ", orderNum=" + orderNum + ", counts=" + counts
               + ", description=" + description + ", pCode=" + pCode + ", createDt=" + createDt
               + ", updateDt=" + updateDt + ", creator=" + creator + ", updator=" + updator
               + ", state=" + state + "]";
    }

}