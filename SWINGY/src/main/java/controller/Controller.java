/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Controller.java                                    :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: pvan-ren <pvan-ren@student.42.fr>          +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/08/21 08:06:11 by pvan-ren          #+#    #+#             */
/*   Updated: 2019/09/05 16:17:06 by pvan-ren         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import model.Coordinates;
import model.Enemies;
import model.Hero;
import view.TheView;

public class Controller {

    static File file = new File("PlayerSave.txt");
    public static PrintWriter writer = null;

    static Scanner sc = new Scanner(System.in);
    static TheView view;
    static Hero hero = new Hero();
    static Enemies enemies = new Enemies();
    
    private static char[][] twoD_arr;
    private static int mapSize;

    public Controller(Hero hero, TheView view) {
        this.hero = hero;
        this.view = view;
        
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            this.writer = new PrintWriter(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void updateView() {
        mapSize = ((hero.getLevel() - 1) * 5) + 10 - (hero.getLevel() % 2);
        Coordinates heroCo = new Coordinates(mapSize / 2, mapSize / 2);
        Coordinates enemyCo = new Coordinates(2, 2); // y, x

        hero.setCoordinates(heroCo);
        enemies.setCoordinates(enemyCo);
        view.MainMenu();
        view.closeScanner();
    }

    public static void setPlayerName() throws IOException {

        sc = new Scanner(System.in);
        String name = sc.nextLine();
        writer.println(name);
        hero.setName(name);

    }

    public static void setPlayerType() throws IOException {
        int chooseType = sc.nextInt();
        if (chooseType == 1) {
            hero.setType("Sentinel");

            hero.setAtt(75);
            hero.setDef(35);
            writer.println("Sentinel");
        }
        if (chooseType == 2) {
            hero.setType("Champion");

            hero.setAtt(42);
            hero.setDef(55);
            writer.println("Champion");
        }
        if (chooseType == 3) {
            hero.setType("Strategist");

            hero.setAtt(25);
            hero.setDef(68);
            writer.println("Strategist");
            writer.close();
        }
    }

    public static String[] heroGetInfo() {
        return hero.getHeroInfo();
    }

    public static void createMap() {

        twoD_arr = new char[mapSize][mapSize]; // [y][x]
        for (int i = 0; i < mapSize; i++) {
            for (int j = 0; j < mapSize; j++) {
                twoD_arr[i][j] = 'O';
                // Place Hero on the map
                if (hero.getCoordinates().getY() == i && hero.getCoordinates().getX() == j) {
                    System.out.print(hero.getHeroDesign());
                }
                // Place enemy on the map
                else if (enemies.getCoordinates().getY() == i && enemies.getCoordinates().getX() == j) {
                    System.out.print(enemies.getEnemyDesign());
                } else
                    System.out.print(twoD_arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void moveHero() throws IOException {

        Coordinates heroCo = new Coordinates(mapSize / 2, mapSize / 2);

        while (sc.hasNextLine()) {
            int flag = 0;
            String moves = sc.nextLine();
            switch (moves) {
            case "w":
                hero.getCoordinates().setY(hero.getCoordinates().getY() - 1);
                flag = 1;
                if (hero.getCoordinates().getY() < 0) {
                    hero.setCoordinates(heroCo);
                    // hero.setLevel(hero.getLevel() + 1);
                    // hero.setExp((hero.getLevel() * 1000) + ((hero.getLevel() - 1) *
                    // (hero.getLevel() - 1) * 450));
                    System.out.println("\033[H\033[2J");
                    // updateView();
                    }
                    break;
                case "s":
                    hero.getCoordinates().setY(hero.getCoordinates().getY() + 1);
                    flag = 1;
                    if (hero.getCoordinates().getY() > mapSize - 1) {
                        hero.setCoordinates(heroCo);
                        // hero.setLevel(hero.getLevel() + 1);
                        // hero.setExp((hero.getLevel() * 1000) + ((hero.getLevel() - 1) * (hero.getLevel() - 1) * 450));
                        System.out.println("\033[H\033[2J");
                        // updateView();
                    }
                    break;
                case "a":
                    hero.getCoordinates().setX(hero.getCoordinates().getX() - 1);
                    flag = 1;
                    if (hero.getCoordinates().getX() < 0) {
                        hero.setCoordinates(heroCo);
                        // hero.setLevel(hero.getLevel() + 1);
                        // hero.setExp((hero.getLevel() * 1000) + ((hero.getLevel() - 1) * (hero.getLevel() - 1) * 450));
                        System.out.println("\033[H\033[2J");
                        // updateView();
                    }
                    break;
                case "d":
                    hero.getCoordinates().setX(hero.getCoordinates().getX() + 1);
                    flag = 1;
                    if (hero.getCoordinates().getX() > mapSize - 1) {
                        hero.setCoordinates(heroCo);
                        // hero.setLevel(hero.getLevel() + 1);
                        // hero.setExp((hero.getLevel() * 1000) + ((hero.getLevel() - 1) * (hero.getLevel() - 1) * 450));
                        System.out.println("\033[H\033[2J");
                        // updateView();
                    }
                    break;
                case "q":
                    System.out.println("\033[H\033[2J");
                    System.out.println("----------------------------------------------");
                    System.out.println("You exit the game and your progress was saved.");
                    System.out.println("----------------------------------------------");
                    System.out.println("");
                    writer.close();
                    System.exit(1);
            }
            if (flag == 1) {
            }
            break;
        }
    }
    public void closeScanner() {
        sc.close();
        sc.close();
    }
}