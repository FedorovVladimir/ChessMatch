package real_data_base.adapter_data_base;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import real_data_base.HibernateUtil;
import real_data_base.entity_from_data_base.TypeCompetitionEntity;

import java.util.List;

public class TypeCompetitionAdapter {

    public static void main(String[] args) {
        List<TypeCompetitionEntity> typeCompetitionEntities = getAll();
        for (TypeCompetitionEntity r: typeCompetitionEntities) {
            System.out.println(r.getId() + " " + r.getCode() + " " + r.getName());
        }
    }

    public static List<TypeCompetitionEntity> getAll() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        String sql = "From " + TypeCompetitionEntity.class.getSimpleName();
        return session.createQuery(sql).list();
    }
}
