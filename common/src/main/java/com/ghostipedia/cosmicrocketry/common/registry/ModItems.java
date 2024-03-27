package com.ghostipedia.cosmicrocketry.common.registry;

import com.ghostipedia.cosmicrocketry.CosmicRocketry;
import com.teamresourceful.resourcefullib.common.registry.RegistryEntry;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistries;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistry;
import earth.terrarium.adastra.common.items.vehicles.RocketItem;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;

public class ModItems {
    public static final ResourcefulRegistry<Item> ITEMS = ResourcefulRegistries.create(BuiltInRegistries.ITEM, CosmicRocketry.MOD_ID);

    public static final ResourcefulRegistry<Item> VEHICLES = ResourcefulRegistries.create(ITEMS);

    public static final RegistryEntry<Item> TIER_5_ROCKET = VEHICLES.register("tier_5_rocket", () -> new RocketItem(ModEntityTypes.TIER_5_ROCKET::get, new Item.Properties().stacksTo(1).fireResistant()));
}
