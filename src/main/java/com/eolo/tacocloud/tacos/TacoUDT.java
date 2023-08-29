package com.eolo.tacocloud.tacos;

import com.eolo.tacocloud.tacos.web.IngredientUDT;
import lombok.Data;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;

import java.util.List;

@Data
@UserDefinedType("taco")
public class TacoUDT {
    private final String name;
    private final List<IngredientUDT> ingredients;
}
