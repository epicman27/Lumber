package net.mcreator.lumber.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.commands.arguments.EntityAnchorArgument;

import java.util.List;
import java.util.Comparator;

public class SawbladeFaceOnTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double v1 = 0;
		double v2 = 0;
		double v3 = 0;
		double apply = 0;
		entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((x + entity.getDeltaMovement().x()), (y + entity.getDeltaMovement().y()), (z + entity.getDeltaMovement().z())));
		v1 = Math.sqrt(Math.pow(entity.getDeltaMovement().x(), 2));
		v2 = Math.sqrt(Math.pow(entity.getDeltaMovement().y(), 2));
		v3 = Math.sqrt(Math.pow(entity.getDeltaMovement().z(), 2));
		if (v1 >= v2) {
			if (v1 >= v3) {
				if (1 > v1) {
					apply = v1 + 1;
				} else {
					apply = v1;
				}
			}
		}
		if (v2 >= v1) {
			if (v2 >= v3) {
				if (1 > v2) {
					apply = v2 + 1;
				} else {
					apply = v2;
				}
			}
		}
		if (v3 >= v1) {
			if (v3 >= v2) {
				if (1 > v3) {
					apply = v3 + 1;
				} else {
					apply = v3;
				}
			}
		}
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(1.25 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("lumber:saw")))), (float) (3 * apply));
			}
		}
		if (0.05 >= v1) {
			if (0.05 >= v2) {
				if (0.05 >= v3) {
					if (!entity.level().isClientSide())
						entity.discard();
				}
			}
		}
	}
}
