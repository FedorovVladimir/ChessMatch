package start;

import db.HibernateUtil;
import entitys_from_db.CountryEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class TestWorkEntity {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        CountryEntity countryEntity = new CountryEntity();
        countryEntity.setNameCountry("RUS");
        countryEntity.setCodeCountry("+7");
        session.save(countryEntity);
        session.getTransaction().commit();
        session.close();
        HibernateUtil.shutdown();
    }
}
