package com.ghostipedia.cosmicrocketry.common.tags;

import com.ghostipedia.cosmicrocketry.common.registry.ModCreativeTab;
import com.ghostipedia.cosmicrocketry.common.registry.ModEntityTypes;
import com.ghostipedia.cosmicrocketry.common.registry.ModItems;

public class CosmicRocketry {
    public static final String MOD_ID = "cosmicrocketry";

    public static void init() {
        ModItems.ITEMS.init();
        ModCreativeTab.init();
        ModEntityTypes.ENTITY_TYPES.init();
    }

    public static void postInit() {}
}
