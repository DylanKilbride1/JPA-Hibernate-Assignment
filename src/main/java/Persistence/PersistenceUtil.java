package Persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.Serializable;

public class PersistenceUtil implements Serializable {
	private static final long serialVersionUID = 1L;

	protected static EntityManagerFactory entityManagerFactory =
					Persistence.createEntityManagerFactory("gaaManagementSystem");

	public static void persist(Object entity) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(entity);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	public static void remove(Object entity) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		Object mergedEntity = entityManager.merge(entity);
		entityManager.remove(mergedEntity);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	public static Object merge(Object entity) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entity = entityManager.merge(entity);
		entityManager.getTransaction().commit();
		entityManager.close();
		return entity;
	}

	public static EntityManager createEntityManager() {
		return entityManagerFactory.createEntityManager();
	}
}
