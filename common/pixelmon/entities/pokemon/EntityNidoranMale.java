package pixelmon.entities.pokemon;

import pixelmon.entities.pixelmon.EntityPixelmon;
import pixelmon.entities.pixelmon.EntityGroundPixelmon;
import net.minecraft.src.World;


public class EntityNidoranMale extends EntityGroundPixelmon
{

	public EntityNidoranMale(World par1World) 
	{
		super(par1World);
		init();
	}
	
	public void init() 
	{
		name = "NidoranMale";
		isImmuneToFire = false;
		super.init();
	}

	public void evolve() 
	{
	}
	
}