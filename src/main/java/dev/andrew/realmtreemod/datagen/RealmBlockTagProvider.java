package dev.andrew.realmtreemod.datagen;

import dev.andrew.realmtreemod.block.InitBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class RealmBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public RealmBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }
    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(InitBlocks.ELF_LOG)
                .add(InitBlocks.IRONWOOD_LOG)
                .add(InitBlocks.EVILWOOD_LOG)
                .add(InitBlocks.BlACKWILLOW_LOG)
                .add(InitBlocks.MITHRIL_LOG)
                .add(InitBlocks.BLUECRYSTAL_LOG)
                .add(InitBlocks.DROW_LOG)
                .add(InitBlocks.PINE_LOG)
                .add(InitBlocks.SILVER_LOG)
                .add(InitBlocks.SUNELF_LOG)
                .add(InitBlocks.UATHAR_LOG)
                .add(InitBlocks.OUFYEW_LOG)
                .add(InitBlocks.AYIFER_LOG)
                .add(InitBlocks.MITHRIL_LEAVES)
                .add(InitBlocks.IORANY_LOG)
                .add(InitBlocks.SHADOW_FIR_LOG)
                .add(InitBlocks.DARKELF_LOG)
                .add(InitBlocks.YEZHOVE_LOG)
                .add(InitBlocks.EDLIFER_LOG)
                .add(InitBlocks.KLINWOOD_LOG)
                .add(InitBlocks.GREEN_FIR_LOG)
                .add(InitBlocks.ASHRET_LOG)
                .add(InitBlocks.SUNELF_LEAVES)
                .add(InitBlocks.DARKELF_LEAVES)
                .add(InitBlocks.WEEPING_LOG)
                .add(InitBlocks.OTHON_LOG)
                .add(InitBlocks.ALOGRORN_LOG)
                .add(InitBlocks.EIKEW_LOG)
                .add(InitBlocks.DLONET_LOG)
                .add(InitBlocks.DIRE_LOG)
                .add(InitBlocks.MITHRIL_PLANKS)
                .add(InitBlocks.MITHRIL_PLANKS_SLAB)
                .add(InitBlocks.DROW_PLANKS)
                .add(InitBlocks.DROW_PLANKS_SLAB)
                .add(InitBlocks.DROW_PLANKS_FENCE)
                .add(InitBlocks.CRYSTAL_PLANKS)
                .add(InitBlocks.CRYSTAL_SLAB)
                .add(InitBlocks.CRYSTAL_FENCE)
                .add(InitBlocks.ASHRET_PLANKS)
                .add(InitBlocks.ASHRET_FENCE)
                .add(InitBlocks.ASHRET_SLAB)
                .add(InitBlocks.ELF_PLANKS)
                .add(InitBlocks.ELF_FENCE)
                .add(InitBlocks.ALOGRORN_PLANKS)
                .add(InitBlocks.ALOGRORN_FENCE)
                .add(InitBlocks.DIRE_PLANKS)
                .add(InitBlocks.DIRE_FENCE)
                .add(InitBlocks.DIRE_SLAB)
                .add(InitBlocks.ELF_SLAB)
                .add(InitBlocks.DROW_WALL_SIGN)
                .add(InitBlocks.BlACKWALNUT_LOG);



        getOrCreateTagBuilder(BlockTags.LOGS)
                .add(InitBlocks.SHADOW_FIR_LOG)
                .add(InitBlocks.SUNELF_LOG)
                .add(InitBlocks.EVILWOOD_LOG)
                .add(InitBlocks.IRONWOOD_LOG)
                .add(InitBlocks.ELF_LOG)
                .add(InitBlocks.SILVER_LOG)
                .add(InitBlocks.PINE_LOG)
                .add(InitBlocks.DROW_LOG)
                .add(InitBlocks.BLUECRYSTAL_LOG)
                .add(InitBlocks.MITHRIL_LOG)
                .add(InitBlocks.BlACKWILLOW_LOG)
                .add(InitBlocks.UATHAR_LOG)
                .add(InitBlocks.OUFYEW_LOG)
                .add(InitBlocks.AYIFER_LOG)
                .add(InitBlocks.IORANY_LOG)
                .add(InitBlocks.DARKELF_LOG)
                .add(InitBlocks.YEZHOVE_LOG)
                .add(InitBlocks.EDLIFER_LOG)
                .add(InitBlocks.KLINWOOD_LOG)
                .add(InitBlocks.GREEN_FIR_LOG)
                .add(InitBlocks.ASHRET_LOG)
                .add(InitBlocks.WEEPING_LOG)
                .add(InitBlocks.OTHON_LOG)
                .add(InitBlocks.ALOGRORN_LOG)
                .add(InitBlocks.EIKEW_LOG)
                .add(InitBlocks.DLONET_LOG)
                .add(InitBlocks.DIRE_LOG)
                .add(InitBlocks.BlACKWALNUT_LOG);

        getOrCreateTagBuilder(BlockTags.LEAVES)
                .add(InitBlocks.DARKELF_LEAVES)
                .add(InitBlocks.SUNELF_LEAVES)
                .add(InitBlocks.EVIL_LEAVES)
                .add(InitBlocks.CRYSTAL_LEAVES)
                .add(InitBlocks.SILVER_LEAVES)
                .add(InitBlocks.MITHRIL_LEAVES);

        getOrCreateTagBuilder(BlockTags.PLANKS)
                .add(InitBlocks.DIRE_PLANKS)
                .add(InitBlocks.ALOGRORN_PLANKS)
                .add(InitBlocks.ELF_PLANKS)
                .add(InitBlocks.ASHRET_PLANKS)
                .add(InitBlocks.CRYSTAL_PLANKS)
                .add(InitBlocks.DROW_PLANKS)
                .add(InitBlocks.MITHRIL_PLANKS);


        getOrCreateTagBuilder(BlockTags.SLABS)
                .add(InitBlocks.ELF_SLAB)
                .add(InitBlocks.DIRE_SLAB)
                .add(InitBlocks.ASHRET_SLAB)
                .add(InitBlocks.CRYSTAL_SLAB)
                .add(InitBlocks.DROW_PLANKS_SLAB)
                .add(InitBlocks.MITHRIL_PLANKS_SLAB);


        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(InitBlocks.DIRE_FENCE)
                .add(InitBlocks.ALOGRORN_FENCE)
                .add(InitBlocks.ELF_FENCE)
                .add(InitBlocks.ASHRET_FENCE)
                .add(InitBlocks.CRYSTAL_FENCE)
                .add(InitBlocks.DROW_PLANKS_FENCE)
                .add(InitBlocks.MITHRIL_PLANKS_FENCE);

        getOrCreateTagBuilder(BlockTags.WALL_SIGNS)
                .add(InitBlocks.DROW_WALL_SIGN);







    }
}
