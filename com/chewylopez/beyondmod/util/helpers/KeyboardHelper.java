package com.chewylopez.beyondmod.util.helpers;

import org.lwjgl.glfw.GLFW;

import net.minecraft.client.Minecraft;
import net.minecraft.client.util.InputMappings;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class KeyboardHelper {

	
	private static final long WINDOW = Minecraft.getInstance().getMainWindow().getHandle();
	@OnlyIn(Dist.CLIENT)
	public static boolean IsHoldingShift() {
		return InputMappings.isKeyDown(WINDOW, GLFW.GLFW_KEY_LEFT_SHIFT) || InputMappings.isKeyDown(WINDOW, GLFW.GLFW_KEY_RIGHT_SHIFT);
	}
	@OnlyIn(Dist.CLIENT)
	public static boolean IsHoldingCtrl() {
		return InputMappings.isKeyDown(WINDOW, GLFW.GLFW_KEY_LEFT_CONTROL) || InputMappings.isKeyDown(WINDOW, GLFW.GLFW_KEY_RIGHT_CONTROL);
	}
	@OnlyIn(Dist.CLIENT)
	public static boolean hasSpaceBeenPressed() {
		return InputMappings.isKeyDown(WINDOW, GLFW.GLFW_KEY_SPACE);
	}
}
