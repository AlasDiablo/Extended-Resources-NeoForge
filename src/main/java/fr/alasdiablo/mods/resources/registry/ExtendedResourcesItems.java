package fr.alasdiablo.mods.resources.registry;

import fr.alasdiablo.mods.resources.ExtendedResources;
import fr.alasdiablo.mods.resources.ExtendedResourcesRegistries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.NotNull;

public class ExtendedResourcesItems {
    static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ExtendedResources.MOD_ID);

    public static final DeferredItem<Item> COAL_DUST    = ITEMS.registerSimpleItem(ExtendedResourcesRegistries.COAL_DUST);
    public static final DeferredItem<Item> COPPER_DUST  = ITEMS.registerSimpleItem(ExtendedResourcesRegistries.COPPER_DUST);
    public static final DeferredItem<Item> DIAMOND_DUST = ITEMS.registerSimpleItem(ExtendedResourcesRegistries.DIAMOND_DUST);
    public static final DeferredItem<Item> EMERALD_DUST = ITEMS.registerSimpleItem(ExtendedResourcesRegistries.EMERALD_DUST);
    public static final DeferredItem<Item> GOLD_DUST    = ITEMS.registerSimpleItem(ExtendedResourcesRegistries.GOLD_DUST);
    public static final DeferredItem<Item> IRON_DUST    = ITEMS.registerSimpleItem(ExtendedResourcesRegistries.IRON_DUST);
    public static final DeferredItem<Item> LAPIS_DUST   = ITEMS.registerSimpleItem(ExtendedResourcesRegistries.LAPIS_DUST);

    public static final DeferredItem<Item> COAL_NUGGET     = ITEMS.registerSimpleItem(ExtendedResourcesRegistries.COAL_NUGGET);
    public static final DeferredItem<Item> COPPER_NUGGET   = ITEMS.registerSimpleItem(ExtendedResourcesRegistries.COPPER_NUGGET);
    public static final DeferredItem<Item> DIAMOND_NUGGET  = ITEMS.registerSimpleItem(ExtendedResourcesRegistries.DIAMOND_NUGGET);
    public static final DeferredItem<Item> EMERALD_NUGGET  = ITEMS.registerSimpleItem(ExtendedResourcesRegistries.EMERALD_NUGGET);
    public static final DeferredItem<Item> LAPIS_NUGGET    = ITEMS.registerSimpleItem(ExtendedResourcesRegistries.LAPIS_NUGGET);
    public static final DeferredItem<Item> REDSTONE_NUGGET = ITEMS.registerSimpleItem(ExtendedResourcesRegistries.REDSTONE_NUGGET);

    public static void displayItemsGenerator(CreativeModeTab.ItemDisplayParameters parameters, @NotNull CreativeModeTab.Output output) {
        output.accept(COAL_DUST.get());
        output.accept(COPPER_DUST.get());
        output.accept(DIAMOND_DUST.get());
        output.accept(EMERALD_DUST.get());
        output.accept(GOLD_DUST.get());
        output.accept(IRON_DUST.get());
        output.accept(LAPIS_DUST.get());

        output.accept(COAL_NUGGET.get());
        output.accept(COPPER_NUGGET.get());
        output.accept(DIAMOND_NUGGET.get());
        output.accept(EMERALD_NUGGET.get());
        output.accept(LAPIS_NUGGET.get());
        output.accept(REDSTONE_NUGGET.get());
    }

    public static void init(IEventBus bus) {
        ITEMS.register(bus);
    }
}
