package org.thinkingstudio.bettergamemenu;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.Toml4jConfigSerializer;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.thinkingstudio.bettergamemenu.gui.BetterGameMenuScreen;

@Mod(BetterGameMenu.MODID)
public class BetterGameMenu {
    public static final ResourceLocation WIDGETS = new ResourceLocation(BetterGameMenu.MODID, "textures/gui/widgets.png");
    public static final String MODID = "bettergamemenu";
    public static BGMConfig BGMCONFIG;

    public BetterGameMenu() {
        //ClientConfig.init();
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::onInitializeClient);
    }

    private void onInitializeClient(final FMLClientSetupEvent event) {
        MinecraftForge.EVENT_BUS.register(BetterGameMenuScreen.class);
        BGMCONFIG = AutoConfig.register(BGMConfig.class, Toml4jConfigSerializer::new).getConfig();
    }
}