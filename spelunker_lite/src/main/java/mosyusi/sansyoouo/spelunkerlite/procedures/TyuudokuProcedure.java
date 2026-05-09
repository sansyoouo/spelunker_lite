package mosyusi.sansyoouo.spelunkerlite.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class TyuudokuProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(MobEffects.FIRE_RESISTANCE) || entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(MobEffects.GLOWING)
				|| entity instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(MobEffects.HEALTH_BOOST) || entity instanceof LivingEntity _livEnt3 && _livEnt3.hasEffect(MobEffects.HEAL)
				|| entity instanceof LivingEntity _livEnt4 && _livEnt4.hasEffect(MobEffects.INVISIBILITY) || entity instanceof LivingEntity _livEnt5 && _livEnt5.hasEffect(MobEffects.JUMP)
				|| entity instanceof LivingEntity _livEnt6 && _livEnt6.hasEffect(MobEffects.LEVITATION) || entity instanceof LivingEntity _livEnt7 && _livEnt7.hasEffect(MobEffects.DIG_SLOWDOWN)
				|| entity instanceof LivingEntity _livEnt8 && _livEnt8.hasEffect(MobEffects.NIGHT_VISION) || entity instanceof LivingEntity _livEnt9 && _livEnt9.hasEffect(MobEffects.REGENERATION)
				|| entity instanceof LivingEntity _livEnt10 && _livEnt10.hasEffect(MobEffects.SATURATION) || entity instanceof LivingEntity _livEnt11 && _livEnt11.hasEffect(MobEffects.SLOW_FALLING)
				|| entity instanceof LivingEntity _livEnt12 && _livEnt12.hasEffect(MobEffects.DAMAGE_BOOST)) {
			entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("spelunker_lite:tyuudokudamage")))), 40);
		}
	}
}