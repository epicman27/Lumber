
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lumber.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.lumber.LumberMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class LumberModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LumberMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(LumberModBlocks.POLISHED_OAK_FENCE.get().asItem());
			tabData.accept(LumberModBlocks.POLISHED_BIRCH_FENCE.get().asItem());
			tabData.accept(LumberModBlocks.POLISHED_SPRUCE_FENCE.get().asItem());
			tabData.accept(LumberModBlocks.POLISHED_DARK_OAK_FENCE.get().asItem());
			tabData.accept(LumberModBlocks.POLISHED_ACACIA_FENCE.get().asItem());
			tabData.accept(LumberModBlocks.POLISHED_JUNGLE_FENCE.get().asItem());
			tabData.accept(LumberModBlocks.POLISHED_CRIMSON_FENCE.get().asItem());
			tabData.accept(LumberModBlocks.POLISHED_WARPED_FENCE.get().asItem());
			tabData.accept(LumberModBlocks.SPRING_SPRUCE_LEAVES.get().asItem());
			tabData.accept(LumberModBlocks.FLOWERING_SPRING_SPRUCE_LEAVES.get().asItem());
			tabData.accept(LumberModBlocks.AERBLOOM_LEAVES.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {
			tabData.accept(LumberModBlocks.POLISHED_OAK_FENCE_GATE.get().asItem());
			tabData.accept(LumberModBlocks.POLISHED_BIRCH_FENCE_GATE.get().asItem());
			tabData.accept(LumberModBlocks.POLISHED_SPRUCE_FENCE_GATE.get().asItem());
			tabData.accept(LumberModBlocks.POLISHED_DARK_OAK_FENCE_GATE.get().asItem());
			tabData.accept(LumberModBlocks.POLISHED_ACACIA_FENCE_GATE.get().asItem());
			tabData.accept(LumberModBlocks.POLISHED_JUNGLE_FENCE_GATE.get().asItem());
			tabData.accept(LumberModBlocks.POLISHED_CRIMSON_FENCE_GATE.get().asItem());
			tabData.accept(LumberModBlocks.POLISHED_WARPED_FENCE_GATE.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(LumberModItems.LUMBER_BOT_V_1_SPAWN_EGG.get());
			tabData.accept(LumberModItems.SAWBLADE_PROJECTILE_SPAWN_EGG.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(LumberModItems.FIRE_AXE.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(LumberModItems.HEART_OF_THE_FOREST.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(LumberModItems.IRON_SAWBLADE.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(LumberModBlocks.POLISHED_OAK_PLANKS.get().asItem());
			tabData.accept(LumberModBlocks.POLISHED_OAK_STAIRS.get().asItem());
			tabData.accept(LumberModBlocks.POLISHED_OAK_SLAB.get().asItem());
			tabData.accept(LumberModBlocks.POLISHED_BIRCH_PLANKS.get().asItem());
			tabData.accept(LumberModBlocks.POLISHED_BIRCH_STAIRS.get().asItem());
			tabData.accept(LumberModBlocks.POLISHED_BIRCH_SLAB.get().asItem());
			tabData.accept(LumberModBlocks.POLISHED_SPRUCE_PLANKS.get().asItem());
			tabData.accept(LumberModBlocks.POLISHED_SPRUCE_STAIRS.get().asItem());
			tabData.accept(LumberModBlocks.POLISHED_SPRUCE_SLAB.get().asItem());
			tabData.accept(LumberModBlocks.POLISHED_DARK_OAK_PLANKS.get().asItem());
			tabData.accept(LumberModBlocks.POLISHED_DARK_OAK_STAIRS.get().asItem());
			tabData.accept(LumberModBlocks.POLISHED_DARK_OAK_SLAB.get().asItem());
			tabData.accept(LumberModBlocks.POLISHED_ACACIA_PLANKS.get().asItem());
			tabData.accept(LumberModBlocks.POLISHED_ACACIA_STAIRS.get().asItem());
			tabData.accept(LumberModBlocks.POLISHED_ACACIA_SLAB.get().asItem());
			tabData.accept(LumberModBlocks.POLISHED_JUNGLE_PLANKS.get().asItem());
			tabData.accept(LumberModBlocks.POLISHED_JUNGLE_STAIRS.get().asItem());
			tabData.accept(LumberModBlocks.POLISHED_JUNGLE_SLAB.get().asItem());
			tabData.accept(LumberModBlocks.POLISHED_CRIMSON_PLANKS.get().asItem());
			tabData.accept(LumberModBlocks.POLISHED_CRIMSON_STAIRS.get().asItem());
			tabData.accept(LumberModBlocks.POLISHED_CRIMSON_SLAB.get().asItem());
			tabData.accept(LumberModBlocks.POLISHED_WARPED_PLANKS.get().asItem());
			tabData.accept(LumberModBlocks.POLISHED_WARPED_STAIRS.get().asItem());
			tabData.accept(LumberModBlocks.POLISHED_WARPED_SLAB.get().asItem());
			tabData.accept(LumberModBlocks.POLISHED_MANGROVE_PLANKS.get().asItem());
			tabData.accept(LumberModBlocks.POLISHED_MANGROVE_STAIRS.get().asItem());
			tabData.accept(LumberModBlocks.POLISHED_MANGROVE_SLAB.get().asItem());
			tabData.accept(LumberModBlocks.ACACIA_LOGS.get().asItem());
			tabData.accept(LumberModBlocks.OAK_LOGS.get().asItem());
			tabData.accept(LumberModBlocks.LIGHTBULB_ON_A_STICK.get().asItem());
			tabData.accept(LumberModBlocks.OAK_LOG_STAIRS.get().asItem());
			tabData.accept(LumberModBlocks.PACKED_MUD_STAIRS.get().asItem());
			tabData.accept(LumberModBlocks.PACKED_MUD_SLAB.get().asItem());
			tabData.accept(LumberModBlocks.OAK_STUMP.get().asItem());
			tabData.accept(LumberModBlocks.CYPRESS_PLANKS.get().asItem());
			tabData.accept(LumberModBlocks.CYPRESS_STAIRS.get().asItem());
			tabData.accept(LumberModBlocks.CYPRESS_SLAB.get().asItem());
			tabData.accept(LumberModBlocks.CYPRESS_FENCE.get().asItem());
			tabData.accept(LumberModBlocks.CYPRESS_FENCE_GATE.get().asItem());
			tabData.accept(LumberModBlocks.CYPRESS_PRESSURE_PLATE.get().asItem());
			tabData.accept(LumberModBlocks.POLISHED_CYPRESS_PLANKS.get().asItem());
			tabData.accept(LumberModBlocks.POLISHED_CYPRESS_STAIRS.get().asItem());
			tabData.accept(LumberModBlocks.POLISHED_CYPRESS_SLAB.get().asItem());
			tabData.accept(LumberModBlocks.POLISHED_CYPRESS_FENCE.get().asItem());
			tabData.accept(LumberModBlocks.POLISHED_CYPRESS_FENCE_GATE.get().asItem());
			tabData.accept(LumberModBlocks.POLISHED_MANGROVE_FENCE.get().asItem());
			tabData.accept(LumberModBlocks.POLISHED_MANGROVE_FENCE_GATE.get().asItem());
		}
	}
}
