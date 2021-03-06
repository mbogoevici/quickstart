package org.jboss.as.quickstarts.tasksJsf;

import javax.ejb.Local;

/**
 * Basic operations for manipulation with users
 * 
 * @author Lukas Fryc
 * 
 */
@Local
public interface UserDao {

    public User getForUsername(String username);

    public void createUser(User user);
}
