package net.nprogram.RealEngine1.timeing;

public interface Tick {
     public void run();
     default void start(){
         TickManager.list(this);
     }
}
