package org.example;

import org.example.model.Bed;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;
import org.example.model.Lamp;
import org.example.model.Wall;
import org.example.model.Ceiling;
import org.example.model.Carpet;
import org.example.model.Wardrobe;
import org.example.model.Bedroom;

public class Main {
    public static void main(String[] args) {
        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(10, PaintColor.WHITE);
        Carpet carpet = new Carpet(5, 7, PaintColor.GREEN);
        Bed bed = new Bed("Queen", 2, 10, 1, 1);
        Lamp lamp = new Lamp(LampType.NORMAL, true, 5);
        Wardrobe wardrobe = new Wardrobe(100, 200, 50.5);

        Bedroom bedroom = new Bedroom("Master Bedroom", wall1, wall2, wall3, wall4, ceiling, carpet, bed, lamp, wardrobe);
        System.out.println("Bedroom Name: " + bedroom.getName());
        System.out.println("Wall 1 Direction: " + bedroom.getWall1().getDirection());
        System.out.println("Ceiling Height: " + bedroom.getCeiling().getHeight());
        System.out.println("Carpet Color: " + bedroom.getCarpet().getColor());


        bedroom.getCeiling().create();
        bedroom.getWall1().create();
    }
}