
package net.mcreator.lumber.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class IronSawbladeItem extends Item {
	public IronSawbladeItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
	}
}
