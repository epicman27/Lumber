package net.mcreator.lumber.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.util.RandomSource;
import net.minecraft.core.BlockPos;

public class FireAxeRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
		double shapemid = 0;
		double shapetop = 0;
		double shapebot = 0;
		double valid = 0;
		double btop = 0;
		double bbot = 0;
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.GLASS) {
			if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.GLASS) {
				if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.GLASS) {
					shapemid = 1;
					valid = 1;
				}
				btop = 1;
			}
			if (valid == 0) {
				if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.GLASS) {
					if ((world.getBlockState(BlockPos.containing(x, y + 2, z))).getBlock() == Blocks.GLASS) {
						shapetop = 1;
						valid = 1;
					}
				}
			}
			if (valid == 0) {
				if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.GLASS) {
					if ((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == Blocks.GLASS) {
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
