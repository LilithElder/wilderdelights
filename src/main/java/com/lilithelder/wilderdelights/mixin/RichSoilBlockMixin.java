package com.lilithelder.wilderdelights.mixin;

import com.lilithelder.wilderdelights.mushroom.WDPaleMushroomColony;
import net.frozenblock.wilderwild.registry.WWBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import vectorwing.farmersdelight.common.block.RichSoilBlock;

@Mixin(RichSoilBlock.class)
public abstract class RichSoilBlockMixin extends Block {
    public RichSoilBlockMixin(Properties properties) {
        super(properties);
    }

    @Inject(method = "convertMushroomToColony",at = @At("HEAD"),cancellable = true)
    public void convertMushroomToColony(BlockState targetState, BlockPos targetPos, ServerLevel level, CallbackInfoReturnable<Boolean> cir) {
        if (targetState.is(WWBlocks.PALE_MUSHROOM)) {
            level.setBlockAndUpdate(targetPos, ((Block) WDPaleMushroomColony.Pale_Mushroom_Colony).defaultBlockState());{
                cir.setReturnValue(true);
            }
        }
    }
}
