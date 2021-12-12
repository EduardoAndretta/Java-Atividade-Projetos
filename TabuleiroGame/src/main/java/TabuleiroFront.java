
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 *
 * @author Eduardo Andretta
 */
public class TabuleiroFront extends javax.swing.JFrame {

    public TabuleiroFront() {
        initComponents();
     
        buttonDado.setEnabled(false);
        
        label1.setSize(42,42);
        labelAzul1.setSize(42,42);
        labelAmarelo1.setSize(42,42);
        labelCiano1.setSize(42,42);
        setPlayerLocation(labels, jLabel13, 0, position1, postionToRemove1, Player1, "peaoVerde.png");
        setPlayerLocation(labelsCiano, jLabel13, 0, position2, postionToRemove2, Player2, "peaoCiano.png");
        setPlayerLocation(labelsAmarelo, jLabel13, 0, position3, postionToRemove3, Player3, "peaoAmar.png");
        setPlayerLocation(labelsAzul, jLabel13, 0, position4, postionToRemove4, Player4, "peaoRoxo.png");
    }
    
  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
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
        buttonDado = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Play");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        FirstPlayerName.setBackground(new java.awt.Color(204, 204, 255));
        FirstPlayerName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        FirstPlayerName.setForeground(new java.awt.Color(255, 255, 255));
        FirstPlayerName.setBorder(null);

        SecondPlayerName.setBackground(new java.awt.Color(204, 204, 255));
        SecondPlayerName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SecondPlayerName.setForeground(new java.awt.Color(255, 255, 255));
        SecondPlayerName.setBorder(null);

        ThirdPlayerName.setBackground(new java.awt.Color(204, 204, 255));
        ThirdPlayerName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ThirdPlayerName.setForeground(new java.awt.Color(255, 255, 255));
        ThirdPlayerName.setBorder(null);

        FourthPlayerName.setBackground(new java.awt.Color(204, 204, 255));
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

        buttonDado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        buttonDado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDadoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 153, 0));
        jLabel10.setText("First Player");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Third Player");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Second Player");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Fourth Player");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11)))))
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonDado, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonDado, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void setPlayerLocation(JLabel[] array, JLabel jlabelPosition, int randomInteger, int position, int positionToRemove, String player, String peaoName){

        if(position >= 29){

            jLabel12.setText(player);
            array[positionToRemove].setIcon(null);
            resizeImage(array[29],"C:\\Users\\Eduardo Andretta\\Documents\\TabuleiroGame\\src\\main\\java\\images\\" + peaoName);
            buttonDado.setEnabled(false);
            jlabelPosition.setText(String.valueOf(30));
                    
        }else if(positionToRemove == position){    
            resizeImage(array[position],"C:\\Users\\Eduardo Andretta\\Documents\\TabuleiroGame\\src\\main\\java\\images\\" + peaoName);
            jlabelPosition.setText(String.valueOf(position+1));
        }else{
            array[positionToRemove].setIcon(null);
            resizeImage(array[position],"C:\\Users\\Eduardo Andretta\\Documents\\TabuleiroGame\\src\\main\\java\\images\\" + peaoName);
            jlabelPosition.setText(String.valueOf(position+1));
        }  

    }
    
    public void resizeImage(JLabel variableJlabel, String photo)
    {  
        BufferedImage icon = null;
        
        try {
            icon = ImageIO.read(new File(photo));
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        Image dimg = icon.getScaledInstance(variableJlabel.getWidth(), variableJlabel.getHeight(),
        Image.SCALE_SMOOTH);

        ImageIcon Icon = new ImageIcon(dimg);
        
        variableJlabel.setIcon(Icon);    
    }
    
    public void resizeImageButton(JButton variableJbutton, String photo)
    {  
        BufferedImage icon = null;
        
        try {
            icon = ImageIO.read(new File(photo));
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        Image dimg = icon.getScaledInstance(variableJbutton.getWidth(), variableJbutton.getHeight(),
        Image.SCALE_SMOOTH);

        ImageIcon Icon = new ImageIcon(dimg);
        
        variableJbutton.setIcon(Icon);    
    }
    
    public void playSound(String file) {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(file).getAbsoluteFile());

            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();

        } catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        }
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
    
    // Label for Icon
    
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
    
     JLabel labelAzul1 = new JLabel(), 
           labelAzul2 = new JLabel(),
           labelAzul3 = new JLabel(), 
           labelAzul4 = new JLabel(), 
           labelAzul5 = new JLabel(),
           labelAzul6 = new JLabel(), 
           labelAzul7 = new JLabel(), 
           labelAzul8 = new JLabel(), 
           labelAzul9 = new JLabel(), 
           labelAzul10 = new JLabel(), 
           labelAzul11 = new JLabel(), 
           labelAzul12 = new JLabel(), 
           labelAzul13 = new JLabel(), 
           labelAzul14 = new JLabel(), 
           labelAzul15 = new JLabel(),
           labelAzul16 = new JLabel(), 
           labelAzul17 = new JLabel(), 
           labelAzul18 = new JLabel(), 
           labelAzul19 = new JLabel(),
           labelAzul20 = new JLabel(),
           labelAzul21 = new JLabel(),
           labelAzul22 = new JLabel(), 
           labelAzul23 = new JLabel(), 
           labelAzul24 = new JLabel(), 
           labelAzul25 = new JLabel(),
           labelAzul26 = new JLabel(), 
           labelAzul27 = new JLabel(), 
           labelAzul28 = new JLabel(),
           labelAzul29 = new JLabel(), 
           labelAzul30 = new JLabel(),
           labelAzul31 = new JLabel();
     
     JLabel labelAmarelo1 = new JLabel(), 
           labelAmarelo2 = new JLabel(),
           labelAmarelo3 = new JLabel(), 
           labelAmarelo4 = new JLabel(), 
           labelAmarelo5 = new JLabel(),
           labelAmarelo6 = new JLabel(), 
           labelAmarelo7 = new JLabel(), 
           labelAmarelo8 = new JLabel(), 
           labelAmarelo9 = new JLabel(), 
           labelAmarelo10 = new JLabel(), 
           labelAmarelo11 = new JLabel(), 
           labelAmarelo12 = new JLabel(), 
           labelAmarelo13 = new JLabel(), 
           labelAmarelo14 = new JLabel(), 
           labelAmarelo15 = new JLabel(),
           labelAmarelo16 = new JLabel(), 
           labelAmarelo17 = new JLabel(), 
           labelAmarelo18 = new JLabel(), 
           labelAmarelo19 = new JLabel(),
           labelAmarelo20 = new JLabel(),
           labelAmarelo21 = new JLabel(),
           labelAmarelo22 = new JLabel(), 
           labelAmarelo23 = new JLabel(), 
           labelAmarelo24 = new JLabel(), 
           labelAmarelo25 = new JLabel(),
           labelAmarelo26 = new JLabel(), 
           labelAmarelo27 = new JLabel(), 
           labelAmarelo28 = new JLabel(),
           labelAmarelo29 = new JLabel(), 
           labelAmarelo30 = new JLabel(),
           labelAmarelo31 = new JLabel();
    
    JLabel labelCiano1 = new JLabel(), 
           labelCiano2 = new JLabel(),
           labelCiano3 = new JLabel(), 
           labelCiano4 = new JLabel(), 
           labelCiano5 = new JLabel(),
           labelCiano6 = new JLabel(), 
           labelCiano7 = new JLabel(), 
           labelCiano8 = new JLabel(), 
           labelCiano9 = new JLabel(), 
           labelCiano10 = new JLabel(), 
           labelCiano11 = new JLabel(), 
           labelCiano12 = new JLabel(), 
           labelCiano13 = new JLabel(), 
           labelCiano14 = new JLabel(), 
           labelCiano15 = new JLabel(),
           labelCiano16 = new JLabel(), 
           labelCiano17 = new JLabel(), 
           labelCiano18 = new JLabel(), 
           labelCiano19 = new JLabel(),
           labelCiano20 = new JLabel(),
           labelCiano21 = new JLabel(),
           labelCiano22 = new JLabel(), 
           labelCiano23 = new JLabel(), 
           labelCiano24 = new JLabel(), 
           labelCiano25 = new JLabel(),
           labelCiano26 = new JLabel(), 
           labelCiano27 = new JLabel(), 
           labelCiano28 = new JLabel(),
           labelCiano29 = new JLabel(), 
           labelCiano30 = new JLabel(),
           labelCiano31 = new JLabel();
    
    
    JPanel campos[] = {campo1, campo2, campo3, campo4, campo5, campo6, campo7, campo8, campo9, campo10,
                       campo11, campo12, campo13, campo14, campo15, campo16, campo17, campo18, campo19, campo20,
                       campo21, campo22, campo23, campo24, campo25, campo26, campo27, campo28, campo29, campo30, campo31};
    
    //Array - Label for Icon
    
    JLabel labels[] = {label1, label2, label3, label4, label5, label6, label7, label8, label9, label10,
                       label11, label12, label13, label14, label15, label16, label17, label18, label19, label20,
                       label21, label22, label23, label24, label25, label26, label27, label28, label29, label30, label31};
    
    JLabel labelsAzul[] = {labelAzul1, labelAzul2, labelAzul3, labelAzul4, labelAzul5, labelAzul6, labelAzul7, labelAzul8, labelAzul9, labelAzul10,
                       labelAzul11, labelAzul12, labelAzul13, labelAzul14, labelAzul15, labelAzul16, labelAzul17, labelAzul18, labelAzul19, labelAzul20,
                       labelAzul21, labelAzul22, labelAzul23, labelAzul24, labelAzul25, labelAzul26, labelAzul27, labelAzul28, labelAzul29, labelAzul30, labelAzul31};
    
     JLabel labelsAmarelo[] = {labelAmarelo1, labelAmarelo2, labelAmarelo3, labelAmarelo4, labelAmarelo5, labelAmarelo6, labelAmarelo7, labelAmarelo8, labelAmarelo9, labelAmarelo10,
                       labelAmarelo11, labelAmarelo12, labelAmarelo13, labelAmarelo14, labelAmarelo15, labelAmarelo16, labelAmarelo17, labelAmarelo18, labelAmarelo19, labelAmarelo20,
                       labelAmarelo21, labelAmarelo22, labelAmarelo23, labelAmarelo24, labelAmarelo25, labelAmarelo26, labelAmarelo27, labelAmarelo28, labelAmarelo29, labelAmarelo30, labelAmarelo31};
    
     JLabel labelsCiano[] = {labelCiano1, labelCiano2, labelCiano3, labelCiano4, labelCiano5, labelCiano6, labelCiano7, labelCiano8, labelCiano9, labelCiano10,
                       labelCiano11, labelCiano12, labelCiano13, labelCiano14, labelCiano15, labelCiano16, labelCiano17, labelCiano18, labelCiano19, labelCiano20,
                       labelCiano21, labelCiano22, labelCiano23, labelCiano24, labelCiano25, labelCiano26, labelCiano27, labelCiano28, labelCiano29, labelCiano30, labelCiano31};
    
    
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
    
    // Tabuleiro JFrame
    
    JFrame Tabuleiro = new JFrame();
    
    // Array - Dado
    
    String[] dados = {"dado1.png","dado2.png","dado3.png","dado4.png","dado5.png","dado5.png"};
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        Tabuleiro.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Tabuleiro.setSize(1030, 660);
        Tabuleiro.setLocationRelativeTo(null);
        Tabuleiro.setVisible(true);
        
        int[] horizontalPositions = {10, 110, 210, 310, 410, 510, 610, 710, 810, 910, 910, 810, 710, 610, 510, 410, 310, 210, 110,  10, 10, 110, 210, 310, 410, 510, 610, 710, 810, 910, 910};
        int[] verticalPositions =   {10,  20,  30,  40,  50,  60,  70,  80,  90, 100, 210, 220, 230, 240, 250, 260, 270, 280, 290, 300,410, 420, 430, 440, 450, 460, 470, 480, 490, 500, 500};
        
        int i = 0;
        
        for (JPanel campo : campos) {       
         
            campo.setLocation(horizontalPositions[i],verticalPositions[i]);
            campo.setSize(100, 100);
            campo.setBackground(new Color(56, 167, 255));  
            campo.setBorder(BorderFactory.createSoftBevelBorder(1, new Color(255, 255, 255), new Color(68, 136, 255)));
            
            // Correção de um bug (Label final sem localização)

            if(labels[i] != label31){
                campo.add(labels[i]);
                campo.add(labelsAzul[i]);
                campo.add(labelsCiano[i]);
                campo.add(labelsAmarelo[i]);
            }
            
            Tabuleiro.add(campo); 
            i++;
            
            //Random messages (Mensagens (Ex. "Volte uma casa"))
//            
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
        
        buttonDado.setEnabled(true);
        jButton1.setEnabled(false);
        
        FirstPlayerName.setEditable(false);
        SecondPlayerName.setEditable(false);
        ThirdPlayerName.setEditable(false);
        FourthPlayerName.setEditable(false);
        
        NameVerification();
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void buttonDadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDadoActionPerformed
        
        
        for(JPanel campo : campos) { campo.setLayout(new GridLayout(2,2)); }
        for(JLabel label : labels){ label.setSize(42, 42); }
        for(JLabel label : labelsAmarelo){ label.setSize(42, 42); }
        for(JLabel label : labelsAzul){ label.setSize(42, 42);}
        for(JLabel label : labelsCiano){ label.setSize(42, 42); }      
     
        contPlayer++;

        // Random Number
        int max = 6;
        int min = 1;
        int randomInteger = (int)Math.floor(Math.random()*(max-min+1)+min);
        
        // Icon - Dado Image
        
        for(int dado = 1; dado < 7; dado++){
            if(randomInteger == dado){       
                resizeImageButton(buttonDado, "C:\\Users\\Eduardo Andretta\\Documents\\TabuleiroGame\\src\\main\\java\\images\\dado"+dado+".png");
                playSound("C:\\Users\\Eduardo Andretta\\Documents\\TabuleiroGame\\src\\main\\java\\audio\\dadoRolando.wav");
            }
        }

        // Value - Dado
        
        jLabel5.setText(String.valueOf(randomInteger));
 
            switch(contPlayer){

                case 1:
                    position1 += randomInteger;
                    setPlayerLocation(labels, jLabel13, randomInteger, position1, postionToRemove1, Player1, "peaoVerde.png");
                    postionToRemove1 = position1;
                    break; 

                case 2:
                    position2 += randomInteger;
                    setPlayerLocation(labelsCiano, jLabel6, randomInteger, position2, postionToRemove2, Player2, "peaoCiano.png");
                    postionToRemove2 = position2;
                    break; 

                case 3:
                    position3 += randomInteger;
                    setPlayerLocation(labelsAmarelo, jLabel14, randomInteger, position3, postionToRemove3, Player3, "peaoAmar.png");
                    postionToRemove3 = position3;
                    break; 

                case 4:
                    position4 += randomInteger;
                    setPlayerLocation(labelsAzul, jLabel7, randomInteger, position4, postionToRemove4, Player4, "peaoRoxo.png");
                    postionToRemove4 = position4;
                    contPlayer = 0;
                    break;
            }
    }//GEN-LAST:event_buttonDadoActionPerformed

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
    private javax.swing.JButton buttonDado;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
