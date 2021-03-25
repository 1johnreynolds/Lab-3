# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table pub_info (
  id                            bigint auto_increment not null,
  title                         varchar(250)NOT NULL DEFAULT '',
  pub_abstract                  longtext,
  mdate                         varchar(100) NOT NULL DEFAULT '',
  authors                       varchar(100)NOT NULL DEFAULT '',
  article_key                   varchar(100) NOT NULL DEFAULT '',
  editors                       varchar(100) NOT NULL DEFAULT '',
  pages                         varchar(50) NOT NULL DEFAULT '',
  ee                            varchar(200) NOT NULL DEFAULT '',
  pub_url                       varchar(100) NOT NULL DEFAULT '',
  pub_year                      INT DEFAULT 0000,
  journal                       varchar(100) NOT NULL DEFAULT '',
  book_title                    varchar(100) NOT NULL DEFAULT '',
  volume                        INT NOT NULL DEFAULT 0,
  pub_number                    INT NOT NULL DEFAULT 0,
  publisher                     varchar(100) NOT NULL DEFAULT '',
  isbn                          varchar(50) NOT NULL DEFAULT '',
  series                        varchar(100) NOT NULL DEFAULT '',
  cross_ref                     varchar(100) NOT NULL DEFAULT '',
  constraint pk_pub_info primary key (id)
);

create table pub_infoapi (
  id                            bigint auto_increment not null,
  title                         varchar(250)NOT NULL DEFAULT '',
  mdate                         varchar(100) NOT NULL DEFAULT '',
  authors                       varchar(100)NOT NULL DEFAULT '',
  article_key                   varchar(100) NOT NULL DEFAULT '',
  editors                       varchar(100) NOT NULL DEFAULT '',
  pages                         varchar(50) NOT NULL DEFAULT '',
  ee                            varchar(200) NOT NULL DEFAULT '',
  pub_url                       varchar(100) NOT NULL DEFAULT '',
  pub_year                      INT DEFAULT 0000,
  journal                       varchar(100) NOT NULL DEFAULT '',
  book_title                    varchar(100) NOT NULL DEFAULT '',
  volume                        INT NOT NULL DEFAULT 0,
  pub_number                    INT NOT NULL DEFAULT 0,
  publisher                     varchar(100) NOT NULL DEFAULT '',
  isbn                          varchar(50) NOT NULL DEFAULT '',
  series                        varchar(100) NOT NULL DEFAULT '',
  cross_ref                     varchar(100) NOT NULL DEFAULT '',
  pub_apiabstract               longtext,
  constraint pk_pub_infoapi primary key (id)
);

create table topicwithtitle (
  pid                           bigint auto_increment not null,
  topic                         varchar(250)NOT NULL DEFAULT '',
  title                         varchar(250)NOT NULL DEFAULT '',
  distribution                  varchar(100) NOT NULL DEFAULT '',
  constraint pk_topicwithtitle primary key (pid)
);

create table topicwithtitleapi (
  pid                           bigint auto_increment not null,
  topic                         varchar(250)NOT NULL DEFAULT '',
  title                         varchar(250)NOT NULL DEFAULT '',
  distribution                  varchar(100) NOT NULL DEFAULT '',
  constraint pk_topicwithtitleapi primary key (pid)
);


# --- !Downs

drop table if exists pub_info;

drop table if exists pub_infoapi;

drop table if exists topicwithtitle;

drop table if exists topicwithtitleapi;

