package com.eolo.tacocloud.tacos.data;

import com.eolo.tacocloud.tacos.TacoOrder;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface OrderRepository extends CrudRepository<TacoOrder, UUID> {

}
