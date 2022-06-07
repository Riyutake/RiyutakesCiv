package com.example.riyutakesciv.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;

import java.util.function.Consumer;

public class RCRecipes extends RecipeProvider {

    public RCRecipes(DataGenerator generatorIn) { super(generatorIn); }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer){
    }
}
