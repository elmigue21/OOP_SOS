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
    public String name;
    public int score;
   public  String picture;
    public Color PlayerColor;
    public String[] catchphrases;
   public  String[] winCatchphrase;
   public  JLabel avatar;
    public JLabel nameLabel;
 
    
    public Player(){
        //this.name = nm;
        //this.PlayerColor = playerColor;
        //score = 0;

    }
    
        public static Player createPlayer(Color pCol) {
    String[] charSelect = {"Dexter's Laboratory", "Jimmy Neutron", "Megamind", "Heinz Doofenshmirtz", "Rick Sanchez", "Stewie Griffin", "Velma Dinkley"};
     JComboBox cSelect = new JComboBox(charSelect);
     String colorr = "none";
     if(pCol == Color.RED){
         colorr = "Red";
     }
     else if(pCol == Color.BLUE){
         colorr = "Blue";
     }
    int characOption = JOptionPane.showConfirmDialog(null, cSelect, "Select Character for " + colorr, JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
    if (characOption == JOptionPane.OK_OPTION) {
        switch (cSelect.getSelectedIndex()) {
            case 0:
                return new Dexter(pCol);
            case 1:
               return new Jimmy(pCol);
            case 2:
                return new Megamind(pCol);
            case 3:
                return new Doofenshmirtz(pCol);
            case 4:
               return new Rick(pCol);
            case 5:
                return new Stewie(pCol);
            case 6:
                return new Velma(pCol);
        }
        
        /*
        player.avatar = avat;
        player.nameLabel = lblName;
        player.avatar.setIcon(new ImageIcon(getClass().getResource("/" + player.picture + ".png")));
        player.nameLabel.setText(player.name);
        return player;
*/
        JOptionPane.showMessageDialog(null, "QWEQWEQWEQWE");
        return null;
    }
    JOptionPane.showMessageDialog(null, "ZXCZXCZXCZXCZXC");
        return null;
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
        
        public String getPlayerName(){
            return null;
        }
        
}

// dexter , jimmy neutron, megamind, doofenshmirtz, rick, stewie griffin, velma
class Dexter extends Player {
    
    public Dexter(Color clr) {
        this.score = 0;
        this.PlayerColor = clr;
        this.name = "Dexter";
        this.picture = "dexter1";
        this.catchphrases = new String[]{"/dexterCatchPhrase1.png", "/dexterCatchPhrase2.png", "/dexterCatchPhrase3.png"};
        this.winCatchphrase = new String[]{"/dexterCatchPhraseWin.png"};
    }  
    public String getPlayerName(){
            return "Dexter";
        }
}

class Jimmy extends Player {
    
    public Jimmy(Color clr ) {
         this.score = 0;
        this.PlayerColor = clr;
        this.name = "Jimmy";
        this.picture = "jimmyneutron1";
        this.catchphrases = new String[]{"/jimmyCatchPhrase1.png"};
        this.winCatchphrase = new String[]{"/jimmyCatchPhraseWin.png"};

    }  
        public String getPlayerName(){
            return "Jimmy";
        }
}
class Megamind extends Player {
    
    public Megamind(Color clr) {
         this.score = 0;
        this.PlayerColor = clr;
        this.name = "Megamind";
        this.picture = "megamind";
        this.catchphrases = new String[]{"/megamindCatchPhrase1.png", "/megamindCatchPhrase2.png"};
        this.winCatchphrase = new String[]{"/megamindCatchPhraseWin.png"};
    }  
    public String getPlayerName(){
            return "Megamind";
        }
}
class Doofenshmirtz extends Player {
    
    public Doofenshmirtz( Color clr) {
         this.score = 0;
        this.PlayerColor = clr;
        this.picture = "Doofenshmirtz";
        this.catchphrases = new String[]{"/doofenshnirtzCatchPhrase1.png", "/doofenshnirtzCatchPhrase2.png"};
        this.winCatchphrase = new String[]{"/DoofenshmirtzWin.jpg"};
    }  
    public String getPlayerName(){
            return "Doofenshmirtz";
        }
}
class Rick extends Player {
    
    public Rick(Color clr) {
         this.score = 0;
       this.PlayerColor = clr;
        this.name = "Rick";
        this.picture = "rick1";
        this.catchphrases = new String[]{"/rickCatchPhrase1.png", "/rickCatchPhrase2.png", "/rickCatchPhrase4.png"};
        this.winCatchphrase = new String[]{"/rickCatchPhraseWin.png"};
    }  
    public String getPlayerName(){
            return "Rick";
        }
}
class Stewie extends Player {
    
    public Stewie(Color clr) {
         this.score = 0;
       this.PlayerColor = clr;
        this.name = "Stewie";
        this.picture = "stewie1";
        this.catchphrases = new String[]{"/stewieCatchPhrase1.png", "/stewieCatchPhrase2.png"};
        this.winCatchphrase = new String[]{"/stewieCatchPhraseWin.png"};
    }  
    public String getPlayerName(){
            return "Stewie";
        }
}
class Velma extends Player {
    
    public Velma(Color clr) {
         this.score = 0;
       this.PlayerColor = clr;
        this.name = "Velma";
        this.picture = "velma1";
        this.catchphrases = new String[]{"/velmaCatchPhrase1.png", "/velmaCatchPhrase2.png"};
        this.winCatchphrase = new String[]{"/velmaCatchPhraseWin.png"};
    }  
    public String getPlayerName(){
            return "Velma";
        }
}
