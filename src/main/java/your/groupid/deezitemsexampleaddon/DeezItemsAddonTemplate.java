package your.groupid.deezitemsexampleaddon;

import dev.luminescent.deezitems.DeezItems;
import dev.luminescent.deezitems.manager.ItemManager;
import dev.luminescent.deezitems.manager.MaterialManager;
import dev.luminescent.deezitems.utils.ItemRarity;
import org.bukkit.plugin.java.JavaPlugin;
import your.groupid.deezitemsexampleaddon.items.ExampleItem;
import your.groupid.deezitemsexampleaddon.items.ExampleMaterial;

public final class DeezItemsAddonTemplate extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        registerItems();
        registerCustomRaritys();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public void registerItems() {
        ItemManager itemManager = DeezItems.getInstance().getManager(ItemManager.class);
        itemManager.registerItem(new ExampleItem());
    }

    public void registerMaterials(){
        MaterialManager materialManager = DeezItems.getInstance().getManager(MaterialManager.class);
        materialManager.registerMaterial(new ExampleMaterial());
    }

    public void registerCustomRaritys() {
        // Register custom raritys here
        ItemRarity.Raritys.put("Example_Rarity", "#0017ff");
    }

}
