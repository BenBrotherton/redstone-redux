package com.github.benbrotherton.common;

import com.github.benbrotherton.common.blocks.IndicatorBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Blocks {

    public static final Block INDICATOR = register("indicator_block",new IndicatorBlock(FabricBlockSettings.of(Material.STONE)));

    public static Block register(String name, Block block)
    {
        return Registry.register(Registry.BLOCK, new Identifier("redstoneredux",name), block);
    }

    public static void init(){

    }
}
