/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   GuiView.java                                       :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: pvan-ren <pvan-ren@student.42.fr>          +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/07/09 15:55:40 by pvan-ren          #+#    #+#             */
/*   Updated: 2019/08/21 10:28:49 by pvan-ren         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GuiView extends JFrame {
    
    private JFrame window;
    private Container con;
    private JPanel titleNamePanel, ButtonPanel;
    private JLabel titleNameLabel;
    
    Font titleFont = new Font("Roboto", Font.PLAIN, 130);
    Font ButtonFont = new Font("Roboto", Font.PLAIN, 30);
    JButton CreatePlayer, LoadPlayer;
    
    public static void main(String[] args) {
        new GuiView();    
    }

    public GuiView() {

        window = new JFrame();
        window.setSize(1000, 800); //(x, y)
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        window.getContentPane().setBackground(new Color(62, 75, 92));
        window.setLayout(null);
        con = window.getContentPane();
        
        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(100, 100, 800, 150); //(x, y, width, height)
        titleNamePanel.setBackground(new Color(62, 75, 92));
        titleNameLabel = new JLabel("SWINGY");
        titleNameLabel.setForeground(Color.white);
        titleNameLabel.setFont(titleFont);

        ButtonPanel = new JPanel();
        ButtonPanel.setBounds(350, 350, 300, 200); //(x, y, width, height)
        ButtonPanel.setBackground(new Color(62, 75, 92));
        
        CreatePlayer = new JButton("CREATE PLAYER");
        CreatePlayer.setBackground(new Color(62, 75, 92));
        CreatePlayer.setForeground(Color.black);
        CreatePlayer.setFont(ButtonFont);
        
        LoadPlayer = new JButton("LOAD PLAYER");
        LoadPlayer.setBackground(Color.white);
        LoadPlayer.setForeground(Color.black);
        LoadPlayer.setFont(ButtonFont);
        
        titleNamePanel.add(titleNameLabel);
        ButtonPanel.add(CreatePlayer);
        ButtonPanel.add(LoadPlayer);
        
        con.add(titleNamePanel);
        con.add(ButtonPanel);
        
        
        // Sets the window to Vertical and Horizontal center.
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension size = toolkit.getScreenSize();
        window.setLocation(size.width/2 - window.getWidth()/2, size.height/2 - window.getHeight()/2);
        
        window.setVisible(true);
    }
}