package fr.alasdiablo.mods.resources.data.model;

import fr.alasdiablo.mods.resources.ExtendedResources;
import fr.alasdiablo.mods.resources.registry.ExtendedResourcesItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

public class ModelsProvider extends ModelProvider {
    private static final ResourceLocation GENERATED = ResourceLocation.withDefaultNamespace("item/generated");

    public ModelsProvider(PackOutput output) {
        super(output, ExtendedResources.MOD_ID);
    }

    @Override
    protected void registerModels(@NotNull BlockModelGenerators blockModels, @NotNull ItemModelGenerators itemModels) {
        itemModels.generateFlatItem(ExtendedResourcesItems.COAL_DUST.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ExtendedResourcesItems.COPPER_DUST.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ExtendedResourcesItems.DIAMOND_DUST.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ExtendedResourcesItems.EMERALD_DUST.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ExtendedResourcesItems.GOLD_DUST.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ExtendedResourcesItems.IRON_DUST.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ExtendedResourcesItems.LAPIS_DUST.get(), ModelTemplates.FLAT_ITEM);

        itemModels.generateFlatItem(ExtendedResourcesItems.COAL_NUGGET.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ExtendedResourcesItems.COPPER_NUGGET.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ExtendedResourcesItems.DIAMOND_NUGGET.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ExtendedResourcesItems.EMERALD_NUGGET.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ExtendedResourcesItems.LAPIS_NUGGET.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ExtendedResourcesItems.REDSTONE_NUGGET.get(), ModelTemplates.FLAT_ITEM);

        itemModels.generateFlatItem(ExtendedResourcesItems.NETHERITE_NUGGET.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ExtendedResourcesItems.NETHERITE_FRAGMENT.get(), ModelTemplates.FLAT_ITEM);
    }
}
