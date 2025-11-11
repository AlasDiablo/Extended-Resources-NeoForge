package fr.alasdiablo.mods.resources.registry;

import fr.alasdiablo.mods.resources.ExtendedResources;
import fr.alasdiablo.mods.resources.ExtendedResourcesRegistries;
import fr.alasdiablo.mods.resources.item.DurabilityCraftingItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.NotNull;

public class ExtendedResourcesItems {
    static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ExtendedResources.MOD_ID);
    // Ingots
    public static final DeferredItem<Item> STEEL_INGOT = ITEMS.registerSimpleItem(ExtendedResourcesRegistries.STEEL_INGOT);

    // Dusts
    public static final DeferredItem<Item> COAL_DUST    = ITEMS.registerSimpleItem(ExtendedResourcesRegistries.COAL_DUST);
    public static final DeferredItem<Item> COPPER_DUST  = ITEMS.registerSimpleItem(ExtendedResourcesRegistries.COPPER_DUST);
    public static final DeferredItem<Item> DIAMOND_DUST = ITEMS.registerSimpleItem(ExtendedResourcesRegistries.DIAMOND_DUST);
    public static final DeferredItem<Item> EMERALD_DUST = ITEMS.registerSimpleItem(ExtendedResourcesRegistries.EMERALD_DUST);
    public static final DeferredItem<Item> GOLD_DUST    = ITEMS.registerSimpleItem(ExtendedResourcesRegistries.GOLD_DUST);
    public static final DeferredItem<Item> IRON_DUST    = ITEMS.registerSimpleItem(ExtendedResourcesRegistries.IRON_DUST);
    public static final DeferredItem<Item> LAPIS_DUST   = ITEMS.registerSimpleItem(ExtendedResourcesRegistries.LAPIS_DUST);
    public static final DeferredItem<Item> ENRICHED_IRON_DUST = ITEMS.registerSimpleItem(ExtendedResourcesRegistries.ENRICHED_IRON_DUST);
    public static final DeferredItem<Item> STEEL_DUST = ITEMS.registerSimpleItem(ExtendedResourcesRegistries.STEEL_DUST);

    // Nuggets
    public static final DeferredItem<Item> COAL_NUGGET     = ITEMS.registerSimpleItem(ExtendedResourcesRegistries.COAL_NUGGET);
    public static final DeferredItem<Item> COPPER_NUGGET   = ITEMS.registerSimpleItem(ExtendedResourcesRegistries.COPPER_NUGGET);
    public static final DeferredItem<Item> DIAMOND_NUGGET  = ITEMS.registerSimpleItem(ExtendedResourcesRegistries.DIAMOND_NUGGET);
    public static final DeferredItem<Item> EMERALD_NUGGET  = ITEMS.registerSimpleItem(ExtendedResourcesRegistries.EMERALD_NUGGET);
    public static final DeferredItem<Item> LAPIS_NUGGET    = ITEMS.registerSimpleItem(ExtendedResourcesRegistries.LAPIS_NUGGET);
    public static final DeferredItem<Item> REDSTONE_NUGGET = ITEMS.registerSimpleItem(ExtendedResourcesRegistries.REDSTONE_NUGGET);
    public static final DeferredItem<Item> NETHERITE_NUGGET   = ITEMS.registerSimpleItem(ExtendedResourcesRegistries.NETHERITE_NUGGET);
    public static final DeferredItem<Item> NETHERITE_FRAGMENT = ITEMS.registerSimpleItem(ExtendedResourcesRegistries.NETHERITE_FRAGMENT);
    public static final DeferredItem<Item> STEEL_NUGGET = ITEMS.registerSimpleItem(ExtendedResourcesRegistries.STEEL_NUGGET);

    // Plates
    public static final DeferredItem<Item> COPPER_PLATE = ITEMS.registerSimpleItem(ExtendedResourcesRegistries.COPPER_PLATE);
    public static final DeferredItem<Item> IRON_PLATE = ITEMS.registerSimpleItem(ExtendedResourcesRegistries.IRON_PLATE);
    public static final DeferredItem<Item> GOLD_PLATE = ITEMS.registerSimpleItem(ExtendedResourcesRegistries.GOLD_PLATE);
    public static final DeferredItem<Item> STEEL_PLATE = ITEMS.registerSimpleItem(ExtendedResourcesRegistries.STEEL_PLATE);

    // Gears
    public static final DeferredItem<Item> WOODEN_GEAR = ITEMS.registerSimpleItem(ExtendedResourcesRegistries.WOODEN_GEAR);
    public static final DeferredItem<Item> COPPER_GEAR = ITEMS.registerSimpleItem(ExtendedResourcesRegistries.COPPER_GEAR);
    public static final DeferredItem<Item> IRON_GEAR = ITEMS.registerSimpleItem(ExtendedResourcesRegistries.IRON_GEAR);
    public static final DeferredItem<Item> GOLD_GEAR = ITEMS.registerSimpleItem(ExtendedResourcesRegistries.GOLD_GEAR);
    public static final DeferredItem<Item> STEEL_GEAR = ITEMS.registerSimpleItem(ExtendedResourcesRegistries.STEEL_GEAR);

    // Rods
    public static final DeferredItem<Item> COPPER_ROD = ITEMS.registerSimpleItem(ExtendedResourcesRegistries.COPPER_ROD);
    public static final DeferredItem<Item> IRON_ROD = ITEMS.registerSimpleItem(ExtendedResourcesRegistries.IRON_ROD);
    public static final DeferredItem<Item> GOLD_ROD = ITEMS.registerSimpleItem(ExtendedResourcesRegistries.GOLD_ROD);
    public static final DeferredItem<Item> STEEL_ROD = ITEMS.registerSimpleItem(ExtendedResourcesRegistries.STEEL_ROD);

    // Tools part
    public static final DeferredItem<Item> MORTAR = ITEMS.registerSimpleItem(ExtendedResourcesRegistries.MORTAR);
    public static final DeferredItem<Item> PESTLE = ITEMS.registerSimpleItem(ExtendedResourcesRegistries.PESTLE);

    // Tools
    public static final DeferredItem<Item> METAL_HAMMER = ITEMS.register(
            ExtendedResourcesRegistries.METAL_HAMMER,
            (key) -> new DurabilityCraftingItem(new Item.Properties().durability(256).setId(ResourceKey.create(Registries.ITEM, key)))
    );
    public static final DeferredItem<Item> METAL_CUTTER = ITEMS.register(
            ExtendedResourcesRegistries.METAL_CUTTER,
            (key) -> new DurabilityCraftingItem(new Item.Properties().durability(256).setId(ResourceKey.create(Registries.ITEM, key)))
    );
    public static final DeferredItem<Item> MORTAR_AND_PESTLE = ITEMS.register(
            ExtendedResourcesRegistries.MORTAR_AND_PESTLE,
            (key) -> new DurabilityCraftingItem(new Item.Properties().durability(512).setId(ResourceKey.create(Registries.ITEM, key)))
    );

    public static void displayItemsGenerator(CreativeModeTab.ItemDisplayParameters parameters, @NotNull CreativeModeTab.Output output) {
        // Ingots
        output.accept(STEEL_INGOT.get());

        // Dusts
        output.accept(COAL_DUST.get());
        output.accept(COPPER_DUST.get());
        output.accept(DIAMOND_DUST.get());
        output.accept(EMERALD_DUST.get());
        output.accept(GOLD_DUST.get());
        output.accept(IRON_DUST.get());
        output.accept(LAPIS_DUST.get());
        output.accept(ENRICHED_IRON_DUST.get());
        output.accept(STEEL_DUST.get());

        // Nuggets
        output.accept(COAL_NUGGET.get());
        output.accept(COPPER_NUGGET.get());
        output.accept(DIAMOND_NUGGET.get());
        output.accept(EMERALD_NUGGET.get());
        output.accept(LAPIS_NUGGET.get());
        output.accept(REDSTONE_NUGGET.get());
        output.accept(NETHERITE_NUGGET.get());
        output.accept(NETHERITE_FRAGMENT.get());
        output.accept(STEEL_NUGGET.get());

        // Plates
        output.accept(COPPER_PLATE.get());
        output.accept(IRON_PLATE.get());
        output.accept(GOLD_PLATE.get());
        output.accept(STEEL_PLATE.get());

        // Gears
        output.accept(WOODEN_GEAR.get());
        output.accept(COPPER_GEAR.get());
        output.accept(IRON_GEAR.get());
        output.accept(GOLD_GEAR.get());
        output.accept(STEEL_GEAR.get());

        // Rods
        output.accept(COPPER_ROD.get());
        output.accept(IRON_ROD.get());
        output.accept(GOLD_ROD.get());
        output.accept(STEEL_ROD.get());

        // Tools part
        output.accept(MORTAR.get());
        output.accept(PESTLE.get());

        // Tools
        output.accept(METAL_HAMMER.get());
        output.accept(METAL_CUTTER.get());
        output.accept(MORTAR_AND_PESTLE.get());
    }

    public static void init(IEventBus bus) {
        ITEMS.register(bus);
    }
}
