
package net.mcreator.lumber.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class PackedMudSlabBlock extends SlabBlock {
	public PackedMudSlabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.PACKED_MUD).strength(1f, 3f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}
}