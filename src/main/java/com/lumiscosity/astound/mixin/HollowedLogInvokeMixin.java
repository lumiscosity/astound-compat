package com.lumiscosity.astound.mixin;

import net.frozenblock.wilderwild.registry.RegisterBlocks;
import net.minecraft.block.MapColor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(RegisterBlocks.class)
public class HollowedLogInvokeMixin {
    @Mixin(RegisterBlocks.class)
    public interface HollowedLogInvoker {
        @Invoker("createHollowedLogBlock")
        public static void invokeCreateHollowedLogBlock(MapColor topMapColor, MapColor sideMapColor) {
            throw new AssertionError();
        }
        @Invoker("createStrippedHollowedLogBlock")
        public static void invokeCreateStrippedHollowedLogBlock(MapColor topMapColor, MapColor sideMapColor) {
            throw new AssertionError();
        }
    }
}
