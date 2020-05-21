import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.Icon;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
/**
 * Senet, an ancient egyptian game of prosperity
 * 
 * @author Caleb Brown 
 * @version 1.0
 */
public class Main
{
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 600;
    boolean turn = true;
    boolean moveUsed = true;
    boolean mustThrow = true;
    int numTurns = 0;
      int row0 = 0;
      int col0 = 0;

      int row1 = 0;
      int col1 = 1;

      int row2 = 0;
      int col2 = 2;

      int row3 = 0;
      int col3 = 3;

      int row4 = 0;
      int col4 = 4; 

      int row5 = 0;
      int col5 = 5;

      int row6 = 0;
      int col6 = 6;

      int row7 = 0;
      int col7 = 7;

      int row8 = 0;
      int col8 = 8;

      int row9 = 0;
      int col9 = 9;

    private JFrame frame;
    private JButton[][] spaces;
    Icon icon = new ImageIcon("tile1.png");
    Icon icon2 = new ImageIcon("tile2.png");
    Icon icon3 = new ImageIcon("tb2r.png");
    Icon icon4 = new ImageIcon("black.png");
    Icon icon5 = new ImageIcon("redstick.png");
    Icon icon6 = new ImageIcon("blackstick.png");
    Icon icon7 = new ImageIcon("square15.png");
    Icon icon8 = new ImageIcon("cranehouse.png");
    Icon icon9 = new ImageIcon("senetrules.png");
    JButton startb = new JButton("Start/ Quit");
    JButton help = new JButton("How To Play");
    JLabel whosTurn = new JLabel("P1 Turn");
    JPanel panel3 = new JPanel();
    JLabel stick1 = new JLabel(icon5);
    JLabel stick2 = new JLabel(icon6);
    JLabel stick3 = new JLabel(icon6);
    JLabel stick4 = new JLabel(icon5);
    int p2score = 0;
    int p1score = 0;
    JButton back = new JButton("Back To Game");
    int initialize = 0;
    JLabel number = new JLabel("");
    JLabel amountOfMoves = new JLabel("");
    JLabel extraTurnB = new JLabel("");
    boolean extraTurn = false;
    boolean twoTurns = false;
    int exitProgram = 0;
    int amountMoves = 0;
    //startb.setSize(50,30);
    JButton cast = new JButton("Throw Sticks");
     //JButton peices
        JButton p1 = new JButton(icon3);
       
        JButton p2 = new JButton(icon3);
     
        JButton p3 = new JButton(icon3);

        JButton p4 = new JButton(icon3);

        JButton p5 = new JButton(icon3);

        JButton p6 = new JButton(icon4);

        JButton p7 = new JButton(icon4);

        JButton p8 = new JButton(icon4);

        JButton p9 = new JButton(icon4);

        JButton p10 = new JButton(icon4);
        JLabel win = new JLabel("");
    public Main()
    {
        initComponents();
        start();
        throwSticks();
        help();
        
    }
    public void help()
    {
      help.addActionListener(new ActionListener() 
    {
    public void actionPerformed(ActionEvent e) 
    {  
      JFrame howtoplay = new JFrame("How To Play");
         JLabel helpL = new JLabel(icon9);
        
      Container pane2 = howtoplay.getContentPane();
        pane2.setLayout(new BoxLayout(pane2, BoxLayout.Y_AXIS));
        JPanel panel3 = new JPanel();
        panel3.setPreferredSize(new Dimension(650, 350));
        panel3.setMaximumSize(new Dimension(650,350));
        panel3.setBackground(Color.WHITE);
    howtoplay.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    // set the howtoplay size and location, and make it visible
    howtoplay.setPreferredSize(new Dimension(700, 500));
    howtoplay.pack();
    howtoplay.setLocationRelativeTo(null);
    
    //howtoplay.add(helpL);
    pane2.add(panel3);
    panel3.add(helpL);
    
panel3.add(back);
    back.addActionListener(new ActionListener() 
    {
    public void actionPerformed(ActionEvent e) 
    {  
      howtoplay.setVisible(false);    
    }
    });
    howtoplay.setVisible(true);

    }
    });
    }
    public void win()
    {
      if(p1score == 5)
        {
          JFrame YouWin = new JFrame("Player 1 Wins!!!");
         
    YouWin.setDefaultCloseOperation(YouWin.EXIT_ON_CLOSE);

    // set the howtoplay size and location, and make it visible
    YouWin.setPreferredSize(new Dimension(400, 300));
    YouWin.pack();
    
    YouWin.setLocationRelativeTo(null);
    YouWin.setVisible(true);
        }
        if(p2score == 5)
        {
          JFrame YouWin2 = new JFrame("Player 2 Wins!!!");
         
    YouWin2.setDefaultCloseOperation(YouWin2.EXIT_ON_CLOSE);

    // set the howtoplay size and location, and make it visible
    YouWin2.setPreferredSize(new Dimension(400, 300));
    YouWin2.pack();
    YouWin2.setLocationRelativeTo(null);
    YouWin2.setVisible(true);
        }
    }

    public void start() 
    {
      
    startb.addActionListener(new ActionListener() 
    {
    public void actionPerformed(ActionEvent e) 
    {   
       moveP1();
       moveP2();
       moveP6();
       moveP7();
       moveP3();
       moveP8();
       moveP4();
       moveP9();
       moveP5();
       moveP10();

       spaces[row0][col0].add(p1);
       spaces[row1][col1].add(p6);
       spaces[row2][col2].add(p2);
       spaces[row3][col3].add(p7);
       spaces[row4][col4].add(p3);
       spaces[row5][col5].add(p8);
       spaces[row6][col6].add(p4);
       spaces[row7][col7].add(p9);
       spaces[row8][col8].add(p5);
       spaces[row9][col9].add(p10);
       frame.setVisible(false);
       frame.setVisible(true);
       if(exitProgram > 0)  System.exit(0);
       exitProgram++;
    }
    });
        
    }




    public void moveP1()
    {

      row0 = 0;
      col0 = 0;

      spaces[row0][col0].add(p1);

      p1.addActionListener(new ActionListener() 
      {

      public void actionPerformed(ActionEvent e) 
      {   
        //numTurns = 0;
      if(turn)
      {
        if(row0 == 1 && col0 == 5)
        {
          row0 = 2; col0 = 5;
          spaces[row0][col0].add(p1);
        frame.setVisible(false);
        frame.setVisible(true);
        }
      if(col0 + amountMoves > 9 && row0 == 0 )
      {
        row0++;
        if(col0 == 9)  {col0 = ((9 - amountMoves) + 1);
        spaces[row0][col0].add(p1);
        frame.setVisible(false);
        frame.setVisible(true);}
        else if(col0 == 8){ col0 = ((9 - amountMoves) + 2);
        spaces[row0][col0].add(p1);
        frame.setVisible(false);
        frame.setVisible(true);}
        else if(col0 == 7){ col0 = ((9 - amountMoves) + 3);
        spaces[row0][col0].add(p1);
        frame.setVisible(false);
        frame.setVisible(true);}
        else if(col0 == 6){ col0 = ((9 - amountMoves) + 4);
        spaces[row0][col0].add(p1);
        frame.setVisible(false);
        frame.setVisible(true);}
        else if(col0 == 5){ col0 = ((9 - amountMoves) + 5);
        spaces[row0][col0].add(p1);
        frame.setVisible(false);
        frame.setVisible(true);}
      }


      else if(row0 == 1 && !(col0 - amountMoves < 0))
      {
        col0 = col0 - amountMoves;
        spaces[row0][col0].add(p1);
        frame.setVisible(false);
        frame.setVisible(true);
      }


      else if(col0 - amountMoves < 0 && row0 == 1)
      {
        row0++;
        if(col0 == 0)
        {
        col0 = (amountMoves - 1);
        spaces[row0][col0].add(p1);
        frame.setVisible(false);
        frame.setVisible(true);
        }
        else if(col0 == 1)
        {
        col0 = (amountMoves - 2);
        spaces[row0][col0].add(p1);
        frame.setVisible(false);
        frame.setVisible(true);
        }
        if(col0 == 2)
        {
        col0 = (amountMoves - 3);
        spaces[row0][col0].add(p1);
        frame.setVisible(false);
        frame.setVisible(true);
        }
        if(col0 == 3)
        {
        col0 = (amountMoves - 4);
        spaces[row0][col0].add(p1);
        frame.setVisible(false);
        frame.setVisible(true);
        }
        if(col0 == 4)
        {
        col0 = (amountMoves - 5);
        spaces[row0][col0].add(p1);
        frame.setVisible(false);
        frame.setVisible(true);
        }

      }
      else if(row0 == 2 && col0 + amountMoves > 9)
      {
        p1.setVisible(false);
        p1score++;
      }
      else
      {
        col0 = col0 + amountMoves;
      spaces[row0][col0].add(p1);
      frame.setVisible(false);
      frame.setVisible(true);
      }
            //amountMoves = 0;
      
    if(extraTurn && numTurns < 1)
    {
      turn = true;
      numTurns++;
    }
    else
    {
      turn = false;
      numTurns = 0;
    }
    }
    win();
    moveUsed = true;
      }
    });


    } 
   




public void moveP2()
    {

      row2 = 0;
      col2 = 2;

      spaces[row2][col2].add(p2);

      p2.addActionListener(new ActionListener() 
      {

      public void actionPerformed(ActionEvent e) 
      {   
       // numTurns = 0;
      if(turn)
      {
        if(row2 == 1 && col2 == 5)
        {
          row2 = 2; col2 = 5;
          spaces[row2][col2].add(p2);
        frame.setVisible(false);
        frame.setVisible(true);
        }
      else if(col2 + amountMoves > 9 && row2 == 0 )
      {
        row2++;
        if(col2 == 9)  {col2 = ((9 - amountMoves) + 1);
        spaces[row2][col2].add(p2);
        frame.setVisible(false);
        frame.setVisible(true);}
        else if(col2 == 8){ col2 = ((9 - amountMoves) + 2);
        spaces[row2][col2].add(p2);
        frame.setVisible(false);
        frame.setVisible(true);}
        else if(col2 == 7){ col2 = ((9 - amountMoves) + 3);
        spaces[row2][col2].add(p2);
        frame.setVisible(false);
        frame.setVisible(true);}
        else if(col2 == 6){ col2 = ((9 - amountMoves) + 4);
        spaces[row2][col2].add(p2);
        frame.setVisible(false);
        frame.setVisible(true);}
        else if(col2 == 5){ col2 = ((9 - amountMoves) + 5);
        spaces[row2][col2].add(p2);
        frame.setVisible(false);
        frame.setVisible(true);}
      }


      else if(row2 == 1 && !(col2 - amountMoves < 0))
      {
        col2 = col2 - amountMoves;
        spaces[row2][col2].add(p2);
        frame.setVisible(false);
      frame.setVisible(true);
      }


      else if(col2 - amountMoves < 0 && row2 == 1)
      {
        row2++;
        if(col2 == 0)
        {
        col2 = (amountMoves - 1);
        spaces[row2][col2].add(p2);
        frame.setVisible(false);
        frame.setVisible(true);
        }
        if(col2 == 1)
        {
        col2 = (amountMoves - 2);
        spaces[row2][col2].add(p2);
        frame.setVisible(false);
        frame.setVisible(true);
        }
        if(col2 == 2)
        {
        col2 = (amountMoves - 3);
        spaces[row2][col2].add(p2);
        frame.setVisible(false);
        frame.setVisible(true);
        }
        if(col2 == 3)
        {
        col2 = (amountMoves - 4);
        spaces[row2][col2].add(p2);
        frame.setVisible(false);
        frame.setVisible(true);
        }
        if(col2 == 4)
        {
        col2 = (amountMoves - 5);
        spaces[row2][col2].add(p2);
        frame.setVisible(false);
        frame.setVisible(true);
        }

      }
      else if(row2 == 2 && col2 + amountMoves > 9)
      {
        p2.setVisible(false);
        p1score++;
      }
      else
      {
        col2 = col2 + amountMoves;
      spaces[row2][col2].add(p2);
      frame.setVisible(false);
      frame.setVisible(true);
      }
         // amountMoves = 0;
 
      if(extraTurn && numTurns < 1)
    {
      turn = true;
      numTurns++;
    }
    else
    {
      turn = false;
      numTurns = 0;

      }
    }
    win();
    moveUsed = true;
      }
    });


    }






public void moveP3()
    {

      row4 = 0;
      col4 = 4;

      spaces[row4][col4].add(p3);

      p3.addActionListener(new ActionListener() 
      {

      public void actionPerformed(ActionEvent e) 
      {   
        //numTurns = 0;
      if(turn)
      {
        if(row4 == 1 && col4 == 5)
        {
          row4 = 2; col4 = 5;
          spaces[row4][col4].add(p3);
        frame.setVisible(false);
        frame.setVisible(true);
        }
      else if(col4 + amountMoves > 9 && row4 == 0 )
      {
        row4++;
        if(col4 == 9)  {col4 = ((9 - amountMoves) + 1);
        spaces[row4][col4].add(p3);
        frame.setVisible(false);
        frame.setVisible(true);}
        else if(col4 == 8){ col4 = ((9 - amountMoves) + 2);
        spaces[row4][col4].add(p3);
        frame.setVisible(false);
        frame.setVisible(true);}
        else if(col4 == 7){ col4 = ((9 - amountMoves) + 3);
        spaces[row4][col4].add(p3);
        frame.setVisible(false);
        frame.setVisible(true);}
        else if(col4 == 6){ col4 = ((9 - amountMoves) + 4);
        spaces[row4][col4].add(p3);
        frame.setVisible(false);
        frame.setVisible(true);}
        else if(col4 == 5){ col4 = ((9 - amountMoves) + 5);
        spaces[row4][col4].add(p3);
        frame.setVisible(false);
        frame.setVisible(true);}
      }


      else if(row4 == 1 && !(col4 - amountMoves < 0))
      {
        col4 = col4 - amountMoves;
        spaces[row4][col4].add(p3);
        frame.setVisible(false);
      frame.setVisible(true);
      }


      else if(col4 - amountMoves < 0 && row4 == 1)
      {
        row4++;
        if(col4 == 0)
        {
        col4 = (amountMoves - 1);
        spaces[row4][col4].add(p3);
        frame.setVisible(false);
        frame.setVisible(true);
        }
        if(col4 == 1)
        {
        col4 = (amountMoves - 2);
        spaces[row4][col4].add(p3);
        frame.setVisible(false);
        frame.setVisible(true);
        }
        if(col4 == 2)
        {
        col4 = (amountMoves - 3);
        spaces[row4][col4].add(p3);
        frame.setVisible(false);
        frame.setVisible(true);
        }
        if(col4 == 3)
        {
        col4 = (amountMoves - 4);
        spaces[row4][col4].add(p3);
        frame.setVisible(false);
        frame.setVisible(true);
        }
        if(col4 == 4)
        {
        col4 = (amountMoves - 5);
        spaces[row4][col4].add(p3);
        frame.setVisible(false);
        frame.setVisible(true);
        }

      }
      else if(row4 == 2 && col4 + amountMoves > 9)
      {
        p3.setVisible(false);
        p1score++;
      }
      else
      {
        col4 = col4 + amountMoves;
      spaces[row4][col4].add(p3);
      frame.setVisible(false);
      frame.setVisible(true);
      }
         //  amountMoves = 0;
 
      if(extraTurn && numTurns < 1)
    {
      turn = true;
      numTurns++;
    }
    else
    {
      turn = false;
      numTurns = 0;
    }
    }
    win();
    moveUsed = true;
      }
    });


    }




public void moveP4()
    {

      row6 = 0;
      col6 = 6;

      spaces[row6][col6].add(p4);

      p4.addActionListener(new ActionListener() 
      {

      public void actionPerformed(ActionEvent e) 
      {   
        //numTurns = 0;
      if(turn)
      {
        if(row6 == 1 && col6 == 5)
        {
          row6 = 2; col6 = 5;
          spaces[row6][col6].add(p4);
        frame.setVisible(false);
        frame.setVisible(true);
        }
      else if(col6 + amountMoves > 9 && row6 == 0 )
      {
        row6++;
        if(col6 == 9)  {col6 = ((9 - amountMoves) + 1);
        spaces[row6][col6].add(p4);
        frame.setVisible(false);
        frame.setVisible(true);}
        else if(col6 == 8){ col6 = ((9 - amountMoves) + 2);
        spaces[row6][col6].add(p4);
        frame.setVisible(false);
        frame.setVisible(true);}
        else if(col6 == 7){ col6 = ((9 - amountMoves) + 3);
        spaces[row6][col6].add(p4);
        frame.setVisible(false);
        frame.setVisible(true);}
        else if(col6 == 6){ col6 = ((9 - amountMoves) + 4);
        spaces[row6][col6].add(p4);
        frame.setVisible(false);
        frame.setVisible(true);}
        else if(col6 == 5){ col6 = ((9 - amountMoves) + 5);
        spaces[row6][col6].add(p4);
        frame.setVisible(false);
        frame.setVisible(true);}
      }


      else if(row6 == 1 && !(col6 - amountMoves < 0))
      {
        col6 = col6 - amountMoves;
        spaces[row6][col6].add(p4);
        frame.setVisible(false);
      frame.setVisible(true);
      }


      else if(col6 - amountMoves < 0 && row6 == 1)
      {
        row6++;
        if(col6 == 0)
        {
        col6 = (amountMoves - 1);
        spaces[row6][col6].add(p4);
        frame.setVisible(false);
        frame.setVisible(true);
        }
        if(col6 == 1)
        {
        col6 = (amountMoves - 2);
        spaces[row6][col6].add(p4);
        frame.setVisible(false);
        frame.setVisible(true);
        }
        if(col6 == 2)
        {
        col6 = (amountMoves - 3);
        spaces[row6][col6].add(p4);
        frame.setVisible(false);
        frame.setVisible(true);
        }
        if(col6 == 3)
        {
        col6 = (amountMoves - 4);
        spaces[row6][col6].add(p4);
        frame.setVisible(false);
        frame.setVisible(true);
        }
        if(col6 == 4)
        {
        col6 = (amountMoves - 5);
        spaces[row6][col6].add(p4);
        frame.setVisible(false);
        frame.setVisible(true);
        }

      }
      else if(row6 == 2 && col6 + amountMoves > 9)
      {
        p4.setVisible(false);
        p1score++;
      }
      else
      {
        col6 = col6 + amountMoves;
      spaces[row6][col6].add(p4);
      frame.setVisible(false);
      frame.setVisible(true);
      }
         // amountMoves = 0;
 
       if(extraTurn && numTurns < 1)
    {
      turn = true;
      numTurns++;
    }
    else
    {
      turn = false;
      numTurns = 0;
    }
    }
    win();
    moveUsed = true;
      }
    });


    }






public void moveP5()
    {

      row8 = 0;
      col8 = 8;

      spaces[row8][col8].add(p5);

      p5.addActionListener(new ActionListener() 
      {

      public void actionPerformed(ActionEvent e) 
      {   
        //numTurns = 0;
      if(turn)
      {
        if(row8 == 1 && col8 == 5)
        {
          row8 = 2; col8 = 5;
          spaces[row8][col8].add(p5);
        frame.setVisible(false);
        frame.setVisible(true);
        }
      else if(col8 + amountMoves > 9 && row8 == 0 )
      {
        row8++;
        if(col8 == 9)  {col8 = ((9 - amountMoves) + 1);
        spaces[row8][col8].add(p5);
        frame.setVisible(false);
        frame.setVisible(true);}
        else if(col8 == 8){ col8 = ((9 - amountMoves) + 2);
        spaces[row8][col8].add(p5);
        frame.setVisible(false);
        frame.setVisible(true);}
        else if(col8 == 7){ col8 = ((9 - amountMoves) + 3);
        spaces[row8][col8].add(p5);
        frame.setVisible(false);
        frame.setVisible(true);}
        else if(col8 == 6){ col8 = ((9 - amountMoves) + 4);
        spaces[row8][col8].add(p5);
        frame.setVisible(false);
        frame.setVisible(true);}
        else if(col8 == 5){ col8 = ((9 - amountMoves) + 5);
        spaces[row8][col8].add(p5);
        frame.setVisible(false);
        frame.setVisible(true);}
      }


      else if(row8 == 1 && !(col8 - amountMoves < 0))
      {
        col8 = col8 - amountMoves;
        spaces[row8][col8].add(p5);
        frame.setVisible(false);
      frame.setVisible(true);
      }


      else if(col8 - amountMoves < 0 && row8 == 1)
      {
        row8++;
        if(col8 == 0)
        {
        col8 = (amountMoves - 1);
        spaces[row8][col8].add(p5);
        frame.setVisible(false);
        frame.setVisible(true);
        }
        if(col8 == 1)
        {
        col8 = (amountMoves - 2);
        spaces[row8][col8].add(p5);
        frame.setVisible(false);
        frame.setVisible(true);
        }
        if(col8 == 2)
        {
        col8 = (amountMoves - 3);
        spaces[row8][col8].add(p5);
        frame.setVisible(false);
        frame.setVisible(true);
        }
        if(col8 == 3)
        {
        col8 = (amountMoves - 4);
        spaces[row8][col8].add(p5);
        frame.setVisible(false);
        frame.setVisible(true);
        }
        if(col8 == 4)
        {
        col8 = (amountMoves - 5);
        spaces[row8][col8].add(p5);
        frame.setVisible(false);
        frame.setVisible(true);
        }

      }
      else if(row8 == 2 && col8 + amountMoves > 9)
      {
        p5.setVisible(false);
        p1score++;
      }
      else
      {
        col8 = col8 + amountMoves;
      spaces[row8][col8].add(p5);
      frame.setVisible(false);
      frame.setVisible(true);
      }
           //amountMoves = 0;
 
       if(extraTurn && numTurns < 1)
    {
      turn = true;
      numTurns++;
    }
    else
    {
      turn = false;
      numTurns = 0;
    }
    }
    win();
    moveUsed = true;
      }
    });


    }








public void moveP6()
    {

     row1 = 0;
     col1 = 1;

      spaces[row1][col1].add(p6);

      p6.addActionListener(new ActionListener() 
      {

      public void actionPerformed(ActionEvent e) 
      {   
        //numTurns = 0;
      if(!(turn))
      {
        if(row1 == 1 && col1 == 5)
        {
          row1 = 2; col1 = 5;
          spaces[row1][col1].add(p6);
        frame.setVisible(false);
        frame.setVisible(true);
        }
      else if(col1 + amountMoves > 9 && row1 == 0 )
      {
        row1++;
        if(col1 == 9)  {col1 = ((9 - amountMoves) + 1);
        spaces[row1][col1].add(p6);
        frame.setVisible(false);
        frame.setVisible(true);}
        else if(col1 == 8){ col1 = ((9 - amountMoves) + 2);
        spaces[row1][col1].add(p6);
        frame.setVisible(false);
        frame.setVisible(true);}
        else if(col1 == 7){ col1 = ((9 - amountMoves) + 3);
        spaces[row1][col1].add(p6);
        frame.setVisible(false);
        frame.setVisible(true);}
        else if(col1 == 6){ col1 = ((9 - amountMoves) + 4);
        spaces[row1][col1].add(p6);
        frame.setVisible(false);
        frame.setVisible(true);}
        else if(col1 == 5){ col1 = ((9 - amountMoves) + 5);
        spaces[row1][col1].add(p6);
        frame.setVisible(false);
        frame.setVisible(true);}
      }


      else if(row1 == 1 && !(col1 - amountMoves < 0))
      {
        col1 = col1 - amountMoves;
        spaces[row1][col1].add(p6);
        frame.setVisible(false);
      frame.setVisible(true);
      }


      else if(col1 - amountMoves < 0 && row1 == 1)
      {
        row1++;
        if(col1 == 0)
        {
        col1 = (amountMoves - 1);
        spaces[row1][col1].add(p6);
        frame.setVisible(false);
        frame.setVisible(true);
        }
        if(col1 == 1)
        {
        col1 = (amountMoves - 2);
        spaces[row1][col1].add(p6);
        frame.setVisible(false);
        frame.setVisible(true);
        }
        if(col1 == 2)
        {
        col1 = (amountMoves - 3);
        spaces[row1][col1].add(p6);
        frame.setVisible(false);
        frame.setVisible(true);
        }
        if(col1 == 3)
        {
        col1 = (amountMoves - 4);
        spaces[row1][col1].add(p6);
        frame.setVisible(false);
        frame.setVisible(true);
        }
        if(col1 == 4)
        {
        col1 = (amountMoves - 5);
        spaces[row1][col1].add(p6);
        frame.setVisible(false);
        frame.setVisible(true);
        }

      }
      else if(row1 == 2 && col1 + amountMoves > 9)
      {
        p6.setVisible(false);
        p2score++;
      }
      else
      {
        col1 = col1 + amountMoves;
      spaces[row1][col1].add(p6);
      frame.setVisible(false);
      frame.setVisible(true);
      }
        // amountMoves = 0;
 
       if(extraTurn && numTurns < 1)
    {
      turn = false;
      numTurns++;
    }
    else
    {
      turn = true;
      numTurns = 0;
    }
    }
    win();
    moveUsed = true;
      }

    });
      

    }





public void moveP7()
    {

     row3 = 0;
     col3 = 3;

      spaces[row3][col3].add(p7);

      p7.addActionListener(new ActionListener() 
      {

      public void actionPerformed(ActionEvent e) 
      {   
        //numTurns = 0;
      if(!(turn))
      {
        if(row3 == 1 && col3 == 5)
        {
          row3 = 2; col3 = 5;
          spaces[row3][col3].add(p7);
        frame.setVisible(false);
        frame.setVisible(true);
        }
      else if(col3 + amountMoves > 9 && row3 == 0 )
      {
        row3++;
        if(col3 == 9)  {col3 = ((9 - amountMoves) + 1);
        spaces[row3][col3].add(p7);
        frame.setVisible(false);
        frame.setVisible(true);}
        else if(col3 == 8){ col3 = ((9 - amountMoves) + 2);
        spaces[row3][col3].add(p7);
        frame.setVisible(false);
        frame.setVisible(true);}
        else if(col3 == 7){ col3 = ((9 - amountMoves) + 3);
        spaces[row3][col3].add(p7);
        frame.setVisible(false);
        frame.setVisible(true);}
        else if(col3 == 6){ col3 = ((9 - amountMoves) + 4);
        spaces[row3][col3].add(p7);
        frame.setVisible(false);
        frame.setVisible(true);}
        else if(col3 == 5){ col3 = ((9 - amountMoves) + 5);
        spaces[row3][col3].add(p7);
        frame.setVisible(false);
        frame.setVisible(true);}
      }


      else if(row3 == 1 && !(col3 - amountMoves < 0))
      {
        col3 = col3 - amountMoves;
        spaces[row3][col3].add(p7);
        frame.setVisible(false);
      frame.setVisible(true);
      }


      else if(col3 - amountMoves < 0 && row3 == 1)
      {
        row3++;
        if(col3 == 0)
        {
        col3 = (amountMoves - 1);
        spaces[row3][col3].add(p7);
        frame.setVisible(false);
        frame.setVisible(true);
        }
        if(col3 == 1)
        {
        col3 = (amountMoves - 2);
        spaces[row3][col3].add(p7);
        frame.setVisible(false);
        frame.setVisible(true);
        }
        if(col3 == 2)
        {
        col3 = (amountMoves - 3);
        spaces[row3][col3].add(p7);
        frame.setVisible(false);
        frame.setVisible(true);
        }
        if(col3 == 3)
        {
        col3 = (amountMoves - 4);
        spaces[row3][col3].add(p7);
        frame.setVisible(false);
        frame.setVisible(true);
        }
        if(col3 == 4)
        {
        col3 = (amountMoves - 5);
        spaces[row3][col3].add(p7);
        frame.setVisible(false);
        frame.setVisible(true);
        }

      }
      else if(row3 == 2 && col3 + amountMoves > 9)
      {
        p7.setVisible(false);
        p2score++;
      }
      else
      {
        col3 = col3 + amountMoves;
      spaces[row3][col3].add(p7);
      frame.setVisible(false);
      frame.setVisible(true);
      }
        //amountMoves = 0;
 
       if(extraTurn && numTurns < 1)
    {
      turn = false;
      numTurns++;
    }
    else
    {
      turn = true;
      numTurns = 0;
    }
    }
    win();
    moveUsed = true;
      }

    });
      

    }





public void moveP8()
    {

     row5 = 0;
     col5 = 5;

      spaces[row5][col5].add(p8);

      p8.addActionListener(new ActionListener() 
      {

      public void actionPerformed(ActionEvent e) 
      {   
       // numTurns = 0;
      if(!(turn))
      {
        if(row5 == 1 && col5 == 5)
        {
          row5 = 2; col5 = 5;
          spaces[row5][col5].add(p8);
        frame.setVisible(false);
        frame.setVisible(true);
        }
      else if(col5 + amountMoves > 9 && row5 == 0 )
      {
        row5++;
        if(col5 == 9)  {col5 = ((9 - amountMoves) + 1);
        spaces[row5][col5].add(p8);
        frame.setVisible(false);
        frame.setVisible(true);}
        else if(col5 == 8){ col5 = ((9 - amountMoves) + 2);
        spaces[row5][col5].add(p8);
        frame.setVisible(false);
        frame.setVisible(true);}
        else if(col5 == 7){ col5 = ((9 - amountMoves) + 3);
        spaces[row5][col5].add(p8);
        frame.setVisible(false);
        frame.setVisible(true);}
        else if(col5 == 6){ col5 = ((9 - amountMoves) + 4);
        spaces[row5][col5].add(p8);
        frame.setVisible(false);
        frame.setVisible(true);}
        else if(col5 == 5){ col5 = ((9 - amountMoves) + 5);
        spaces[row5][col5].add(p8);
        frame.setVisible(false);
        frame.setVisible(true);}
      }


      else if(row5 == 1 && !(col5 - amountMoves < 0))
      {
        col5 = col5 - amountMoves;
        spaces[row5][col5].add(p8);
        frame.setVisible(false);
      frame.setVisible(true);
      }


      else if(col5 - amountMoves < 0 && row5 == 1)
      {
        row5++;
        if(col5 == 0)
        {
        col5 = (amountMoves - 1);
        spaces[row5][col5].add(p8);
        frame.setVisible(false);
        frame.setVisible(true);
        }
        if(col5 == 1)
        {
        col5 = (amountMoves - 2);
        spaces[row5][col5].add(p8);
        frame.setVisible(false);
        frame.setVisible(true);
        }
        if(col5 == 2)
        {
        col5 = (amountMoves - 3);
        spaces[row5][col5].add(p8);
        frame.setVisible(false);
        frame.setVisible(true);
        }
        if(col5 == 3)
        {
        col5 = (amountMoves - 4);
        spaces[row5][col5].add(p8);
        frame.setVisible(false);
        frame.setVisible(true);
        }
        if(col5 == 4)
        {
        col5 = (amountMoves - 5);
        spaces[row5][col5].add(p8);
        frame.setVisible(false);
        frame.setVisible(true);
        }

      }
      else if(row5 == 2 && col5 + amountMoves > 9)
      {
        p8.setVisible(false);
        p2score++;
      }
      else
      {
        col5 = col5 + amountMoves;
      spaces[row5][col5].add(p8);
      frame.setVisible(false);
      frame.setVisible(true);
      }
        //amountMoves = 0;
 
       if(extraTurn && numTurns < 1)
    {
      turn = false;
      numTurns++;
    }
    else
    {
      turn = true;
      numTurns = 0;
    }
    }
    win();
    moveUsed = true;
      }

    });
      

    }





public void moveP9()
    {

     row7 = 0;
     col7 = 7;

      spaces[row7][col7].add(p9);

      p9.addActionListener(new ActionListener() 
      {

      public void actionPerformed(ActionEvent e) 
      {   
       // numTurns = 0;
      if(!(turn))
      {
        if(row7 == 1 && col7 == 5)
        {
          row7 = 2; col7 = 5;
          spaces[row7][col7].add(p9);
        frame.setVisible(false);
        frame.setVisible(true);
        }
      else if(col7 + amountMoves > 9 && row7 == 0 )
      {
        row7++;
        if(col7 == 9)  {col7 = ((9 - amountMoves) + 1);
        spaces[row7][col7].add(p9);
        frame.setVisible(false);
        frame.setVisible(true);}
        else if(col7 == 8){ col7 = ((9 - amountMoves) + 2);
        spaces[row7][col7].add(p9);
        frame.setVisible(false);
        frame.setVisible(true);}
        else if(col7 == 7){ col7 = ((9 - amountMoves) + 3);
        spaces[row7][col7].add(p9);
        frame.setVisible(false);
        frame.setVisible(true);}
        else if(col7 == 6){ col7 = ((9 - amountMoves) + 4);
        spaces[row7][col7].add(p9);
        frame.setVisible(false);
        frame.setVisible(true);}
        else if(col7 == 5){ col7 = ((9 - amountMoves) + 5);
        spaces[row7][col7].add(p9);
        frame.setVisible(false);
        frame.setVisible(true);}
      }


      else if(row7 == 1 && !(col7 - amountMoves < 0))
      {
        col7 = col7 - amountMoves;
        spaces[row7][col7].add(p9);
        frame.setVisible(false);
      frame.setVisible(true);
      }


      else if(col7 - amountMoves < 0 && row7 == 1)
      {
        row7++;
        if(col7 == 0)
        {
        col7 = (amountMoves - 1);
        spaces[row7][col7].add(p9);
        frame.setVisible(false);
        frame.setVisible(true);
        }
        if(col7 == 1)
        {
        col7 = (amountMoves - 2);
        spaces[row7][col7].add(p9);
        frame.setVisible(false);
        frame.setVisible(true);
        }
        if(col7 == 2)
        {
        col7 = (amountMoves - 3);
        spaces[row7][col7].add(p9);
        frame.setVisible(false);
        frame.setVisible(true);
        }
        if(col7 == 3)
        {
        col7 = (amountMoves - 4);
        spaces[row7][col7].add(p9);
        frame.setVisible(false);
        frame.setVisible(true);
        }
        if(col7 == 4)
        {
        col7 = (amountMoves - 5);
        spaces[row7][col7].add(p9);
        frame.setVisible(false);
        frame.setVisible(true);
        }

      }
      else if(row7 == 2 && col7 + amountMoves > 9)
      {
        p9.setVisible(false);
        p2score++;
      }
      else
      {
        col7 = col7 + amountMoves;
      spaces[row7][col7].add(p9);
      frame.setVisible(false);
      frame.setVisible(true);
      }
         //amountMoves = 0;
 
        if(extraTurn && numTurns < 1)
    {
      turn = false;
      numTurns++;
      
    }
    else
    {
      turn = true;
      numTurns = 0;
      
    }
    }
    win();
   moveUsed = true;
      }
      
    });
      

    }



//makes tenth stick, black

public void moveP10()
    {

      row9 = 0;
      col9 = 9;

      spaces[row9][col9].add(p10);

      p10.addActionListener(new ActionListener() 
      {

      public void actionPerformed(ActionEvent e) 
      {   
        //numTurns = 0;
      if(!(turn))
      {
        if(row9 == 1 && col9 == 5)
        {
          row9 = 2; col9 = 5;
          spaces[row9][col9].add(p10);
        frame.setVisible(false);
        frame.setVisible(true);
        }
      else if(col9 + amountMoves > 9 && row9 == 0 )
      {
        row9++;
        if(col9 == 9)  {col9 = ((9 - amountMoves) + 1);
        spaces[row9][col9].add(p10);
        frame.setVisible(false);
        frame.setVisible(true);}
        else if(col9 == 8){ col9 = ((9 - amountMoves) + 2);
        spaces[row9][col9].add(p10);
        frame.setVisible(false);
        frame.setVisible(true);}
        else if(col9 == 7){ col9 = ((9 - amountMoves) + 3);
        spaces[row9][col9].add(p10);
        frame.setVisible(false);
        frame.setVisible(true);}
        else if(col9 == 6){ col9 = ((9 - amountMoves) + 4);
        spaces[row9][col9].add(p10);
        frame.setVisible(false);
        frame.setVisible(true);}
        else if(col9 == 5){ col9 = ((9 - amountMoves) + 5);
        spaces[row9][col9].add(p10);
        frame.setVisible(false);
        frame.setVisible(true);}
      }


      else if(row9 == 1 && !(col9 - amountMoves < 0))
      {
        col9 = col9 - amountMoves;
        spaces[row9][col9].add(p10);
        frame.setVisible(false);
      frame.setVisible(true);
      }


      else if(col9 - amountMoves < 0 && row9 == 1)
      {
        row9++;
        if(col9 == 0)
        {
        col9 = (amountMoves - 1);
        spaces[row9][col9].add(p10);
        frame.setVisible(false);
        frame.setVisible(true);
        }
        if(col9 == 1)
        {
        col9 = (amountMoves - 2);
        spaces[row9][col9].add(p10);
        frame.setVisible(false);
        frame.setVisible(true);
        }
        if(col9 == 2)
        {
        col9 = (amountMoves - 3);
        spaces[row9][col9].add(p10);
        frame.setVisible(false);
        frame.setVisible(true);
        }
        if(col9 == 3)
        {
        col9 = (amountMoves - 4);
        spaces[row9][col9].add(p10);
        frame.setVisible(false);
        frame.setVisible(true);
        }
        if(col9 == 4)
        {
        col9 = (amountMoves - 5);
        spaces[row9][col9].add(p10);
        frame.setVisible(false);
        frame.setVisible(true);
        }

      }
      else if(row9 == 2 && col9 + amountMoves > 9)
      {
        p10.setVisible(false);
        p2score++;
      }
      else
      {
        col9 = col9 + amountMoves;
      spaces[row9][col9].add(p10);
      frame.setVisible(false);
      frame.setVisible(true);
      }
     // amountMoves = 0;
      
        if(extraTurn && numTurns < 1)
    {
      turn = false;
      numTurns++;
      
    }
    else
    {
      turn = true;
      numTurns = 0;
      
    }
    }
    win();
    moveUsed = true;
      }
    });


    }







    public void throwSticks()
    {
      {
        Container pane2 = frame.getContentPane();
        pane2.setLayout(new BoxLayout(pane2, BoxLayout.Y_AXIS));
        
        panel3.setLayout(new BoxLayout(panel3,BoxLayout.X_AXIS));
        panel3.setPreferredSize(new Dimension(650, 150));
        panel3.setMaximumSize(new Dimension(650,150));
        pane2.add(panel3);
      cast.addActionListener(new ActionListener() 
    {
    public void actionPerformed(ActionEvent e) 
    {
      if(moveUsed)
      {
        mustThrow = false;
      moveUsed = false;
      int numberCast = 0;
     int tmp = (int) ( Math.random() * 2 + 1);
      if (tmp == 1)
      {
       stick1.setIcon(icon5);
      }
      else
      {
        stick1.setIcon(icon6);
        numberCast++;
      }
      int ran1 = (int) ( Math.random() * 2 + 1);
      if (ran1 == 1)
      {
       stick2.setIcon(icon5);
      }
      else
      {
        stick2.setIcon(icon6);
        numberCast++;
      }
      int ran2 = (int) ( Math.random() * 2 + 1);
      if (ran2 == 1)
      {
       stick3.setIcon(icon5);
      }
      else
      {
        stick3.setIcon(icon6);
        numberCast++;
      }
      int ran3 = (int) ( Math.random() * 2 + 1);
      if (ran3 == 1)
      {
       stick4.setIcon(icon5);
      }
      else
      {
        stick4.setIcon(icon6);
        numberCast++;
      }
      panel3.add(stick1);
      panel3.add(stick2);      
      panel3.add(stick3);
      panel3.add(stick4);

      if(numberCast == 0)
      {
        amountMoves = 4;
        extraTurn = true;
      }
       if(numberCast == 1)
      {
        amountMoves = 3;
        extraTurn = false;
      }
       if(numberCast == 2)
      {
        amountMoves = 2;
        extraTurn = false;
      }
       if(numberCast == 3)
      {
        amountMoves = 1;
        extraTurn = true;
      }
       if(numberCast == 4)
      {
        amountMoves = 5;
        extraTurn = true;
      }
      if(initialize == 0)
      {
      //panel3.add(number);
      panel3.add(amountOfMoves);
      panel3.add(extraTurnB);
      initialize++;
      }
      else
      {
      number.setText(String.valueOf(numberCast));
      }
      amountOfMoves.setText("Amount Of Moves: " + String.valueOf(amountMoves) + "   ");
      extraTurnB.setText("Extra Turn: " + String.valueOf(extraTurn) + "     ");
      frame.setVisible(false);
      frame.setVisible(true);
      //cast.setVisible(false);
      //stick1.setVisible(false);
      //stick2.setVisible(false);
      //stick3.setVisible(false);
      //stick4.setVisible(false);
      }
    }
    });
      }
      
    }



  

    public void initComponents()
    {
        frame = new JFrame("Senet");
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((dim.width - FRAME_WIDTH) / 2, (dim.height - FRAME_HEIGHT) / 2);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(FRAME_WIDTH, FRAME_HEIGHT));//setPreferredSize take a Dimension object
        Container pane = frame.getContentPane();
        pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();
        panel.setPreferredSize(new Dimension(650, 250));
        panel.setMaximumSize(new Dimension(650,250));
        panel2.setPreferredSize(new Dimension(650, 50));
        panel2.setMaximumSize(new Dimension(650,50));
        panel.setLayout(new GridLayout(3,10));
        panel.setBackground(Color.GRAY);
        spaces = new JButton[3][10];
        
        for(int row = 0; row < 3; row++)
        {
            for(int col = 0; col < 10; col++)
            {
            
                if(row % 2 == 0 && col % 2 == 0)
                {
                JButton space = new JButton(icon);
                space.setBackground(new Color(120,200,50));
                space.setPreferredSize(new Dimension(20,20));
                space.setMaximumSize(new Dimension(20,20));
                space.setMinimumSize(new Dimension(20,20));
                spaces[row][col] = space;
                panel.add(space);
                }



                else if(row % 2 != 0 && col % 2 != 0)
                {
                  if (row == 1 && col == 5)
                  {
                    JButton space = new JButton(icon7);
                space.setBackground(new Color(120,200,50));
                space.setPreferredSize(new Dimension(20,20));
                space.setMaximumSize(new Dimension(20,20));
                space.setMinimumSize(new Dimension(20,20));
                spaces[row][col] = space;
                panel.add(space);
                  }
                  else
                  {
                     
                JButton space = new JButton(icon);
                space.setBackground(new Color(120,200,50));
                space.setPreferredSize(new Dimension(20,20));
                space.setMaximumSize(new Dimension(20,20));
                space.setMinimumSize(new Dimension(20,20));
                spaces[row][col] = space;
                panel.add(space);
                  }
                }



                else
                {
                    if (row == 2 && col == 5)
                  {
                    JButton space = new JButton(icon8);
                space.setBackground(new Color(120,200,50));
                space.setPreferredSize(new Dimension(20,20));
                space.setMaximumSize(new Dimension(20,20));
                space.setMinimumSize(new Dimension(20,20));
                spaces[row][col] = space;
                panel.add(space);
                  }
                  else
                  {
                 JButton space = new JButton(icon2);
                space.setBackground(new Color(120,200,50));
                space.setPreferredSize(new Dimension(20,20));
                space.setMaximumSize(new Dimension(20,20));
                space.setMinimumSize(new Dimension(20,20));
                spaces[row][col] = space;
                panel.add(space);
                  }
                }

            }
        }

        pane.add(panel);
        pane.add(panel2);
        panel2.add(startb);
        panel2.add(help);
        panel2.add(cast);
        frame.pack();
        frame.setVisible(true);
    }
    
      
    public static void main(String[] args)
    {
        new Main();
        
    }
  
}