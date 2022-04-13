package de.fritzist.theMod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static CreativeModeTab SILVER_TAB = new CreativeModeTab("SILVER-theMod") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.SILVER_INGOT.get());
        }
    };
}
