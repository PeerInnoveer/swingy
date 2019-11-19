/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Character.java                                     :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: pvan-ren <pvan-ren@student.42.fr>          +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/08/02 14:47:49 by pvan-ren          #+#    #+#             */
/*   Updated: 2019/09/03 12:31:34 by pvan-ren         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package model;

import javax.validation.constraints.*;
import model.Coordinates;

public class Character {

    @NotNull(message = "Please enter a character name.")
    private String name;
    @NotBlank(message = "Please choose a type.")
    private String type;
    private int level = 1;
    private int experience = 0;
    private int attack;
    private int defence;
    private int hp = 100;
    private Coordinates coordinates;

    public Character() {
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    
    public int getExp() {
        return experience;
    }
    public void setExp(int experience) {
        this.experience = experience;
    }

    public int getAtt() {
        return attack;
    }
    public void setAtt(int attack) {
        this.attack = attack;
    }
    
    public int getDef() {
        return defence;
    }
    public void setDef(int defence) {
        this.defence = defence;
    }
    
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }
    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

}