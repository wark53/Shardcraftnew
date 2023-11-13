
package net.mcreator.shardcraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class TitanscrapItem extends Item {
	public TitanscrapItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
	}
}
