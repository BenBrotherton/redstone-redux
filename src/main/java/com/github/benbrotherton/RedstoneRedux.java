package com.github.benbrotherton;

import com.github.benbrotherton.common.Items;
import com.github.benbrotherton.common.Blocks;
import net.fabricmc.api.ModInitializer;

public class RedstoneRedux implements ModInitializer {
	@Override
	public void onInitialize() {
		Blocks.init();
		Items.init();
	}
}
