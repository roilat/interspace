package cn.roilat.interspace.api.common.query;

public interface CriteriaGenerable<T> {
    public Criteria buildCriteria(T t);
}
