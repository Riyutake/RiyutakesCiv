package com.example.riyutakesciv.datagen;

import com.example.riyutakesciv.RiyutakesCiv;
import com.example.riyutakesciv.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class RCItemTags extends ItemTagsProvider {

    public RCItemTags(DataGenerator generator, BlockTagsProvider blockTags, ExistingFileHelper helper) {
        super(generator, blockTags, RiyutakesCiv.MODID, helper);
    }

    @Override
    protected void addTags() {
        tag(Tags.Items.ORES)
                .add(Registration.MITHRIL_ORE_ITEM.get());
    }

    @Override
    public String getName() { return "Tutorial Tags"; }
}
