package real_data_base.adapter_data_base;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import real_data_base.HibernateUtil;
import real_data_base.entity_from_data_base.TypeCompetitionEntity;

import java.util.List;

public class TypeCompetitionAdapter {

    private static SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    private static Session session = sessionFactory.openSession();

    static {
        session.beginTransaction();
    }

    public static void main(String[] args) {
        List<TypeCompetitionEntity> typeCompetitionEntities = getAll();
        for (TypeCompetitionEntity r: typeCompetitionEntities) {
            System.out.println(r.getId() + " " + r.getCode() + " " + r.getName());
        }
    }

    public static List<TypeCompetitionEntity> getAll() {
        String sql = "From " + TypeCompetitionEntity.class.getSimpleName();
        List<TypeCompetitionEntity> typeCompetitionEntities = session.createQuery(sql).list();
        return typeCompetitionEntities;
    }
}
