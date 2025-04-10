package net.mcreator.lumber.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.BlockItem;
import net.minecraft.util.RandomSource;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class FireAxeRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
		double shapemid = 0;
		double shapetop = 0;
		double shapebot = 0;
		double valid = 0;
		double btop = 0;
		double bbot = 0;
		ItemStack block = ItemStack.EMPTY;
		if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(new ResourceLocation("minecraft:glass_blocks")))) {
			block = (new ItemStack((world.getBlockState(BlockPos.containing(x, y, z))).getBlock())).copy();
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == (block.getItem() instanceof BlockItem _bi ? _bi.getBlock().defaultBlockState() : Blocks.AIR.defaultBlockState()).getBlock()) {
				if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == (block.getItem() instanceof BlockItem _bi ? _bi.getBlock().defaultBlockState() : Blocks.AIR.defaultBlockState()).getBlock()) {
					if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == (block.getItem() instanceof BlockItem _bi ? _bi.getBlock().defaultBlockState() : Blocks.AIR.defaultBlockState()).getBlock()) {
						shapemid = 1;
						valid = 1;
					}
					btop = 1;
				}
				if (valid == 0) {
					if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == (block.getItem() instanceof BlockItem _bi ? _bi.getBlock().defaultBlockState() : Blocks.AIR.defaultBlockState()).getBlock()) {
						if ((world.getBlockState(BlockPos.containing(x, y + 2, z))).getBlock() == (block.getItem() instanceof BlockItem _bi ? _bi.getBlock().defaultBlockState() : Blocks.AIR.defaultBlockState()).getBlock()) {
							shapetop = 1;
							valid = 1;
						}
					}
				}
				if (valid == 0) {
					if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == (block.getItem() instanceof BlockItem _bi ? _bi.getBlock().defaultBlockState() : Blocks.AIR.defaultBlockState()).getBlock()) {
						if ((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == (block.getItem() instanceof BlockItem _bi ? _bi.getBlock().defaultBlockState() : Blocks.AIR.defaultBlockState()).getBlock()) {
							shapebot = 1;
							valid = 1;
						}
						bbot = 1;
					}
				}
				if (shapemid == 1) {
					{
						ItemStack _ist = itemstack;
						if (_ist.hurt(1, RandomSource.create(), null)) {
							_ist.shrink(1);
							_ist.setDamageValue(0);
						}
					}
					world.destroyBlock(BlockPos.containing(x, y, z), false);
					world.destroyBlock(BlockPos.containing(x, y + 1, z), false);
					world.destroyBlock(BlockPos.containing(x, y - 1, z), false);
				} else {
					if (shapetop == 1) {
						{
							ItemStack _ist = itemstack;
							if (_ist.hurt(1, RandomSource.create(), null)) {
								_ist.shrink(1);
								_ist.setDamageValue(0);
							}
						}
						world.destroyBlock(BlockPos.containing(x, y, z), false);
						world.destroyBlock(BlockPos.containing(x, y + 1, z), false);
						world.destroyBlock(BlockPos.containing(x, y + 2, z), false);
					} else {
						if (shapebot == 1) {
							{
								ItemStack _ist = itemstack;
								if (_ist.hurt(1, RandomSource.create(), null)) {
									_ist.shrink(1);
									_ist.setDamageValue(0);
								}
							}
							world.destroyBlock(BlockPos.containing(x, y, z), false);
							world.destroyBlock(BlockPos.containing(x, y - 1, z), false);
							world.destroyBlock(BlockPos.containing(x, y - 2, z), false);
						}
					}
				}
				if (valid == 0) {
					{
						ItemStack _ist = itemstack;
						if (_ist.hurt(1, RandomSource.create(), null)) {
							_ist.shrink(1);
							_ist.setDamageValue(0);
						}
					}
					world.destroyBlock(BlockPos.containing(x, y, z), false);
					if (btop == 1) {
						world.destroyBlock(BlockPos.containing(x, y + 1, z), false);
					}
					if (bbot == 1) {
						world.destroyBlock(BlockPos.containing(x, y - 1, z), false);
					}
				}
			}
		}
	}
}
