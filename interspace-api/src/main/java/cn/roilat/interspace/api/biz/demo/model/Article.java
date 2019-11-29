package cn.roilat.interspace.api.biz.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.ibatis.type.Alias;

@Entity//jpa
@Table(name = "tb_article")//jpa
@Alias("Article") //for mybatis
public class Article {
    @Id
    @GeneratedValue
    private Long    id;
    private String  title;
    private String  summary;
    private Date    createTime;
    private Date    publicTime;
    private Date    updateTime;
    private Long    userId;
    private Integer status;
    private Integer type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getPublicTime() {
        return publicTime;
    }

    public void setPublicTime(Date publicTime) {
        this.publicTime = publicTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Article [id=" + id + ", title=" + title + ", summary=" + summary + ", createTime="
               + createTime + ", publicTime=" + publicTime + ", updateTime=" + updateTime
               + ", userId=" + userId + ", status=" + status + ", type=" + type + "]";
    }
    

}
