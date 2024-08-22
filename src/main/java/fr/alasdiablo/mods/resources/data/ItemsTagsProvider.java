package fr.alasdiablo.mods.resources.data;

import fr.alasdiablo.mods.resources.ExtendedResources;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

import static fr.alasdiablo.mods.resources.registry.ExtendedResourcesItems.*;
import static fr.alasdiablo.mods.resources.tag.ExtendedResourcesTags.Items.*;

public class ItemsTagsProvider  extends ItemTagsProvider {
    public ItemsTagsProvider(
            PackOutput output, CompletableFuture<HolderLookup.Provider> lookup,
            @NotNull TagsProvider<Block> blockTagsProvider,
            @Nullable ExistingFileHelper existingFileHelper
    ) {
        super(output, lookup, blockTagsProvider.contentsGetter(), ExtendedResources.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        this.tag(DUSTS_COAL).add(COAL_DUST.get());
        this.tag(DUSTS_COPPER).add(COPPER_DUST.get());
        this.tag(DUSTS_DIAMOND).add(DIAMOND_DUST.get());
        this.tag(DUSTS_EMERALD).add(EMERALD_DUST.get());
        this.tag(DUSTS_GOLD).add(GOLD_DUST.get());
        this.tag(DUSTS_IRON).add(IRON_DUST.get());
        this.tag(DUSTS_LAPIS).add(LAPIS_DUST.get());

        this.tag(Tags.Items.DUSTS).addTag(DUSTS_COAL);
        this.tag(Tags.Items.DUSTS).addTag(DUSTS_COPPER);
        this.tag(Tags.Items.DUSTS).addTag(DUSTS_DIAMOND);
        this.tag(Tags.Items.DUSTS).addTag(DUSTS_EMERALD);
        this.tag(Tags.Items.DUSTS).addTag(DUSTS_GOLD);
        this.tag(Tags.Items.DUSTS).addTag(DUSTS_IRON);
        this.tag(Tags.Items.DUSTS).addTag(DUSTS_LAPIS);

        this.tag(NUGGETS_COAL).add(COAL_NUGGET.get());
        this.tag(NUGGETS_COPPER).add(COPPER_NUGGET.get());
        this.tag(NUGGETS_DIAMOND).add(DIAMOND_NUGGET.get());
        this.tag(NUGGETS_EMERALD).add(EMERALD_NUGGET.get());
        this.tag(NUGGETS_LAPIS).add(LAPIS_NUGGET.get());
        this.tag(NUGGETS_REDSTONE).add(REDSTONE_NUGGET.get());

        this.tag(Tags.Items.NUGGETS).addTag(NUGGETS_COAL);
        this.tag(Tags.Items.NUGGETS).addTag(NUGGETS_COPPER);
        this.tag(Tags.Items.NUGGETS).addTag(NUGGETS_DIAMOND);
        this.tag(Tags.Items.NUGGETS).addTag(NUGGETS_EMERALD);
        this.tag(Tags.Items.NUGGETS).addTag(NUGGETS_LAPIS);
        this.tag(Tags.Items.NUGGETS).addTag(NUGGETS_REDSTONE);
    }
}
