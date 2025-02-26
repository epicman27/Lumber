
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lumber.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.lumber.world.inventory.LumberBotStorageMenu;
import net.mcreator.lumber.LumberMod;

public class LumberModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, LumberMod.MODID);
	public static final RegistryObject<MenuType<LumberBotStorageMenu>> LUMBER_BOT_STORAGE = REGISTRY.register("lumber_bot_storage", () -> IForgeMenuType.create(LumberBotStorageMenu::new));
}
