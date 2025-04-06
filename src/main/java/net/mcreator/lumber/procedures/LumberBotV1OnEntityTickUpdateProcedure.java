package net.mcreator.lumber.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class LumberBotV1OnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double logx = 0;
		double logy = 0;
		double logz = 0;
		sx = -3;
		found = false;
		for (int index0 = 0; index0 < 6; index0++) {
			sy = -3;
			for (int index1 = 0; index1 < 6; index1++) {
				sz = -3;
				for (int index2 = 0; index2 < 6; index2++) {
					if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.OAK_LOG) {
						found = true;
						logx = x + sx;
						logy = y + sy;
						logz = z + sz;
					}
					sz = sz + 1;
				}
				sy = sy + 1;
			}
			sx = sx + 1;
		}
		if (found == true) {
			if (entity instanceof Mob _entity)
				_entity.getNavigation().moveTo(logx, logy, logz, 1.2);
		} else {
			if (entity instanceof Mob _entity)
				_entity.getNavigation().moveTo(x, y, z, 1);
		}
	}
}
