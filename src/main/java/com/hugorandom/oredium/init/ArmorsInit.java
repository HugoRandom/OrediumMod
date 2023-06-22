package com.hugorandom.oredium.init;

import com.hugorandom.oredium.Oredium;
import com.hugorandom.oredium.armors.Armor;
import com.hugorandom.oredium.armors.ArmorTier;
import com.hugorandom.oredium.armors.ArmorU;
import com.hugorandom.oredium.tools.*;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ArmorsInit {

    public static final DeferredRegister<Item> ARMORS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Oredium.MOD_ID);

    public static void register(IEventBus eventBus)
    {
        registerFullSet("disprosio", ArmorTier.DISPROSIO);
        registerFullSet("franitolina", ArmorTier.FRANITOLINA);
        registerFullSet("melitonila", ArmorTier.MELITONILA);
        registerFullSet("terium", ArmorTier.TERIUM);
        registerFullSet("alezarita", ArmorTier.ALEZARITA);
        registerFullSet("halinox", ArmorTier.HALINOX);
        registerFullSet("miguelitio", ArmorTier.MIGUELITIO);
        registerFullSetUpgraded("disprosio", ArmorTier.DISPROSIO_UPGRADED);
        registerFullSetUpgraded("franitolina", ArmorTier.FRANITOLINA_UPGRADED);
        registerFullSetUpgraded("melitonila", ArmorTier.MELITONILA_UPGRADED);
        registerFullSetUpgraded("terium", ArmorTier.TERIUM_UPGRADED);
        registerFullSetUpgraded("alezarita", ArmorTier.ALEZARITA_UPGRADED);
        registerFullSetUpgraded("halinox", ArmorTier.HALINOX_UPGRADED);
        registerFullSetUpgraded("miguelitio", ArmorTier.MIGUELITIO_UPGRADED);
        ARMORS.register(eventBus);
    }

    private static void registerFullSet(String prefix, ArmorMaterial material) {
        ARMORS.register(prefix + "_helmet", () -> new Armor(material, EquipmentSlot.HEAD));
        ARMORS.register(prefix + "_chestplate", () -> new Armor(material, EquipmentSlot.CHEST));
        ARMORS.register(prefix + "_leggings", () -> new Armor(material, EquipmentSlot.LEGS));
        ARMORS.register(prefix + "_boots", () -> new Armor(material, EquipmentSlot.FEET));
    }

    private static void registerFullSetUpgraded(String prefix, ArmorMaterial material) {
        ARMORS.register(prefix + "_helmet_upgraded", () -> new ArmorU(material, EquipmentSlot.HEAD));
        ARMORS.register(prefix + "_chestplate_upgraded", () -> new ArmorU(material, EquipmentSlot.CHEST));
        ARMORS.register(prefix + "_leggings_upgraded", () -> new ArmorU(material, EquipmentSlot.LEGS));
        ARMORS.register(prefix + "_boots_upgraded", () -> new ArmorU(material, EquipmentSlot.FEET));
    }
}
