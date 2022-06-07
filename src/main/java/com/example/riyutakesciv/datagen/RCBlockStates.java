package com.example.riyutakesciv.datagen;

import com.example.riyutakesciv.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import com.example.riyutakesciv.RiyutakesCiv;

public class RCBlockStates extends BlockStateProvider {

    public RCBlockStates(DataGenerator gen, ExistingFileHelper helper) { super(gen, RiyutakesCiv.MODID, helper); }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(Registration.MITHRIL_ORE.get());
    }
}
