package your.groupid.deezitemsexampleaddon;

import dev.luminescent.deezitems.manager.ItemManager;
import org.bukkit.plugin.java.JavaPlugin;
import dev.luminescent.deezitems.DeezItems;
import dev.luminescent.deezitems.utils.ItemRarity;
import your.groupid.deezitemsexampleaddon.items.ExampleItem;

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

    public void registerItems(){
        ItemManager itemManager = DeezItems.getInstance().getManager(ItemManager.class);
        itemManager.registerItem(new ExampleItem());
    }

    public void registerCustomRaritys(){
        // Register custom raritys here
        ItemRarity.Raritys.put("Example_Rarity", "#0017ff");
    }

}
