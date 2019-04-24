package real_data_base.adapter_data_base;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import real_data_base.HibernateUtil;
import real_data_base.entity_from_data_base.IndicatorEntity;
import real_data_base.entity_from_data_base.RegionEntity;

import java.util.List;

public class IndicatorAdapter {

    public static void main(String[] args) {
        List<IndicatorEntity> indicatorEntities = getAll();
        for (IndicatorEntity r: indicatorEntities) {
            System.out.println(r.getId() + " " + r.getCode() + " " + r.getName());
        }
    }

    public static List<IndicatorEntity> getAll() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        String sql = "From " + IndicatorEntity.class.getSimpleName();
        return session.createQuery(sql).list();
    }
}
