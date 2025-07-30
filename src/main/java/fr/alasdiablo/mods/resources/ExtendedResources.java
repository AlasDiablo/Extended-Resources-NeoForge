package fr.alasdiablo.mods.resources;

import com.mojang.logging.LogUtils;
import fr.alasdiablo.mods.resources.data.datamaps.DataMapsProvider;
import fr.alasdiablo.mods.resources.data.lang.LanguagesProvider;
import fr.alasdiablo.mods.resources.data.model.ModelsProvider;
import fr.alasdiablo.mods.resources.data.recipe.RecipesProvider;
import fr.alasdiablo.mods.resources.data.tag.BlocksTagsProvider;
import fr.alasdiablo.mods.resources.data.tag.ItemsTagsProvider;
import fr.alasdiablo.mods.resources.registry.ExtendedResourcesCreativeTabs;
import fr.alasdiablo.mods.resources.registry.ExtendedResourcesItems;
import fr.alasdiablo.mods.resources.tag.ExtendedResourcesTags;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;

@SuppressWarnings("unused")
@Mod(ExtendedResources.MOD_ID)
public class ExtendedResources {
    public static final String MOD_ID = "dio_extended_resources";
    public static final Logger LOGGER = LogUtils.getLogger();

    public ExtendedResources(IEventBus modEventBus, ModContainer modContainer) {
        ExtendedResourcesTags.Items.init();

        ExtendedResourcesItems.init(modEventBus);
        ExtendedResourcesCreativeTabs.init(modEventBus);

        modEventBus.addListener(this::gatherData);
    }

    private void gatherData(@NotNull GatherDataEvent.Client event) {
        ExtendedResources.LOGGER.debug("Start data generator");

        ExtendedResources.LOGGER.debug("Add Client Provider");

        ExtendedResources.LOGGER.debug("Add Item Model Provider");
        event.createProvider(ModelsProvider::new);

        ExtendedResources.LOGGER.debug("Add Language Provider");
        event.createProvider(LanguagesProvider.French.Canada::new);
        event.createProvider(LanguagesProvider.French.France::new);

        event.createProvider(LanguagesProvider.English.Australia::new);
        event.createProvider(LanguagesProvider.English.Canada::new);
        event.createProvider(LanguagesProvider.English.NewZealand::new);
        event.createProvider(LanguagesProvider.English.UnitedKingdom::new);
        event.createProvider(LanguagesProvider.English.UnitedStates::new);


        ExtendedResources.LOGGER.debug("Add Server Provider");

        ExtendedResources.LOGGER.debug("Add Tags Provider");
        event.createProvider(BlocksTagsProvider::new);
        event.createProvider(ItemsTagsProvider::new);

        ExtendedResources.LOGGER.debug("Add Recipes Provider");
        event.createProvider(RecipesProvider.Runner::new);

        ExtendedResources.LOGGER.debug("Add DataMap Provider");
        event.createProvider(DataMapsProvider::new);
    }
}
