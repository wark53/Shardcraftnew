
package net.mcreator.shardcraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class TungstenIngotItem extends Item {
	public TungstenIngotItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
	}
}
