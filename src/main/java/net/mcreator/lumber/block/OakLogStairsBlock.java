
package net.mcreator.lumber.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class OakLogStairsBlock extends StairBlock {
	public OakLogStairsBlock() {
		super(() -> Blocks.AIR.defaultBlockState(), BlockBehaviour.Properties.of().ignitedByLava().instrument(NoteBlockInstrument.BASS).sound(SoundType.WOOD).strength(2f));
	}

	@Override
	public float getExplosionResistance() {
		return 2f;
	}

	@Override
	public boolean isRandomlyTicking(BlockState state) {
		return false;
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 5;
	}
}