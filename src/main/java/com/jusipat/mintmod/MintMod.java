package com.jusipat.mintmod;

import com.jusipat.mintmod.registry.ModBlocks;
import com.jusipat.mintmod.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
public class MintMod implements ModInitializer {

	public static final String MOD_ID = "mint";
	public static final ItemGroup MINT_GROUP = FabricItemGroupBuilder.create(
			new Identifier(MOD_ID, "items")).icon(
			() -> new ItemStack(ModItems.COPPER_COIN))
			.build();

	@Override
	public void onInitialize() {
		ModBlocks.registerBlocks();
		ModItems.registerItems();

	}
}
