package fr.alasdiablo.mods.resources;

import com.mojang.logging.LogUtils;
import fr.alasdiablo.mods.resources.data.*;
import fr.alasdiablo.mods.resources.registry.ExtendedResourcesCreativeTabs;
import fr.alasdiablo.mods.resources.registry.ExtendedResourcesItems;
import fr.alasdiablo.mods.resources.registry.ExtendedResourcesTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;

import java.util.concurrent.CompletableFuture;

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

    private void gatherData(@NotNull GatherDataEvent event) {
        ExtendedResources.LOGGER.debug("Start data generator");
        final DataGenerator                            generator          = event.getGenerator();
        final PackOutput                               output             = generator.getPackOutput();
        final CompletableFuture<HolderLookup.Provider> lookup             = event.getLookupProvider();
        final ExistingFileHelper                       existingFileHelper = event.getExistingFileHelper();

        ExtendedResources.LOGGER.debug("Add Client Provider");

        ExtendedResources.LOGGER.debug("Add Item Model Provider");
        generator.addProvider(event.includeClient(), new ModelProvider(output, existingFileHelper));

        ExtendedResources.LOGGER.debug("Add Language Provider");
        generator.addProvider(event.includeClient(), new LanguagesProvider.EnglishUnitedKingdom(output));
        generator.addProvider(event.includeClient(), new LanguagesProvider.FrenchFrance(output));
        generator.addProvider(event.includeClient(), new LanguagesProvider.EnglishUnitedStates(output));

        ExtendedResources.LOGGER.debug("Add Server Provider");

        ExtendedResources.LOGGER.debug("Add Tags Provider");
        final BlocksTagsProvider blockTagsProvider = new BlocksTagsProvider(output, lookup, existingFileHelper);
        generator.addProvider(event.includeServer(), blockTagsProvider);
        generator.addProvider(event.includeServer(), new ItemsTagsProvider(output, lookup, blockTagsProvider, existingFileHelper));

        ExtendedResources.LOGGER.debug("Add Recipes Provider");
        generator.addProvider(event.includeServer(), new RecipesProvider(output, lookup));

        ExtendedResources.LOGGER.debug("Add DataMap Provider");
        generator.addProvider(event.includeServer(), new DataMapsProvider(output, lookup));
    }
}
