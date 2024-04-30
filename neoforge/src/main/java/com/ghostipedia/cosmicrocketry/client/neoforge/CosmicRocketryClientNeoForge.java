package com.ghostipedia.cosmicrocketry.client.neoforge;

import com.ghostipedia.cosmicrocketry.client.CosmicRocketryClient;
import earth.terrarium.adastra.client.neoforge.AdAstraClientNeoForge;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;

@Mod.EventBusSubscriber(value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CosmicRocketryClientNeoForge {
    public static void init(IEventBus bus) {}

    @SubscribeEvent
    public static void onClientSetup(final FMLClientSetupEvent event) {
        event.enqueueWork(CosmicRocketryClient::init);
        CosmicRocketryClient.onRegisterItemRenderers(AdAstraClientNeoForge.ITEM_RENDERERS::put);
    }

    @SubscribeEvent
    public static void onRegisterLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        CosmicRocketryClient.onRegisterEntityLayers(event::registerLayerDefinition);
    }
}
