package com.ghostipedia.cosmicrocketry.neoforge;

import com.ghostipedia.cosmicrocketry.client.neoforge.CosmicRocketryClientNeoForge;
import com.ghostipedia.cosmicrocketry.common.tags.CosmicRocketry;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.loading.FMLEnvironment;

@Mod(CosmicRocketry.MOD_ID)
public class CosmicRocketryNeoForge {

    public CosmicRocketryNeoForge(IEventBus bus) {
        CosmicRocketry.init();

        if (FMLEnvironment.dist.isClient()) CosmicRocketryClientNeoForge.init(bus);
    }

}
