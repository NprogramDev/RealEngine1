package net.nprogram.RealEngine1.timeing;

import java.util.ArrayList;
import java.util.List;

public class TickManager {
    public static boolean exit = false;
    private static List<Tick> ticklist = new ArrayList<>();

    public static void onStart() {
        Thread thread = new Thread() {
            @Override
            public void run() {
                while (!exit) {
                    TickManager.run();
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        thread.start();

    }

    public static void list(Tick tick) {
        ticklist.add(tick);
    }

    public static void run() {
        for (Tick tick : ticklist) {
            tick.run();
        }
    }
}
