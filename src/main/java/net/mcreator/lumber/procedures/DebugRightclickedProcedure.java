package net.mcreator.lumber.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.lumber.init.LumberModEntities;

public class DebugRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = LumberModEntities.SAWBLADE_PROJECTILE.get().spawn(_level, BlockPos.containing(x + entity.getLookAngle().x * 0.4, y + entity.getLookAngle().y * 0.4, z + entity.getLookAngle().z * 0.4), MobSpawnType.MOB_SUMMONED);
			if (entityToSpawn != null) {
				entityToSpawn.setYRot((float) Math.toDegrees(Math.atan2(entity.getLookAngle().x, entity.getLookAngle().z)));
				entityToSpawn.setYBodyRot((float) Math.toDegrees(Math.atan2(entity.getLookAngle().x, entity.getLookAngle().z)));
				entityToSpawn.setYHeadRot((float) Math.toDegrees(Math.atan2(entity.getLookAngle().x, entity.getLookAngle().z)));
				entityToSpawn.setXRot((float) Math.toDegrees(Math.atan2(entity.getLookAngle().y, Math.sqrt(Math.pow(entity.getLookAngle().x, 2) + Math.pow(entity.getLookAngle().z, 2)))));
				entityToSpawn.setDeltaMovement((entity.getLookAngle().x * 1.5), (entity.getLookAngle().y * 1.5), (entity.getLookAngle().z * 1.5));
			}
		}
	}
}
