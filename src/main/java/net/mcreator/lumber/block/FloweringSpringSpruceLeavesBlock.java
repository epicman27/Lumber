
package net.mcreator.lumber.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class FloweringSpringSpruceLeavesBlock extends LeavesBlock {
	public FloweringSpringSpruceLeavesBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.WET_GRASS).strength(1f, 0.2f).noOcclusion());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 1;
	}
}
