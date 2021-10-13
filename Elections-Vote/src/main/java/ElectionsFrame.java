
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import static java.awt.PageAttributes.MediaType.C;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.EventListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ButtonModel;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ElectionsFrame extends javax.swing.JFrame {

    public ElectionsFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jOptionPane1 = new javax.swing.JOptionPane();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Urna Eletrônica");
        setBackground(new java.awt.Color(153, 153, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.black);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton3.setText("3");
        jButton3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(204, 204, 204));
        jButton5.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jButton5.setText("1");
        jButton5.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray));
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton4.setText("2");
        jButton4.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(204, 204, 204));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton6.setText("4");
        jButton6.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(204, 204, 204));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton7.setText("5");
        jButton7.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(204, 204, 204));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton8.setText("6");
        jButton8.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jTextField1.setBackground(new java.awt.Color(204, 204, 204));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));

        jList1.setBackground(new java.awt.Color(204, 204, 204));
        jList1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jList1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jScrollPane1.setViewportView(jList1);

        jButton9.setBackground(new java.awt.Color(204, 204, 204));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton9.setText("Apurar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(204, 204, 204));
        jButton10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton10.setText("Resultado");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(204, 204, 204));
        jButton11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton11.setText("Confirmar");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Yu Mincho Demibold", 0, 36)); // NOI18N

        jButton12.setBackground(new java.awt.Color(255, 255, 255));
        jButton12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton12.setText("Reiniciar");
        jButton12.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nome", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setForeground(new java.awt.Color(51, 51, 0));

        jButton13.setBackground(new java.awt.Color(255, 255, 255));
        jButton13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton13.setForeground(new java.awt.Color(0, 255, 0));
        jButton13.setText("Ativado");
        jButton13.setActionCommand("");
        jButton13.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(255, 255, 255));
        jButton14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton14.setText("Desativado");
        jButton14.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Notificações:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jButton11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void ClearText(){
        jTextField1.setText("");  
    }
    public void BlockButton(){  
       jButton10.setEnabled(false); 
    }
    public void BlockKeys(){
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
        jButton6.setEnabled(false);
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
        jButton9.setEnabled(false);
        jButton11.setEnabled(false);
        jTextField1.setEnabled(false);  
    }
    public void TurnOnKeys(){
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
        jButton11.setEnabled(true);
        jTextField1.setEnabled(true);
    }
    public void Focus(){ 
        jTextField1.requestFocus();
    }
    public void Ativo(){
        
        //Estilo - Botão Ativo (Message Box)
        
        jButton13.setForeground(Color.GREEN);
        jButton13.setText("Ativado");
        jButton14.setForeground(Color.BLACK);
        notification = 0;        
    }
    public void Desativado(){
        
        //Estilo - Botão Desativado (Message Box)
        
        jButton14.setForeground(Color.RED);
        jButton14.setText("Desativado");
        jButton13.setForeground(Color.BLACK);
        notification = 1;
    }
    public void ImageAndContentChange(String number, String name, String information1, String information2, String file){
        //Adiconando número apertado no jTextField
        
        jTextField1.setText(number);
        
        //Adicionando informações sobre o candidato escolhido(a) 

        jLabel3.setText(name);
        jLabel4.setText(information1);
        jLabel5.setText(information2);
       
        //Criando uma variável para armazenar o jLabel2 (Importação no Java)
        
        JLabel variableJlabel = jLabel2;
        
        //Criando um BufferedImage com valor null (Importação no Java)
       
        BufferedImage icon = null;
        
        //Utilizando o try para ler imagem com ImageIO.read (Importação no Java)
        
        try {
            //Coletando o File
            
            icon = ImageIO.read(new File(file));
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Redimensainando a imagem e atribuindo a variável dimg (Importação no Java)
        
        Image dimg = icon.getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(),
        Image.SCALE_SMOOTH);
        
        //Criando o ImageIcon (Importação no Java)
        
        ImageIcon politicIcon = new ImageIcon(dimg);
        
        //Atribuindo Icon ao jLabel1 
        
        variableJlabel.setIcon(politicIcon); 
}
    public void NoImageAndContentChange(String number, String icon1, String voteInformation, String null1, String null2, String null3){
        
         //Adiconando número apertado no jTextField
        
        jTextField1.setText(number); 
        
        //Criando uma variável para armazenar o jLabel2 (Importação no Java)
        
        JLabel variableJlabel = jLabel2;
        
        //Criando o ImageIcon (Importação no Java)
        
        ImageIcon icon = new ImageIcon(icon1);
        
        //Atribuindo Icon ao jLabel1 
        
        variableJlabel.setIcon(icon);
        
        //Adicionando informações sobre a ação escolhida
        
        jLabel2.setText(voteInformation);
        
        //Deixando as informações vazias
        
        jLabel3.setText("");
        jLabel4.setText("");
        jLabel5.setText("");
    }
    
    public void notificationIF(String message){
        
        //Caso notification for 0
        
        if(notification == 0){
                
            //MessageBox Ativado
            
            JOptionPane.showMessageDialog(null,message);
                    
        }else{/*MessageBox Desativado*/}
    }
    
//Variáveis 
    
    
    int valueFirstPolitic = 0;
    int valueSecondPolitic = 0;
    int valueThirdPolitic = 0;
    int valueFourthPolitic = 0;
    int valueNull = 0;
    int valueBlank = 0;
    int vote = 0;
    int total = 0;
    int notification = 0;
    int highVoteValue;
    String[] candit = new String[4];
    String canditGreat;
   
    //Classe para não redimensionar elementos
    
     public class MainWindow extends JFrame{

        public MainWindow(){
        
            JFrame frame = new JFrame();
            frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
            frame.setVisible(true);
            frame.setResizable(false); 
        }
    }

    //Buttons for number key
    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
       BlockButton();
        
       ImageAndContentChange("1", "Antoon van Dyck", "Retratista brabantino", "Principal pintor da corte real de Carlos I da Inglaterra", "C:\\Users\\Eduardo Andretta\\Documents\\NetBeansProjects\\Elections-Vote\\src\\main\\java\\Antoon van Dyck.jpg");
 
       Focus();
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        BlockButton(); 
       
        ImageAndContentChange("2", "Katherine Clayton", "Senhora Howard o Walden", "Título pendente de baronesa Howard de Walden", "C:\\Users\\Eduardo Andretta\\Documents\\NetBeansProjects\\Elections-Vote\\src\\main\\java\\Benjamin-West-Katherine-Clayton-Lady-Howard-de-Walden.jpg");

        Focus();
       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         
        BlockButton();
        
        ImageAndContentChange("3", "Jeanne D'Arc", "Camponesa e Santa francesa", "Heroína francesa da Guerra dos Cem Anos", "C:\\Users\\Eduardo Andretta\\Documents\\NetBeansProjects\\Elections-Vote\\src\\main\\java\\Joan-of-Arc.jpg");
       
        Focus();
  
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
        BlockButton();

        ImageAndContentChange("4", "Paul Antoine de la Boulaye", "Pintora francesa", "Compositora do quadro 'Sainte Jeanne d'Arc'", "C:\\Users\\Eduardo Andretta\\Documents\\NetBeansProjects\\Elections-Vote\\src\\main\\java\\Paul Antoine de la Boulaye.jpg");
        
        Focus();
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
        BlockButton();
    
        ImageAndContentChange("5", "Voto Nulo", " ", " ", "C:\\Users\\Eduardo Andretta\\Documents\\NetBeansProjects\\Elections-Vote\\src\\main\\java\\votoNulo.png");
        //NoImageAndContentChange("5", "", "Nulo", "", "", "");
  
        Focus();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        
        BlockButton();
        
        
        ImageAndContentChange("6", "Voto Branco", " ", " ", "C:\\Users\\Eduardo Andretta\\Documents\\NetBeansProjects\\Elections-Vote\\src\\main\\java\\votoBranco.png");
        //NoImageAndContentChange("6", "", "Branco", "", "", "");
        
        Focus();
        
    }//GEN-LAST:event_jButton8ActionPerformed

    //Submit Button
    
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        
        BlockButton();
        
        String vote = jTextField1.getText();
        
        
        
        if(null == vote){
            
            jTextField1.setText("Digite um valor válido");
            notificationIF("Voto não concretizado!");
            
        }else switch (vote) {
            case "um":
            case "1":
            case "Um":
                valueFirstPolitic++;
                ClearText();
                notificationIF("Voto concretizado!");
                break;
            
            case "dois":
            case "2":
            case "Dois":
                valueSecondPolitic++;
                ClearText();
                notificationIF("Voto concretizado!");
                break;
            
            case "três":
            case "3":
            case "Três":
            case "tres":
            case "Tres":
                valueThirdPolitic++;
                ClearText();
                notificationIF("Voto concretizado!");
                break;
            
            case "quatro":
            case "4":
            case "Quatro":
                valueFourthPolitic++;
                ClearText();
                notificationIF("Voto concretizado!");
                break;
           
            case "cinco":
            case "5":
            case "Cinco":
                valueNull++;
                ClearText();
                notificationIF("Voto concretizado!");
                break;
            
            case "seis":
            case "6":
            case "Seis":
                valueBlank++;
                ClearText();
                notificationIF("Voto concretizado!");
                break;
            
            default:
                jTextField1.setText("Digite um valor válido");
                notificationIF("Voto não concretizado!");
                break;
        }
        
        Focus();

    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

        java.awt.Toolkit.getDefaultToolkit().beep();
        
        total = valueBlank + valueFirstPolitic + valueSecondPolitic + valueThirdPolitic + valueFourthPolitic + valueNull; 
        
        //Criando uma variável para armazenar o maior valor
        //O MIN_VALUE é o menor valor possível de um Integer (Isso serve para inciar a primeira comparação e não afetar o resultado)
        
        highVoteValue = Integer.MIN_VALUE;
        
        int[] arrayElections = {valueFirstPolitic, valueSecondPolitic,valueThirdPolitic,valueFourthPolitic};
        
        String[] candit = {"Antoon van Dyck","Katherine Clayton","Jeanne D'Arc","Paul Antoine de la Boulaye"};
        
        highVoteValue = Integer.MIN_VALUE;
        
        //Inciando um for para iniciar as repetições de comparação (.length indica o tamanho do Array)
        
        for(int i = 0; i < arrayElections.length; i++){
            
            //Introduzindo um if para realizar a comparação
            //Caso o [i] (Elemento da vez) for maior que highVoteValue (Elemento que irá armazenar cada valor)
            
            if(arrayElections[i] > highVoteValue){
                
                //Caso for True, o highVoteValue armazena o valor [i] (Elemento da vez) e recomeça a comaparação até acabar o tamanho do Array
                
                highVoteValue = arrayElections[i];
                
                //Atribuindo o nome do candidato vencedor
                
                canditGreat = candit[i];
            
            //Caso não houver votos para candidatos    
                
            }else if(highVoteValue == 0){
                
                canditGreat = "Não há votos nos Candidatos!";    

            //Caso acontecer um empate
            
            }else if(arrayElections[i] == highVoteValue){
                
                canditGreat = "Empate";
                
            }
        }        

        BlockKeys();
        
        ImageAndContentChange(" ", "Fim", " ", " ", "C:\\Users\\Eduardo Andretta\\Documents\\NetBeansProjects\\Elections-Vote\\src\\main\\java\\Fim.png");
        notificationIF("Apuração Finalizada!\nVerifique o resultado.");
            
        jButton10.setEnabled(true);
        
        jButton10.requestFocus();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        

    BlockButton();
            
    DefaultListModel modelElections = new DefaultListModel();    
        
    modelElections.addElement("Primeiro Candidato: " + valueFirstPolitic);
    modelElections.addElement("Segundo Candidato: " +valueSecondPolitic);
    modelElections.addElement("Terceiro Candidato: " +valueThirdPolitic);
    modelElections.addElement("Quarto Candidato: " +valueFourthPolitic);
    modelElections.addElement("Votos Nulos: " +valueNull);
    modelElections.addElement("Votos em Branco: " +valueBlank);
    modelElections.addElement(" ");
    modelElections.addElement("Total de votos: " +total);
    modelElections.addElement(" ");
    modelElections.addElement("Vencedor(a): " +canditGreat);
    
    this.jList1.setModel(modelElections);   
        
    jButton12.requestFocus();    
    
    //JList list = new JList(model);
 
    //modelElections.add(0, "item 1");
    //modelElections.add(1, "item 2");
    //modelElections.add(2, "item 3");

    //DefaultListModel model = (DefaultListModel) list.getModel();
    //model.add(model.getSize(), "item final");

    //DefaultListModel mode2 = (DefaultListModel) list.getModel();
    //model.add(0, "item começo");
    
    //DefaultListModel model = new DefaultListModel();
    //JList list = new JList(model);
 
    //JScrollPane jscroll = new JScrollPane(list);
        

        
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        
        highVoteValue = Integer.MIN_VALUE;
        canditGreat = "";
        valueFirstPolitic = 0;
        valueSecondPolitic = 0;
        valueThirdPolitic = 0;
        valueFourthPolitic = 0;
        valueNull = 0;
        valueBlank = 0;
        vote = 0;
        total = 0;
        
        
        
        TurnOnKeys();
        
        DefaultListModel modelElectionsNull = new DefaultListModel();    
        
        modelElectionsNull.addElement("");
        
        this.jList1.setModel(modelElectionsNull); 
        
        JLabel variableJlabel = jLabel2;
        
        ImageIcon icon = new ImageIcon("");
        
        variableJlabel.setIcon(icon);
        
        
        jTextField1.setText("");
        
        jLabel2.setText("");
        jLabel3.setText("");
        jLabel4.setText("");
        jLabel5.setText("");

        
        Focus();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        jButton10.setEnabled(false);
        Focus();
        
    }//GEN-LAST:event_formWindowOpened

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
           
        Ativo();
        Focus();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed

        
        Desativado();  
        Focus();
    }//GEN-LAST:event_jButton14ActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ElectionsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    public javax.swing.JButton jButton13;
    public javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList<String> jList1;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    private void or(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
