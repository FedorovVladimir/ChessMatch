package real_data_base.adapter_data_base;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import real_data_base.HibernateUtil;
import real_data_base.entity_from_data_base.TournamentEntity;

import java.util.List;

public class TournamentAdapter {

    private static SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    private static Session session = sessionFactory.openSession();

    static {
        session.beginTransaction();
    }

    public static void main(String[] args) {
        List<TournamentEntity> tournamentEntities = getAll();
        for (TournamentEntity r: tournamentEntities) {
            System.out.println(r.getId() + " " + r.getAdress() + " " + r.getName() + " " + r.getAdress());
        }
        tournamentEntities = getId(1);
        System.out.println(tournamentEntities.toString());
    }

    public static List<TournamentEntity> getAll() {
        String sql = "From " + TournamentEntity.class.getSimpleName();
        List<TournamentEntity> tournamentEntities = session.createQuery(sql).list();
        return tournamentEntities;
    }
    public static List<TournamentEntity> getId(int id) {
        String sql = "From " + TournamentEntity.class.getSimpleName();
        Query query = session.createQuery("from TournamentEntity where id = " + id);
        List<TournamentEntity> tournamentEntities = query.list();
        return tournamentEntities;

    }


}
