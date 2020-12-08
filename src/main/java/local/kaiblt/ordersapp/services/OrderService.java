package local.kaiblt.ordersapp.services;

import local.kaiblt.ordersapp.models.Order;

public interface OrderService {
    Order getOrderById(long id);
}
