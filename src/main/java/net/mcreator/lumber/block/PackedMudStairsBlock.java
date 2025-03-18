
package net.mcreator.lumber.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class PackedMudStairsBlock extends StairBlock {
	public PackedMudStairsBlock() {
		super(() -> Blocks.AIR.defaultBlockState(), BlockBehaviour.Properties.of().sound(SoundType.PACKED_MUD).strength(1f, 3f));
	}

	@Override
	public float getExplosionResistance() {
		return 3f;
	}

	@Override
	public boolean isRandomlyTicking(BlockState state) {
		return false;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}
}