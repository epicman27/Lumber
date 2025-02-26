package net.mcreator.lumber.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class FireAxeRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.GLASS) {
			world.destroyBlock(BlockPos.containing(x, y, z), false);
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.GLASS) {
			world.destroyBlock(BlockPos.containing(x, y, z), false);
			if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.GLASS) {
				world.destroyBlock(BlockPos.containing(x, y - 1, z), false);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.GLASS) {
			world.destroyBlock(BlockPos.containing(x, y, z), false);
			if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.GLASS) {
				world.destroyBlock(BlockPos.containing(x, y + 1, z), false);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.GLASS) {
			world.destroyBlock(BlockPos.containing(x, y, z), false);
			if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.GLASS) {
				world.destroyBlock(BlockPos.containing(x, y + 1, z), false);
				if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.GLASS) {
					world.destroyBlock(BlockPos.containing(x, y - 1, z), false);
				}
			}
		}
	}
}
