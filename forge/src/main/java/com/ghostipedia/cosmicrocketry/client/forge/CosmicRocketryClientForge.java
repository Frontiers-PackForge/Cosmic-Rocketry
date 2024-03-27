package com.ghostipedia.cosmicrocketry.client.forge;

import com.ghostipedia.cosmicrocketry.client.CosmicRocketryClient;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CosmicRocketryClientForge {

    public static void init() {}

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(CosmicRocketryClient::init);
    }
}
