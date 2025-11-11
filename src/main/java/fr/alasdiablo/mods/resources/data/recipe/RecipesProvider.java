package fr.alasdiablo.mods.resources.data.recipe;

import fr.alasdiablo.mods.lib.data.DioRecipieProvider;
import fr.alasdiablo.mods.resources.ExtendedResources;
import fr.alasdiablo.mods.resources.registry.ExtendedResourcesItems;
import fr.alasdiablo.mods.resources.tag.ExtendedResourcesTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.BlastingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.Tags;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;


public class RecipesProvider extends DioRecipieProvider {
    public RecipesProvider(HolderLookup.Provider registries, RecipeOutput output) {
        super(ExtendedResources.MOD_ID, registries, output);
    }

    @Override
    protected void buildRecipes() {
        this.nineStorage(ExtendedResourcesItems.COAL_NUGGET, Items.COAL);
        this.nineStorage(ExtendedResourcesItems.COPPER_NUGGET, Items.COPPER_INGOT);
        this.nineStorage(ExtendedResourcesItems.DIAMOND_NUGGET, Items.DIAMOND);
        this.nineStorage(ExtendedResourcesItems.EMERALD_NUGGET, Items.EMERALD);
        this.nineStorage(ExtendedResourcesItems.LAPIS_NUGGET, Items.LAPIS_LAZULI);
        this.nineStorage(ExtendedResourcesItems.REDSTONE_NUGGET, Items.REDSTONE);
        this.nineStorage(ExtendedResourcesItems.NETHERITE_NUGGET, Items.NETHERITE_INGOT);
        this.nineStorage(ExtendedResourcesItems.STEEL_NUGGET, ExtendedResourcesItems.STEEL_INGOT);

        this.shaped(RecipeCategory.MISC, Items.NETHERITE_SCRAP)
                .define('#', ExtendedResourcesItems.NETHERITE_FRAGMENT)
                .pattern("##")
                .pattern("##")
                .unlockedBy(RecipesProvider.getHasName(Items.NETHERITE_SCRAP), this.has(ExtendedResourcesItems.NETHERITE_FRAGMENT))
                .save(
                        this.output,
                        ResourceLocation.fromNamespaceAndPath(
                                ExtendedResources.MOD_ID,
                                RecipesProvider.getSimpleRecipeName(Items.NETHERITE_SCRAP) + "_from_fragments"
                        ).toString()
                );

        this.shapeless(RecipeCategory.MISC, ExtendedResourcesItems.NETHERITE_FRAGMENT, 4)
                .requires(Items.NETHERITE_SCRAP)
                .unlockedBy(RecipesProvider.getHasName(ExtendedResourcesItems.NETHERITE_FRAGMENT), this.has(ExtendedResourcesItems.NETHERITE_FRAGMENT))
                .save(this.output);

        this.oreCooking(ExtendedResourcesItems.COPPER_DUST, Items.COPPER_INGOT, 0.7F, "copper_ingot");
        this.oreCooking(ExtendedResourcesItems.GOLD_DUST, Items.GOLD_INGOT, 1.0F, "gold_ingot");
        this.oreCooking(ExtendedResourcesItems.IRON_DUST, Items.IRON_INGOT, 0.7F, "iron_ingot");
        this.oreCooking(ExtendedResourcesItems.STEEL_DUST, ExtendedResourcesItems.STEEL_INGOT, 0.7F, "steel_ingot");

        SimpleCookingRecipeBuilder.generic(
                        Ingredient.of(ExtendedResourcesItems.ENRICHED_IRON_DUST),
                        RecipeCategory.MISC,
                        ExtendedResourcesItems.STEEL_INGOT, 10f,
                        1600,
                        RecipeSerializer.BLASTING_RECIPE,
                        BlastingRecipe::new
                )
                .group("steel_ingot")
                .unlockedBy(getHasName(ExtendedResourcesItems.ENRICHED_IRON_DUST), this.has(ExtendedResourcesItems.ENRICHED_IRON_DUST))
                .save(
                        this.output,
                        ResourceLocation.fromNamespaceAndPath(
                                ExtendedResources.MOD_ID,
                                getItemName(ExtendedResourcesItems.STEEL_INGOT) + "_from_blasting_" + getItemName(ExtendedResourcesItems.ENRICHED_IRON_DUST)
                        ).toString()
                );

        this.gearRecipes(ExtendedResourcesItems.WOODEN_GEAR, Tags.Items.RODS_WOODEN, ItemTags.PLANKS);
        this.gearRecipes(ExtendedResourcesItems.COPPER_GEAR, ExtendedResourcesTags.Items.RODS_COPPER, ExtendedResourcesTags.Items.PLATES_COPPER);
        this.gearRecipes(ExtendedResourcesItems.IRON_GEAR, ExtendedResourcesTags.Items.RODS_IRON, ExtendedResourcesTags.Items.PLATES_IRON);
        this.gearRecipes(ExtendedResourcesItems.GOLD_GEAR, ExtendedResourcesTags.Items.RODS_GOLD, ExtendedResourcesTags.Items.PLATES_GOLD);
        this.gearRecipes(ExtendedResourcesItems.STEEL_GEAR, ExtendedResourcesTags.Items.RODS_STEEL, ExtendedResourcesTags.Items.PLATES_STEEL);

        this.shaped(RecipeCategory.MISC, ExtendedResourcesItems.MORTAR)
                .define('I', ExtendedResourcesTags.Items.PLATES_IRON)
                .pattern("I I")
                .pattern(" I ")
                .unlockedBy("has_iron_plate", this.has(ExtendedResourcesTags.Items.PLATES_IRON))
                .save(this.output);
        this.shaped(RecipeCategory.MISC, ExtendedResourcesItems.PESTLE)
                .define('S', ExtendedResourcesTags.Items.RODS_IRON)
                .define('I', ExtendedResourcesTags.Items.PLATES_IRON)
                .pattern("S")
                .pattern("I")
                .unlockedBy("has_iron_plate", this.has(ExtendedResourcesTags.Items.PLATES_IRON))
                .unlockedBy("has_iron_rod", this.has(ExtendedResourcesTags.Items.RODS_IRON))
                .save(this.output);

        this.shaped(RecipeCategory.TOOLS, ExtendedResourcesItems.METAL_HAMMER)
                .define('I', Tags.Items.INGOTS_IRON)
                .define('S', Tags.Items.RODS_WOODEN)
                .pattern("  I")
                .pattern("SSI")
                .pattern("  I")
                .unlockedBy("has_iron", this.has(Tags.Items.INGOTS_IRON))
                .unlockedBy("has_wooden_rod", this.has(Tags.Items.RODS_WOODEN))
                .save(this.output);
        this.shaped(RecipeCategory.TOOLS, ExtendedResourcesItems.METAL_CUTTER)
                .define('I', Tags.Items.INGOTS_IRON)
                .define('P', ExtendedResourcesTags.Items.PLATES_IRON)
                .define('S', Tags.Items.RODS_WOODEN)
                .pattern(" I ")
                .pattern("SPI")
                .pattern(" S ")
                .unlockedBy("has_iron", this.has(Tags.Items.INGOTS_IRON))
                .unlockedBy("has_iron_plate", this.has(ExtendedResourcesTags.Items.PLATES_IRON))
                .unlockedBy("has_wooden_rod", this.has(Tags.Items.RODS_WOODEN))
                .save(this.output);
        this.shaped(RecipeCategory.TOOLS, ExtendedResourcesItems.MORTAR_AND_PESTLE)
                .define('P', ExtendedResourcesItems.PESTLE)
                .define('M', ExtendedResourcesItems.MORTAR)
                .pattern("P")
                .pattern("M")
                .unlockedBy(getHasName(ExtendedResourcesItems.PESTLE), this.has(ExtendedResourcesItems.PESTLE))
                .unlockedBy(getHasName(ExtendedResourcesItems.MORTAR), this.has(ExtendedResourcesItems.MORTAR))
                .save(this.output);

        this.metalPlate(ExtendedResourcesItems.COPPER_PLATE, Tags.Items.INGOTS_COPPER);
        this.metalPlate(ExtendedResourcesItems.IRON_PLATE, Tags.Items.INGOTS_IRON);
        this.metalPlate(ExtendedResourcesItems.GOLD_PLATE, Tags.Items.INGOTS_GOLD);
        this.metalPlate(ExtendedResourcesItems.STEEL_PLATE, ExtendedResourcesTags.Items.INGOTS_STEEL);

        this.metalRod(ExtendedResourcesItems.COPPER_ROD, ExtendedResourcesTags.Items.PLATES_COPPER);
        this.metalRod(ExtendedResourcesItems.IRON_ROD, ExtendedResourcesTags.Items.PLATES_IRON);
        this.metalRod(ExtendedResourcesItems.GOLD_ROD, ExtendedResourcesTags.Items.PLATES_GOLD);
        this.metalRod(ExtendedResourcesItems.STEEL_ROD, ExtendedResourcesTags.Items.PLATES_STEEL);

        this.dust(ExtendedResourcesItems.COAL_DUST, Items.COAL);
        this.dust(ExtendedResourcesItems.COPPER_DUST, Tags.Items.INGOTS_COPPER);
        this.dust(ExtendedResourcesItems.DIAMOND_DUST, Items.DIAMOND);
        this.dust(ExtendedResourcesItems.EMERALD_DUST, Items.EMERALD);
        this.dust(ExtendedResourcesItems.GOLD_DUST, Tags.Items.INGOTS_GOLD);
        this.dust(ExtendedResourcesItems.IRON_DUST, Tags.Items.INGOTS_IRON);
        this.dust(ExtendedResourcesItems.LAPIS_DUST, Items.LAPIS_LAZULI);
        this.dust(ExtendedResourcesItems.STEEL_DUST, ExtendedResourcesTags.Items.DUSTS_STEEL);

        this.shapeless(RecipeCategory.MISC, ExtendedResourcesItems.ENRICHED_IRON_DUST)
                .requires(ExtendedResourcesTags.Items.DUSTS_IRON)
                .requires(ExtendedResourcesTags.Items.DUSTS_COAL)
                .requires(ExtendedResourcesItems.MORTAR_AND_PESTLE)
                .unlockedBy("has_iron_dust", this.has(ExtendedResourcesTags.Items.DUSTS_IRON))
                .unlockedBy("has_coal_dust", this.has(ExtendedResourcesTags.Items.DUSTS_COAL))
                .unlockedBy(getHasName(ExtendedResourcesItems.MORTAR_AND_PESTLE), this.has(ExtendedResourcesItems.MORTAR_AND_PESTLE))
                .save(this.output);
    }

    protected void gearRecipes(ItemLike item, TagKey<Item> rod, TagKey<Item> plate) {
        this.shaped(RecipeCategory.MISC, item)
                .define('R', rod)
                .define('P', plate)
                .pattern(" R ")
                .pattern("RPR")
                .pattern(" R ")
                .unlockedBy("has_rod", this.has(rod))
                .unlockedBy("has_plate", this.has(plate))
                .save(this.output);
    }

    protected void metalPlate(ItemLike item, TagKey<Item> ingot) {
        this.shapeless(RecipeCategory.MISC, item)
                .requires(ingot)
                .requires(ExtendedResourcesItems.METAL_HAMMER)
                .unlockedBy("has_ingot", this.has(ingot))
                .unlockedBy("has_metal_hammer", this.has(ExtendedResourcesItems.METAL_HAMMER))
                .save(this.output);
    }

    protected void metalRod(ItemLike item, TagKey<Item> ingot) {
        this.shapeless(RecipeCategory.MISC, item, 2)
                .requires(ingot)
                .requires(ExtendedResourcesItems.METAL_CUTTER)
                .unlockedBy("has_ingot", this.has(ingot))
                .unlockedBy("has_metal_cutter", this.has(ExtendedResourcesItems.METAL_CUTTER))
                .save(this.output);
    }

    protected void dust(ItemLike item, Item ingotOrGem) {
        this.shapeless(RecipeCategory.MISC, item)
                .requires(ingotOrGem)
                .requires(ExtendedResourcesItems.MORTAR_AND_PESTLE)
                .unlockedBy("has_ingot_or_gem", this.has(ingotOrGem))
                .unlockedBy("has_mortar_and_pestle", this.has(ExtendedResourcesItems.MORTAR_AND_PESTLE))
                .save(this.output);
    }

    protected void dust(ItemLike item, TagKey<Item> ingotOrGem) {
        this.shapeless(RecipeCategory.MISC, item)
                .requires(ingotOrGem)
                .requires(ExtendedResourcesItems.MORTAR_AND_PESTLE)
                .unlockedBy("has_ingot_or_gem", this.has(ingotOrGem))
                .unlockedBy("has_mortar_and_pestle", this.has(ExtendedResourcesItems.MORTAR_AND_PESTLE))
                .save(this.output);
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
