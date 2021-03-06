package pixelmon.client.models.animations;

import java.util.ArrayList;

import pixelmon.entities.pixelmon.EntityPixelmon;

import net.minecraft.client.model.ModelRenderer;

public class ModuleHead extends Module {

	ArrayList<Module> modules = new ArrayList<Module>();

	ModelRenderer head;

	float headStartAngleX, headStartAngleY;

	public ModuleHead(ModelRenderer head) {
		this.head = head;
		headStartAngleX = head.rotateAngleX;
		headStartAngleY = head.rotateAngleY;
	}

	@Override
	public void walk(EntityPixelmon entity, float f, float f1, float f2, float rotateAnglePitch, float rotateAngleYaw) {
		head.rotateAngleX = rotateAngleYaw * toRadians + headStartAngleX;
		head.rotateAngleY = rotateAnglePitch * toRadians + headStartAngleY;
		for (Module m : modules)
			m.walk(entity, f, f1, f2, rotateAnglePitch, rotateAngleYaw);
	}

}
