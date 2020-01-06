package com.github.curriculeon.assessment2.collections.inventory;

import com.github.curriculeon.assessment2.collections.Inventory;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveItemFromInventory {
    @Test
    public void test1() {
        String itemToBeRemoved = "Football";
        String[] itemsTobeAdded = {"Baseball", "Baseball", "Basketball", itemToBeRemoved};
        test(itemsTobeAdded, itemToBeRemoved);
    }


    @Test
    public void test2() {
        String itemToBeRemoved = "Baseball";
        String[] itemsTobeAdded = {itemToBeRemoved, itemToBeRemoved, "Basketball", "Football"};
        test(itemsTobeAdded, itemToBeRemoved);
    }

    @Test
    public void test3() {
        String itemToBeRemoved = "Basketball";
        String[] itemsTobeAdded = {"Baseball", "Baseball", itemToBeRemoved, "Football"};
        test(itemsTobeAdded, itemToBeRemoved);
    }


    private void test(String[] itemsToAddToInventory, String itemToRemove) {
        // given
        Inventory inventory = new Inventory(new ArrayList<>(Arrays.asList(itemsToAddToInventory)));

        int preRemovalQuantity = inventory.getItemQuantity(itemToRemove);
        int expectedPostRemovalQuantity = preRemovalQuantity - 1;

        // when
        inventory.removeItemFromInventory(itemToRemove);
        int actualPostRemovalQuantity = inventory.getItemQuantity(itemToRemove);

        // then
        Assert.assertEquals(expectedPostRemovalQuantity, actualPostRemovalQuantity);
    }
}
