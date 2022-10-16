package com.jusipat.mintmod.registry;

import com.jusipat.mintmod.MintMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item COPPER_COIN = new Item(new FabricItemSettings().group(MintMod.MINT_GROUP));
    public static final Item IRON_COIN = new Item(new FabricItemSettings().group(MintMod.MINT_GROUP));
    public static final Item GOLD_COIN = new Item(new FabricItemSettings().group(MintMod.MINT_GROUP));

public static void registerItems() {
    Registry.register(Registry.ITEM, new Identifier(MintMod.MOD_ID, "copper_coin"), COPPER_COIN);
    Registry.register(Registry.ITEM, new Identifier(MintMod.MOD_ID, "iron_coin"), IRON_COIN);
    Registry.register(Registry.ITEM, new Identifier(MintMod.MOD_ID, "gold_coin"), GOLD_COIN);

    Registry.register(Registry.ITEM, new Identifier(MintMod.MOD_ID, "mint"), new BlockItem(ModBlocks.MINT, new FabricItemSettings().group(MintMod.MINT_GROUP)));
    }
}
