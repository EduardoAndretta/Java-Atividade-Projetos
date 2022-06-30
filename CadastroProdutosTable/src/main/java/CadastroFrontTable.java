
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class CadastroFrontTable extends javax.swing.JFrame {

  
    public CadastroFrontTable() {
        initComponents();
        //Primeira Ordem (Inserir e Alterar [Bloqueio de Letras])
        
        jTextField3.setDocument(new OnlyNumbers());
        jTextField4.setDocument(new OnlyNumbers());
        jTextField5.setDocument(new OnlyNumbers());
        
        //Código de Soma total do Estoque
        jTextField1.setDocument(new OnlyNumbers());
        
        
        //Segunda Ordem (Buscar [Bloqueio de Letras])
        
        jTextField7.setDocument(new OnlyNumbers());
        jTextField8.setDocument(new OnlyNumbers());
        jTextField9.setDocument(new OnlyNumbers());
        
        //Bloquando um jTextField de Resultado
        jTextField10.setEditable(false);
        
    
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Inserir");
        jButton1.setPreferredSize(new java.awt.Dimension(65, 25));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Listar Produtos");
        jButton2.setPreferredSize(new java.awt.Dimension(100, 25));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Soma Total do Estoque (All)");
        jButton3.setPreferredSize(new java.awt.Dimension(100, 25));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Soma Total do Estoque (Single)");
        jButton4.setPreferredSize(new java.awt.Dimension(100, 25));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setText("Produto");

        jLabel3.setText("Código");

        jLabel4.setText("Preço");

        jButton5.setText("Alterar");
        jButton5.setPreferredSize(new java.awt.Dimension(65, 25));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Pesquisar (Only)");
        jButton6.setPreferredSize(new java.awt.Dimension(65, 25));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel6.setText("Produto");

        jLabel7.setText("Código");

        jLabel8.setText("Preço");

        jLabel5.setText("Quantidade");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel9.setText("Quantidade");

        jLabel13.setText("Código");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField10)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)))
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel10.setText("Quantidade remanescente: ");

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 255, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Som");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Notificações");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton7.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 255, 0));
        jButton7.setText("On");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jButton8.setText("Off");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jButton9.setForeground(new java.awt.Color(0, 255, 0));
        jButton9.setText("On");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jButton10.setText("Off");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(0, 0, 0));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(255, 255, 255));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton10))
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton7)
                            .addComponent(jButton8)
                            .addComponent(jButton9)
                            .addComponent(jButton10)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Métodos Gerais
    
    //-----------//Mudança de cor (Botões)//-----------//
    
    public void ativoSom(){
        if (somAtivo == 0){
        somAtivo = 1;
        jButton7.setForeground(Color.GREEN);
        jButton8.setForeground(Color.BLACK);
        }      
}
    public void desativoSom(){
        if (somAtivo == 1){
        somAtivo = 0;
        jButton8.setForeground(Color.RED);
        jButton7.setForeground(Color.BLACK);
        }      
}
    public void ativoNotificacoes(){
        if(notificacoesAtivo == 0){ 
        notificacoesAtivo = 1;
        jButton9.setForeground(Color.GREEN);
        jButton10.setForeground(Color.BLACK);
        }       
}
       public void desativoNotificacoes(){
        if(notificacoesAtivo == 1){          
        notificacoesAtivo = 0;
        jButton10.setForeground(Color.RED);
        jButton9.setForeground(Color.BLACK);
        }       
}
    //Operação realizada com sucesso ou não (Visor - Mensagem)
       
       public void opSucesso(){
           jLabel12.setForeground(Color.GREEN);
           jLabel12.setText("Operação realizada com sucesso!");     
       }
       public void opFalha(){
           jLabel12.setForeground(Color.RED);
           jLabel12.setText("Falha ao realizar a operação"); 
       }
       
       public void notFound(){
           jLabel12.setForeground(Color.YELLOW);
           jLabel12.setText("O parâmetro informado não existe"); 
       }

    //Replace de [,],[" "] e [.]
       
       public String replaceNumbers(String number){
            number = number.replace(",","");
            number = number.replace(".","");
            number = number.replace(" ","");
        return number;
       }
       public String replaceNumbersPreco(String number){
            number = number.replace(",",".");
            number = number.replace(" ","");
        return number;
       
       }
    
    //Message Box / Beep Windows
       
       public void beepWindowsVerification(){
           if(somAtivo == 1){   
               java.awt.Toolkit.getDefaultToolkit().beep();
           }   
       }
       public void messageBoxVerification(String message){
           if(notificacoesAtivo == 1){
               JOptionPane.showMessageDialog(null,message);
           }  
       }
     
    public void table(){
 
        if(tableConstruction == false){

            productModel.addColumn("Nome");
            productModel.addColumn("Código");
            productModel.addColumn("Preço");
            productModel.addColumn("Quantidade");
            productTable.setShowHorizontalLines(true);
            productTable.setShowVerticalLines(true);
            productTable.setGridColor(Color.BLACK);
            productTable.setCellSelectionEnabled(true);
            productPanel.add(new JScrollPane(productTable));
            frame.add(productPanel);
            frame.setSize(550, 400);
            frame.setVisible(true);
            
            tableConstruction = true;  
        }

        productTable.setModel(productModel);
    } 
 
    //Variáveis Gerais - Escopo público
    
    JFrame frame = new JFrame();
    JPanel productPanel = new JPanel();
    JTable productTable = new JTable();
    
    
    //Painel de Controle
    
    int somAtivo = 1;
    int notificacoesAtivo = 1;
    
    //Array's (Produto)
    
    String[] codProduto = new String[10];
    String[] nomeProduto = new String[10];
    String[] precoProduto = new String[10];
    String[] quantidadeProduto = new String[10];
    
    //Controle da quantidade
    
    int quantidadeExcedente = 10;
    int indexArray = 0;
    
    //List (Model)
    
    DefaultListModel prodList = new DefaultListModel();
    
    //Variáveis com relação a pesquisa
    
    //Array List (Dinâmicos [Inserção e Remoção direta])
    
    ArrayList<Integer> revEscolha = new ArrayList<>();
    
    //Model (Table)
    
    DefaultTableModel productModel = new DefaultTableModel();
    
    //Controle das colunas da tabela
    
    boolean tableConstruction = false;
 
   
    
    //------------------------------//Painel de Controle//------------------------------//

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        //Variável de verificação da integridade do código

        int codIgual = 0;

        //----Botão Inserir - Limite 10(09)----//

        if (quantidadeExcedente == 0){

            jButton1.setEnabled(false);

            //Limpando os jTextField's

            jTextField2.setText("");
            jTextField3.setText("");
            jTextField4.setText("");
            jTextField5.setText("");

            opFalha();
            beepWindowsVerification();
            messageBoxVerification("Não há mais slots restantes");

        }else{

            String nomeProd = jTextField2.getText();
            String codProd = jTextField3.getText();
            String precoProd = jTextField4.getText();
            String qntdProd = jTextField5.getText();

            //Removendo Vírgula, Ponto e espaços em branco (Manipulação de String)

            codProd = replaceNumbers(codProd);
            qntdProd = replaceNumbers(qntdProd);
            precoProd = replaceNumbersPreco(precoProd);

            //Verirficação de campos vazios

            if ((nomeProd.trim() == null || "".equals(nomeProd.trim())) ||
                (codProd.trim() == null || "".equals(codProd.trim()))    ||
                (precoProd.trim() == null || "".equals(precoProd.trim()))||
                (qntdProd.trim() == null  || "".equals(qntdProd.trim()))){

                opFalha();
                beepWindowsVerification();
                messageBoxVerification("Todas as variáveis devem ser preenchidas");

            }else{

                //Verificação - Integridade do Código informado (Utilizei o ForEach para pegar o tamanho correto do Array)

                int i = 0;
                for(String cod : codProduto){
                    if(codProd.equals(codProduto[i])) codIgual += 1;
                    i += 1;
                }

                //Caso houver um código igual / Caso não houver

                if(codIgual >= 1){

                    opFalha();
                    beepWindowsVerification();
                    messageBoxVerification("A inserção não pode conter um código igual");

                }else{

                    //Adicionando os campos a seus devidos index's

                    nomeProduto[indexArray] = nomeProd;
                    codProduto[indexArray] = codProd;
                    precoProduto[indexArray] = precoProd;
                    quantidadeProduto[indexArray] = qntdProd;

                    indexArray += 1;
                    quantidadeExcedente -= 1;

                    jTextField2.setText("");
                    jTextField3.setText("");
                    jTextField4.setText("");
                    jTextField5.setText("");

                    //Atualizando o label de quantidade remanescente

                    jLabel10.setText("Quantidade remanescente: " + String.valueOf(quantidadeExcedente));

                    opSucesso();
                    beepWindowsVerification();
                    messageBoxVerification("Produto inserido com sucesso!");

                }
            }
        }
        
        //Reforçando a verificação
        
        if (quantidadeExcedente == 0){
   
            jButton1.setEnabled(false);
            beepWindowsVerification();
            messageBoxVerification("Não há mais slots restantes");
        }
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        //----//Botão Listar//----//
        
        //Limpando as Model's
        
        productModel.setNumRows(0);
        prodList.clear();

        if (quantidadeExcedente > 0){

            for(int i = 0; i < indexArray; i++){
                
                productModel.addRow(new Object[]{nomeProduto[i], codProduto[i],precoProduto[i],quantidadeProduto[i]});

            }
            
            table();
        
            messageBoxVerification("Dados listados");
            beepWindowsVerification();
            opSucesso();
  
        }else if(quantidadeProduto[0] == null || "".equals(quantidadeProduto[0].trim()) ||
                (precoProduto[0] == null || "".equals(precoProduto[0].trim())) ||
                (nomeProduto[0] == null || "".equals(nomeProduto[0].trim())) ||
                (codProduto[0] == null || "".equals(codProduto[0].trim()))){   
            opFalha();
            beepWindowsVerification();
            messageBoxVerification("Nenhum produto foi inserido");
                
            
        }else{
            opFalha();
            beepWindowsVerification();
            messageBoxVerification("A quantidade mínima de dados não foi inserida");
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        //----//Botão para Calcular o total em estoque de todos os produtos//----//

        //Verificação (Array vazio ou não)
        if(quantidadeProduto[0] == null || "".equals(quantidadeProduto[0].trim()) ||
          (precoProduto[0] == null || "".equals(precoProduto[0].trim())) ||
          (nomeProduto[0] == null || "".equals(nomeProduto[0].trim())) ||
          (codProduto[0] == null || "".equals(codProduto[0].trim()))){
            opFalha();
            beepWindowsVerification();
            messageBoxVerification("Nenhum produto foi inserido");

        }else if(quantidadeExcedente != 0){    
            opFalha();
            beepWindowsVerification();
            messageBoxVerification("A quantidade miníma ainda não foi atingida\nQuantidade atual: " + indexArray);
            
        }else{

            //Limpando o texto do TextField
            jTextField10.setText("");

            //Variável para armazenar a quantidade total a cada rodada do for
            float somaTotal = 0;

            for(int i = 0; i < indexArray; i++){

                somaTotal += Integer.parseInt(quantidadeProduto[i]) * Float.parseFloat(precoProduto[i]);

            }

            //Informando o total no jTextField

            jTextField10.setText(String.valueOf(somaTotal));
            opSucesso();
            beepWindowsVerification();
            messageBoxVerification("Soma de estoque completa realizada com sucesso");

        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        //----//Botão para Calcular o total em estoque de um produto através do Código//----//

        //Limpando a variável somaTotal
        String cod = jTextField1.getText();

        //Limpando o texto do TextField
        jTextField10.setText("");

        //Verificação e Manipulação do código
        cod = replaceNumbers(cod);

        if(cod.trim() == null || "".equals(cod.trim())){
            opFalha();
            beepWindowsVerification();
            messageBoxVerification("Código não informado");
            
        //Verificação da quantiade de itens no Array    
        }else if(quantidadeExcedente != 0){    
            opFalha();
            beepWindowsVerification();
            messageBoxVerification("A quantidade mínima ainda não foi atingida\nQuantidade atual: " + indexArray);
     
        }else{

            //Variável para armazenar o total
            float somaTotalOnly = 0;

            //Variável da posição do produto
            int pos = -1;

            for(int i = 0; i < indexArray; i++){

                if(cod.equals(codProduto[i])) pos = i;

            }

            if(pos == -1){
                opFalha();
                beepWindowsVerification();
                messageBoxVerification("Não há nenhum dado registrado com o código informado");

            }else{

                //Passo final, realizando o cálculo
                somaTotalOnly = Integer.parseInt(quantidadeProduto[pos]) * Float.parseFloat(precoProduto[pos]);

                //Informando o total no jTextField
                jTextField10.setText(String.valueOf(somaTotalOnly));

                //Limpando jTextField1
                jTextField1.setText("");

                opSucesso();
                beepWindowsVerification();
                messageBoxVerification("Soma de estoque individual realizada com sucesso");

            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        //----//Botão Alterar//----//

        //Variável para armazenar a posição da alteração

        int pos = -1;

        //Alteração Dinâmica

        //Os código abaixo serão retornados após a manipulação de String, analizando os campos informados
        //Código 1 - Nome
        //Código 2 - Preço
        //Código 3 - Quantidade

        int cod1 = 1;
        int cod2 = 1;
        int cod3 = 1;

        String nomeProd = jTextField2.getText();
        String codProd = jTextField3.getText();
        String precoProd = jTextField4.getText();
        String qntdProd = jTextField5.getText();

        //Removendo Vírgula, Ponto e espaços em branco (Manipulação de String)

        codProd = replaceNumbers(codProd);
        qntdProd = replaceNumbers(qntdProd);
        precoProd = replaceNumbersPreco(precoProd);

        //Verirficação de campos vazios

        if(codProd.trim() == null || "".equals(codProd.trim())){
            opFalha();
            beepWindowsVerification();
            messageBoxVerification("O código não pode estar vazio");

        }else{

            if(nomeProd.trim() == null || "".equals(nomeProd.trim()))cod1 = 0;

            if(precoProd.trim() == null ||"".equals(precoProd.trim()))cod2 = 0;

            if(qntdProd.trim() == null || "".equals(qntdProd.trim()))cod3 = 0;

            //Buscando o indice do código informado

            for(int i = 0; i < codProduto.length; i++){

                if(codProd.equals(codProduto[i])) pos = i;

            }

            //Caso não houver o indice requisitado / Se houver o programa troca os valores dos Array's
            if(pos == -1){
                opFalha();
                beepWindowsVerification();
                messageBoxVerification("Não há nenhum dado registrado com o código informado");

            }else{

                //Verificando os códigos (Caso o cod recebeu 0, não haverá atualização)

                if(cod1 != 0 || cod2 != 0 || cod3 != 0){

                    if(cod1 == 1){
                        //Altera-se o campo nome
                        nomeProduto[pos] = nomeProd;
                    }
                    if(cod2 == 1){
                        //Altera-se o campo preço
                        precoProduto[pos] = precoProd;
                    }
                    if(cod3 == 1){
                        //Altera-se o campo quantidade
                        quantidadeProduto[pos] = qntdProd;
                    }

                    jTextField2.setText("");
                    jTextField3.setText("");
                    jTextField4.setText("");
                    jTextField5.setText("");

                    opSucesso();
                    beepWindowsVerification();
                    messageBoxVerification("Alteração realizada com sucesso");

                }else{

                    //Caso nenhum dos campos [nome, preço e quantidade] forem preenchidos
                    opFalha();
                    beepWindowsVerification();
                    messageBoxVerification("Nenhum campo foi informado para realizar a alteração");

                }
            }

        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        //----//Botão Pesquisar//----//
        //cod1 - Pesquisa por Código adicionada
        //cod2 - Pesquisa por Nome adicionada
        //cod3 - Pesquisa por Preço adicionada
        //cod4 - Pesquisa por Quantidade adicionada

        //Limpeza do Array de Escolha

        revEscolha.clear();

        //Limpando a model da list

        prodList.clear();
        
        //Limpando a model da table
        
        productModel.setNumRows(0);

        //Analizando os campos informados

        int cod1 = 1;
        int cod2 = 1;
        int cod3 = 1;
        int cod4 = 1;

        String nomeProd = jTextField6.getText();
        String codProd = jTextField7.getText();
        String precoProd = jTextField8.getText();
        String qntdProd = jTextField9.getText();

        if(((codProd.trim() == null || "".equals(codProd.trim()))   &&
            (nomeProd.trim() == null || "".equals(nomeProd.trim()))  &&
            (precoProd.trim() == null || "".equals(precoProd.trim()))&&
            (qntdProd.trim() == null || "".equals(qntdProd.trim())))  ||
            
            ((quantidadeProduto[0] == null || "".equals(quantidadeProduto[0].trim()) ||
            (precoProduto[0] == null || "".equals(precoProduto[0].trim())) ||
            (nomeProduto[0] == null || "".equals(nomeProduto[0].trim())) ||
            (codProduto[0] == null || "".equals(codProduto[0].trim()))))){
            
            opFalha();
            beepWindowsVerification();
            messageBoxVerification("Nenhum campo foi informado para realizar a pesquisa / Nenhum dado foi inserido");

        }else{

            if(codProd.trim() == null || "".equals(codProd.trim()))cod1 = 0;

            if(nomeProd.trim() == null || "".equals(nomeProd.trim()))cod2 = 0;

            if(precoProd.trim() == null ||"".equals(precoProd.trim()))cod3 = 0;

            if(qntdProd.trim() == null || "".equals(qntdProd.trim()))cod4 = 0;

            //Iniciando a pesquisa dos parâmetros indicados (Dinâmica)

            if(cod1 == 1){
                for(int i = 0; i < codProduto.length; i++){
                    if(codProd.equals(codProduto[i])) revEscolha.add(i);
                }
            }

            if(cod2 == 1){
                for(int i = 0; i < nomeProduto.length; i++){
                    if(nomeProd.equals(nomeProduto[i])) revEscolha.add(i);
                }
            }

            if(cod3 == 1){
                for(int i = 0; i < precoProduto.length; i++){
                    if(precoProd.equals(precoProduto[i])) revEscolha.add(i);
                }
            }

            if(cod4 == 1){
                for(int i = 0; i < quantidadeProduto.length; i++){
                    if(qntdProd.equals(quantidadeProduto[i])) revEscolha.add(i);
                }
            }

            //Removendo duplicatas com atribuição a um Set[Não aceita duplicatas]

            Set<Integer> setProd = new HashSet<>(revEscolha);
            revEscolha.clear();
            revEscolha.addAll(setProd);

            if(revEscolha.isEmpty()){
                notFound();
                beepWindowsVerification();
                messageBoxVerification("Nenhum dado foi encontrado com as especificações informadas");

            }else{

                for(int i = 0; i < revEscolha.size(); i++){
                    //Busca-se o indice do campo nome como especificado
                    productModel.addRow(new Object[]{nomeProduto[revEscolha.get(i)], codProduto[revEscolha.get(i)],precoProduto[revEscolha.get(i)],quantidadeProduto[revEscolha.get(i)]});

                }
                
                table();
          
                opSucesso();
                beepWindowsVerification();
                messageBoxVerification("Pesquisa realizada com sucesso");

            }

        }

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        //----Botão On - Som----//
        ativoSom();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

        //----Botão Off - Som----//
        desativoSom();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

        //----Botão On - Notificações----//
        ativoNotificacoes();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

        //----Botão Off - Notificações----//
        desativoNotificacoes();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed

        //----//Black Mode//----//

        JPanel panel = new JPanel();

        Color BlackCor = new Color(56, 56, 59);
        panel.setBackground(BlackCor);

        Border border = new LineBorder(Color.BLACK, 4, true);
        panel.setBorder(border);

        Color PurpleCor = new Color(178, 133, 255);
        Color GreyCor = new Color(146, 146, 146);
        Color GreyCorLight = new Color(70, 70, 70);

        jPanel1.setBackground(BlackCor);
        jPanel2.setBackground(BlackCor);
        jPanel3.setBackground(BlackCor);

        jLabel1.setForeground(PurpleCor);
        jLabel2.setForeground(PurpleCor);
        jLabel3.setForeground(PurpleCor);
        jLabel4.setForeground(PurpleCor);
        jLabel5.setForeground(PurpleCor);
        jLabel6.setForeground(PurpleCor);
        jLabel7.setForeground(PurpleCor);
        jLabel8.setForeground(PurpleCor);
        jLabel9.setForeground(PurpleCor);
        jLabel10.setForeground(PurpleCor);
        jLabel11.setForeground(PurpleCor);
        jLabel13.setForeground(PurpleCor);

        jLabel1.setBackground(GreyCor);
        jLabel2.setBackground(GreyCor);
        jLabel3.setBackground(GreyCor);
        jLabel4.setBackground(GreyCor);
        jLabel5.setBackground(GreyCor);
        jLabel6.setBackground(GreyCor);
        jLabel7.setBackground(GreyCor);
        jLabel8.setBackground(GreyCor);
        jLabel9.setBackground(GreyCor);
        jLabel10.setBackground(GreyCor);
        jLabel11.setBackground(GreyCor);
        jLabel13.setBackground(GreyCor);

        jButton1.setBackground(GreyCorLight);
        jButton2.setBackground(GreyCorLight);
        jButton3.setBackground(GreyCorLight);
        jButton4.setBackground(GreyCorLight);
        jButton5.setBackground(GreyCorLight);
        jButton6.setBackground(GreyCorLight);
        jButton7.setBackground(GreyCorLight);
        jButton8.setBackground(GreyCorLight);
        jButton9.setBackground(GreyCorLight);
        jButton10.setBackground(GreyCorLight);
        jButton11.setBackground(GreyCorLight);

        jButton1.setForeground(PurpleCor);
        jButton2.setForeground(PurpleCor);
        jButton3.setForeground(PurpleCor);
        jButton4.setForeground(PurpleCor);
        jButton5.setForeground(PurpleCor);
        jButton6.setForeground(PurpleCor);
        jButton7.setForeground(PurpleCor);
        jButton8.setForeground(PurpleCor);
        jButton9.setForeground(PurpleCor);
        jButton10.setForeground(PurpleCor);
        jButton11.setForeground(PurpleCor);
        
        jTextField1.setBackground(GreyCor);
        jTextField2.setBackground(GreyCor);
        jTextField3.setBackground(GreyCor);
        jTextField4.setBackground(GreyCor);
        jTextField5.setBackground(GreyCor);
        jTextField6.setBackground(GreyCor);
        jTextField7.setBackground(GreyCor);
        jTextField8.setBackground(GreyCor);
        jTextField9.setBackground(GreyCor);
        jTextField10.setBackground(GreyCor);
     

    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed

        //----//Light Mode//----//
        
        //----//Black Mode//----//

        JPanel panel = new JPanel();

        Color BlackCor = new Color(32, 32, 32);
        panel.setBackground(BlackCor);

        Border border = new LineBorder(Color.BLACK, 4, true);
        panel.setBorder(border);

        Color PurpleCor = new Color(56, 56, 59);
        Color GreyCor = new Color(153, 157, 160);
        Color GreyCorLight = new Color(175, 175, 175);

        jPanel1.setBackground(GreyCor);
        jPanel2.setBackground(GreyCor);
        jPanel3.setBackground(GreyCor);

        jLabel1.setForeground(PurpleCor);
        jLabel2.setForeground(PurpleCor);
        jLabel3.setForeground(PurpleCor);
        jLabel4.setForeground(PurpleCor);
        jLabel5.setForeground(PurpleCor);
        jLabel6.setForeground(PurpleCor);
        jLabel7.setForeground(PurpleCor);
        jLabel8.setForeground(PurpleCor);
        jLabel9.setForeground(PurpleCor);
        jLabel10.setForeground(PurpleCor);
        jLabel11.setForeground(PurpleCor);
        jLabel13.setForeground(PurpleCor);

        jLabel1.setBackground(GreyCor);
        jLabel2.setBackground(GreyCor);
        jLabel3.setBackground(GreyCor);
        jLabel4.setBackground(GreyCor);
        jLabel5.setBackground(GreyCor);
        jLabel6.setBackground(GreyCor);
        jLabel7.setBackground(GreyCor);
        jLabel8.setBackground(GreyCor);
        jLabel9.setBackground(GreyCor);
        jLabel10.setBackground(GreyCor);
        jLabel11.setBackground(GreyCor);
        jLabel13.setBackground(GreyCor);

        jButton1.setBackground(GreyCorLight);
        jButton2.setBackground(GreyCorLight);
        jButton3.setBackground(GreyCorLight);
        jButton4.setBackground(GreyCorLight);
        jButton5.setBackground(GreyCorLight);
        jButton6.setBackground(GreyCorLight);
        jButton7.setBackground(GreyCorLight);
        jButton8.setBackground(GreyCorLight);
        jButton9.setBackground(GreyCorLight);
        jButton10.setBackground(GreyCorLight);
        jButton11.setBackground(GreyCorLight);

        jButton1.setForeground(PurpleCor);
        jButton2.setForeground(PurpleCor);
        jButton3.setForeground(PurpleCor);
        jButton4.setForeground(PurpleCor);
        jButton5.setForeground(PurpleCor);
        jButton6.setForeground(PurpleCor);
        jButton7.setForeground(PurpleCor);
        jButton8.setForeground(PurpleCor);
        jButton9.setForeground(PurpleCor);
        jButton10.setForeground(PurpleCor);
        jButton11.setForeground(PurpleCor);

    }//GEN-LAST:event_jButton11ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroFrontTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroFrontTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroFrontTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroFrontTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroFrontTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
