package com.german.gogogo.configuration;

import com.german.gogogo.model.Product;
import com.german.gogogo.model.SalesPoint;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateConfiguration {
    private static SessionFactory sessionFactory;

    private HibernateConfiguration() {}

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration().configure();

                configuration.addAnnotatedClass(Product.class);
                configuration.addAnnotatedClass(SalesPoint.class);

                StandardServiceRegistryBuilder builder =
                        new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());

                sessionFactory = configuration.buildSessionFactory(builder.build());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return sessionFactory;
    }
}
