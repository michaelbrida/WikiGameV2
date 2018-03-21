package at.htld.modules.handler;

import at.htld.modules.entity.User;

public class Session {
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
