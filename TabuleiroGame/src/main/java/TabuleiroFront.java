
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.TitledBorder;
import java.util.concurrent.ThreadLocalRandom;


/**
 *
 * @author Eduardo Andretta
 */
public class TabuleiroFront extends javax.swing.JFrame {

    public TabuleiroFront() {
        initComponents();
     
        jButton2.setEnabled(false);
        
        label1.setSize(90,90);
        resizeImage(label1,"C:\\Users\\Eduardo Andretta\\Documents\\TabuleiroGame\\src\\main\\java\\images\\peao.png");      

        
    }
    
  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        FirstPlayerName = new javax.swing.JTextField();
        SecondPlayerName = new javax.swing.JTextField();
        ThirdPlayerName = new javax.swing.JTextField();
        FourthPlayerName = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 51));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Play");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));

        FirstPlayerName.setBackground(new java.awt.Color(255, 102, 0));
        FirstPlayerName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        FirstPlayerName.setForeground(new java.awt.Color(255, 255, 255));
        FirstPlayerName.setBorder(null);

        SecondPlayerName.setBackground(new java.awt.Color(255, 102, 0));
        SecondPlayerName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SecondPlayerName.setForeground(new java.awt.Color(255, 255, 255));
        SecondPlayerName.setBorder(null);

        ThirdPlayerName.setBackground(new java.awt.Color(255, 102, 0));
        ThirdPlayerName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ThirdPlayerName.setForeground(new java.awt.Color(255, 255, 255));
        ThirdPlayerName.setBorder(null);

        FourthPlayerName.setBackground(new java.awt.Color(255, 102, 0));
        FourthPlayerName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        FourthPlayerName.setForeground(new java.awt.Color(255, 255, 255));
        FourthPlayerName.setBorder(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Second Player");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("First Player");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Third Player");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fourth Player");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ThirdPlayerName)
                    .addComponent(FourthPlayerName)
                    .addComponent(jSeparator2)
                    .addComponent(FirstPlayerName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SecondPlayerName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FirstPlayerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SecondPlayerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel3)
                .addGap(11, 11, 11)
                .addComponent(ThirdPlayerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FourthPlayerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setText("Dado");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Fourth Player");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Fourth Player");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Fourth Player");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Fourth Player");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(73, 73, 73)
                                        .addComponent(jLabel11))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(33, 33, 33))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(31, 31, 31)
                        .addComponent(jLabel12)))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     public void resizeImage(JLabel variableJlabel, String photo)
    {  
        BufferedImage icon = null;
        
        try 
        {
            
            icon = ImageIO.read(new File(photo));
        } catch (IOException e) 
        {
            e.printStackTrace();
        }
        
        Image dimg = icon.getScaledInstance(variableJlabel.getWidth(), variableJlabel.getHeight(),
        Image.SCALE_SMOOTH);

        ImageIcon Icon = new ImageIcon(dimg);
        
        variableJlabel.setIcon(Icon);    
    }
  
     public void NameVerification(){
         
          if("".equals(FirstPlayerName.getText().trim()) || FirstPlayerName.getText().trim() == null){
            Player1 = "Jogador 1";
        }else{
            Player1 = FirstPlayerName.getText().trim();
        }
        
        if("".equals(SecondPlayerName.getText().trim()) || SecondPlayerName.getText().trim() == null){
            Player2 = "Jogador 2";
        }else{
            Player2 = SecondPlayerName.getText().trim();
        }
        
        if("".equals(ThirdPlayerName.getText().trim()) || ThirdPlayerName.getText().trim() == null){
            Player3 = "Jogador 3";
        }else{
            Player3 = ThirdPlayerName.getText().trim();
        }
        
        if("".equals(FourthPlayerName.getText().trim()) || FourthPlayerName.getText().trim() == null){
            Player4 = "Jogador 4";
        }else{
            Player4 = FourthPlayerName.getText().trim();
        }
     }
    
    JPanel campo1 = new JPanel(), 
           campo2 = new JPanel(),
           campo3 = new JPanel(), 
           campo4 = new JPanel(), 
           campo5 = new JPanel(),
           campo6 = new JPanel(), 
           campo7 = new JPanel(), 
           campo8 = new JPanel(), 
           campo9 = new JPanel(), 
           campo10 = new JPanel(), 
           campo11 = new JPanel(), 
           campo12 = new JPanel(), 
           campo13 = new JPanel(), 
           campo14 = new JPanel(), 
           campo15 = new JPanel(),
           campo16 = new JPanel(), 
           campo17 = new JPanel(), 
           campo18 = new JPanel(), 
           campo19 = new JPanel(),
           campo20 = new JPanel(),
           campo21 = new JPanel(),
           campo22 = new JPanel(), 
           campo23 = new JPanel(), 
           campo24 = new JPanel(), 
           campo25 = new JPanel(),
           campo26 = new JPanel(), 
           campo27 = new JPanel(), 
           campo28 = new JPanel(),
           campo29 = new JPanel(), 
           campo30 = new JPanel(),
           campo31 = new JPanel();
    
    JLabel label1 = new JLabel(), 
           label2 = new JLabel(),
           label3 = new JLabel(), 
           label4 = new JLabel(), 
           label5 = new JLabel(),
           label6 = new JLabel(), 
           label7 = new JLabel(), 
           label8 = new JLabel(), 
           label9 = new JLabel(), 
           label10 = new JLabel(), 
           label11 = new JLabel(), 
           label12 = new JLabel(), 
           label13 = new JLabel(), 
           label14 = new JLabel(), 
           label15 = new JLabel(),
           label16 = new JLabel(), 
           label17 = new JLabel(), 
           label18 = new JLabel(), 
           label19 = new JLabel(),
           label20 = new JLabel(),
           label21 = new JLabel(),
           label22 = new JLabel(), 
           label23 = new JLabel(), 
           label24 = new JLabel(), 
           label25 = new JLabel(),
           label26 = new JLabel(), 
           label27 = new JLabel(), 
           label28 = new JLabel(),
           label29 = new JLabel(), 
           label30 = new JLabel(),
           label31 = new JLabel();
    
    JPanel campos[] = {campo1, campo2, campo3, campo4, campo5, campo6, campo7, campo8, campo9, campo10,
                       campo11, campo12, campo13, campo14, campo15, campo16, campo17, campo18, campo19, campo20,
                       campo21, campo22, campo23, campo24, campo25, campo26, campo27, campo28, campo29, campo30, campo31};
    
    JLabel labels[] = {label1, label2, label3, label4, label5, label6, label7, label8, label9, label10,
                       label11, label12, label13, label14, label15, label16, label17, label18, label19, label20,
                       label21, label22, label23, label24, label25, label26, label27, label28, label29, label30, label31};
    
    String messages[] = {"Volte uma casa","Volte duas casas","Volte para o início","Volte cinco casas","Volte quatro casas"};
    
    // Player Name
    
    String Player1;
    String Player2;
    String Player3;
    String Player4;
    
    // Players Array
    
    String[] players = {Player1, Player2, Player3, Player4};
    
    // Postion Player
    
    int position1 = 0;
    int position2 = 0;
    int position3 = 0;
    int position4 = 0;
    
    // Postions Array
    
    int[] positions = {position1, position2, position3, position4};
    
    // Remove position Logic
    
    int postionToRemove1 = 0;
    int postionToRemove2 = 0;
    int postionToRemove3 = 0;
    int postionToRemove4 = 0;
    
    // Cont Player
    
    int contPlayer = 0;
    
    // String - Winner
    
    String winner = "";
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
        JFrame Tabuleiro = new JFrame();
        Tabuleiro.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Tabuleiro.setSize(1030, 660);
        Tabuleiro.setLocationRelativeTo(null);
        Tabuleiro.setVisible(true);
        
        int[] horizontalPositions = {10, 110, 210, 310, 410, 510, 610, 710, 810, 910, 910, 810, 710, 610, 510, 410, 310, 210, 110,  10, 10, 110, 210, 310, 410, 510, 610, 710, 810, 910, 0};
        int[] verticalPositions =   {10,  20,  30,  40,  50,  60,  70,  80,  90, 100, 210, 220, 230, 240, 250, 260, 270, 280, 290, 300,410, 420, 430, 440, 450, 460, 470, 480, 490, 500, 0};
        
        int i = 0;
        
        for (JPanel campo : campos) {       
            Tabuleiro.add(campo); 
            campo.setLocation(horizontalPositions[i],verticalPositions[i]);
            campo.setSize(100, 100);
            campo.setBackground(Color.RED);  
            campo.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            
            campo.add(labels[i]);
            labels[i].setLocation(horizontalPositions[i],verticalPositions[i]);
            labels[i].setSize(90, 90);
            labels[i].setVisible(true);
            
            i++;
            
            // Random messages (Mensagens (Ex. "Volte uma casa"))
            
//            if(i == 10 || i== 15 || i == 20 || i == 25 || i == 30){
//                int max = 28;
//                int min = 2;
//                int randomInteger = (int)Math.floor(Math.random()*(max-min+1)+min);
//                int randomIntegerMessage = (int)Math.floor(Math.random()*(4-0+1)+0);
//                
//                if("".equals(labels[randomInteger].getText().trim()) || labels[randomInteger].getText() == null){
//                    
//                    labels[randomInteger].setText(messages[randomIntegerMessage]);
//                    labels[randomInteger].setFont(new Font("Segoe UI", Font.BOLD, 10)); 
//                    labels[randomInteger].setForeground(new Color(255,255,255));       
//                }
//            }
        }  
  
        jButton2.setEnabled(true);
        jButton1.setEnabled(false);
        
        FirstPlayerName.setEditable(false);
        SecondPlayerName.setEditable(false);
        ThirdPlayerName.setEditable(false);
        FourthPlayerName.setEditable(false);
        
        NameVerification();
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        for(JLabel label : labels){     
            label.setSize(90, 90);     
        }

        for(int e = 0; e == 0; e++){

            label1.setIcon(null);
        }

        contPlayer++;

        if(position1 != 30 || position2 != 30 || position3 != 30 || position4 != 30){

            // Random Number

            int max = 6;
            int min = 0;
            int randomInteger = (int)Math.floor(Math.random()*(max-min+1)+min);

            jLabel5.setText(String.valueOf(randomInteger));

            switch(contPlayer){

                case 1:
                    position1 += randomInteger;

                    if(position1 >= 30){    
                        labels[postionToRemove1].setIcon(null);
                        resizeImage(labels[29],"C:\\Users\\Eduardo Andretta\\Documents\\TabuleiroGame\\src\\main\\java\\images\\peaoVerde.png");
                        jButton2.setEnabled(false);
                    }else if(postionToRemove1 == position1){    
                        resizeImage(labels[position1],"C:\\Users\\Eduardo Andretta\\Documents\\TabuleiroGame\\src\\main\\java\\images\\peaoVerde.png");
                    }else{
                        labels[postionToRemove1].setIcon(null);
                        resizeImage(labels[position1],"C:\\Users\\Eduardo Andretta\\Documents\\TabuleiroGame\\src\\main\\java\\images\\peaoVerde.png");

                    }
                    postionToRemove1 = position1;
                    break; 

                case 2:
                    position2 += randomInteger;

                    if(position2 >= 30){    
                        labels[postionToRemove2].setIcon(null);
                        resizeImage(labels[29],"C:\\Users\\Eduardo Andretta\\Documents\\TabuleiroGame\\src\\main\\java\\images\\peao.png");
                        jButton2.setEnabled(false);
                    }else if(postionToRemove2 == position2){    
                        resizeImage(labels[position2],"C:\\Users\\Eduardo Andretta\\Documents\\TabuleiroGame\\src\\main\\java\\images\\peao.png");
                    }else{
                        labels[postionToRemove2].setIcon(null);
                        resizeImage(labels[position2],"C:\\Users\\Eduardo Andretta\\Documents\\TabuleiroGame\\src\\main\\java\\images\\peao.png");

                    }
                    postionToRemove2 = position2;
                    break; 

                case 3:
                   position3 += randomInteger;

                    if(position3 >= 30){    
                        labels[postionToRemove3].setIcon(null);
                        resizeImage(labels[29],"C:\\Users\\Eduardo Andretta\\Documents\\TabuleiroGame\\src\\main\\java\\images\\peao.png");
                        jButton2.setEnabled(false);
                    }else if(postionToRemove3 == position3){    
                        resizeImage(labels[position3],"C:\\Users\\Eduardo Andretta\\Documents\\TabuleiroGame\\src\\main\\java\\images\\peao.png");
                    }else{
                        labels[postionToRemove3].setIcon(null);
                        resizeImage(labels[position3],"C:\\Users\\Eduardo Andretta\\Documents\\TabuleiroGame\\src\\main\\java\\images\\peao.png");

                    }
                    postionToRemove3 = position3;
                    break; 

                case 4:
                    position4 += randomInteger;

                    if(position4 >= 30){    
                        labels[postionToRemove4].setIcon(null);
                        resizeImage(labels[29],"C:\\Users\\Eduardo Andretta\\Documents\\TabuleiroGame\\src\\main\\java\\images\\peao.png");
                        jButton2.setEnabled(false);
                    }else if(postionToRemove4 == position4){    
                        resizeImage(labels[position4],"C:\\Users\\Eduardo Andretta\\Documents\\TabuleiroGame\\src\\main\\java\\images\\peao.png");
                    }else{
                        labels[postionToRemove4].setIcon(null);
                        resizeImage(labels[position4],"C:\\Users\\Eduardo Andretta\\Documents\\TabuleiroGame\\src\\main\\java\\images\\peao.png");

                    }
                    postionToRemove4 = position4;

                    // Reset

                    contPlayer = 0;
                    break;
            }

        }else{

            for(int i = 0; i < 3; i++){

                if(positions[i] >= 30){

                    winner = players[i];

                } 
            }

            jLabel12.setText(winner);
            jButton2.setEnabled(false);

        }  
     
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TabuleiroFront().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FirstPlayerName;
    private javax.swing.JTextField FourthPlayerName;
    private javax.swing.JTextField SecondPlayerName;
    private javax.swing.JTextField ThirdPlayerName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
