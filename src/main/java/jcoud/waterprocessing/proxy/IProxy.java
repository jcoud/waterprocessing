package jcoud.waterprocessing.proxy;

import net.minecraft.item.Item;

public interface IProxy {
    public void registerItemRenderer(Item item, int meta, String id);
}
