package fr.alasdiablo.mods.resources.data.recipe;

import fr.alasdiablo.mods.resources.ExtendedResources;
import fr.alasdiablo.mods.resources.registry.ExtendedResourcesItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;


public class RecipesProvider extends RecipeProvider {
    public RecipesProvider(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);
    }

    @Override
    protected void buildRecipes() {
        this.nineStorageRecipes(ExtendedResourcesItems.COAL_NUGGET, Items.COAL);
        this.nineStorageRecipes(ExtendedResourcesItems.COPPER_NUGGET, Items.COPPER_INGOT);
        this.nineStorageRecipes(ExtendedResourcesItems.DIAMOND_NUGGET, Items.DIAMOND);
        this.nineStorageRecipes(ExtendedResourcesItems.EMERALD_NUGGET, Items.EMERALD);
        this.nineStorageRecipes(ExtendedResourcesItems.LAPIS_NUGGET, Items.LAPIS_LAZULI);
        this.nineStorageRecipes(ExtendedResourcesItems.REDSTONE_NUGGET, Items.REDSTONE);
        this.nineStorageRecipes(ExtendedResourcesItems.NETHERITE_NUGGET, Items.NETHERITE_INGOT);

        this.shaped(RecipeCategory.MISC, Items.NETHERITE_SCRAP)
                .define('#', ExtendedResourcesItems.NETHERITE_FRAGMENT)
                .pattern("##")
                .pattern("##")
                .unlockedBy(RecipesProvider.getHasName(Items.NETHERITE_SCRAP), this.has(ExtendedResourcesItems.NETHERITE_FRAGMENT))
                .save(
                        this.output,
                        ResourceLocation.fromNamespaceAndPath(
                                ExtendedResources.MOD_ID, RecipesProvider.getSimpleRecipeName(Items.NETHERITE_SCRAP) + "_from_fragments"
                        ).toString()
                );
    }

    protected void nineStorageRecipes(
            @NotNull ItemLike unpacked,
            @NotNull ItemLike packed
    ) {
        this.shapeless(RecipeCategory.MISC, unpacked, 9)
                .requires(packed)
                .unlockedBy(RecipesProvider.getHasName(packed), this.has(packed))
                .save(this.output);

        this.shaped(RecipeCategory.MISC, packed)
                .define('#', unpacked)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .unlockedBy(RecipesProvider.getHasName(unpacked), this.has(unpacked))
                .save(
                        this.output,
                        ResourceLocation.fromNamespaceAndPath(
                                ExtendedResources.MOD_ID, RecipesProvider.getSimpleRecipeName(packed) + "_from_nuggets"
                        ).toString()
                );
    }

    public static class Runner extends RecipeProvider.Runner {
        public Runner(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
            super(output, lookupProvider);
        }

        @Override
        protected @NotNull RecipeProvider createRecipeProvider(HolderLookup.@NotNull Provider provider, @NotNull RecipeOutput output) {
            return new RecipesProvider(provider, output);
        }

        @Override
        public @NotNull String getName() {
            return "Dio's Extended Resources Recipes Provider";
        }
    }
}
