package dao;

// default package
// Generated 24/01/2014 09:58:50 PM by Hibernate Tools 3.4.0.CR1

import org.hibernate.Query;
import org.hibernate.Session;

import model.Usuario;
import util.HibernateUtil;

public class UsuarioDAO {

	private Session session;

	public Usuario verificarDatos(Usuario usuario) throws Exception {
		Usuario us = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			String hql = "FROM Usuario WHERE username = '" + usuario.getUsername()
					+ "' and password = '" + usuario.getPassword() + "'";
			Query query = session.createQuery(hql);

			if (!query.list().isEmpty()) {
				us = (Usuario) query.list().get(0);
			}

		} catch (Exception e) {
			throw e;
		}

		return us;
	}
}