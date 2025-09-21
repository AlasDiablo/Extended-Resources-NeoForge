package fr.alasdiablo.mods.resources.data.datamaps;

import fr.alasdiablo.mods.resources.registry.ExtendedResourcesItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DataMapProvider;
import net.neoforged.neoforge.registries.datamaps.builtin.FurnaceFuel;
import net.neoforged.neoforge.registries.datamaps.builtin.NeoForgeDataMaps;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class DataMapsProvider extends DataMapProvider {
    public DataMapsProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(packOutput, lookupProvider);
    }

    @Override
    protected void gather(@NotNull  HolderLookup.Provider provider) {
        this.builder(NeoForgeDataMaps.FURNACE_FUELS) // Less than vanilla (1600 / 9)
                .add(ExtendedResourcesItems.COAL_NUGGET, new FurnaceFuel(175), false);

        this.builder(NeoForgeDataMaps.FURNACE_FUELS)
                .add(ExtendedResourcesItems.WOODEN_GEAR, new FurnaceFuel(300), false);
    }
}
