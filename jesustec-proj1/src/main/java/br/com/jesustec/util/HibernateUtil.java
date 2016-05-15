
package br.com.jesustec.util;

import javax.validation.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.service.ServiceRegistry;


public class HibernateUtil {
    
    private static final SessionFactory sessionfactory;
    
    private static final HIBERNATE_SESSION = "hibernate_session";
    
    static {
        try {
            System.out.println("Tentando abrir uma Session factory");
            
            Configuration configuration = new Configuration().configure();
            ServiceRegistry serviceregistry = new ServiceRegistry(); 
            
            sessionfactory = configuration.buildSessionFactory(ServiceRegitry);
            
        } catch (Exception e) {
        }
    }
    
}
