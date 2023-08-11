package net.magne.nf.item;

import net.magne.nf.NucoreFoundation;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, NucoreFoundation.ID);

    public static final RegistryObject<Item> SULFUR_POWDER = ITEMS.register("sulfur_powder",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BLUEPRINT = registerBlueprint("blueprint");

    public static final RegistryObject<Item> BLUEPRINT_BOOK = registerBlueprint("blueprint_book");

    public static final RegistryObject<Item> MACHINE_BLUEPRINT = registerBlueprint("machine_blueprint");

    public static final RegistryObject<Item> FLUID_BLUEPRINT = registerBlueprint("fluid_blueprint");
    public static final RegistryObject<Item> MATERIAL_BLUEPRINT = registerBlueprint("material_blueprint");
    public static final RegistryObject<Item> BAUXITE_INGOT = registerIngot("bauxite_ingot");
    public static final RegistryObject<Item> COBALT_INGOT = registerIngot("cobalt_ingot");
    public static final RegistryObject<Item> LITHIUM_INGOT = registerIngot("lithium_ingot");
    public static final RegistryObject<Item> MAGNESIUM_INGOT = registerIngot("magnesium_ingot");

    public static <T extends Item> RegistryObject<T> registerIngot(String name) {
        ITEMS.register(name,
                () -> new Item(new Item.Properties()));

        return null;
    }

    public static <T extends Item> RegistryObject<T> registerBlueprint(String name) {
        ITEMS.register(name,
                () -> new Item(new Item.Properties()
                        .stacksTo(16)));

        return null;
    }




    public static void register(IEventBus eventBus) {ITEMS.register(eventBus);}

}
