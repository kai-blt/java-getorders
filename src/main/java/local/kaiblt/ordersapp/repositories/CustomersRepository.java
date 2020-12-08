package local.kaiblt.ordersapp.repositories;

import local.kaiblt.ordersapp.models.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomersRepository extends CrudRepository<Customer, Long> {
    List<Customer> findByCustnameContainingIgnoreCase(String name);
}
