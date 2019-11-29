package cn.roilat.interspace.api.biz.photoalbum.model;

import java.util.Date;

public class PhotoAlbumFile {
    /**
     *

     * This field corresponds to the database column t_photo_album_file.ID
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    private Integer id;

    /**
     *

     * This field corresponds to the database column t_photo_album_file.PHOTO_ALBUM_ID
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    private Integer photoAlbumId;

    /**
     *

     * This field corresponds to the database column t_photo_album_file.SAVE_PATH
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    private String savePath;

    /**
     *

     * This field corresponds to the database column t_photo_album_file.NAME
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    private String name;

    /**
     *

     * This field corresponds to the database column t_photo_album_file.DESCRIPTION
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    private String description;

    /**
     *

     * This field corresponds to the database column t_photo_album_file.TYPE
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    private String type;

    /**
     *

     * This field corresponds to the database column t_photo_album_file.CREATE_DT
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    private Date createDt;

    /**
     *

     * This field corresponds to the database column t_photo_album_file.UPDATE_DT
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    private Date updateDt;

    /**
     *

     * This field corresponds to the database column t_photo_album_file.CREATOR
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    private String creator;

    /**
     *

     * This field corresponds to the database column t_photo_album_file.UPDATOR
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    private String updator;

    /**
     *

     * This field corresponds to the database column t_photo_album_file.STATE
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    private String state;

    /**
     * 
     * This method returns the value of the database column t_photo_album_file.ID
     *
     * @return the value of t_photo_album_file.ID
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * This method sets the value of the database column t_photo_album_file.ID
     *
     * @param id the value for t_photo_album_file.ID
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * This method returns the value of the database column t_photo_album_file.PHOTO_ALBUM_ID
     *
     * @return the value of t_photo_album_file.PHOTO_ALBUM_ID
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public Integer getPhotoAlbumId() {
        return photoAlbumId;
    }

    /**
     * 
     * This method sets the value of the database column t_photo_album_file.PHOTO_ALBUM_ID
     *
     * @param photoAlbumId the value for t_photo_album_file.PHOTO_ALBUM_ID
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public void setPhotoAlbumId(Integer photoAlbumId) {
        this.photoAlbumId = photoAlbumId;
    }

    /**
     * 
     * This method returns the value of the database column t_photo_album_file.SAVE_PATH
     *
     * @return the value of t_photo_album_file.SAVE_PATH
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public String getSavePath() {
        return savePath;
    }

    /**
     * 
     * This method sets the value of the database column t_photo_album_file.SAVE_PATH
     *
     * @param savePath the value for t_photo_album_file.SAVE_PATH
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public void setSavePath(String savePath) {
        this.savePath = savePath == null ? null : savePath.trim();
    }

    /**
     * 
     * This method returns the value of the database column t_photo_album_file.NAME
     *
     * @return the value of t_photo_album_file.NAME
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * This method sets the value of the database column t_photo_album_file.NAME
     *
     * @param name the value for t_photo_album_file.NAME
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 
     * This method returns the value of the database column t_photo_album_file.DESCRIPTION
     *
     * @return the value of t_photo_album_file.DESCRIPTION
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public String getDescription() {
        return description;
    }

    /**
     * 
     * This method sets the value of the database column t_photo_album_file.DESCRIPTION
     *
     * @param description the value for t_photo_album_file.DESCRIPTION
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * 
     * This method returns the value of the database column t_photo_album_file.TYPE
     *
     * @return the value of t_photo_album_file.TYPE
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * This method sets the value of the database column t_photo_album_file.TYPE
     *
     * @param type the value for t_photo_album_file.TYPE
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * 
     * This method returns the value of the database column t_photo_album_file.CREATE_DT
     *
     * @return the value of t_photo_album_file.CREATE_DT
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public Date getCreateDt() {
        return createDt;
    }

    /**
     * 
     * This method sets the value of the database column t_photo_album_file.CREATE_DT
     *
     * @param createDt the value for t_photo_album_file.CREATE_DT
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public void setCreateDt(Date createDt) {
        this.createDt = createDt;
    }

    /**
     * 
     * This method returns the value of the database column t_photo_album_file.UPDATE_DT
     *
     * @return the value of t_photo_album_file.UPDATE_DT
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public Date getUpdateDt() {
        return updateDt;
    }

    /**
     * 
     * This method sets the value of the database column t_photo_album_file.UPDATE_DT
     *
     * @param updateDt the value for t_photo_album_file.UPDATE_DT
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public void setUpdateDt(Date updateDt) {
        this.updateDt = updateDt;
    }

    /**
     * 
     * This method returns the value of the database column t_photo_album_file.CREATOR
     *
     * @return the value of t_photo_album_file.CREATOR
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 
     * This method sets the value of the database column t_photo_album_file.CREATOR
     *
     * @param creator the value for t_photo_album_file.CREATOR
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * 
     * This method returns the value of the database column t_photo_album_file.UPDATOR
     *
     * @return the value of t_photo_album_file.UPDATOR
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public String getUpdator() {
        return updator;
    }

    /**
     * 
     * This method sets the value of the database column t_photo_album_file.UPDATOR
     *
     * @param updator the value for t_photo_album_file.UPDATOR
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public void setUpdator(String updator) {
        this.updator = updator == null ? null : updator.trim();
    }

    /**
     * 
     * This method returns the value of the database column t_photo_album_file.STATE
     *
     * @return the value of t_photo_album_file.STATE
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public String getState() {
        return state;
    }

    /**
     * 
     * This method sets the value of the database column t_photo_album_file.STATE
     *
     * @param state the value for t_photo_album_file.STATE
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}