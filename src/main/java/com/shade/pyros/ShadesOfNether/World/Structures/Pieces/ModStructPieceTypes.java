package com.shade.pyros.ShadesOfNether.World.Structures.Pieces;

import java.util.Locale;

import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.structure.IStructurePieceType;

public class ModStructPieceTypes {
	public static IStructurePieceType ASHER_MINE = register(AsherMinePiece.Piece::new, "ASHER_P");
			
	static IStructurePieceType register(IStructurePieceType p_214750_0_, String key) {
		return Registry.register(Registry.STRUCTURE_PIECE, key.toLowerCase(Locale.ROOT), p_214750_0_);
	}
}
