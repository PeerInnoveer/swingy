/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   GuiController.java                                 :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: pvan-ren <pvan-ren@student.42.fr>          +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/08/21 09:07:55 by pvan-ren          #+#    #+#             */
/*   Updated: 2019/08/21 10:06:48 by pvan-ren         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/* The Controller coordinates interactions
between the view and Model.*/

public class GuiController {

    private GuiView theView;
    private GuiModel theModel;

    public GuiController(GuiView theView, GuiModel theModel) {
        this.theView = theView;
        this.theModel = theModel;
    }
}