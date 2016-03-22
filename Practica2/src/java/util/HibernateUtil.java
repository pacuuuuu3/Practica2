package util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtil {

	private static final SessionFactory sessionFactory;

    static {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file. Si el cfg.xml esta en la raiz (default-package), el configure seria "()"
			sessionFactory = new AnnotationConfiguration().configure(
					"xml/hibernate.cfg.xml")
					.buildSessionFactory();
        } catch (Throwable ex) {            
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
		return sessionFactory;
    }
}