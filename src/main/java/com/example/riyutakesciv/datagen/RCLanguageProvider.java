package com.example.riyutakesciv.datagen;

import com.example.riyutakesciv.RiyutakesCiv;
import com.example.riyutakesciv.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class RCLanguageProvider extends LanguageProvider {

    public RCLanguageProvider(DataGenerator gen, String locale) { super(gen, RiyutakesCiv.MODID, locale);}

    @Override
    protected void addTranslations() {
        add("itemGroup." + RiyutakesCiv.TAB_NAME, "Tutorial");

        add(Registration.MITHRIL_ORE.get(), "Mithril Ore");
    }
}
