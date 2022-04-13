package de.fritzist.theMod.item;

import de.fritzist.theMod.Main;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Main.MODID);

    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SILVER_TAB)));

    // public static final RegistryObject<Item> SILVER_AXE = ITEMS.register("silver_axe",
      //      () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    /*public static final RegistryObject<Item> SILVER_HOE = ITEMS.register("silver_hoe",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> SILVER_PICKAXE = ITEMS.register("silver_pickaxe",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> SILVER_SHOVEL = ITEMS.register("silver_shovel",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> SILVER_SWORD = ITEMS.register("silver_sword",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));*/



    public static void Register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
