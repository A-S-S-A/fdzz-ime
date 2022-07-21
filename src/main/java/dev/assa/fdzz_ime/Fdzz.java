package dev.assa.fdzz_ime;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Fdzz implements ModInitializer {
    private static final Logger LOGGER = LoggerFactory.getLogger("dev.assa.fdzz_ime");

    @Override
    public void onInitialize() {
        LOGGER.info("Fdzz IME is loaded!");
    }
}
