
package net.mcreator.shardcraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SkeletonshardItem extends Item {
	public SkeletonshardItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
