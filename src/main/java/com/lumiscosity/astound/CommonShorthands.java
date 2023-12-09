package com.lumiscosity.astound;

import net.fabricmc.fabric.api.event.registry.RegistryEntryAddedCallback;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

public class CommonShorthands {
    public static Block fromID(String id) {
        return Registries.BLOCK.get(Identifier.tryParse(id));
    }
}
