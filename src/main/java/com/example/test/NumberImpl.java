package com.example.test;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Connectivity with database(mysql)
 * when call this method value will be increased by 1.
 */

@Repository
@Transactional
public class NumberImpl implements NumberDao{
    private SessionFactory sessionFactory;

    @Autowired
    public NumberImpl(SessionFactory sessionFactory){
        this.sessionFactory=sessionFactory;
    }

    @Override
    @Transactional
    public void countNumber() {
        Session session= sessionFactory.getCurrentSession();
           /**
                read value from database where id=1
             */
            Query query = session.createSQLQuery("select MAX(counts) from number");
            List<Integer> numbers= query.getResultList();
            int a=numbers.get(0);
            int b= a+1;
           /**
              write value in database by increasing +1 where id =1
           */
            Query query1 = session.createSQLQuery("update number set counts= :numCount where id='1'");
            query1.setParameter("numCount",b);
            int result= query1.executeUpdate();
    }
}
