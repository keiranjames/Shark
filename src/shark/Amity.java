/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shark;

import environment.Environment;
import grid.Grid;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author keiran
 */
class Amity extends Environment {

    Grid grid;
    
    public Amity() {
        
        grid = new Grid(25, 20, 20, 20, new Point (180, 80), Color.red);
        
    }

    @Override
    public void initializeEnvironment() {
    }
    
    int counter;

    @Override
    public void timerTaskHandler() {
//        System.out.println("Aidan is cool! " + ++counter );
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
//        System.out.println("Key Event " + e.getKeyChar()); 
//        System.out.println("Key Event " + e.getKeyCode()); 
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            System.out.println("Go Left");
        }
        else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            System.out.println("Go Right");
        }
        else if (e.getKeyCode() == KeyEvent.VK_UP) {
            System.out.println("Go Up");
        }
        
        else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            System.out.println("Go Down");
        }
        
    }
        
        
        
        
        
        
    @Override
    public void keyReleasedHandler(KeyEvent e) {
        
        if (e.getKeyCode() == KeyEvent.VK_W) {
            System.out.println("Go Up");
        }
        else if (e.getKeyCode() == KeyEvent.VK_A) {
            System.out.println("Go Left");
        }
        else if (e.getKeyCode() == KeyEvent.VK_S) {
            System.out.println("Go Down");
        }
        
        else if (e.getKeyCode() == KeyEvent.VK_D) {
            System.out.println("Go Right");
        }
        
        
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
        System.out.println("Mouse clicked at " + e.getPoint());
        System.out.println("You are in cell " + grid.getCellLocationFromSystemCoordinate(e.getPoint()));
        
    }

    @Override
    public void paintEnvironment(Graphics graphics) {
        if (grid != null) {
            grid.paintComponent(graphics);
        }
    }
    
}