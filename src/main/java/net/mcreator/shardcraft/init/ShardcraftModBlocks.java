
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.shardcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.shardcraft.block.TungestenBlock;
import net.mcreator.shardcraft.block.TitanoreBlock;
import net.mcreator.shardcraft.block.ShardStantionBlock;
import net.mcreator.shardcraft.ShardcraftMod;

public class ShardcraftModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ShardcraftMod.MODID);
	public static final RegistryObject<Block> SHARD_STANTION = REGISTRY.register("shard_stantion", () -> new ShardStantionBlock());
	public static final RegistryObject<Block> TUNGESTEN = REGISTRY.register("tungesten", () -> new TungestenBlock());
	public static final RegistryObject<Block> TITANORE = REGISTRY.register("titanore", () -> new TitanoreBlock());
}
