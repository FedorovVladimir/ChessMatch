package real_data_base.adapter_data_base;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import real_data_base.HibernateUtil;
import real_data_base.entity_from_data_base.ArbiterEntity;
import real_data_base.entity_from_data_base.IndicatorEntity;

import java.util.List;

public class ArbiterAdapter {

    private static SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    private static Session session = sessionFactory.openSession();

    static {
        session.beginTransaction();
    }

    public static void main(String[] args) {
        List<ArbiterEntity> arbiterEntities = getAll();
        System.out.println(arbiterEntities.size());
        for (ArbiterEntity r: arbiterEntities) {
            System.out.println(r.getId() + " " + r.getHuman().getFirst() + " " + r.getHuman().getLast() + " " + r.getHuman().getPatro());
        }
    }

    public static List<ArbiterEntity> getAll() {
        String sql = "From " + ArbiterEntity.class.getSimpleName();
        List<ArbiterEntity> arbiterEntities = session.createQuery(sql).list();
        return arbiterEntities;
    }
}
