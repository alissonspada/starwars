package org.example.domain;

import org.example.rebel.Item;
import org.example.rebel.Rebelde;
import org.example.services.RebeldeService;

public class Main {
    public static void main(String[] args) {

        RebeldeService rebelde = new RebeldeService();

        rebelde.reportarLoc();
    }


}