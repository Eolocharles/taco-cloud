package com.eolo.tacocloud.tacos.data;

import com.eolo.tacocloud.tacos.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {

}
