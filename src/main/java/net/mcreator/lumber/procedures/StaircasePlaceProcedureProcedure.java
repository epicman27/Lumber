package net.mcreator.lumber.procedures;

import net.minecraftforge.eventbus.api.Event;

public class StaircasePlaceProcedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getLookAngle().y > 0) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		}
	}
}
