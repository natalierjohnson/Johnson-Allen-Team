/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lehisjourney;

import byui.cit260.NatalieJoci.lehisJourney.model.Player;

/**
 *
 * @author NatalieJ
 */
public class LehisJourney {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player firstPlayer = new Player();
        firstPlayer.setName("Lehi");
        firstPlayer.setRole("Leader");
        firstPlayer.setDescription("Father, Guide, Decision Maker");
        String playerInfo = firstPlayer.toString();
        System.out.println(playerInfo);
        
    }
    
}
