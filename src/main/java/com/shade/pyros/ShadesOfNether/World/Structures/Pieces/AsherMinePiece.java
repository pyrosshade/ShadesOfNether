package com.shade.pyros.ShadesOfNether.World.Structures.Pieces;

import java.util.List;
import java.util.Map;
import java.util.Random;

import com.google.common.collect.ImmutableMap;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.Mirror;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.IWorld;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.structure.IStructurePieceType;
import net.minecraft.world.gen.feature.structure.StructurePiece;
import net.minecraft.world.gen.feature.structure.TemplateStructurePiece;
import net.minecraft.world.gen.feature.template.BlockIgnoreStructureProcessor;
import net.minecraft.world.gen.feature.template.PlacementSettings;
import net.minecraft.world.gen.feature.template.Template;
import net.minecraft.world.gen.feature.template.TemplateManager;

public class AsherMinePiece{

	   private static final ResourceLocation field_202592_e = new ResourceLocation("shadesofnether:asher_mine");
	   private static final Map<ResourceLocation, BlockPos> field_207622_e = ImmutableMap.of(field_202592_e, BlockPos.ZERO);

	   public static void func_207617_a(TemplateManager p_207617_0_, BlockPos p_207617_1_, Rotation p_207617_2_, List<StructurePiece> p_207617_3_, Random p_207617_4_, NoFeatureConfig p_207617_5_) {
		   p_207617_3_.add(new AsherMinePiece.Piece(p_207617_0_, field_202592_e, p_207617_1_, p_207617_2_, 0));
	   }

	   public static class Piece extends TemplateStructurePiece {
	      private final ResourceLocation field_207615_d;
	      private final Rotation field_207616_e;

	      public Piece(TemplateManager p_i49313_1_, ResourceLocation p_i49313_2_, BlockPos p_i49313_3_, Rotation p_i49313_4_, int p_i49313_5_) {
	         super(ModStructPieceTypes.ASHER_MINE, 0);
	         this.field_207615_d = p_i49313_2_;
	         BlockPos blockpos = AsherMinePiece.field_207622_e.get(p_i49313_2_);
	         this.templatePosition = p_i49313_3_.add(blockpos.getX(), blockpos.getY() - p_i49313_5_, blockpos.getZ());
	         this.field_207616_e = p_i49313_4_;
	         this.func_207614_a(p_i49313_1_);
	      }

	      public Piece(TemplateManager p_i50566_1_, CompoundNBT p_i50566_2_) {
	         super(ModStructPieceTypes.ASHER_MINE, p_i50566_2_);
	         this.field_207615_d = new ResourceLocation(p_i50566_2_.getString("Template"));
	         this.field_207616_e = Rotation.valueOf(p_i50566_2_.getString("Rot"));
	         this.func_207614_a(p_i50566_1_);
	      }

	      private void func_207614_a(TemplateManager p_207614_1_) {
	         Template template = p_207614_1_.getTemplateDefaulted(this.field_207615_d);
	         PlacementSettings placementsettings = (new PlacementSettings()).setRotation(this.field_207616_e).setMirror(Mirror.NONE).addProcessor(BlockIgnoreStructureProcessor.STRUCTURE_BLOCK);
	         this.setup(template, this.templatePosition, placementsettings);
	      }

	      /**
	       * (abstract) Helper method to read subclass data from NBT
	       */
	      protected void readAdditional(CompoundNBT tagCompound) {
	         super.readAdditional(tagCompound);
	         tagCompound.putString("Template", this.field_207615_d.toString());
	         tagCompound.putString("Rot", this.field_207616_e.name());
	      }

	      protected void handleDataMarker(String function, BlockPos pos, IWorld worldIn, Random rand, MutableBoundingBox sbb) {
	         //if ("blaze".equals(function)) { // Not doing chests just yet
	         //   worldIn.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
	         //   TileEntity tileentity = worldIn.getTileEntity(pos.down());
	         //   if (tileentity instanceof DispenserTileEntity) {
	         //      ((DispenserTileEntity)tileentity).setLootTable(LootTables.CHESTS_IGLOO_CHEST, rand.nextLong());
	         //   }
	         //}
	      }

	      /**
	       * second Part of Structure generating, this for example places Spiderwebs, Mob Spawners, it closes Mineshafts at
	       * the end, it adds Fences...
	       */
	      public boolean addComponentParts(IWorld worldIn, Random randomIn, MutableBoundingBox structureBoundingBoxIn, ChunkPos p_74875_4_) {
	         PlacementSettings placementsettings = (new PlacementSettings()).setRotation(this.field_207616_e).setMirror(Mirror.NONE).addProcessor(BlockIgnoreStructureProcessor.STRUCTURE_BLOCK);
	         BlockPos blockpos = AsherMinePiece.field_207622_e.get(this.field_207615_d);
	         BlockPos blockpos1 = this.templatePosition.add(Template.transformedBlockPos(placementsettings, new BlockPos(3 - blockpos.getX(), 0, 0 - blockpos.getZ())));
	         int i = worldIn.getHeight(Heightmap.Type.WORLD_SURFACE_WG, blockpos1.getX(), blockpos1.getZ());
	         BlockPos blockpos2 = this.templatePosition;
	         this.templatePosition = this.templatePosition.add(0, i - 90 - 1, 0);
	         boolean flag = super.addComponentParts(worldIn, randomIn, structureBoundingBoxIn, p_74875_4_);
	         this.templatePosition = blockpos2;
	         return flag;
	      }
	   }
}
