/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.group4sos;
import java.awt.Color;
import java.util.Random;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.util.Timer;
import java.util.TimerTask;
/**
 *
 * @author John
 */
public class Player {
    String name;
    int score;
    String picture;
    String PlayerColor;
    String[] catchphrases;
    String[] winCatchphrase;
    JLabel avatar;
    JLabel nameLabel;
    
    
    public Player(String playerColor){
        //this.name = nm;
        this.PlayerColor = playerColor;
        score = 0;

    }
        public void PlayCatchphrase(JLabel catchphrasePanel, Player player){
            //JOptionPane.showMessageDialog(null, catchphrases);
            Random random = new Random();
            int blueRandomIndex = random.nextInt(player.catchphrases.length);
            catchphrasePanel.setIcon(new ImageIcon(getClass().getResource(player.catchphrases[blueRandomIndex])));
            catchphrasePanel.setBorder(new LineBorder(Color.BLACK, 2, true));
            Timer blueTimer = new Timer();
            blueTimer.schedule(new TimerTask() {
                @Override
                public void run(){
                    catchphrasePanel.setIcon(null);
                    catchphrasePanel.setBorder(null);
                    blueTimer.cancel();
                }
            }, 5000);
        }
        public void WinCatchphrase(JLabel catchphrasePanel, Player player){
            Random random = new Random();
            int blueRandomIndex = random.nextInt(player.winCatchphrase.length);
            catchphrasePanel.setIcon(new ImageIcon(getClass().getResource(player.winCatchphrase[blueRandomIndex])));
            catchphrasePanel.setBorder(new LineBorder(Color.BLACK, 2, true));
            Timer blueTimer = new Timer();
            blueTimer.schedule(new TimerTask() {
                @Override
                public void run(){
                    catchphrasePanel.setIcon(null);
                    catchphrasePanel.setBorder(null);
                    blueTimer.cancel();
                }
            }, 15000);
        }
        
}
// dexter , jimmy neutron, megamind, doofenshmirtz, rick, stewie griffin, velma
class Dexter extends Player {
    
    public Dexter(String playerColor) {
        super(playerColor);
        this.name = "Dexter";
        this.picture = "dexter1";
        this.catchphrases = new String[]{"/dexterCatchPhrase1.png", "/dexterCatchPhrase2.png", "/dexterCatchPhrase3.png"};
        this.winCatchphrase = new String[]{"/dexterCatchPhraseWin.png"};
    }  
}
class Jimmy extends Player {
    
    public Jimmy(String playerColor) {
        super(playerColor);
        this.name = "Jimmy";
        this.picture = "jimmyneutron1";
        this.catchphrases = new String[]{"/jimmyCatchPhrase1.png"};
        this.winCatchphrase = new String[]{"/jimmyCatchPhraseWin.png"};
    }  
}
class Megamind extends Player {
    
    public Megamind(String playerColor) {
        super(playerColor);
        this.name = "Megamind";
        this.picture = "megamind";
        this.catchphrases = new String[]{"/megamindCatchPhrase1.png", "/megamindCatchPhrase2.png"};
        this.winCatchphrase = new String[]{"/megamindCatchPhraseWin.png"};
    }  
}
class Doofenshmirtz extends Player {
    
    public Doofenshmirtz(String playerColor) {
        super(playerColor);
        this.picture = "Doofenshmirtz";
        this.catchphrases = new String[]{"/doofenshnirtzCatchPhrase1.png", "/doofenshnirtzCatchPhrase2.png"};
        this.winCatchphrase = new String[]{"/DoofenshmirtzWin.jpg"};
    }  
}
class Rick extends Player {
    
    public Rick(String playerColor) {
        super(playerColor);
        this.name = "Rick";
        this.picture = "rick1";
        this.catchphrases = new String[]{"/rickCatchPhrase1.png", "/rickCatchPhrase2.png", "/rickCatchPhrase4.png"};
        this.winCatchphrase = new String[]{"/rickCatchPhraseWin.png"};
    }  
}
class Stewie extends Player {
    
    public Stewie(String playerColor) {
        super(playerColor);
        this.name = "Stewie";
        this.picture = "stewie1";
        this.catchphrases = new String[]{"/stewieCatchPhrase1.png", "/stewieCatchPhrase2.png"};
        this.winCatchphrase = new String[]{"/stewieCatchPhraseWin.png"};
    }  
}
class Velma extends Player {
    
    public Velma(String playerColor) {
        super(playerColor);
        this.name = "Velma";
        this.picture = "velma1";
        this.catchphrases = new String[]{"/velmaCatchPhrase1.png", "/velmaCatchPhrase2.png"};
        this.winCatchphrase = new String[]{"/velmaCatchPhraseWin.png"};
    }  
}
