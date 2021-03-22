# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table pub_info (
  pid                           bigint auto_increment not null,
  title                         varchar(250)NOT NULL DEFAULT '',
  pub_abstract                  longtext,
  mdate                         varchar(100) NOT NULL DEFAULT '',
  author                        varchar(100)NOT NULL DEFAULT '',
  author_list                   varchar(150)NOT NULL DEFAULT '',
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
  constraint pk_pub_info primary key (pid)
);


# --- !Downs

drop table if exists pub_info;

