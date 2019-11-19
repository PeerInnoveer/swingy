/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   GuiMain.java                                       :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: pvan-ren <pvan-ren@student.42.fr>          +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/08/21 09:03:52 by pvan-ren          #+#    #+#             */
/*   Updated: 2019/08/21 10:26:28 by pvan-ren         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

import src.GuiView;

public class GuiMain {
    public static void main(String[] args) {

        GuiView theView = new GuiView();
        
        theView.setVisible(true);
    }
}