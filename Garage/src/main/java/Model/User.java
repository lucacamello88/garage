package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//import it.dstech.model.Contact;

@Entity
public class User {

	@Id
	@GeneratedValue
	private int id;

	private String username;

	private String password;

	// @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
	// private List<Veicolo> listVeicoli;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
