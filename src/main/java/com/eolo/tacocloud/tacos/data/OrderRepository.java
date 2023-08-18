package com.eolo.tacocloud.tacos.data;

import com.eolo.tacocloud.tacos.TacoOrder;

public interface OrderRepository {

    TacoOrder save(TacoOrder order);
}
