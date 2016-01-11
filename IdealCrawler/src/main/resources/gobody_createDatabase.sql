drop database if exists gobody;
create database gobody;
use gobody;

create table article(
id					 int(10)			   not null    primary key    unique     auto_increment,
articleid          varchar(255)    not null,
title               varchar(255)    not null,
subject          varchar(255)    not null,
url                 varchar(255)    not null,
abstract         varchar(255)    not null,
author           varchar(255)    not null,
img1			     varchar(255),
img2              varchar(255),
img3              varchar(255),
createtime      bigint              not null
);

create table keywords(
id                  int(10)         not null    primary key     unique		auto_increment,
keyword             varchar(20)     not null,
articleIds          text
);

create table articlecontent(
articleid                  varchar(255)    not null    primary key     unique,
content             text
);

create table historyUrl(
id                  int(10)         not null    primary key     unique		auto_increment,
url                 varchar(255)    not null
);

alter table articlecontent
   add constraint foreign key (articleid)
      references article (articleid)
      on delete cascade on update cascade;
      