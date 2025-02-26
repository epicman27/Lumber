
package net.mcreator.lumber.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FenceBlock;

public class PolishedCrimsonFenceBlock extends FenceBlock {
	public PolishedCrimsonFenceBlock() {
		super(BlockBehaviour.Properties.of().ignitedByLava().instrument(NoteBlockInstrument.BASS).sound(SoundType.STEM).strength(2f, 3f).forceSolidOn());
	}
}
