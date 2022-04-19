package de.fritzist.theMod.item;

import de.fritzist.theMod.Main;
import de.fritzist.theMod.item.custom.CoalCokeItem;
import de.fritzist.theMod.item.custom.DowsingRodItem;
import de.fritzist.theMod.item.custom.LevitationSwordItem;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Main.MODID);

    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.theMod)));

    public static final RegistryObject<Item> RAW_SILVER = ITEMS.register("raw_silver",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.theMod)));



    public static final RegistryObject<Item> DOWSING_ROD = ITEMS.register("dowsing_rod",
            () -> new DowsingRodItem(new Item.Properties().tab(ModCreativeModeTab.theMod).durability(12)));



    public static final RegistryObject<Item> BROCCOLI = ITEMS.register("broccoli",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.theMod).food(ModFoods.BROCCOLI)));



    public static final RegistryObject<Item> COAL_COKE = ITEMS.register("coal_coke",
            () -> new CoalCokeItem(new Item.Properties().tab(ModCreativeModeTab.theMod)));



    public static final RegistryObject<Item> SILVER_SWORD = ITEMS.register("silver_sword",
            () -> new LevitationSwordItem(ModTiers.SILVER, 3, -2.3F,
                    new Item.Properties().tab(ModCreativeModeTab.theMod)));

    public static final RegistryObject<Item> SILVER_HOE = ITEMS.register("silver_hoe",
            () -> new HoeItem(ModTiers.SILVER, 0, -1F,
                    new Item.Properties().tab(ModCreativeModeTab.theMod)));

    public static final RegistryObject<Item> SILVER_SHOVEl = ITEMS.register("silver_shovel",
            () -> new ShovelItem(ModTiers.SILVER, 1, -3F,
                    new Item.Properties().tab(ModCreativeModeTab.theMod)));

    public static final RegistryObject<Item> SILVER_AXE = ITEMS.register("silver_axe",
            () -> new AxeItem(ModTiers.SILVER, 0, -2.4F,
                    new Item.Properties().tab(ModCreativeModeTab.theMod)));

    public static final RegistryObject<Item> SILVER_PICKAXE = ITEMS.register("silver_pickaxe",
            () -> new PickaxeItem(ModTiers.SILVER, 2, -2.3F,
                    new Item.Properties().tab(ModCreativeModeTab.theMod)));



    public static void Register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
