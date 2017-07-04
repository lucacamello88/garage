package GestGar;

import Model.User;

public interface UserDao {

	void saveUser(User user);

	User getUserByUsernameAndPassword(String username, String password);

}
