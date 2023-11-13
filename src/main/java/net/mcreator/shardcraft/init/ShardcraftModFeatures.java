
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.shardcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.shardcraft.world.features.ores.TungestenFeature;
import net.mcreator.shardcraft.world.features.ores.TitanoreFeature;
import net.mcreator.shardcraft.ShardcraftMod;

@Mod.EventBusSubscriber
public class ShardcraftModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, ShardcraftMod.MODID);
	public static final RegistryObject<Feature<?>> TUNGESTEN = REGISTRY.register("tungesten", TungestenFeature::new);
	public static final RegistryObject<Feature<?>> TITANORE = REGISTRY.register("titanore", TitanoreFeature::new);
}
