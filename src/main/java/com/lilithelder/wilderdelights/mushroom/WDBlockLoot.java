package com.lilithelder.wilderdelights.mushroom;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.frozenblock.wilderwild.registry.WWBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.level.block.Block;
import vectorwing.farmersdelight.data.loot.FDBlockLoot;

import java.util.concurrent.CompletableFuture;

public class WDBlockLoot extends FDBlockLoot {
    public WDBlockLoot(FabricPackOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        this.add((Block) WDPaleMushroomColony.Pale_Mushroom_Colony, (block) -> this.mushroomColony(block, WDPaleMushroomColony.Pale_Mushroom_Colony_Item));
        super.generate();
    }
}
