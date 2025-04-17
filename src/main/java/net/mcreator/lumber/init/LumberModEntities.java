
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lumber.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.lumber.entity.SawbladeProjectileEntity;
import net.mcreator.lumber.entity.LumberBotV1Entity;
import net.mcreator.lumber.entity.LumberBotTestEntity;
import net.mcreator.lumber.LumberMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class LumberModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, LumberMod.MODID);
	public static final RegistryObject<EntityType<LumberBotV1Entity>> LUMBER_BOT_V_1 = register("lumber_bot_v_1",
			EntityType.Builder.<LumberBotV1Entity>of(LumberBotV1Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LumberBotV1Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SawbladeProjectileEntity>> SAWBLADE_PROJECTILE = register("sawblade_projectile", EntityType.Builder.<SawbladeProjectileEntity>of(SawbladeProjectileEntity::new, MobCategory.MISC)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(0).setUpdateInterval(3).setCustomClientFactory(SawbladeProjectileEntity::new).fireImmune().sized(0.3f, 0.2f));
	public static final RegistryObject<EntityType<LumberBotTestEntity>> LUMBER_BOT_TEST = register("lumber_bot_test",
			EntityType.Builder.<LumberBotTestEntity>of(LumberBotTestEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LumberBotTestEntity::new)

					.sized(0.6f, 1.8f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			LumberBotV1Entity.init();
			SawbladeProjectileEntity.init();
			LumberBotTestEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(LUMBER_BOT_V_1.get(), LumberBotV1Entity.createAttributes().build());
		event.put(SAWBLADE_PROJECTILE.get(), SawbladeProjectileEntity.createAttributes().build());
		event.put(LUMBER_BOT_TEST.get(), LumberBotTestEntity.createAttributes().build());
	}
}
