package cn.roilat.interspace.api.biz.photoalbum.mappers1;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.roilat.interspace.api.biz.photoalbum.model.PhotoAlbumList;
import cn.roilat.interspace.api.biz.photoalbum.model.PhotoAlbumListExample;

public interface PhotoAlbumListMapper {
    /**
     * 
     * This method corresponds to the database table t_photo_album_list
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    long countByCondition(PhotoAlbumListExample example);

    /**
     * 
     * This method corresponds to the database table t_photo_album_list
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    int deleteByCondition(PhotoAlbumListExample example);

    /**
     * 
     * This method corresponds to the database table t_photo_album_list
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    int insert(PhotoAlbumList record);

    /**
     * 
     * This method corresponds to the database table t_photo_album_list
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    int insertSelective(PhotoAlbumList record);

    /**
     * 
     * This method corresponds to the database table t_photo_album_list
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    List<PhotoAlbumList> selectByCondition(PhotoAlbumListExample example);

    /**
     * 
     * This method corresponds to the database table t_photo_album_list
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    int updateByConditionSelective(@Param("record") PhotoAlbumList record, @Param("example") PhotoAlbumListExample example);

    /**
     * 
     * This method corresponds to the database table t_photo_album_list
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    int updateByCondition(@Param("record") PhotoAlbumList record, @Param("example") PhotoAlbumListExample example);
}