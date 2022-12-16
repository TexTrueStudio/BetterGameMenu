package net.morimori.bettergamemenu.mixin;

//import net.minecraft.client.gui.FocusableGui;

import net.minecraft.client.gui.AbstractParentElement;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraftforge.fml.client.gui.screen.ModListScreen;
import net.morimori.bettergamemenu.ClientConfig;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Screen.class)
public abstract class ScreenMixin extends AbstractParentElement {
    @Shadow
    public abstract void renderDirtBackground(int vOffset);

    @Inject(method = "renderBackground(Lnet/minecraft/client/util/math/MatrixStack;I)V", at = @At("TAIL"), cancellable = true)
    private void renderBackground(MatrixStack matrixStack, int vOffset, CallbackInfo ci) {
        Screen screen = (Screen) (Object) this;
        if (screen instanceof ModListScreen && ClientConfig.RenderModListBackground.get()) {
            ci.cancel();
            this.renderDirtBackground(vOffset);
        }
    }
}
