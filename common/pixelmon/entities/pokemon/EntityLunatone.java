package pixelmon.entities.pokemon;

import pixelmon.entities.pixelmon.BaseEntityPixelmon;
import pixelmon.entities.pixelmon.EntityGroundPixelmon;
import net.minecraft.src.World;

public class EntityLunatone extends EntityGroundPixelmon
{
	
	public EntityLunatone(World world)
	{
		super(world);
		init();
	}

	public void init()
	{
		name = "Lunatone";
		isImmuneToFire = false;
		helper.doesHover = true;
		helper.hoverHeight=1f;
		super.init();
	}
	
	public void evolve() 
	{		
	
	}
	
	public boolean getCanSpawnHere()
	{
		if(!worldObj.isDaytime() ) {
			return true;
		}
		
		return false;
	}
	
}
	
	