package Persist;

import java.io.Serializable;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Persistencia {

    private final SessionFactory sessionFactory;
    private final Session session;

    public Persistencia() {
        this.sessionFactory = new Configuration().configure().buildSessionFactory();
        this.session = sessionFactory.openSession();
        //this.session = new Configuration().configure().buildSessionFactory().openSession();
    }

    public void insert(Object unObjeto){
        Transaction tr = session.beginTransaction();
        session.save(unObjeto);
        tr.commit();
    }
    
    public void delete(Object unObjeto){
        Transaction tr = session.beginTransaction();
        session.delete(unObjeto);
        tr.commit();
    }

    public void update(Object unObjeto){
        Transaction tr = session.beginTransaction();
        session.saveOrUpdate(unObjeto);
        tr.commit();        
    }

    public Object load(String clase,Serializable id) {
        Object obj = session.load(clase,id);
        return obj;
    }
    
    public Object get(String clase,Serializable id){
        Object obj = session.get(clase,id);
        return obj;
    }
    
    public List find(String sentencia) {
        List obj = session.createQuery(sentencia).list();
        
        return obj;
    }
    
    
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
