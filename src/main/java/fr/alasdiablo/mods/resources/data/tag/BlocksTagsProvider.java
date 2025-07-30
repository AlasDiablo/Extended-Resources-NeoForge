package fr.alasdiablo.mods.resources.data.tag;

import fr.alasdiablo.mods.resources.ExtendedResources;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class BlocksTagsProvider extends BlockTagsProvider {

    public BlocksTagsProvider(
            PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider
    ) {
        super(output, lookupProvider, ExtendedResources.MOD_ID);
    }

    @Override
    protected void addTags(@NotNull HolderLookup.Provider pProvider) {}
}
