package com.jusipat.mintmod.registry;

import com.jusipat.mintmod.MintMod;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block MINT = new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f));

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(MintMod.MOD_ID, "mint"), MINT);
    }
}
