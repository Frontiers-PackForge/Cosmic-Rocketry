package com.ghostipedia.cosmicrocketry.client.fabric;

import com.ghostipedia.cosmicrocketry.client.CosmicRocketryClient;
import net.fabricmc.fabric.api.client.rendering.v1.BuiltinItemRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;

public class CosmicRocketryClientFabric {

    public static void init() {
        CosmicRocketryClient.init();

        CosmicRocketryClient.onRegisterItemRenderers(((item, renderer) -> BuiltinItemRendererRegistry.INSTANCE.register(item, renderer::renderByItem)));
        CosmicRocketryClient.onRegisterEntityLayers(((location, definition) -> EntityModelLayerRegistry.registerModelLayer(location, definition::get)));
    }

}
