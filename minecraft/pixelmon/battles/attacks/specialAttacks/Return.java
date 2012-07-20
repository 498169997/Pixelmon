package pixelmon.battles.attacks.specialAttacks;

import java.util.ArrayList;

import pixelmon.battles.attacks.Attack;
import pixelmon.comm.ChatHandler;
import pixelmon.entities.pixelmon.helpers.PixelmonEntityHelper;

import net.minecraft.src.ModLoader;

public class Return extends SpecialAttackBase {

	public Return() {
		super(SpecialAttackType.Return, ApplyStage.During, false);
	}

	@Override
	public boolean ApplyEffect(PixelmonEntityHelper user, PixelmonEntityHelper target, Attack a, ArrayList<String> attackList) {
		ChatHandler.sendChat(user.getOwner(), target.getOwner(), "Friendship not fully implemented yet, using basePower of 50");
		a.basePower = 50;
		return false;
	}

}
