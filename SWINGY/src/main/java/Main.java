
/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Main.java                                          :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: pvan-ren <pvan-ren@student.42.fr>          +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/07/23 14:23:45 by pvan-ren          #+#    #+#             */
/*   Updated: 2019/08/21 12:34:27 by pvan-ren         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

import controller.Controller;
import model.Hero;
import view.TheView;

public class Main {    
    public static void main(String[] args) {

        TheView view = new TheView();
        Hero hero = new Hero();
        Controller controller = new Controller(hero, view);

        controller.updateView();
        controller.closeScanner();
        controller.writer.close();
    }
}