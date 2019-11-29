package cn.roilat.interspace.api.biz.photoalbum.mappers1;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.roilat.interspace.api.biz.photoalbum.model.PhotoAlbumFile;
import cn.roilat.interspace.api.biz.photoalbum.model.PhotoAlbumFileExample;

public interface PhotoAlbumFileMapper {
    /**
     * 
     * This method corresponds to the database table t_photo_album_file
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    long countByCondition(PhotoAlbumFileExample example);

    /**
     * 
     * This method corresponds to the database table t_photo_album_file
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    int deleteByCondition(PhotoAlbumFileExample example);

    /**
     * 
     * This method corresponds to the database table t_photo_album_file
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    int insert(PhotoAlbumFile record);

    /**
     * 
     * This method corresponds to the database table t_photo_album_file
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    int insertSelective(PhotoAlbumFile record);

    /**
     * 
     * This method corresponds to the database table t_photo_album_file
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    List<PhotoAlbumFile> selectByCondition(PhotoAlbumFileExample example);

    /**
     * 
     * This method corresponds to the database table t_photo_album_file
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    int updateByConditionSelective(@Param("record") PhotoAlbumFile record, @Param("example") PhotoAlbumFileExample example);

    /**
     * 
     * This method corresponds to the database table t_photo_album_file
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    int updateByCondition(@Param("record") PhotoAlbumFile record, @Param("example") PhotoAlbumFileExample example);
}