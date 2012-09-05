package BankOrganiser;

/**
 * Created with IntelliJ IDEA.
 * User: Preston2
 * Date: 9/4/12
 * Time: 3:36 PM
 * To change this template use File | Settings | File Templates.
 */

import org.powerbot.concurrent.strategy.Strategy;
import org.powerbot.game.api.ActiveScript;
import org.powerbot.game.api.Manifest;

@Manifest(authors = "Echocage", name = "Test", description = "N/a", version = 0.01)
public class Test extends ActiveScript {
    @Override
    protected void setup() {

        provide(new defile());
    }

    private class defile extends Strategy implements Runnable {
        @Override
        public void run() {
            Methods.sortOpenTabsLoop();

        }

        @Override
        public boolean validate() {
            // TODO Auto-generated method stub
            return true;
        }

    }
}
