/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ıqpuzzlerpro;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Toolkit;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.embed.swing.JFXPanel;
import javax.swing.JPanel;
/**
 *
 * @author Dervis
 */
public class GamePanel extends JPanel {

    private int modeNo, boardNo, playerNo, difficultyNo;
    private BoardViewerPanel board;
    private Group scene;
    
    public GamePanel()
    {
        
    }
    
    public GamePanel(int modeNo, int boardNo, int playerNo, int difficultyNo) 
    {    
        this.modeNo     = modeNo;
        this.boardNo    = boardNo;
        this.playerNo   = playerNo;
        this.difficultyNo=difficultyNo;
        this.board      = new BoardViewerPanel( new Board(boardNo));
       
        scene = new Group();
        scene.getChildren().add(board.createBoard());
        
        scene.setLayoutX( (Toolkit.getDefaultToolkit().getScreenSize().getWidth() - board.getBoardWidth()) / 2 );
        scene.setLayoutY( (Toolkit.getDefaultToolkit().getScreenSize().getHeight() - board.getBoardHeight()) / 3 );
     
        //this.add((GridLayout) board);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(153, 153, 153));
        setMinimumSize(new java.awt.Dimension(2000, 1000));
        setPreferredSize(new java.awt.Dimension(2000, 1000));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    
}