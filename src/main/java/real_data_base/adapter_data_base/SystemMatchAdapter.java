package real_data_base.adapter_data_base;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import real_data_base.HibernateUtil;
import real_data_base.entity_from_data_base.RegionEntity;
import real_data_base.entity_from_data_base.SystemMatchEntity;

import java.util.List;

public class SystemMatchAdapter {

    private static SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    private static Session session = sessionFactory.openSession();

    static {
        session.beginTransaction();
    }

    public static void main(String[] args) {
        List<SystemMatchEntity> systemMatchEntities = getAll();
        for (SystemMatchEntity r: systemMatchEntities) {
            System.out.println(r.getId() + " " + r.getCode() + " " + r.getName());
        }
    }

    public static List<SystemMatchEntity> getAll() {
        String sql = "From " + SystemMatchEntity.class.getSimpleName();
        List<SystemMatchEntity> systemMatchEntities = session.createQuery(sql).list();
        return systemMatchEntities;
    }
}
