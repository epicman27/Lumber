package net.mcreator.lumber.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.BlockPos;

import net.mcreator.lumber.init.LumberModBlocks;
import net.mcreator.lumber.LumberMod;

import java.util.Map;

public class StaircasePlaceProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double temp = 0;
		LumberMod.LOGGER.info("test");
		LumberMod.LOGGER.info("before calc:");
		LumberMod.LOGGER.info(entity.getLookAngle().y);
		temp = Math.atan2(entity.getLookAngle().y, Math.sqrt(Math.pow(entity.getLookAngle().x, 2) + Math.pow(entity.getLookAngle().z, 2)));
		LumberMod.LOGGER.info("after calc:");
		LumberMod.LOGGER.info(temp);
		if (temp < 0) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = LumberModBlocks.OAK_LOG_STAIRS_UD.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				BlockEntity _be = world.getBlockEntity(_bp);
				CompoundTag _bnbt = null;
				if (_be != null) {
					_bnbt = _be.saveWithFullMetadata();
					_be.setRemoved();
				}
				world.setBlock(_bp, _bs, 3);
				if (_bnbt != null) {
					_be = world.getBlockEntity(_bp);
					if (_be != null) {
						try {
							_be.load(_bnbt);
						} catch (Exception ignored) {
						}
					}
				}
			}
		}
	}
}
