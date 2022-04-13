package de.fritzist.theMod;

import de.fritzist.theMod.block.ModBlocks;
import de.fritzist.theMod.item.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Main.MODID)
public class Main {

    public static final String MODID = "themod";

    public Main() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        System.out.println(MODID + ":registering mod");


        ModItems.Register(eventBus);
        ModBlocks.Register(eventBus);

        eventBus.addListener(this::Setup);
        eventBus.addListener(this::SetupClient);

        MinecraftForge.EVENT_BUS.register(this);
    }

    public void SetupClient(final FMLClientSetupEvent e) {
    }

    public void Setup(final FMLCommonSetupEvent e) {
    }
}

