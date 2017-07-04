package GestGar;

import javax.persistence.Query;

import Model.User;

public class UserDaoImpl extends ServiceCrud implements UserDao {

	@Override
	public void saveUser(User user) {
		jpaCreate(user);
	}

	@Override
	public User getUserByUsernameAndPassword(String username, String password) {
		Query query = jpaRead("SELECT u FROM User u WHERE u.username=:username AND u.password=:password");
		query.setParameter("username", username);
		query.setParameter("password", password);
		return (User) query.getSingleResult();
	}

}
