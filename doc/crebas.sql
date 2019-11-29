CREATE DATABASE IF NOT EXISTS interspace;
ALTER DATABASE interspace DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;

/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2019/1/23 0:15:18                            */
/*==============================================================*/


drop table if exists T_BLOG_ARTICLE;

drop table if exists T_BLOG_ATTACHMENT;

drop table if exists T_BLOG_CATEGORY;

drop table if exists T_BLOG_LINK;

drop table if exists T_DDCZ_EVENTS;

drop table if exists T_PHOTO_ALBUM_FILE;

drop table if exists T_PHOTO_ALBUM_LIST;

/*==============================================================*/
/* Table: T_BLOG_ARTICLE                                        */
/*==============================================================*/
create table T_BLOG_ARTICLE
(
   ID                   int not null auto_increment comment '主键',
   CODE                 char(5) comment '类目编码',
   CONTENT              longtext comment '博客内容',
   TITLE                varchar(200) comment '博客标题',
   COVER                varchar(100) comment '文章封面（一个url）',
   SOURCE               varchar(10) comment '内容来源(字典待定)',
   ATTACHMENTS          varchar(100) comment '附件列表(将ID逗号分开)',
   IF_PUBLISH           char(1) comment '是否公开(1可以,0不可以)',
   IF_COMMENT           char(1) comment '是否评论(1可以,0不可以)',
   CREATE_DT            datetime comment '创建日期',
   UPDATE_DT            datetime comment '更新日期',
   CREATOR              varchar(20) comment '创建人',
   UPDATOR              varchar(20) comment '更新人',
   STATE                char(1) comment '记录状态(1有效,0删除)',
   primary key (ID)
)ENGINE=InnoDB DEFAULT CHARSET=UTF8 COMMENT='博客文章';


/*==============================================================*/
/* Table: T_BLOG_ATTACHMENT                                     */
/*==============================================================*/
create table T_BLOG_ATTACHMENT
(
   ID                   int not null auto_increment comment '主键',
   BLOG_ID              int comment '博客ID',
   SAVE_PATH            varchar(150) comment '附件全限定名（包括路径和名称）',
   NAME                 varchar(50) comment '附件名称',
   TYPE                 char(1) comment '附件类型(暂未定义)',
   CREATE_DT            datetime comment '创建日期',
   UPDATE_DT            datetime comment '更新日期',
   CREATOR              varchar(20) comment '创建人',
   UPDATOR              varchar(20) comment '更新人',
   STATE                char(1) comment '记录状态(1有效,0删除)',
   primary key (ID)
)ENGINE=InnoDB DEFAULT CHARSET=UTF8 COMMENT='博客附件';


/*==============================================================*/
/* Table: T_BLOG_CATEGORY                                       */
/*==============================================================*/
create table T_BLOG_CATEGORY
(
   ID                   int not null auto_increment comment '主键',
   TYPE                 char(1) comment '类目类型(L:link,A:article)',
   CODE                 char(5) comment '类目编码(Cxxxx<4位数字>)',
   PATH                 varchar(100) comment '类目编码路径',
   LEVEL                int comment '类目层级',
   ORDER_NUM            int comment '类目排序',
   COUNTS               int comment '文章数量',
   DESCRIPTION          varchar(100) comment '类目描述',
   P_CODE               char(5) comment '父类目编码',
   CREATE_DT            datetime comment '创建日期',
   UPDATE_DT            datetime comment '更新日期',
   CREATOR              varchar(20) comment '创建人',
   UPDATOR              varchar(20) comment '更新人',
   STATE                char(1) comment '记录状态(1有效,0删除)',
   primary key (ID)
)ENGINE=InnoDB DEFAULT CHARSET=UTF8 COMMENT='博客类目';


/*==============================================================*/
/* Table: T_BLOG_LINK                                           */
/*==============================================================*/
create table T_BLOG_LINK
(
   ID                   int not null auto_increment comment '主键',
   SOURCE               varchar(10) comment '链接来源(字典待定)',
   ADDRESS              varchar(200) comment '链接地址',
   SNAPSHOOT            varchar(500) comment '内容快照',
   CREATE_DT            datetime comment '创建日期',
   UPDATE_DT            datetime comment '更新日期',
   CREATOR              varchar(20) comment '创建人',
   UPDATOR              varchar(20) comment '更新人',
   STATE                char(1) comment '记录状态(1有效,0删除)',
   primary key (ID)
)ENGINE=InnoDB DEFAULT CHARSET=UTF8 COMMENT='博客链接';


/*==============================================================*/
/* Table: T_DDCZ_EVENTS                                         */
/*==============================================================*/
create table T_DDCZ_EVENTS
(
   ID                   int not null auto_increment comment '主键',
   EVENT_TYPE           char(3) comment '事件类型（码值待定）',
   EVENT_NAME           varchar(50) comment '事件名称',
   DESCRIPTION          varchar(500) comment '事件描述',
   ORDER_NUM            int comment '事件排序',
   RELA_LINKS           varchar(150) comment '事件相关链接',
   FILE_SAVE_PATH       varchar(150) comment '事件文件全限定名（包括路径和名称）',
   FILE_NAME            varchar(50) comment '事件文件名称',
   FILE_TYPE            char(1) comment '事件文件类型(1图片2视频)',
   EVENT_DATE           char(10) comment '事件日期(yyyy-MM-dd)',
   EVENT_TIME           char(8) comment '事件时间(HH:MI:SS)',
   CREATE_DT            datetime comment '创建日期',
   UPDATE_DT            datetime comment '更新日期',
   CREATOR              varchar(20) comment '创建人',
   UPDATOR              varchar(20) comment '更新人',
   STATE                char(1) comment '记录状态(1有效,0删除)',
   primary key (ID)
)ENGINE=InnoDB DEFAULT CHARSET=UTF8 COMMENT='豆豆成长记事表';


/*==============================================================*/
/* Table: T_PHOTO_ALBUM_FILE                                    */
/*==============================================================*/
create table T_PHOTO_ALBUM_FILE
(
   ID                   int not null auto_increment comment '主键',
   PHOTO_ALBUM_ID       int comment '相册ID',
   SAVE_PATH            varchar(150) comment '相册文件全限定名（包括路径和名称）',
   NAME                 varchar(50) comment '相册文件名称',
   DESCRIPTION          varchar(200) comment '相册文件描述',
   TYPE                 char(1) comment '相册文件类型(1图片2视频)',
   CREATE_DT            datetime comment '创建日期',
   UPDATE_DT            datetime comment '更新日期',
   CREATOR              varchar(20) comment '创建人',
   UPDATOR              varchar(20) comment '更新人',
   STATE                char(1) comment '记录状态(1有效,0删除)',
   primary key (ID)
)ENGINE=InnoDB DEFAULT CHARSET=UTF8 COMMENT='相册文件';


/*==============================================================*/
/* Table: T_PHOTO_ALBUM_LIST                                    */
/*==============================================================*/
create table T_PHOTO_ALBUM_LIST
(
   ID                   int not null auto_increment comment '主键',
   NAME                 varchar(50) comment '相册名称',
   DESCRIPTION          varchar(500) comment '相册描述',
   ORDER_NUM            int comment '相册排序',
   COUNTS               int comment '相册文件数量',
   CREATE_DT            datetime comment '创建日期',
   UPDATE_DT            datetime comment '更新日期',
   CREATOR              varchar(20) comment '创建人',
   UPDATOR              varchar(20) comment '更新人',
   STATE                char(1) comment '记录状态(1有效,0删除)',
   primary key (ID)
)ENGINE=InnoDB DEFAULT CHARSET=UTF8 COMMENT='相册分类';


