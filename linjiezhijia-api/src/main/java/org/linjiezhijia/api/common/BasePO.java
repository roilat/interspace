package org.linjiezhijia.api.common;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 查询参数对象基类
 * 
 * @author roilat-J
 * @version $Id: BasePO.java, v 0.1 2019年2月28日 下午4:09:20 roilat-J Exp $
 */
public class BasePO {
    protected String              orderByClause;
    protected Integer             currentPage = 1;
    protected Integer             pageSize    = 10;
    protected Map<String, Object> params      = new HashMap<String, Object>();

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public void setParams(Map<String, Object> params) {
        this.params = params;
    }

    protected Integer id;
    protected Date    createDt;
    protected Date    updateDt;
    protected String  creator;
    protected String  updator;
    protected String  state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
