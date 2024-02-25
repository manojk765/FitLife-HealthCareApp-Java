package com.example.firstapp;

public class Recepies {
    private String RecipeName;
    private String RecipeIngredients;
    private String RecipeMethodTitle;
    private String Recipe;
    private String RecipeNutrientsHead ;
    private String RecipeNutrients ;
    private int Thumbnail;



    public Recepies(String name, String recipeIngredients, String recipeMethodTitle, String recipe, int thumbnail , String NutritionalValues){
        RecipeName = name;
        RecipeIngredients = recipeIngredients;
        RecipeMethodTitle = recipeMethodTitle;
        Recipe = recipe;
        Thumbnail = thumbnail;
        RecipeNutrientsHead = "Nutritional Values" ;
        RecipeNutrients = NutritionalValues ;
    }

    public  String getRecipeName(){
        return RecipeName;
    }

    public String getRecipeIngredients(){
        return RecipeIngredients;
    }

    public String getRecipeMethodTitle(){
        return RecipeMethodTitle;
    }

    public String getRecipe(){
        return Recipe;
    }

    public int getThumbnail(){
        return Thumbnail;
    }

    public String getRecipeNutrientsHead() {
        return RecipeNutrientsHead;
    }

    public String getRecipeNutrients() {
        return RecipeNutrients;
    }

}