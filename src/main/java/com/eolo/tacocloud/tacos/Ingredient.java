package com.eolo.tacocloud.tacos;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table
public record Ingredient(@Id String id, String name, com.eolo.tacocloud.tacos.Ingredient.Type type) {
    public enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
