package com.shade.pyros.ShadesOfNether.gui.screen;

import com.mojang.blaze3d.platform.GlStateManager;
import com.shade.pyros.ShadesOfNether.Containers.ModVanillaCraftContainer;

import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class VanillaCraftingScreen extends ContainerScreen<ModVanillaCraftContainer>{
    private static final ResourceLocation CRAFTING_TABLE_GUI_TEXTURES = new ResourceLocation("textures/gui/container/crafting_table.png");
    

    public VanillaCraftingScreen(ModVanillaCraftContainer p_i51094_1_, PlayerInventory p_i51094_2_, ITextComponent p_i51094_3_) {
        super(p_i51094_1_, p_i51094_2_, p_i51094_3_);
    }

    public void render(int p_render_1_, int p_render_2_, float p_render_3_) {
       this.renderBackground();
       super.render(p_render_1_, p_render_2_, p_render_3_);
       this.renderHoveredToolTip(p_render_1_, p_render_2_);
    }


    protected void drawGuiContainerForegroundLayer(int p_146979_1_, int p_146979_2_) {
        this.font.drawString(this.title.getFormattedText(), 28.0F, 6.0F, 4210752);
        this.font.drawString(this.playerInventory.getDisplayName().getFormattedText(), 8.0F, (float)(this.ySize - 96 + 2), 4210752);
    }

    protected void drawGuiContainerBackgroundLayer(float p_146976_1_, int p_146976_2_, int p_146976_3_) {
        GlStateManager.color4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.minecraft.getTextureManager().bindTexture(CRAFTING_TABLE_GUI_TEXTURES);
        int lvt_4_1_ = this.guiLeft;
        int lvt_5_1_ = (this.height - this.ySize) / 2;
        this.blit(lvt_4_1_, lvt_5_1_, 0, 0, this.xSize, this.ySize);
    }

    @Override
    public void removed() {
        super.removed();
    }

}