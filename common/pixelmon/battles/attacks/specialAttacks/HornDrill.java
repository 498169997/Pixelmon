package pixelmon.battles.attacks.specialAttacks;

import java.util.ArrayList;

import pixelmon.battles.attacks.Attack;
import pixelmon.battles.attacks.attackEffects.EffectBase.ApplyStage;
import pixelmon.comm.ChatHandler;
import pixelmon.entities.pixelmon.helpers.PixelmonEntityHelper;

import net.minecraft.src.DamageSource;
import net.minecraft.src.EntityLiving;

public class HornDrill extends SpecialAttackBase {

	public HornDrill(SpecialAttackType type, ApplyStage a, boolean persists) {
		super(SpecialAttackType.HornDrill, ApplyStage.During, false);
		}

		public boolean ApplyEffect(PixelmonEntityHelper user, PixelmonEntityHelper target, Attack a, ArrayList<String> attackList) {
			ChatHandler.sendChat(user.getOwner(), target.getOwner(), "It's a one-hit-KO!");
			target.attackEntityFrom(DamageSource.causeMobDamage((EntityLiving) user.getEntity()), target.getHealth());
			return true;
		}
		
		public boolean hasSpecialAccuracyEffect() {
			return true;
		}

		public double getAccuracy(PixelmonEntityHelper user, PixelmonEntityHelper target) {
			if (target.getLvl().getLevel() > user.getLvl().getLevel()) return 0;
			
			return (user.getLvl().getLevel() - target.getLvl().getLevel()) + 30;
		}

}
