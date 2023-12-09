package com.lumiscosity.astound.frozenlib;

import net.frozenblock.lib.integration.api.ModIntegration;
import net.frozenblock.lib.integration.api.ModIntegrationSupplier;
import net.frozenblock.lib.integration.api.ModIntegrations;

public class RegisterThroughIntegration {
    // some mods don't give us direct access to blocks
    // as a public static final we can import, meaning we can't add them to registries
    // or have remapping conflicts (biomemakeover)
    // or are packaged as nested jars, so we can't modrinth maven em (cinderscapes and traverse)
    // we can't add them to various registries without getting them from the registry,
    // which requires the mods to be loaded first.
    // unfortunately, fabric lacks load orders by design, which tbh is an awful move
    // fortunately, frozenlib provides a mod integration api that gives us load orders anyways
    // modders do what fabricdon't i guess?
}
