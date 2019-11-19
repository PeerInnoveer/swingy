/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Enemies.java                                       :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: pvan-ren <pvan-ren@student.42.fr>          +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/08/02 11:36:40 by pvan-ren          #+#    #+#             */
/*   Updated: 2019/09/04 16:02:55 by pvan-ren         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package model;

public class Enemies extends Character {

    private String enemyDesign = "\u001B[31m" + "E" + "\u001B[0m";
    
    public String getEnemyDesign() {
        return enemyDesign;
    }
}