package dev.kir.sync.client.render;


import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.BufferBuilderStorage;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.render.Shader;
import net.minecraft.client.render.item.HeldItemRenderer;
import net.minecraft.resource.ResourceManager;
import net.minecraft.util.math.Matrix4f;

@Environment(EnvType.CLIENT)


public final class CustomGameRenderer extends GameRenderer {
    
    private static Shader renderTypeEntityTranslucentPartiallyTextured = null;
    private static Shader renderTypeVoxelShader = null;

    private CustomGameRenderer(MinecraftClient client, HeldItemRenderer heldItemRenderer, ResourceManager resourceManager, BufferBuilderStorage buffers) {
        super(client, heldItemRenderer, resourceManager, buffers);
    }

    public static void setRenderTypeEntityTranslucentPartiallyTexturedShader(Shader shader) {
        renderTypeEntityTranslucentPartiallyTextured = shader;
    }
    

    public static Shader getRenderTypeEntityTranslucentPartiallyTexturedShader() {
        return renderTypeEntityTranslucentPartiallyTextured;
    }

    public static void setRenderTypeVoxelShader(Shader shader) {
        renderTypeVoxelShader = shader;
    }

    public static Shader getRenderTypeVoxelShader() {
        return renderTypeVoxelShader;
    }

    public static void initClient() { }

}