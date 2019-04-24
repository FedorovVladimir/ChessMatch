package real_data_base.adapter_data_base;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import real_data_base.HibernateUtil;
import real_data_base.entity_from_data_base.RegionEntity;
import real_data_base.entity_from_data_base.SystemMatchEntity;

import java.util.List;

public class SystemMatchAdapter {

    public static void main(String[] args) {
        List<SystemMatchEntity> systemMatchEntities = getAll();
        for (SystemMatchEntity r: systemMatchEntities) {
            System.out.println(r.getId() + " " + r.getCode() + " " + r.getName());
        }
    }

    public static List<SystemMatchEntity> getAll() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        String sql = "From " + SystemMatchEntity.class.getSimpleName();
        return session.createQuery(sql).list();
    }
}
