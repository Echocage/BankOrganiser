package BankOrganiser;

/**
 * Created with IntelliJ IDEA.
 * User: Preston2
 * Date: 8/31/12
 * Time: 12:53 AM
 * To change this template use File | Settings | File Templates.
 */

import org.powerbot.concurrent.strategy.Strategy;
import org.powerbot.game.api.ActiveScript;
import org.powerbot.game.api.Manifest;
import org.powerbot.game.api.methods.widget.Bank;
import org.powerbot.game.api.util.Time;
import org.powerbot.game.api.util.Timer;

import javax.swing.*;


@Manifest(authors = "Echocage", name = "BankOrganiser", description = "N/a", version = 0.01)
public class BankOrganiser extends ActiveScript {

    public static boolean guiWait = true;
    public static Timer itemTime;
    Gui anything;

    @Override
    protected void setup() {
        itemTime = new Timer(1);
        try {
            SwingUtilities.invokeLater(new Runnable() {

                public void run() {
                    anything = new Gui();
                    anything.setVisible(true);
                    Timer j = new Timer(1);

                }
            });
        } catch (Throwable e) {
        }

        provide(new defile());
        provide(new openBank());
        provide(new openTabs());


    }


    private class defile extends Strategy implements Runnable {
        @Override
        public void run() {
            Methods.sortOpenTabsLoop();
        }


        @Override
        public boolean validate() {
            return Bank.isOpen() && Bank.getTabCount() == 9&&isRunning();
        }

    }

    private class openBank extends Strategy implements Runnable {
        @Override
        public void run() {
            while (isRunning() && anything.isVisible())
                Time.sleep(100);
            Bank.open();
            Time.sleep(2000);


        }


        @Override
        public boolean validate() {
            return !Bank.isOpen();
        }

    }

    private class openTabs extends Strategy implements Runnable {

        @Override
        public void run() {

        }

        @Override
        public boolean validate() {
            return Bank.getTabCount() != 9;
        }
    }


}