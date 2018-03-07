select count(*) from wikiuser where username = ? and password = ?;

select hopps from statistics where username_FK = ?;

select StartTime, EndTime from statistics where username_FK = ?;