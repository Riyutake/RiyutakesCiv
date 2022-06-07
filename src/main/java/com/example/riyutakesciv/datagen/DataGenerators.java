package com.example.riyutakesciv.datagen;

import com.example.riyutakesciv.RiyutakesCiv;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = RiyutakesCiv.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        if (event.includeServer()){
            generator.addProvider(new RCRecipes(generator));
            generator.addProvider(new RCLootTables(generator));
            RCBlockTags blockTags = new RCBlockTags(generator, event.getExistingFileHelper());

            generator.addProvider(blockTags);
            generator.addProvider(new RCItemTags(generator, blockTags, event.getExistingFileHelper()));
        }

        if (event.includeClient()){
            generator.addProvider(new RCBlockStates(generator, event.getExistingFileHelper()));
            generator.addProvider(new RCItemModels(generator, event.getExistingFileHelper()));
            generator.addProvider(new RCLanguageProvider(generator, "en_us"));
        }
    }
}
