package jcoud.waterprocessing.base.items;

import jcoud.waterprocessing.WaterProcessing_main;
import jcoud.waterprocessing.utils.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {
    public ItemBase(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MISC);

        items_list.ITEMS.add(this);
    }
    @Override
    public void registerModels() {
        WaterProcessing_main.proxy.registerItemRenderer(this, 0, "inventory");
    }

}
