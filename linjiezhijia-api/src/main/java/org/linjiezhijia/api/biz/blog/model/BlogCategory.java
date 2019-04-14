package org.linjiezhijia.api.biz.blog.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;
import org.linjiezhijia.api.common.BaseEntity;

/**
 * 博客类目
 * 
 * @author roilat-J
 * @version $Id: BlogCategory.java, v 0.1 2019年3月7日 下午4:40:24 roilat-J Exp $
 */
@Entity 
@Table(name = "T_BLOG_CATEGORY") 
@DynamicUpdate
public class BlogCategory extends BaseEntity {
    /**  */
    private static final long serialVersionUID = 7335815104705006277L;

    /**
     *类目类型(L:link,A:article)
     */
    private String  type;

    /**
     *类目编码(Cxxxx<4位数字>)
     */
    private String  code;

    /**
     *类目编码路径
     */
    private String  path;

    /**
     *类目层级
     */
    private Integer   level;

    /**
     *类目排序
     */
    private Integer   orderNum;

    /**
     *文章数量
     */
    private Integer counts;

    /**
     *类目描述
     */
    private String  description;

    /**
     *父类目编码
     */
    private String  pCode;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? "" : type.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? "" : code.trim();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? "" : path.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level == null ? new Integer(0) : level;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum == null ? new Integer(0) : orderNum;
    }

    public Integer getCounts() {
        return counts;
    }

    public void setCounts(Integer counts) {
        this.counts = counts == null ? new Integer(0) : counts;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? "" : description.trim();
    }

    public String getpCode() {
        return pCode;
    }

    public void setpCode(String pCode) {
        this.pCode = pCode == null ? "" : pCode.trim();
    }

    @Override
    public String toString() {
        return "BlogCategory [type=" + type + ", code=" + code + ", path=" + path + ", level="
               + level + ", orderNum=" + orderNum + ", counts=" + counts + ", description="
               + description + ", pCode=" + pCode + ", id=" + id + ", createDt=" + createDt
               + ", updateDt=" + updateDt + ", creator=" + creator + ", updator=" + updator
               + ", state=" + state + "]";
    }
}