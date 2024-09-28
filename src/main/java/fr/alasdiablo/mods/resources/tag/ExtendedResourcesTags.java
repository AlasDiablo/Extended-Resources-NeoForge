package fr.alasdiablo.mods.resources.tag;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import org.jetbrains.annotations.NotNull;

public class ExtendedResourcesTags {
    public static class Items {
        public static void init() {}

        public static final TagKey<Item> TINY_DUSTS          = commonTag("tiny_dusts");
        public static final TagKey<Item> TINY_DUSTS_REDSTONE = commonTag("tiny_dusts");

        public static final TagKey<Item> DUSTS_COAL    = commonTag("dusts/coal");
        public static final TagKey<Item> DUSTS_COPPER  = commonTag("dusts/copper");
        public static final TagKey<Item> DUSTS_DIAMOND = commonTag("dusts/diamond");
        public static final TagKey<Item> DUSTS_EMERALD = commonTag("dusts/emerald");
        public static final TagKey<Item> DUSTS_GOLD    = commonTag("dusts/gold");
        public static final TagKey<Item> DUSTS_IRON    = commonTag("dusts/iron");
        public static final TagKey<Item> DUSTS_LAPIS   = commonTag("dusts/lapis");

        public static final TagKey<Item> NUGGETS_COAL     = commonTag("nuggets/coal");
        public static final TagKey<Item> NUGGETS_COPPER   = commonTag("nuggets/copper");
        public static final TagKey<Item> NUGGETS_DIAMOND  = commonTag("nuggets/diamond");
        public static final TagKey<Item> NUGGETS_EMERALD  = commonTag("nuggets/emerald");
        public static final TagKey<Item> NUGGETS_LAPIS    = commonTag("nuggets/lapis");
        public static final TagKey<Item> NUGGETS_REDSTONE = commonTag("nuggets/redstone");

        private static @NotNull TagKey<Item> commonTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", name));
        }
    }
}
