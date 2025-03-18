
package net.mcreator.lumber.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class PackedMudSlabBlock extends SlabBlock {
	public PackedMudSlabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.PACKED_MUD).strength(1f, 3f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}
}
