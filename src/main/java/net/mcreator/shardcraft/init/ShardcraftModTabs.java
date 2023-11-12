
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.shardcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.shardcraft.ShardcraftMod;

public class ShardcraftModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ShardcraftMod.MODID);
	public static final RegistryObject<CreativeModeTab> SHARDS = REGISTRY.register("shards",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.shardcraft.shards")).icon(() -> new ItemStack(ShardcraftModItems.DEADSHARD.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ShardcraftModItems.DEADSHARD.get());
				tabData.accept(ShardcraftModItems.SKELETONSHARD.get());
				tabData.accept(ShardcraftModItems.ZOMBIE_SKELSHARD.get());
				tabData.accept(ShardcraftModBlocks.TUNGESTEN.get().asItem());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> SHARD_BLOCKS = REGISTRY.register("shard_blocks",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.shardcraft.shard_blocks")).icon(() -> new ItemStack(ShardcraftModBlocks.SHARD_STANTION.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ShardcraftModBlocks.SHARD_STANTION.get().asItem());
			})

					.build());
}
