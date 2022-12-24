package org.thinkingstudio.bettergamemenu;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;

@Config(name = BetterGameMenu.MODID)
public class BGMConfig implements ConfigData {
    public static boolean enableModOptions = true;
    public static boolean enableRFARB = true;
    public static boolean enableHideUnnecessaryShareToLan = true;
    //public static boolean enableRejoinButton = true;
    public static boolean showNotificationModUpdate = true;
    //public boolean enableJoinLastWorldButton = true;
}
