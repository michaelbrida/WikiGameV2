use wikigame;

drop user if exists wikigameuser@localhost;

create user 'wikigameuser'@'localhost' identified by 'asdf1234';

grant all privileges on wikigame.* to wikigameuser@localhost with grant option;