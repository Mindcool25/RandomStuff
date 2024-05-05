package xyz.mindcool;

import net.fabricmc.api.ModInitializer;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RandomStuff implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("random-stuff");

	// Example block def
	public static final Block TEST_BLOCK = new Block(Block.Settings.create().strength(4.0f).requiresTool());

	// Example item def
	public static final Item TEST_ITEM = new Item(new Item.Settings());

	@Override
	public void onInitialize() {
		LOGGER.info("Random Stuff initialized");
		Registry.register(Registries.BLOCK, new Identifier("random-stuff", "test_block"), TEST_BLOCK);
		Registry.register(Registries.ITEM, new Identifier("random-stuff", "test_block"), new BlockItem(TEST_BLOCK, new Item.Settings()));

		Registry.register(Registries.ITEM, new Identifier("random-stuff", "test_item"), TEST_ITEM);
	}
}