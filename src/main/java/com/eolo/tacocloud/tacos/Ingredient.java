package com.eolo.tacocloud.tacos;

public record Ingredient(String id, String name, com.eolo.tacocloud.tacos.Ingredient.Type type) {
    public enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
