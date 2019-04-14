package org.linjiezhijia.api.biz.blog.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;
import org.linjiezhijia.api.common.BaseEntity;

/**
 * 博客链接
 * 
 * @author roilat-J
 * @version $Id: BlogLink.java, v 0.1 2019年3月7日 下午4:39:50 roilat-J Exp $
 */
@Entity 
@Table(name = "T_BLOG_LINK") 
@DynamicUpdate
public class BlogLink extends BaseEntity {
    /**  */
    private static final long serialVersionUID = 5586417727051727036L;
    /**
     *链接来源(字典待定)
     */
    private String            source;

    /**
     *链接地址
     */
    private String            address;

    /**
     *内容快照
     */
    private String            snapshoot;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? "" : source.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? "" : address.trim();
    }

    public String getSnapshoot() {
        return snapshoot;
    }

    public void setSnapshoot(String snapshoot) {
        this.snapshoot = snapshoot == null ? "" : snapshoot.trim();
    }

    @Override
    public String toString() {
        return "BlogLink [source=" + source + ", address=" + address + ", snapshoot=" + snapshoot
               + ", id=" + id + ", createDt=" + createDt + ", updateDt=" + updateDt + ", creator="
               + creator + ", updator=" + updator + ", state=" + state + "]";
    }

}