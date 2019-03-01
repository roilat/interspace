package org.linjiezhijia.api.common.query;

/**
 * 查询参数对象基类
 * 
 * @author roilat-J
 * @version $Id: BasePO.java, v 0.1 2019年2月28日 下午4:09:20 roilat-J Exp $
 */
public class BasePO {
    protected String  orderByClause;
    protected Integer currentPage = 1;
    protected Integer pageSize = 10;

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

}
