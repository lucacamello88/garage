package GestGar;

import java.util.ArrayList;

import javax.persistence.Query;

import Model.User;
import Model.Veicolo;

public class VeicoloDaoImpl extends ServiceCrud implements VeicoloDao {

	@Override
	public void saveVeicolo(Veicolo veicolo) {
		jpaCreate(veicolo);
	}

	@Override
	public Veicolo getVeicoloById(int id) {
		Query query = jpaRead("SELECT c FROM Contact c WHERE c.id=:id");
		query.setParameter("id", id);
		return (Veicolo) query.getSingleResult();
	}

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<Veicolo> getListVeicoloByUser(User user) {
		Query query = jpaRead("SELECT c FROM Contact c JOIN c.user u WHERE u.id=:id");
		query.setParameter("id", user.getId());
		return (ArrayList<Veicolo>) query.getResultList();
	}

	@Override
	public void updateVeicolo(Veicolo veicolo) {
		jpaUpdate(veicolo);
	}

	@Override
	public void remuveVeicolo(Veicolo veicolo) {
		jpaRemuve(veicolo);
	}

	private void jpaRemuve(Veicolo veicolo) {
		// TODO Auto-generated method stub

	}

}
