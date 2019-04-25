package real_data_base.adapter_data_base;

import real_data_base.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import real_data_base.entity_from_data_base.RegionEntity;

import java.util.List;

public class RegionAdapter {

    private static SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    private static Session session = sessionFactory.openSession();

    static {
        session.beginTransaction();
    }

    public static void main(String[] args) {
        List<RegionEntity> regionEntityList = getAll();
        for (RegionEntity r: regionEntityList) {
            System.out.println(r.getId() + " " + r.getCode() + " " + r.getName());
        }
    }

    public static List<RegionEntity> getAll() {
        String sql = "From " + RegionEntity.class.getSimpleName();
        List<RegionEntity> regionEntities = session.createQuery(sql).list();
        return regionEntities;
    }
}
