package BankOrganiser;

import org.powerbot.game.api.methods.Widgets;
import org.powerbot.game.api.methods.input.Mouse;
import org.powerbot.game.api.methods.widget.Bank;
import org.powerbot.game.api.util.Time;
import org.powerbot.game.api.util.Timer;
import org.powerbot.game.api.wrappers.node.Item;
import org.powerbot.game.api.wrappers.widget.Widget;
import org.powerbot.game.api.wrappers.widget.WidgetChild;
import org.powerbot.game.bot.Context;
import org.powerbot.game.client.Client;

import java.awt.*;
import java.awt.event.MouseWheelEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Preston2
 * Date: 9/2/12
 * Time: 9:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class Methods {

    //Methods
    public static final int[] COMPONENT_BANK_TABS = new int[]{0, 65, 63, 61, 59, 57,
            55, 53, 51, 49};
    public static final int[] COMPONENT_BANK_FIRST_ITEMS = new int[]{78, 79,
            80, 81, 82, 83, 84, 85, 86};
    public static final int[] COMPONENT_BANK_TABS_DIVIDERS = {68, 69, 70, 71, 72, 73, 74, 75

    };

    public static Timer j;
    public static Item itemArray[];
    public static boolean onStart = false;
     public static boolean isInFirstTab(Item a){
               return a.getWidgetChild().getRelativeY()<Widgets.get(Bank.WIDGET_BANK,COMPONENT_BANK_TABS_DIVIDERS[0]).getRelativeY();
     }
    public static int getTab(Item item) {
        logError("Superman");
        int[] divider = COMPONENT_BANK_TABS_DIVIDERS;
        int y = (int) item.getWidgetChild().getRelativeY();

        if (y < Widgets.get(Bank.WIDGET_BANK, COMPONENT_BANK_TABS_DIVIDERS[0]).getRelativeY()) {
            return 1;
        } else {
            if (y < Widgets.get(Bank.WIDGET_BANK, divider[1]).getRelativeY()) {
                return 2;
            } else {
                if (y < Widgets.get(Bank.WIDGET_BANK, divider[2]).getRelativeY()) {
                    return 3;
                } else {
                    if (y < Widgets.get(Bank.WIDGET_BANK, divider[3]).getRelativeY()) {
                        return 4;
                    } else {
                        if (y < Widgets.get(Bank.WIDGET_BANK, divider[4]).getRelativeY()) {
                            return 5;
                        } else {
                            if (y < Widgets.get(Bank.WIDGET_BANK, divider[5]).getRelativeY()) {
                                return 6;
                            } else {
                                if (y < Widgets.get(Bank.WIDGET_BANK, divider[6]).getRelativeY()) {
                                    return 7;
                                } else {
                                    if (y < Widgets.get(Bank.WIDGET_BANK, divider[7]).getRelativeY()) {
                                        return 8;
                                    } else {
                                        if (y < Widgets.get(Bank.WIDGET_BANK, divider[8]).getRelativeY()) {
                                            return 9;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return 1;
    }

    private static boolean isSlotVisible(final WidgetChild slot) {

        final WidgetChild slots = Widgets.get(Bank.WIDGET_BANK, Bank.WIDGET_SLOTS_CONTAINER);
        final Rectangle visibleBounds = new Rectangle(
                slots.getAbsoluteLocation(),
                new Dimension(
                        slots.getWidth() - slot.getWidth(), slots.getHeight() - slot.getHeight()
                )
        );
        return visibleBounds.contains(slot.getAbsoluteLocation());
    }


    public static Widget bankWidget() {
        if (Bank.getWidget() != null) {
            return Bank.getWidget();
        }
        return null;
    }

    public static Point convertNumToPoint(int tabNumber) {
        if (bankWidget() != null) {
            return Widgets.get(762, getTabNumber(tabNumber)).getCentralPoint();
        }
        return null;
    }

    public static int getTabNumber(int a) {
        return COMPONENT_BANK_TABS[a];
    }

    public static Item getCatagoryItem(int a) {
        Item bob[] = Bank.getItems();
        for (int c = 0; c <= bob.length; c++) {
            if (selectCatagory(bob[c].getId()) == a) {
                return bob[c];
            }
        }
        return null;
    }

    public static void sortOpenTabsLoop() {
        logError("Loop");
        Item bob[] = Bank.getItems();
        java.util.ArrayList<Integer> list1 = new ArrayList<Integer>();
        for (Item x : bob) {
            if (x.getId() > 2) {


                if(isInFirstTab(x))
                    list1.add(x.getId());

            }
        }


        bubblesrt(list1);
        logError(list1.toArray()[0].toString());
        int itemID = Integer.parseInt(list1.toArray()[0].toString());
        sortNextItem(Bank.getItem(itemID).getWidgetChild().getIndex());


    }

    public static void bubblesrt(ArrayList<Integer> list) {
        int temp;
        if (list.size() > 1) // check if the number of orders is larger than 1
        {
            for (int x = 0; x < list.size(); x++) // bubble sort outer loop
            {
                for (int i = 0; i < list.size() - x - 1; i++) {
                    if (list.get(i).compareTo(list.get(i + 1)) > 0) {
                        temp = list.get(i);
                        list.set(i, list.get(i + 1));
                        list.set(i + 1, temp);
                    }
                }
            }
        }

    }

    public static void logError(String str) {
        System.out.println(str);
    }

    public static void sortNextItem(int index) {
        logError("Sorting next item");


        WidgetChild bob[] = getItems();
        if (isSlotVisible(bob[index])) {
            logError("Its visible " + bob[index].getChildId());
            logError(selectCatagory(bob[index].getChildId()) + "");
            BankOrganiser.itemTime.setEndIn(4000);
            organiseItem(bob[index], selectCatagory(bob[index].getChildId()));

            while (bob[index].isOnScreen() && BankOrganiser.itemTime.isRunning()) {
                Time.sleep(10);
            }
        } else {
            logError("Finding Item");

            if (findItem(bob[index])) {
                logError("Found Item!");
            }

            sortNextItem(index);
        }


    }

    public static Point itemPoint(int a) {
        return Bank.getItem(a).getWidgetChild().getCentralPoint();
    }

    public static boolean organiseItem(WidgetChild item, int tabNum) {
        Point itemPoint = item.getCentralPoint();
        Point tabPoint = convertNumToPoint(tabNum);
        moveItem(itemPoint, tabPoint);
        return false;

    }

    public static int selectCatagory(int a) {
        logError("Selecting catagory");
        if (getCatagory(a) != null) {
            String s = getCatagory(a).toLowerCase();
            System.out.println(s);

            if (s.toLowerCase().contains("miscellaneous")) {
                return Values.MiscValue;
            }
            if (s.toLowerCase().contains("ammo")) {
                return Values.AmmoValue;
            }
            if (s.toLowerCase().contains("arrows")) {
                return Values.ArrowsValue;
            }
            if (s.toLowerCase().contains("bolts")) {
                return Values.BoltsValue;
            }
            if (s.toLowerCase().contains("construction")) {
                return Values.ConstructionValue;
            }

            if (s.toLowerCase().contains("cooking")) {
                return Values.FoodValue; //FIIIIIIIIIIIIIIIIIIIIXXXXXXXXXXXXXXXXXXXXXXXXXXx
            }
            if (s.toLowerCase().contains("costumes")) {
                return Values.CostumesValue;
            }
            if (s.toLowerCase().contains("crafting")) {
                return Values.CraftingValue;
            }
            if (s.toLowerCase().contains("familiars")) {
                return Values.FamilarsValue;
            }
            if (s.toLowerCase().contains("farming")) {
                return Values.FarmingValue;
            }
            if (s.toLowerCase().contains("fletching")) {
                return Values.FletchingValue;
            }
            if (s.toLowerCase().contains("food")) {
                return Values.FoodValue;
            }
            if (s.toLowerCase().contains("herblore")) {
                return Values.HerbloreValue;
            }
            if (s.toLowerCase().contains("hunting")) {
                return Values.HerbloreValue;
            }
            if (s.toLowerCase().contains("jewellery")) {
                return Values.JewelleryValue;
            }
            if (s.toLowerCase().contains("mage")) {
                return Values.MageArmorValue;
            }
            if (s.toLowerCase().contains("melee armour")) {
                return Values.MeleeArmorValue;
            }
            if (s.toLowerCase().contains("melee weapons")) {
                return Values.MeleeWeaponsValue;
            }
            if (s.toLowerCase().contains("mining")) {
                return Values.MiningAndSmithingValue;
            }
            if (s.toLowerCase().contains("prayer armour")) {
                return Values.PrayerValue;
            }
            if (s.toLowerCase().contains("prayer materials")) {
                return Values.PrayerValue;
            }
            if (s.toLowerCase().contains("range armor")) {
                return Values.RangeArmorValue;
            }
            if (s.toLowerCase().contains("range weapons")) {
                return Values.RangeWeaponsValue;
            }
            if (s.toLowerCase().contains("runecrafting")) {
                return Values.RunecraftingValue;
            }
            if (s.toLowerCase().contains("runes")) {
                return Values.MageMaterialsValue;
            }
            if (s.toLowerCase().contains("seeds")) {
                return Values.SeedsValue;
            }
            if (s.toLowerCase().contains("summoning scrolls")) {
                return Values.SummoningValue;
            }
            if (s.toLowerCase().contains("tools and containers")) {
                return Values.ToolsValue;
            }
            if (s.toLowerCase().contains("potions")) {
                return Values.PotionsValue;
            }
            if (s.toLowerCase().contains("woodcutting")) {
                return Values.WoodcuttingValue;
            }

        }
        return Values.MiscValue;
    }

    public static WidgetChild[] getItems() {
        if (Bank.isOpen()) {
            if (Bank.getItems() != null) {
                return Widgets.get(762, 95).getChildren();
            } else {
                return null;
            }


        } else {
            Bank.open();
            Time.sleep(500);
            getItems();
        }
        return null;
    }

    public static boolean moveItem(Point a, Point b) {

        Mouse.move(a);
        if (Mouse.getLocation().distance(a) <= 3) {
            Mouse.drag((int) b.getX(), (int) b.getY(), 3, 3);
        }

        return false;
    }


    public static String pullString(int id) throws IOException {
        String price;
        URL url = new URL("http://services.runescape.com/m=itemdb_rs/api/catalogue/detail.json?item=" + id);
        URLConnection con = url.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String line;
        while ((line = in.readLine()) != null) {
            if (line.contains("\"type\":\"")) {

                price = line.substring(line.indexOf("\"type\":\"") + 8, line.indexOf("\",\"typeIcon"));
                try {
                    return (price);
                } catch (NumberFormatException e) {
                    return null;
                }
            }
        }
        return null;
    }

    public static String getCatagory(int id) {
        try {
            return pullString(id);
        } catch (IOException e) {
            return null;
        }
    }

    public static boolean findItem(WidgetChild item) {
        logError("Real Finding Item");
        scrollUp();
        while (!isSlotVisible(item)) {
            logError("Found Item");
            Mouse.move(Widgets.get(Bank.WIDGET_BANK, Bank.WIDGET_SCROLLBAR).getChild(0).getAbsoluteLocation());
            scroll(true, 1000, 1);
            Time.sleep(50);
        }
        return isSlotVisible(item);

    }

    public static void scrollUp() {
        while (Bank.isOpen() && Widgets.get(Bank.WIDGET_BANK, Bank.WIDGET_SCROLLBAR).getChild(1).getAbsoluteLocation().getY() != 151) {
            logError("Scrolling up");
            Mouse.move(Widgets.get(Bank.WIDGET_BANK, Bank.WIDGET_SCROLLBAR).getChild(0).getAbsoluteLocation());
            scroll(false, 0, 3);

        }
    }

    public static void scroll(final boolean down, final int delay, final int wheelRotation) {
        final org.powerbot.game.client.input.Mouse mouse = getMouse();
        final Component target = getTarget();
        if (mouse == null || target == null) {
            return;
        }
        mouse.sendEvent(
                new MouseWheelEvent(target, MouseWheelEvent.MOUSE_WHEEL, System.currentTimeMillis() + delay, 0, Mouse.getX(), Mouse.getY(), 0, false, MouseWheelEvent.WHEEL_UNIT_SCROLL, wheelRotation, down ? 3 : -3)
        );
    }

    private static org.powerbot.game.client.input.Mouse getMouse() {
        final Client client = Context.client();
        return client == null ? null : client.getMouse();
    }

    private static Component getTarget() {
        final Context context = Context.get();
        if (context.getApplet() == null || context.getApplet().getComponentCount() == 0) {
            return null;
        }

        return context.getApplet().getComponent(0);
    }


    public static boolean makeTab(int tab) {
        Item bob = getCatagoryItem(tab);
        if (bob != null) {
            if (isSlotVisible(bob.getWidgetChild())) {
                System.out.println(bob.getName());
                moveItem(bob.getWidgetChild().getAbsoluteLocation(), convertNumToPoint(tab));
                Time.sleep(4000);
            } else {
                if (Widgets.get(Bank.WIDGET_BANK, Bank.WIDGET_SCROLLBAR).getChild(1).getRelativeY() != 151) {
                    scrollUp();
                }
                while (!isSlotVisible(bob.getWidgetChild())) {
                    Mouse.scroll(true);
                }
                makeTab(tab);
            }
        }

        return false;
    }
}
