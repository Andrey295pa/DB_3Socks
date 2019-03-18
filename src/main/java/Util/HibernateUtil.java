package Util;

import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;

public class HibernateUtil {
    private static  final SessionFactory sessionFuctory;
    static {

            try{
                sessionFuctory= new Configuration().configure().buildSessionFactory();
            }catch (Throwable ex) {
                System.err.println("Initial SessionFactory creation failed"+ex);
                throw new ExceptionInInitializerError(ex);
            }
        }

    public  static SessionFactory getSessionFuctory(){
        return sessionFuctory;
    }
}
