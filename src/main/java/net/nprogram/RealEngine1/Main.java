package net.nprogram.RealEngine1;

import net.nprogram.RealEngine1.components.atom.Atom;
import net.nprogram.RealEngine1.logging.Logging;
import net.nprogram.RealEngine1.timeing.Tick;
import net.nprogram.RealEngine1.timeing.TickManager;

import java.util.logging.Level;

public class Main {

    public static void main(String[] args){
        new Logging().onStart();
        TickManager.onStart();
        Logging.log(Level.INFO,"Program starts...");
        Atom.Hg.getValue(Level.INFO);
        while (!TickManager.exit){}
        System.exit(-1);
    }
}
