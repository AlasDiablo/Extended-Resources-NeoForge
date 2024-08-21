package fr.alasdiablo.mods.resources.data;

import fr.alasdiablo.mods.resources.ExtendedResources;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import static fr.alasdiablo.mods.resources.ExtendedResourcesRegistries.*;

public class ModelProvider extends ItemModelProvider {
    private static final ResourceLocation GENERATED = ResourceLocation.withDefaultNamespace("item/generated");

    public ModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ExtendedResources.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        this.dustItem(COAL_DUST);
        this.dustItem(COPPER_DUST);
        this.dustItem(DIAMOND_DUST);
        this.dustItem(EMERALD_DUST);
        this.dustItem(GOLD_DUST);
        this.dustItem(IRON_DUST);
        this.dustItem(LAPIS_DUST);

        this.nuggetItem(COAL_NUGGET);
        this.nuggetItem(COPPER_NUGGET);
        this.nuggetItem(DIAMOND_NUGGET);
        this.nuggetItem(EMERALD_NUGGET);
        this.nuggetItem(LAPIS_NUGGET);
        this.nuggetItem(REDSTONE_NUGGET);
    }

    public void dustItem(String item) {
        this.withExistingParent(item, GENERATED)
                .texture("layer0", ResourceLocation.fromNamespaceAndPath(ExtendedResources.MOD_ID, "item/dust/" + item));
    }

    public void nuggetItem(String item) {
        this.withExistingParent(item, GENERATED)
                .texture("layer0", ResourceLocation.fromNamespaceAndPath(ExtendedResources.MOD_ID, "item/nugget/" + item));
    }
}
