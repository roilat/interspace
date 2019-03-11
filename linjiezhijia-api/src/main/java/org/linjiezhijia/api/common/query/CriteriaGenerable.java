package org.linjiezhijia.api.common.query;

public interface CriteriaGenerable<T> {
    public Criteria buildCriteria(T t);
}
