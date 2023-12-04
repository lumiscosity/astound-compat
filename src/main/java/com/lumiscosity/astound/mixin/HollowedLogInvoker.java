package com.lumiscosity.astound.mixin;

import net.frozenblock.wilderwild.block.HollowedLogBlock;
import net.frozenblock.wilderwild.registry.RegisterBlocks;
import net.minecraft.block.MapColor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(RegisterBlocks.class)
public interface HollowedLogInvoker {
    @Invoker("createHollowedLogBlock")
    static HollowedLogBlock invokeCreateHollowedLogBlock(MapColor topMapColor, MapColor sideMapColor) {
        throw new AssertionError();
    }
    @Invoker("createStrippedHollowedLogBlock")
    static HollowedLogBlock invokeCreateStrippedHollowedLogBlock(MapColor mapColor) {
        throw new AssertionError();
    }
}
