/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Hero.java                                          :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: pvan-ren <pvan-ren@student.42.fr>          +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/07/23 15:09:56 by pvan-ren          #+#    #+#             */
/*   Updated: 2019/08/23 07:53:50 by pvan-ren         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package model;

public class Hero extends Character {

    private String heroDesign = "\u001B[32m" + "H" + "\u001B[0m";

    public Hero() {}

    public String getHeroDesign() {
        return heroDesign;
    }

    public String[] getHeroInfo() {
        String[] info = new String[7];

        info[0] = getName();
        info[1] = getType();
        info[2] = String.valueOf(getLevel());
        info[3] = String.valueOf(getExp());
        info[4] = String.valueOf(getAtt());
        info[5] = String.valueOf(getDef());
        info[6] = String.valueOf(getHp());

        return info;
    }
}