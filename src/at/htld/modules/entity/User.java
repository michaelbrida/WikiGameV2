package at.htld.modules.entity;


/**
 *
 create table wikiuser(
 username varchar(50) not null,
 name varchar(50),
 password varchar(255) not null,
 primary key (username)
 );
 */
public class User {
    private String userName;
    private String name;
    private String password;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
