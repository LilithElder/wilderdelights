package com.lilithelder.wilderdelights;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.frozenblock.wilderwild.registry.WWBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.tags.TagAppender;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagBuilder;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class WDBlockTagsProvider extends FabricTagsProvider.BlockTagsProvider {
    public WDBlockTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        valueLookupBuilder(WDTags.Blocks.Hibiscus)
                .add(WWBlocks.RED_HIBISCUS)
                .add(WWBlocks.PURPLE_HIBISCUS)
                .add(WWBlocks.YELLOW_HIBISCUS)
                .add(WWBlocks.WHITE_HIBISCUS)
                .add(WWBlocks.PINK_HIBISCUS)
        ;
    }

}
