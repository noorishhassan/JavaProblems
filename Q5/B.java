/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smd_a1_q5;
import java.util.concurrent.TimeUnit;
/**
 *
 * @author Noorish Hassan
 */
public class B {
    public void isProcessARunning(I obj)
    {
        while (true)
        {
            try{
                TimeUnit.SECONDS.sleep(60);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();      
            }
            if (obj.stopWastingTime() == true)
            {
                obj.exitGame();
                break;
            }
            else{
                obj.continuePlaying();
            }
        }

    }
}
