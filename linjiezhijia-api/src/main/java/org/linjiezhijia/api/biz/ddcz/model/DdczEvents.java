package org.linjiezhijia.api.biz.ddcz.model;

import java.util.Date;

public class DdczEvents {
    /**
     *

     * This field corresponds to the database column t_ddcz_events.ID
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    private Integer id;

    /**
     *

     * This field corresponds to the database column t_ddcz_events.EVENT_TYPE
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    private String eventType;

    /**
     *

     * This field corresponds to the database column t_ddcz_events.EVENT_NAME
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    private String eventName;

    /**
     *

     * This field corresponds to the database column t_ddcz_events.DESCRIPTION
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    private String description;

    /**
     *

     * This field corresponds to the database column t_ddcz_events.ORDER_NUM
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    private Integer orderNum;

    /**
     *

     * This field corresponds to the database column t_ddcz_events.RELA_LINKS
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    private String relaLinks;

    /**
     *

     * This field corresponds to the database column t_ddcz_events.FILE_SAVE_PATH
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    private String fileSavePath;

    /**
     *

     * This field corresponds to the database column t_ddcz_events.FILE_NAME
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    private String fileName;

    /**
     *

     * This field corresponds to the database column t_ddcz_events.FILE_TYPE
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    private String fileType;

    /**
     *

     * This field corresponds to the database column t_ddcz_events.EVENT_DATE
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    private String eventDate;

    /**
     *

     * This field corresponds to the database column t_ddcz_events.EVENT_TIME
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    private String eventTime;

    /**
     *

     * This field corresponds to the database column t_ddcz_events.CREATE_DT
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    private Date createDt;

    /**
     *

     * This field corresponds to the database column t_ddcz_events.UPDATE_DT
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    private Date updateDt;

    /**
     *

     * This field corresponds to the database column t_ddcz_events.CREATOR
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    private String creator;

    /**
     *

     * This field corresponds to the database column t_ddcz_events.UPDATOR
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    private String updator;

    /**
     *

     * This field corresponds to the database column t_ddcz_events.STATE
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    private String state;

    /**
     * 
     * This method returns the value of the database column t_ddcz_events.ID
     *
     * @return the value of t_ddcz_events.ID
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * This method sets the value of the database column t_ddcz_events.ID
     *
     * @param id the value for t_ddcz_events.ID
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * This method returns the value of the database column t_ddcz_events.EVENT_TYPE
     *
     * @return the value of t_ddcz_events.EVENT_TYPE
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * 
     * This method sets the value of the database column t_ddcz_events.EVENT_TYPE
     *
     * @param eventType the value for t_ddcz_events.EVENT_TYPE
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public void setEventType(String eventType) {
        this.eventType = eventType == null ? null : eventType.trim();
    }

    /**
     * 
     * This method returns the value of the database column t_ddcz_events.EVENT_NAME
     *
     * @return the value of t_ddcz_events.EVENT_NAME
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public String getEventName() {
        return eventName;
    }

    /**
     * 
     * This method sets the value of the database column t_ddcz_events.EVENT_NAME
     *
     * @param eventName the value for t_ddcz_events.EVENT_NAME
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public void setEventName(String eventName) {
        this.eventName = eventName == null ? null : eventName.trim();
    }

    /**
     * 
     * This method returns the value of the database column t_ddcz_events.DESCRIPTION
     *
     * @return the value of t_ddcz_events.DESCRIPTION
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public String getDescription() {
        return description;
    }

    /**
     * 
     * This method sets the value of the database column t_ddcz_events.DESCRIPTION
     *
     * @param description the value for t_ddcz_events.DESCRIPTION
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * 
     * This method returns the value of the database column t_ddcz_events.ORDER_NUM
     *
     * @return the value of t_ddcz_events.ORDER_NUM
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public Integer getOrderNum() {
        return orderNum;
    }

    /**
     * 
     * This method sets the value of the database column t_ddcz_events.ORDER_NUM
     *
     * @param orderNum the value for t_ddcz_events.ORDER_NUM
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    /**
     * 
     * This method returns the value of the database column t_ddcz_events.RELA_LINKS
     *
     * @return the value of t_ddcz_events.RELA_LINKS
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public String getRelaLinks() {
        return relaLinks;
    }

    /**
     * 
     * This method sets the value of the database column t_ddcz_events.RELA_LINKS
     *
     * @param relaLinks the value for t_ddcz_events.RELA_LINKS
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public void setRelaLinks(String relaLinks) {
        this.relaLinks = relaLinks == null ? null : relaLinks.trim();
    }

    /**
     * 
     * This method returns the value of the database column t_ddcz_events.FILE_SAVE_PATH
     *
     * @return the value of t_ddcz_events.FILE_SAVE_PATH
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public String getFileSavePath() {
        return fileSavePath;
    }

    /**
     * 
     * This method sets the value of the database column t_ddcz_events.FILE_SAVE_PATH
     *
     * @param fileSavePath the value for t_ddcz_events.FILE_SAVE_PATH
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public void setFileSavePath(String fileSavePath) {
        this.fileSavePath = fileSavePath == null ? null : fileSavePath.trim();
    }

    /**
     * 
     * This method returns the value of the database column t_ddcz_events.FILE_NAME
     *
     * @return the value of t_ddcz_events.FILE_NAME
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * 
     * This method sets the value of the database column t_ddcz_events.FILE_NAME
     *
     * @param fileName the value for t_ddcz_events.FILE_NAME
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    /**
     * 
     * This method returns the value of the database column t_ddcz_events.FILE_TYPE
     *
     * @return the value of t_ddcz_events.FILE_TYPE
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public String getFileType() {
        return fileType;
    }

    /**
     * 
     * This method sets the value of the database column t_ddcz_events.FILE_TYPE
     *
     * @param fileType the value for t_ddcz_events.FILE_TYPE
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public void setFileType(String fileType) {
        this.fileType = fileType == null ? null : fileType.trim();
    }

    /**
     * 
     * This method returns the value of the database column t_ddcz_events.EVENT_DATE
     *
     * @return the value of t_ddcz_events.EVENT_DATE
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public String getEventDate() {
        return eventDate;
    }

    /**
     * 
     * This method sets the value of the database column t_ddcz_events.EVENT_DATE
     *
     * @param eventDate the value for t_ddcz_events.EVENT_DATE
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public void setEventDate(String eventDate) {
        this.eventDate = eventDate == null ? null : eventDate.trim();
    }

    /**
     * 
     * This method returns the value of the database column t_ddcz_events.EVENT_TIME
     *
     * @return the value of t_ddcz_events.EVENT_TIME
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public String getEventTime() {
        return eventTime;
    }

    /**
     * 
     * This method sets the value of the database column t_ddcz_events.EVENT_TIME
     *
     * @param eventTime the value for t_ddcz_events.EVENT_TIME
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public void setEventTime(String eventTime) {
        this.eventTime = eventTime == null ? null : eventTime.trim();
    }

    /**
     * 
     * This method returns the value of the database column t_ddcz_events.CREATE_DT
     *
     * @return the value of t_ddcz_events.CREATE_DT
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public Date getCreateDt() {
        return createDt;
    }

    /**
     * 
     * This method sets the value of the database column t_ddcz_events.CREATE_DT
     *
     * @param createDt the value for t_ddcz_events.CREATE_DT
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public void setCreateDt(Date createDt) {
        this.createDt = createDt;
    }

    /**
     * 
     * This method returns the value of the database column t_ddcz_events.UPDATE_DT
     *
     * @return the value of t_ddcz_events.UPDATE_DT
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public Date getUpdateDt() {
        return updateDt;
    }

    /**
     * 
     * This method sets the value of the database column t_ddcz_events.UPDATE_DT
     *
     * @param updateDt the value for t_ddcz_events.UPDATE_DT
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public void setUpdateDt(Date updateDt) {
        this.updateDt = updateDt;
    }

    /**
     * 
     * This method returns the value of the database column t_ddcz_events.CREATOR
     *
     * @return the value of t_ddcz_events.CREATOR
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 
     * This method sets the value of the database column t_ddcz_events.CREATOR
     *
     * @param creator the value for t_ddcz_events.CREATOR
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * 
     * This method returns the value of the database column t_ddcz_events.UPDATOR
     *
     * @return the value of t_ddcz_events.UPDATOR
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public String getUpdator() {
        return updator;
    }

    /**
     * 
     * This method sets the value of the database column t_ddcz_events.UPDATOR
     *
     * @param updator the value for t_ddcz_events.UPDATOR
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public void setUpdator(String updator) {
        this.updator = updator == null ? null : updator.trim();
    }

    /**
     * 
     * This method returns the value of the database column t_ddcz_events.STATE
     *
     * @return the value of t_ddcz_events.STATE
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public String getState() {
        return state;
    }

    /**
     * 
     * This method sets the value of the database column t_ddcz_events.STATE
     *
     * @param state the value for t_ddcz_events.STATE
     *
     * @mbg.generated Wed Feb 27 18:14:31 CST 2019
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}