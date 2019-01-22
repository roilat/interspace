CREATE DATABASE IF NOT EXISTS linjiezhijia;
ALTER DATABASE linjiezhijia DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;

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
   ID                   int not null comment '����',
   CODE                 char(1) comment '��Ŀ����',
   CONTENT              longtext comment '��������',
   TITLE                varchar(200) comment '���ͱ���',
   COVER                varchar(100) comment '���·��棨һ��url��',
   SOURCE               varchar(10) comment '������Դ(�ֵ����)',
   ATTACHMENTS          varchar(100) comment '�����б�(��ID���ŷֿ�)',
   IF_PUBLISH           char(1) comment '�Ƿ񹫿�(1����,0������)',
   IF_COMMENT           char(1) comment '�Ƿ�����(1����,0������)',
   CREATE_DT            datetime comment '��������',
   UPDATE_DT            datetime comment '��������',
   CREATOR              varchar(20) comment '������',
   UPDATOR              varchar(20) comment '������',
   STATE                char(1) comment '��¼״̬(1��Ч,0ɾ��)',
   primary key (ID)
);

alter table T_BLOG_ARTICLE comment '��������';

/*==============================================================*/
/* Table: T_BLOG_ATTACHMENT                                     */
/*==============================================================*/
create table T_BLOG_ATTACHMENT
(
   ID                   int not null comment '����',
   BLOG_ID              int comment '����ID',
   SAVE_PATH            varchar(150) comment '����ȫ�޶���������·�������ƣ�',
   NAME                 varchar(50) comment '��������',
   TYPE                 char(1) comment '��������(��δ����)',
   CREATE_DT            datetime comment '��������',
   UPDATE_DT            datetime comment '��������',
   CREATOR              varchar(20) comment '������',
   UPDATOR              varchar(20) comment '������',
   STATE                char(1) comment '��¼״̬(1��Ч,0ɾ��)',
   primary key (ID)
);

alter table T_BLOG_ATTACHMENT comment '���͸���';

/*==============================================================*/
/* Table: T_BLOG_CATEGORY                                       */
/*==============================================================*/
create table T_BLOG_CATEGORY
(
   ID                   int not null comment '����',
   TYPE                 char(1) comment '��Ŀ����(L:link,A:article)',
   CODE                 char(5) comment '��Ŀ����(Cxxxx<4λ����>)',
   PATH                 varchar(100) comment '��Ŀ����·��',
   LEVEL                smallint comment '��Ŀ�㼶',
   ORDER_NUM            smallint comment '��Ŀ����',
   COUNTS               int comment '��������',
   DESCRIPTION          varchar(100) comment '��Ŀ����',
   P_CODE               char(5) comment '����Ŀ����',
   CREATE_DT            datetime comment '��������',
   UPDATE_DT            datetime comment '��������',
   CREATOR              varchar(20) comment '������',
   UPDATOR              varchar(20) comment '������',
   STATE                char(1) comment '��¼״̬(1��Ч,0ɾ��)',
   primary key (ID)
);

alter table T_BLOG_CATEGORY comment '������Ŀ';

/*==============================================================*/
/* Table: T_BLOG_LINK                                           */
/*==============================================================*/
create table T_BLOG_LINK
(
   ID                   int not null comment '����',
   SOURCE               varchar(10) comment '������Դ(�ֵ����)',
   ADDRESS              varchar(200) comment '���ӵ�ַ',
   SNAPSHOOT            varchar(500) comment '���ݿ���',
   CREATE_DT            datetime comment '��������',
   UPDATE_DT            datetime comment '��������',
   CREATOR              varchar(20) comment '������',
   UPDATOR              varchar(20) comment '������',
   STATE                char(1) comment '��¼״̬(1��Ч,0ɾ��)',
   primary key (ID)
);

alter table T_BLOG_LINK comment '��������';

/*==============================================================*/
/* Table: T_DDCZ_EVENTS                                         */
/*==============================================================*/
create table T_DDCZ_EVENTS
(
   ID                   int not null comment '����',
   EVENT_TYPE           char(3) comment '�¼����ͣ���ֵ������',
   EVENT_NAME           varchar(50) comment '�¼�����',
   DESCRIPTION          varchar(500) comment '�¼�����',
   ORDER_NUM            smallint comment '�¼�����',
   RELA_LINKS           varchar(150) comment '�¼��������',
   FILE_SAVE_PATH       varchar(150) comment '�¼��ļ�ȫ�޶���������·�������ƣ�',
   FILE_NAME            varchar(50) comment '�¼��ļ�����',
   FILE_TYPE            char(1) comment '�¼��ļ�����(1ͼƬ2��Ƶ)',
   EVENT_DATE           char(10) comment '�¼�����(yyyy-MM-dd)',
   EVENT_TIME           char(8) comment '�¼�ʱ��(HH:MI:SS)',
   CREATE_DT            datetime comment '��������',
   UPDATE_DT            datetime comment '��������',
   CREATOR              varchar(20) comment '������',
   UPDATOR              varchar(20) comment '������',
   STATE                char(1) comment '��¼״̬(1��Ч,0ɾ��)',
   primary key (ID)
);

alter table T_DDCZ_EVENTS comment '�����ɳ����±�';

/*==============================================================*/
/* Table: T_PHOTO_ALBUM_FILE                                    */
/*==============================================================*/
create table T_PHOTO_ALBUM_FILE
(
   ID                   int not null comment '����',
   PHOTO_ALBUM_ID       int comment '���ID',
   SAVE_PATH            varchar(150) comment '����ļ�ȫ�޶���������·�������ƣ�',
   NAME                 varchar(50) comment '����ļ�����',
   DESCRIPTION          varchar(200) comment '����ļ�����',
   TYPE                 char(1) comment '����ļ�����(1ͼƬ2��Ƶ)',
   CREATE_DT            datetime comment '��������',
   UPDATE_DT            datetime comment '��������',
   CREATOR              varchar(20) comment '������',
   UPDATOR              varchar(20) comment '������',
   STATE                char(1) comment '��¼״̬(1��Ч,0ɾ��)',
   primary key (ID)
);

alter table T_PHOTO_ALBUM_FILE comment '����ļ�';

/*==============================================================*/
/* Table: T_PHOTO_ALBUM_LIST                                    */
/*==============================================================*/
create table T_PHOTO_ALBUM_LIST
(
   ID                   int not null comment '����',
   NAME                 varchar(50) comment '�������',
   DESCRIPTION          varchar(500) comment '�������',
   ORDER_NUM            smallint comment '�������',
   COUNTS               int comment '����ļ�����',
   CREATE_DT            datetime comment '��������',
   UPDATE_DT            datetime comment '��������',
   CREATOR              varchar(20) comment '������',
   UPDATOR              varchar(20) comment '������',
   STATE                char(1) comment '��¼״̬(1��Ч,0ɾ��)',
   primary key (ID)
);

alter table T_PHOTO_ALBUM_LIST comment '������';

