package com.ghostipedia.cosmicrocketry.client;

import com.ghostipedia.cosmicrocketry.client.models.entities.CosmicRocketModel;
import com.ghostipedia.cosmicrocketry.client.renderers.entities.CosmicRocketRenderer;
import com.ghostipedia.cosmicrocketry.common.registry.ModEntityTypes;
import com.ghostipedia.cosmicrocketry.common.registry.ModItems;
import earth.terrarium.adastra.client.ClientPlatformUtils;
import earth.terrarium.adastra.client.renderers.entities.vehicles.RocketRenderer;
import earth.terrarium.botarium.client.ClientHooks;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.world.item.Item;

import java.util.function.BiConsumer;

public class CosmicRocketryClient {

    public static void init() {
        registerEntityRenderers();
    }

    private static void registerEntityRenderers() {
        ClientHooks.registerEntityRenderer(ModEntityTypes.TIER_5_ROCKET, c -> new RocketRenderer(c, CosmicRocketModel.TIER_5_LAYER, CosmicRocketRenderer.TIER_5_TEXTURE));
    }

    public static void onRegisterEntityLayers(ClientPlatformUtils.LayerDefinitionRegistry consumer) {
        CosmicRocketModel.register(consumer);
    }

    public static void onRegisterItemRenderers(BiConsumer<Item, BlockEntityWithoutLevelRenderer> consumer) {
        consumer.accept(ModItems.TIER_5_ROCKET.get(), new RocketRenderer.ItemRenderer(CosmicRocketModel.TIER_5_LAYER, CosmicRocketRenderer.TIER_5_TEXTURE));
    }

}
