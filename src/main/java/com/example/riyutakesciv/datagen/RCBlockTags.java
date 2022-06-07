package com.example.riyutakesciv.datagen;

import com.example.riyutakesciv.RiyutakesCiv;
import com.example.riyutakesciv.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class RCBlockTags extends BlockTagsProvider {

    public RCBlockTags(DataGenerator generator, ExistingFileHelper helper){
        super(generator, RiyutakesCiv.MODID, helper);
    }

    @Override
    protected void addTags() {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(Registration.MITHRIL_ORE.get());
        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(Registration.MITHRIL_ORE.get());
        tag(Tags.Blocks.ORES)
                .add(Registration.MITHRIL_ORE.get());
    }
}
