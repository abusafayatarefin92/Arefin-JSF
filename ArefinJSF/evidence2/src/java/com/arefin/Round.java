/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arefin;

import javax.faces.model.SelectItem;

/**
 *
 * @author user
 */
public class Round {

    static SelectItem[] round = new SelectItem[]{
        new SelectItem("Round-36", "Round-36"),
        new SelectItem("Round-37", "Round-37"),
        new SelectItem("Round-38", "Round-38")
    };

    public static SelectItem[] getRound() {
        return round;
    }

    public static void setRound(SelectItem[] round) {
        Round.round = round;
    }

}
