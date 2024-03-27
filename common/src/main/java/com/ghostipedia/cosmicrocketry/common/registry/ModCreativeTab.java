package com.ghostipedia.cosmicrocketry.common.registry;

import com.ghostipedia.cosmicrocketry.common.tags.CosmicRocketry;
import com.teamresourceful.resourcefullib.common.item.tabs.ResourcefulCreativeTab;
import earth.terrarium.adastra.common.registry.ModFluids;
import earth.terrarium.adastra.common.utils.FluidUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ModCreativeTab {

    public static final Supplier<CreativeModeTab> TAB = new ResourcefulCreativeTab(new ResourceLocation(CosmicRocketry.MOD_ID, "main"))
            .setItemIcon(ModItems.TIER_5_ROCKET)
            .addContent(ModCreativeTab::getCustomNbtItems)
            .addRegistry(ModItems.ITEMS)
            .build();

    public static Stream<ItemStack> getCustomNbtItems() {
        List<ItemStack> list = new ArrayList<>();

        list.add(FluidUtils.fluidFilledItem(ModItems.TIER_5_ROCKET, ModFluids.FUEL));
        list.add(FluidUtils.fluidFilledItem(ModItems.TIER_6_ROCKET, ModFluids.FUEL));
        list.add(FluidUtils.fluidFilledItem(ModItems.TIER_7_ROCKET, ModFluids.FUEL));

        return list.stream();
    }

    public static void init() {}
}
