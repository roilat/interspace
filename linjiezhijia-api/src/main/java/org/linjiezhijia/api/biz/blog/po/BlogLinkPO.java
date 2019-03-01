package org.linjiezhijia.api.biz.blog.po;

import java.util.Date;

import org.linjiezhijia.api.common.query.BasePO;

public class BlogLinkPO extends BasePO {
    /**
     *
     */
    private Integer id;

    /**
     *
     */
    private String  source;

    /**
     *
     */
    private String  address;

    /**
     *
     */
    private String  snapshoot;

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

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSnapshoot() {
        return snapshoot;
    }

    public void setSnapshoot(String snapshoot) {
        this.snapshoot = snapshoot;
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
        return "BlogLink [id=" + id + ", source=" + source + ", address=" + address + ", snapshoot="
               + snapshoot + ", createDt=" + createDt + ", updateDt=" + updateDt + ", creator="
               + creator + ", updator=" + updator + ", state=" + state + "]";
    }

}