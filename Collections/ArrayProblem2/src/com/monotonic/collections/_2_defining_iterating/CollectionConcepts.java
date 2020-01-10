package com.monotonic.collections._2_defining_iterating;

import com.monotonic.collections.Product;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionConcepts {

    public static void main(String[] args) {
        Product door = new Product("Wooden door", 35);
        Product floorPanel = new Product("Floor panel", 25);
        Product window = new Product("Glass window", 10);

        Collection<Product> products = new ArrayList<>();
        products.add(door);
        products.add(floorPanel);
        products.add(window);

        //Do not modify inside foreach-loop
        for (Product product : products) {
            if (product.getWeight() > 20) {
                System.out.println(product);
            }
            /*else {
                products.remove(product); //java.util.ConcurrentModificationException
            }*/
        }

        //using Iterator remove() can't be done with foreach
        final Iterator<Product> productIterator = products.iterator();
        while (productIterator.hasNext()) {
            Product product = productIterator.next();

            if (product.getWeight() > 20) {
                System.out.println(product);
            } else {
                productIterator.remove();
            }
        }

        //System.out.println(products);
        System.out.println(products.size());            //2
        System.out.println(products.isEmpty());         //false
        System.out.println(products.contains(window));  //false
        System.out.println(products.contains(door));    //true

        Collection<Product> otherProducts = new ArrayList<>();
        otherProducts.add(window);
        otherProducts.add(door);

        products.removeAll(otherProducts); //remove window and door from products
        products.remove(window);
        System.out.println(products);

        for (Product product : products) {
            System.out.println(product);
        }

        //using Iterator Iterate all the products from Collection
        final Iterator<Product> productIteratorTwo = products.iterator();
        while (productIteratorTwo.hasNext()) {
            Product product = productIteratorTwo.next();
            System.out.println(product);
        }
    }
}
