package com.homy.rest.dao;

import com.homy.rest.model.Item;
import org.springframework.stereotype.Repository;

import com.homy.rest.model.Items;

@Repository
public class ItemDAO
{
    private static Items list = new Items();

    static
    {
        list.getItemList().add(new Item(1, "Cheese1", "good cheese", "$50"));
        list.getItemList().add(new Item(2, "Cheese2", "good cheese", "$60"));
        list.getItemList().add(new Item(3, "Cheese3", "good cheese", "$80"));
    }

    public Items getAllItems()
    {
        return list;
    }

    public void addItem(Item item) {
        list.getItemList().add(item);
    }
}


