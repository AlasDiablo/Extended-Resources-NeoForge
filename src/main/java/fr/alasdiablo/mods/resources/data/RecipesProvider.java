package fr.alasdiablo.mods.resources.data;

import fr.alasdiablo.mods.resources.ExtendedResources;
import fr.alasdiablo.mods.resources.registry.ExtendedResourcesItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class RecipesProvider extends RecipeProvider {
    public RecipesProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput) {
        this.nineStorageRecipes(recipeOutput, ExtendedResourcesItems.COAL_NUGGET, Items.COAL);
        this.nineStorageRecipes(recipeOutput, ExtendedResourcesItems.COPPER_NUGGET, Items.COPPER_INGOT);
        this.nineStorageRecipes(recipeOutput, ExtendedResourcesItems.DIAMOND_NUGGET, Items.DIAMOND);
        this.nineStorageRecipes(recipeOutput, ExtendedResourcesItems.EMERALD_NUGGET, Items.EMERALD);
        this.nineStorageRecipes(recipeOutput, ExtendedResourcesItems.LAPIS_NUGGET, Items.LAPIS_LAZULI);
        this.nineStorageRecipes(recipeOutput, ExtendedResourcesItems.REDSTONE_NUGGET, Items.REDSTONE);
    }

    protected void nineStorageRecipes(
            @NotNull RecipeOutput recipeOutput,
            @NotNull ItemLike unpacked,
            @NotNull ItemLike packed
    ) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, unpacked, 9)
                .requires(packed)
                .unlockedBy(getHasName(packed), has(packed))
                .save(
                        recipeOutput,
                        ResourceLocation.fromNamespaceAndPath(
                                ExtendedResources.MOD_ID, getSimpleRecipeName(unpacked)
                        )
                );

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, packed)
                .define('#', unpacked)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .unlockedBy(getHasName(unpacked), has(unpacked))
                .save(
                        recipeOutput,
                        ResourceLocation.fromNamespaceAndPath(
                                ExtendedResources.MOD_ID, getSimpleRecipeName(packed) + "_from_nuggets"
                        )
                );
    }
}
