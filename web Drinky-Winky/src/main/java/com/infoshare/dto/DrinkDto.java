package com.infoshare.dto;

import com.infoshare.model.Drink;
import com.infoshare.model.Ingredient;

import java.util.ArrayList;
import java.util.List;

public class DrinkDto {
    private Long id;
    private String name;

    private Boolean isCustom;
    private Boolean isApproved;
    private String recipe;
    private String drinkType;
    private String glassType;
    private String modificationDate;
    private String imageUrl;
    private CategoryDto category;
    private List<IngredientDto> ingredientList;

    public static DrinkDto drinkToDTO(Drink drink) {
        DrinkDto drinkDTO = new DrinkDto();
        drinkDTO.setId(drink.getId());
        drinkDTO.setName(drink.getName());
        drinkDTO.setCustom(drink.getIsCustom());
        drinkDTO.setApproved(drink.getIsApproved());
        drinkDTO.setRecipe(drink.getRecipe());
        drinkDTO.setDrinkType(drink.getDrinkType());
        drinkDTO.setGlassType(drink.getGlassType());
        drinkDTO.setModificationDate(drink.getModificationDate());
        drinkDTO.setImageUrl(drink.getImageUrl());
        drinkDTO.setCategory(CategoryDto.categoryToDto(drink.getCategory()));

        List<IngredientDto> ingredientDtoList = new ArrayList<>();
        drink.getIngredientList().forEach(ingredient -> {
            IngredientDto ingredientDTO = IngredientDto.ingredientToDto(ingredient);
            ingredientDtoList.add(ingredientDTO);
                });
        drinkDTO.setIngredientList(ingredientDtoList);
        return drinkDTO;
    }

    public static Drink dtoToDrink(DrinkDto drinkDTO) {
        Drink drink = new Drink();
        drink.setName(drinkDTO.getName());
        drink.setIsCustom(drinkDTO.getCustom());
        drink.setIsApproved(drinkDTO.getApproved());
        drink.setRecipe(drinkDTO.getRecipe());
        drink.setDrinkType(drinkDTO.getDrinkType());
        drink.setGlassType(drinkDTO.getGlassType());
        drink.setModificationDate(drinkDTO.getModificationDate());
        drink.setImageUrl(drinkDTO.getImageUrl());
        drink.setCategory(CategoryDto.dtoToCategory(drinkDTO.getCategory()));

        List<Ingredient> ingredientList = new ArrayList<>();
        drinkDTO.getIngredientList().forEach(ingredientDto -> {
            Ingredient ingredient = IngredientDto.dtoToIngredient(ingredientDto);
            ingredientList.add(ingredient);
        });
        drink.setIngredientList(ingredientList);
        return drink;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getCustom() {
        return isCustom;
    }

    public void setCustom(Boolean custom) {
        isCustom = custom;
    }

    public Boolean getApproved() {
        return isApproved;
    }

    public void setApproved(Boolean approved) {
        isApproved = approved;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    public String getDrinkType() {
        return drinkType;
    }

    public void setDrinkType(String drinkType) {
        this.drinkType = drinkType;
    }

    public String getGlassType() {
        return glassType;
    }

    public void setGlassType(String glassType) {
        this.glassType = glassType;
    }

    public String getModificationDate() {
        return modificationDate;
    }

    public void setModificationDate(String modificationDate) {
        this.modificationDate = modificationDate;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public CategoryDto getCategory() {
        return category;
    }

    public void setCategory(CategoryDto category) {
        this.category = category;
    }

    public List<IngredientDto> getIngredientList() {
        return ingredientList;
    }

    public void setIngredientList(List<IngredientDto> ingredientList) {
        this.ingredientList = ingredientList;
    }

}

