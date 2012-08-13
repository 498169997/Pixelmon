package pixelmon.battles.attacks.attackModifiers;

import pixelmon.battles.attacks.Attack;
import pixelmon.entities.pixelmon.helpers.PixelmonEntityHelper;

public class AlwaysHitAttackModifier extends AttackModifierBase {

	public AlwaysHitAttackModifier() {
		super(AttackModifierType.AlwaysHit, ApplyStage.Start, false);
	}

	@Override
	public boolean ApplyEffect(PixelmonEntityHelper user, PixelmonEntityHelper target, Attack a) {
		return false;
	}
	
	public boolean hasSpecialAccuracyEffect() {
		return true;
	}

	public double getAccuracy(PixelmonEntityHelper user, PixelmonEntityHelper target) {
		return 100;
	}

}
