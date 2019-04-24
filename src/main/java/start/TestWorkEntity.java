package start;

import db.HibernateUtil;
import entitys_from_db.CountryEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class TestWorkEntity {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
//        CountryEntity countryEntity = new CountryEntity();
//        countryEntity.setPkCountry(4);
//        countryEntity.setNameCountry("RUS");
//        countryEntity.setCodeCountry("+7");
//        session.save(countryEntity);
//        session.getTransaction().commit();
        String sql = "From " + CountryEntity.class.getSimpleName();
        System.out.println("sql = " + sql);

        List<CountryEntity> users = session.createQuery(sql).list();
        System.out.println("FFFFFFFFFFFFFFFFFFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF" + users.size());

        session.close();
        HibernateUtil.shutdown();
    }
}
