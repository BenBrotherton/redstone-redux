package com.github.benbrotherton.common.blocks;

import com.google.common.collect.Sets;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.ComparatorBlockEntity;
import net.minecraft.entity.decoration.ItemFrameEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

import java.util.Iterator;
import java.util.Random;
import java.util.Set;


public class IndicatorBlock extends HorizontalFacingBlock {
    public static final DirectionProperty FACING;
    public static final BooleanProperty POWERED;
    public static final IntProperty POWER;
    private boolean wiresGivePower = true;


    public IndicatorBlock(HorizontalFacingBlock.Settings blockSettings){
        super(blockSettings);
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING, POWERED, POWER);
    }

    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return (BlockState)this.getDefaultState().with(FACING, ctx.getPlayerLookDirection().getOpposite()).with(POWER,0);
    }

    static {
        FACING = Properties.FACING;
        POWERED = Properties.POWERED;
        POWER = Properties.POWER;
    }

}
