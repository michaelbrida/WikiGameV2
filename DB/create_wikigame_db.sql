create database wikigame;

use wikigame;

drop table if exists wikiuser, statistics;

create table wikiuser(
	username varchar(50) not null,
    name varchar(50),
    password varchar(255) not null,
    primary key (username)
);

create table statistics(
	id int auto_increment,
    username_FK varchar(50) not null,
    startTime date,
    EndTime date,
    hopps int,
    primary key(id),
    Foreign key (username_FK) references wikiuser(username)
);

create table words(
	id int auto_increment,
    start_word varchar(255) not null,
    end_word varchar(255) not null,
    primary key(id)
);

