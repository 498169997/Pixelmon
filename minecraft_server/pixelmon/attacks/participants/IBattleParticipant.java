package pixelmon.attacks.participants;

import pixelmon.attacks.Attack;
import pixelmon.attacks.BattleController;
import pixelmon.entities.pixelmon.helpers.PixelmonEntityHelper;

public interface IBattleParticipant {
	boolean isWild = false;
	PixelmonEntityHelper currentPokemon();
	boolean hasMorePokemon();
	boolean canGainXP();
	void EndBattle(boolean didWin, IBattleParticipant participant2);
	boolean getIsFaintedOrDead();
	void getNextPokemon();
	String getName();
	Attack getMove(IBattleParticipant participant2);
	void switchPokemon(IBattleParticipant participant2, int newPixelmonId);
	boolean checkPokemon();
	void setBattleController(BattleController bc);
}
