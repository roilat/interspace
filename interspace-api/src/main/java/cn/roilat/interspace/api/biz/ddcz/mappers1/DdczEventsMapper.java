package cn.roilat.interspace.api.biz.ddcz.mappers1;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.roilat.interspace.api.biz.ddcz.model.DdczEvents;
import cn.roilat.interspace.api.biz.ddcz.model.DdczEventsExample;

public interface DdczEventsMapper {
    /**
     * 
     * This method corresponds to the database table t_ddcz_events
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    long countByCondition(DdczEventsExample example);

    /**
     * 
     * This method corresponds to the database table t_ddcz_events
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    int deleteByCondition(DdczEventsExample example);

    /**
     * 
     * This method corresponds to the database table t_ddcz_events
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    int insert(DdczEvents record);

    /**
     * 
     * This method corresponds to the database table t_ddcz_events
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    int insertSelective(DdczEvents record);

    /**
     * 
     * This method corresponds to the database table t_ddcz_events
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    List<DdczEvents> selectByCondition(DdczEventsExample example);

    /**
     * 
     * This method corresponds to the database table t_ddcz_events
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    int updateByConditionSelective(@Param("record") DdczEvents record, @Param("example") DdczEventsExample example);

    /**
     * 
     * This method corresponds to the database table t_ddcz_events
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    int updateByCondition(@Param("record") DdczEvents record, @Param("example") DdczEventsExample example);
}