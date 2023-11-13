
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.shardcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.shardcraft.ShardcraftMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ShardcraftModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ShardcraftMod.MODID);
	public static final RegistryObject<CreativeModeTab> SHARDS = REGISTRY.register("shards",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.shardcraft.shards")).icon(() -> new ItemStack(ShardcraftModItems.DEADSHARD.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ShardcraftModItems.DEADSHARD.get());
				tabData.accept(ShardcraftModItems.SKELETONSHARD.get());
				tabData.accept(ShardcraftModItems.ZOMBIE_SKELSHARD.get());
				tabData.accept(ShardcraftModItems.NIGGERSHARD.get());
				tabData.accept(ShardcraftModItems.RAW_TUNGSTEN.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> SHARD_BLOCKS = REGISTRY.register("shard_blocks",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.shardcraft.shard_blocks")).icon(() -> new ItemStack(ShardcraftModBlocks.SHARD_STANTION.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ShardcraftModBlocks.SHARD_STANTION.get().asItem());
				tabData.accept(ShardcraftModBlocks.TUNGESTEN.get().asItem());
				tabData.accept(ShardcraftModBlocks.TITANORE.get().asItem());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(ShardcraftModItems.TUNGSTEN_INGOT.get());
		}
	}
}
