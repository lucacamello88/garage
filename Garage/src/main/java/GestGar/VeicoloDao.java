package GestGar;

import java.util.ArrayList;

import Model.User;
import Model.Veicolo;

public interface VeicoloDao {

	void saveVeicolo(Veicolo Veicolo);

	Veicolo getVeicoloById(int id);

	ArrayList<Veicolo> getListVeicoloByUser(User user);

	void updateVeicolo(Veicolo veicolo);

	void remuveVeicolo(Veicolo veicolo);

}
