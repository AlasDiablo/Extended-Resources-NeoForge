package fr.alasdiablo.mods.resources.data.recipe;

import fr.alasdiablo.mods.lib.data.DioRecipieProvider;
import fr.alasdiablo.mods.resources.ExtendedResources;
import fr.alasdiablo.mods.resources.tag.ExtendedResourcesTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class VanillaRecipiesProvider extends DioRecipieProvider {
    protected VanillaRecipiesProvider(HolderLookup.Provider registries, RecipeOutput output) {
        super(ExtendedResources.MOD_ID, registries, output);
    }

    @Override
    protected void buildRecipes() {
        this.tools(
                Items.IRON_AXE, Items.IRON_HOE, Items.IRON_PICKAXE, Items.IRON_SHOVEL, Items.IRON_SWORD,
                ExtendedResourcesTags.Items.PLATES_IRON
        );
        this.armors(
                Items.IRON_HELMET, Items.IRON_CHESTPLATE, Items.IRON_LEGGINGS, Items.IRON_BOOTS,
                ExtendedResourcesTags.Items.PLATES_IRON
        );

        this.tools(
                Items.GOLDEN_AXE, Items.GOLDEN_HOE, Items.GOLDEN_PICKAXE, Items.GOLDEN_SHOVEL, Items.GOLDEN_SWORD,
                ExtendedResourcesTags.Items.PLATES_GOLD
        );
        this.armors(
                Items.GOLDEN_HELMET, Items.GOLDEN_CHESTPLATE, Items.GOLDEN_LEGGINGS, Items.GOLDEN_BOOTS,
                ExtendedResourcesTags.Items.PLATES_GOLD
        );
    }

    public static class Runner extends RecipeProvider.Runner {
        public Runner(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
            super(output, lookupProvider);
        }

        @Override
        protected @NotNull RecipeProvider createRecipeProvider(HolderLookup.@NotNull Provider provider, @NotNull RecipeOutput output) {
            return new VanillaRecipiesProvider(provider, output);
        }

        @Override
        public @NotNull String getName() {
            return "Dio's Extended Resources Vanilla Recipes Provider";
        }
    }
}
