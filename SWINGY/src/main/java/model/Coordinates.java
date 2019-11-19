/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Coordinates.java                                   :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: pvan-ren <pvan-ren@student.42.fr>          +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/08/02 10:44:48 by pvan-ren          #+#    #+#             */
/*   Updated: 2019/08/20 15:47:38 by pvan-ren         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package model;

public class Coordinates {
    
    private int posX, posY;

    public Coordinates(int posX, int posY)
    {
        this.posX = posX;
        this.posY = posY;
    }

    public void setX(int posX) {
        this.posX = posX;
    }
    public int getX() {
        return posX;
    }

    public void setY(int posY) {
        this.posY = posY;
    }
    public int getY() {
        return posY;
    }
}