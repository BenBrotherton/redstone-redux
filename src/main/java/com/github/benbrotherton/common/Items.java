package com.github.benbrotherton.common;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Items
{
    public static final Item DOOBER = register("doober", new Item(new Item.Settings().group(ItemGroup.REDSTONE)));
    public static final Item INDICATOR = register("indicator_block", new BlockItem(Blocks.INDICATOR, new Item.Settings().group(ItemGroup.REDSTONE)));
    public static Item register(String name,Item item)
    {
        return Registry.register(Registry.ITEM, new Identifier("redstoneredux",name), item);
    }

    public static void init(){

    }
}
