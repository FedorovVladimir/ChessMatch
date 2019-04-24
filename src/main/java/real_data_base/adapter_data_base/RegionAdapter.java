package real_data_base.adapter_data_base;

import real_data_base.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import real_data_base.entity_from_data_base.RegionEntity;

import java.util.List;

public class RegionAdapter {

    public static void main(String[] args) {
        List<RegionEntity> regionEntityList = getAll();
        for (RegionEntity r: regionEntityList) {
            System.out.println(r.getId() + " " + r.getCode() + " " + r.getName());
        }
    }

    public static List<RegionEntity> getAll() {
        System.out.println("Goood");
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        String sql = "From " + RegionEntity.class.getSimpleName();
        System.out.println(sql);
        List<RegionEntity> regionEntityList = session.createQuery(sql).list();
        return regionEntityList;
    }
}
