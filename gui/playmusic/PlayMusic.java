
/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Sound.java                                         :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: pvan-ren <pvan-ren@student.42.fr>          +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/07/26 10:49:38 by pvan-ren          #+#    #+#             */
/*   Updated: 2019/07/26 12:02:28 by pvan-ren         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package playmusic;

import java.io.*;
import javax.swing.*;
import sun.audio.*;

public class PlayMusic {

    public static void main(String[] args) {
        play("../irish-drum-marching-to-war.wav");
    }

    public static void play(String filepath) {
        InputStream music;
        try {
            music = new FileInputStream(new File(filepath));
            AudioStream audios = new AudioStream(music);
            AudioPlayer.player.start(audios);

        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Oops!, something went wrong.");
        }
    };
}