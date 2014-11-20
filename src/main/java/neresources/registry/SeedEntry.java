package neresources.registry;

import neresources.api.entry.ISeedEntry;
import neresources.api.utils.KeyGen;
import net.minecraft.item.ItemStack;

public class SeedEntry implements ISeedEntry
{
    private ItemStack seed;
    private int itemWeight;

    public SeedEntry(ItemStack seed, int itemWeight)
    {
        this.seed = seed;
        this.itemWeight = itemWeight;
    }

    @Override
    public ItemStack getDrop()
    {
        return seed;
    }

    @Override
    public int getWeight()
    {
        return itemWeight;
    }

    @Override
    public String getKey()
    {
        return KeyGen.getKey(seed);
    }
}