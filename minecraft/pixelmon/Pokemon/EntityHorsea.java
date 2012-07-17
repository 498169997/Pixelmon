package pixelmon.Pokemon;

import pixelmon.entities.BaseEntityPixelmon;
import pixelmon.entities.EntityWaterPixelmon;
import net.minecraft.src.*;


public class EntityHorsea extends EntityWaterPixelmon
{
	
	public EntityHorsea(World world)
	{
		super(world);
		init();
	}

	public void init() 
	{
		name = "Horsea";
		isImmuneToFire = false;
		depthRangeStart = 2;
		depthRangeEnd = 20;
		super.init();
	}

	public float getMoveSpeed() 
	{
		return 2F;
	}

	public void evolve() 
	{
	}
}