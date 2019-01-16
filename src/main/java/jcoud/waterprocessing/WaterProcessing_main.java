package jcoud.waterprocessing;

import jcoud.waterprocessing.proxy.IProxy;
import jcoud.waterprocessing.utils.Reference;
import jcoud.waterprocessing.utils.logHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSION, dependencies = Reference.DEPENDENCIES)
public class WaterProcessing_main {
    @Mod.Instance
    public static WaterProcessing_main instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public static void preInint(FMLPreInitializationEvent event) {
        logHelper.info("***WATERPROCESSING mod Pre-Initialization***");
    }

    @Mod.EventHandler
    public static void Inint(FMLInitializationEvent event) {
        logHelper.info("***WATERPROCESSING mod Initialization***");
    }

    @Mod.EventHandler
    public static void postInint(FMLPostInitializationEvent event) {
        logHelper.info("***WATERPROCESSING mod Post-Initialization***");
    }
}

