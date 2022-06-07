package com.example.riyutakesciv.datagen;

import com.example.riyutakesciv.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import com.example.riyutakesciv.RiyutakesCiv;
import net.minecraftforge.common.data.ExistingFileHelper;

public class RCItemModels extends ItemModelProvider {

    public RCItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper){
        super(generator, RiyutakesCiv.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        withExistingParent(Registration.MITHRIL_ORE_ITEM.get().getRegistryName().getPath(), modLoc("block/mithril_ore.png"));
    }
}
