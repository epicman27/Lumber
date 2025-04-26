
package net.mcreator.lumber.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class HeartOfTheForestItem extends Item {
	public HeartOfTheForestItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
	}
}
