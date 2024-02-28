package lk.ijse.SathsaraMoters.config;

import lk.ijse.SathsaraMoters.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryConfig {
    private static SessionFactoryConfig sessionFactoryConfig;

    private final SessionFactory sessionFactory;
    private SessionFactoryConfig(){
        sessionFactory = new Configuration()
                .configure()
                .addAnnotatedClass(User.class)
                .buildSessionFactory();
    }
    public static SessionFactoryConfig getInstance(){
        return sessionFactoryConfig == null
                ? sessionFactoryConfig = new SessionFactoryConfig()
                : sessionFactoryConfig;
    }
    public Session getSession(){
        return sessionFactory.openSession();
    }
}
