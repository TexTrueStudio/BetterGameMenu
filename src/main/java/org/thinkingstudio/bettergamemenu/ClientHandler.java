package org.thinkingstudio.bettergamemenu;
/*
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.PauseScreen;
import net.minecraft.client.gui.screens.TitleScreen;
import net.minecraft.client.player.LocalPlayer;
import net.minecraftforge.client.event.ScreenEvent;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import org.thinkingstudio.bettergamemenu.compat.FancyMenuCompat;
import org.thinkingstudio.bettergamemenu.compat.PackMenuCompat;
import org.thinkingstudio.bettergamemenu.gui.BetterGameMenuScreen;
import org.thinkingstudio.bettergamemenu.gui.JoinLastWorld;

import java.util.Objects;

public class ClientHandler {
    private static final Minecraft mc = Minecraft.getInstance();

    @SubscribeEvent
    public static void onOpenGUI(ScreenEvent e) {
        if (e.getScreen() instanceof PauseScreen && ((PauseScreen) e.getScreen()).showPauseMenu && !(e.getScreen() instanceof BetterGameMenuScreen)) {
            e.setScreen(new BetterGameMenuScreen());
        }
    }


    @SubscribeEvent
    public static void onGUIInit(ScreenEvent.Init.Post e) {
        if (!BGMConfig.enableRejoinButton || PackMenuCompat.isLoaded() || FancyMenuCompat.isLoaded())
            return;
        if (e.getScreen() instanceof TitleScreen) {
            JoinLastWorld.onGui(e);
        }
    }

    @SubscribeEvent
    public static void onWorldJoin(EntityJoinLevelEvent e) {
        if (e.getLevel().isClientSide() && e.getEntity() instanceof LocalPlayer) {
            if (!BGMConfig.enableRejoinButton || PackMenuCompat.isLoaded() || FancyMenuCompat.isLoaded())
                return;
            if (mc.hasSingleplayerServer()) {
                JoinLastWorld.setLastSinglePlay(Objects.requireNonNull(mc.getSingleplayerServer()).storageSource);
            } else {
                JoinLastWorld.setLastMultiPlay(mc.getCurrentServer());
            }
        }
    }
}
 */