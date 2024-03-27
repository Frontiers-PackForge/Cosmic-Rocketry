package com.ghostipedia.cosmicrocketry.forge;

import com.ghostipedia.cosmicrocketry.CosmicRocketry;
import com.ghostipedia.cosmicrocketry.client.forge.CosmicRocketryClientForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.loading.FMLEnvironment;

@Mod(CosmicRocketry.MOD_ID)
public class CosmicRocketryForge {

    public CosmicRocketryForge() {
        CosmicRocketry.init();

        if (FMLEnvironment.dist.isClient()) CosmicRocketryClientForge.init();
    }

}
