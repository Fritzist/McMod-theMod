package de.fritzist.theMod.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {

    public static final ForgeTier SILVER = new ForgeTier(2, 250, 6.9F, 2.1F, 15, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.SILVER_INGOT.get()));
}
