import iterator.MenuItem;
import iterator.IteratorMenuInterface;

public class DinnerMenu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinnerMenu() {
        this.menuItems = new MenuItem[MAX_ITEMS];

        addItem(
            "Vegetarian BLT",
            "(Fakin') Bacon with lettuce & tomato on whole wheat",
            true,
            2.99
        );

        addItem(
            "BLT",
            "Bacon with lettuce & tomato on whole wheat",
            false,
            2.99
        );

        addItem(
            "Soup of the day",
            "Soup of the day with a side of potato salad",
            false,
            3.29
        );

        addItem(
            "Hotdog",
            "A hot dog, with saurkraut, relish, onions, topped with cheese",
            true,
            2.99
        );
    }

    public void addItem(
        String name,
        String description,
        boolean vegetarian,
        double price
    ) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);

        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("Sorry, menu is full! Can't add item to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }

    public Iterator createIterator() {
        return new DinnerMenu(menuItems);
    }
}
