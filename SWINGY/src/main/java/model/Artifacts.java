/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Artifacts.java                                     :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: pvan-ren <pvan-ren@student.42.fr>          +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/08/23 11:36:42 by pvan-ren          #+#    #+#             */
/*   Updated: 2019/09/03 10:39:48 by pvan-ren         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package model;

public class Artifacts {
    
    private String weapon;
    private String helm;
    private String armor;

    public Artifacts() {
        
    }

    public String getWeapon() {
        return weapon;
    }
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getHelm() {
        return helm;
    }
    public void setHelm(String helm) {
        this.helm = helm;
    }

    public String getArmor() {
        return armor;
    }
    public void setArmor(String armor) {
        this.armor = armor;
    }
}