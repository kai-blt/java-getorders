package local.kaiblt.ordersapp.services;

import local.kaiblt.ordersapp.models.Customer;
import local.kaiblt.ordersapp.models.Order;

import java.util.List;

public interface CustomerService {
    List<Customer> getAllOrders();

    Customer getCustomerById(long id);

//    List<Customer> findByNameContainingIgnoreCase(String likename);
}
