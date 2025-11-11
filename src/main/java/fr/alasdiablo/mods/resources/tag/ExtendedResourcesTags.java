package fr.alasdiablo.mods.resources.tag;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import org.jetbrains.annotations.NotNull;

public class ExtendedResourcesTags {
    public static class Items {
        public static void init() {}

        public static final TagKey<Item> INGOTS_STEEL = commonTag("ingots/steel");

        public static final TagKey<Item> TINY_DUSTS          = commonTag("tiny_dusts");
        public static final TagKey<Item> TINY_DUSTS_REDSTONE = commonTag("tiny_dusts/redstone");

        public static final TagKey<Item> DUSTS_COAL          = commonTag("dusts/coal");
        public static final TagKey<Item> DUSTS_COPPER        = commonTag("dusts/copper");
        public static final TagKey<Item> DUSTS_DIAMOND       = commonTag("dusts/diamond");
        public static final TagKey<Item> DUSTS_EMERALD       = commonTag("dusts/emerald");
        public static final TagKey<Item> DUSTS_GOLD          = commonTag("dusts/gold");
        public static final TagKey<Item> DUSTS_IRON          = commonTag("dusts/iron");
        public static final TagKey<Item> DUSTS_LAPIS         = commonTag("dusts/lapis");
        public static final TagKey<Item> DUSTS_ENRICHED_IRON = commonTag("dusts/enriched_iron");
        public static final TagKey<Item> DUSTS_STEEL         = commonTag("dusts/steel");

        public static final TagKey<Item> NUGGETS_COAL     = commonTag("nuggets/coal");
        public static final TagKey<Item> NUGGETS_COPPER   = commonTag("nuggets/copper");
        public static final TagKey<Item> NUGGETS_DIAMOND  = commonTag("nuggets/diamond");
        public static final TagKey<Item> NUGGETS_EMERALD  = commonTag("nuggets/emerald");
        public static final TagKey<Item> NUGGETS_LAPIS    = commonTag("nuggets/lapis");
        public static final TagKey<Item> NUGGETS_REDSTONE = commonTag("nuggets/redstone");
        public static final TagKey<Item> NUGGETS_NETHERITE = commonTag("nuggets/netherite");
        public static final TagKey<Item> NUGGETS_STEEL    = commonTag("nuggets/steel");

        public static final TagKey<Item> PLATES        = commonTag("plates");
        public static final TagKey<Item> PLATES_COPPER = commonTag("plates/copper");
        public static final TagKey<Item> PLATES_IRON   = commonTag("plates/iron");
        public static final TagKey<Item> PLATES_GOLD   = commonTag("plates/gold");
        public static final TagKey<Item> PLATES_STEEL  = commonTag("plates/steel");

        public static final TagKey<Item> GEARS        = commonTag("gears");
        public static final TagKey<Item> GEARS_WOODEN = commonTag("gears/wooden");
        public static final TagKey<Item> GEARS_COPPER = commonTag("gears/copper");
        public static final TagKey<Item> GEARS_IRON   = commonTag("gears/iron");
        public static final TagKey<Item> GEARS_GOLD   = commonTag("gears/gold");
        public static final TagKey<Item> GEARS_STEEL  = commonTag("gears/steel");

        public static final TagKey<Item> RODS_COPPER = commonTag("rods/copper");
        public static final TagKey<Item> RODS_IRON   = commonTag("rods/iron");
        public static final TagKey<Item> RODS_GOLD   = commonTag("rods/gold");
        public static final TagKey<Item> RODS_STEEL  = commonTag("rods/steel");

        private static @NotNull TagKey<Item> commonTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", name));
        }
    }
}
