package com.restaurantbookings.restaurantbookings.repositories.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;

public class CustomerRepositoryImpl implements CustomerRepositoryCustom{

    @Autowired
    EntityManager entityManager;

//    @Transactional
//    public List<Customer> findAllOrderByBookingsCount() {
//        List<Customer> results = null;
//        Session session = entityManager.unwrap(Session.class);
//        try {
//            Criteria cr = session.createCriteria(Customer.class);
//            cr.createAlias("bookings", "bookings");
//            cr.addOrder(Order.desc("count"));
//            results = cr.list();
//        }
//        catch(HibernateException ex) {
//            ex.printStackTrace();
//        }
//        finally {
//            session.close();
//            return results;
//        }
//    }

}
