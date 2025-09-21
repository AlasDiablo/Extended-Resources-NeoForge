package fr.alasdiablo.mods.resources.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class DurabilityCraftingItem extends Item {
    public DurabilityCraftingItem(Properties properties) {
        super(properties);
    }

    @Override
    public @NotNull ItemStack getCraftingRemainder(@NotNull ItemStack stack) {
        ItemStack copy = stack.copy();

        if (copy.isDamageableItem()) {
            copy.setDamageValue(copy.getDamageValue() + 1);
            if (copy.getDamageValue() >= copy.getMaxDamage()) {
                return ItemStack.EMPTY;
            }
        }
        return copy;
    }
}
