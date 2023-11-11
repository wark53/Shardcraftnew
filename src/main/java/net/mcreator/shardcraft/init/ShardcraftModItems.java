
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.shardcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.shardcraft.item.DsadsItem;
import net.mcreator.shardcraft.item.DeadshardItem;
import net.mcreator.shardcraft.ShardcraftMod;

public class ShardcraftModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ShardcraftMod.MODID);
	public static final RegistryObject<Item> DEADSHARD = REGISTRY.register("deadshard", () -> new DeadshardItem());
	public static final RegistryObject<Item> DSADS = REGISTRY.register("dsads", () -> new DsadsItem());
}
