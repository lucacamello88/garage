package Model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Veicolo {

	@Enumerated(EnumType.STRING)
	private Tipo tipo;

	@Id
	@GeneratedValue
	private int id;
	private String targa;
	private String marca;
	private String modello;
	double costoOrario = 1.20;

	// @ManyToOne(fetch = FetchType.EAGER)
	// @JoinColumn(name = "id_user")
	// private User user;

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTarga() {
		return targa;
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public double getCostoOrario() {
		return costoOrario;
	}

	public void setCostoOrario(double costoOrario) {
		this.costoOrario = costoOrario;
	}

}
