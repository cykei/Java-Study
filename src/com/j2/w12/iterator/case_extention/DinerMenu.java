package com.j2.w12.iterator.case_extention;

public class DinerMenu implements Menu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;
  
    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
 
        addItem("Vegetarian BLT",
                "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("BLT",
                "Bacon with lettuce & tomato on whole wheat", false, 2.99);
        addItem("Soup of the day",
                "Soup of the day, with a side of potato salad", false, 3.29);
        addItem("±èÄ¡ººÀ½¹ä",
                "´Þ°¿ 1°³, ¹ä, ±èÄ¡, ²¢ÀÙ", true, 3.05);
        addItem("Ä¡Å² ¸¶¿ä",
                "Ä¡Å², ¹ä, ¸¶¿ä³×Áî, ¼Ò½º", false, 3.99);
        addItem("ºÀ°ñ·¹ ½ºÆÄ°ÔÆ¼",
                "Á¶°³, ¿Ã¸®ºê¿ÀÀÏ, ¸é¹ß, ¸¶´Ã, ºê·ÎÄÝ¸®", true, 3.89);
 }
    public void addItem(String n, String d, boolean v, double p) {
        MenuItem menuItem = new MenuItem(n, d, v, p);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full!  Can't add item to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }
    public MenuItem[] getMenuItems() {
        return menuItems;
    }
    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
    // other menu methods here
}
