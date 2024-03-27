package com.ghostipedia.cosmicrocketry.common.entities;

import earth.terrarium.adastra.common.entities.vehicles.Rocket;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;

public class CosmicRocket extends Rocket {
    public CosmicRocket(EntityType<?> type, Level level) {
        super(type, level);
    }

    public CosmicRocket(EntityType<?> type, Level level, RocketProperties properties) {
        super(type, level, properties);
    }
}
