
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public class EstoqueFront extends javax.swing.JFrame {

   
    public EstoqueFront() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton5.setText("Pesquisar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Pesquisa por Nome");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Pesquisa por Código");

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Pesquisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("Pesquisar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Pesquisa por Preço");

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setText("Pesquisar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Pesquisa por Quantidade");

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton4.setText("Pesquisar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Quantidade de Itens:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Pesquisa por Avaliação ");

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton6.setText("Pesquisar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField3)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField4)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 250, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTextField5))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(12, 12, 12)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(11, 11, 11)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jList2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //\t
    
    //Linha Detalhe
    //addElement("COD PROD \t NOMEPROD \t PREÇO \t QTDESTOQUE")
    
    //Linha Cabeçalho
    //addElement("0676 + "\v" + Cities Skyline + "\tR$" + 159,99 + "\t" + 2134)
    
    //Para eu trazer tudo de um produto, é só pedir o código ou Item 
    //Com o item ou Código, eu coleto a posição e trago os outro arrays, exibindo no list
    
    
    /********************************
    *Array armazena o valor do index correspondente ao item escolhido, caso houver mais de um, os dois serão exibidos no jList
    
    
    
    
    */
    
    
    //Código (Produto)
    
    String[] codProd = {"00001","00002","00003","00004","00005","00006","00007","00008","00009","00010","00011","00012","00013","00014","00015","00016","00017","00018","00019","00020",
               "00021","00022","00023","00024","00025","00026","00027","00028","00029","00030","00031","00032","00033","00034","00035","00036","00037","00038","00039","00040",
               "00041","00042","00043","00044","00045","00046","00047","00048","00049","00050"};
    
    String[] nomeProd = {"Doom","Minecraft","Cyberpunk 2077","Fortnite","Terraria","Jojo S Bizarre Adventure All Star Battle","Portal 2","Don't Starve Together","Cities: Skylines","The Last of Us",
               "The Last of Us Part II","Super Mario Maker 2","Diablo III","The Witcher 3: Wild Hunt","Borderlands 2","Grand Theft Auto IV","FIFA 18","Kinect Adventures!","Sonic the Hedgehog","Grand Theft Auto V",
               "Marvel's Spider-Man","Uncharted 4: A Thief's End","God of War","Horizon Zero Dawn","Genshin Impact","Gran Turismo Sport","Final Fantasy VII Remake","Ghost of Tsushima","Monster Hunter: World","Persona 5",
               "Detroit: Become Human","Crash Bandicoot N. Sane Trilogy","Final Fantasy XV","Killzone: Shadow Fall","Driveclub","Bloodborne","Knack","Call of Duty: WWII","Nier: Automata","Street Fighter V",
               "Dragon Quest XI: Echoes of an Elusive Age","Battlefield 1","Metal Gear Solid V: The Phantom Pain","FIFA 17","Call of Duty: Black Ops III","Final Fantasy XII: The Zodiac Age","Infamous: Second Son","Kingdom Hearts III","Nioh","Civilization® VI"};
    
    double[] precoProd = {54.50, 149.89, 78.30, 44.00, 19.99, 34.79, 35.00, 27.99, 32.98, 39.95, 135.00, 19.39, 39.95, 180.00, 19.99, 19.99, 15.67, 43.64, 158.66, 34.99, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                          11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
    
    int[] qntdProd = {3143, 254, 653 ,764 ,534 ,436, 897, 878, 549, 1450, 511, 312, 4413, 14, 156, 157, 318, 179, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32,
                      34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 50, 50};
    
    String[] avalProd = {"★★★","★★★★","★★★★","★★★★","★★★★","★★★★","★★★★★","★★★★★","★★★★","★★★★",
                         "★★★★★","★★★★★","★★★★★","★★★★★","★★★★★","★★★★★","★★★★","★★★★★","★★★","★★★★★",
                         "★★★★","★★★★★","★★★★","★★★★★","★★★★","★★★★★","★★★","★★★★★","★★★★★","★★★",
                         "★★★★★","★★★★","★★★★★","★★★","★★★★★","★★★★★","★★★","★★","★★★★★","★★★★★",
                         "★★★★","★★★★★","★★★★★","★★★★","★★★★★","★★★★★","★★★★","★★★★","★★★★★","★★★"};
    
    //ArrayList/Vetores para armazenar escolha do usuário (É dinâmico)

    ArrayList<Integer> codEscolha = new ArrayList<>();
    ArrayList<Integer> nomeEscolha = new ArrayList<>();
    ArrayList<Integer> precoEscolha = new ArrayList<>();
    ArrayList<Integer> qntdEscolha = new ArrayList<>();
    ArrayList<Integer> avalEscolha = new ArrayList<>();
    
    //Variável para exibir quantidade de Itens
    
    int qntd = 0;
    
    //Model da List
    
    DefaultListModel ProdList = new DefaultListModel();
    
    public void detalheList(){
        
        ProdList.addElement("Código do Produto Nome do Produto Valor do Produto Quantidade do Produto Avaliação do Produto");
       
    }
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        //Limpeza do Model
        
        ProdList.clear();
                
        //Limpeza do Array responsável pelos Indices de Nome e a variável de quantidade de Itens encontrados
        
        nomeEscolha.clear();
        qntd = 0;
                
        //Armazenando o valor obtido na jTextField relacionado ao nome do produto
        
        String nomeProduto = jTextField1.getText();
        
        
        //A operação está "<" proque deste modo, ele verifica exatamente o valor da lista, pois antes de fica maior que a lista, a condição foi alcançada
        
        for(int i = 0; i < nomeProd.length; i++){
            
            //Caso o nome do Produto for similiar, seu index será adicionado no Array List
            
            if(nomeProduto.equals(nomeProd[i])){
                
                //Adicionando o Index do Item Semelhante para um Array List
                
                nomeEscolha.add(i);
                
                //Incrementando a Quantidade de Itens encontrados
                
                qntd += 1;
                
            }
            
        }
        
        //Informando a quantidade de itens (Conversão de Int para String)
        
        jLabel1.setText("Quantidade de Itens: " + Integer.toString(qntd));
        
        //Verificação da Quantidade (Caso for 0, uma mensagem será exibida no jList)

        if(qntd == 0){
            
            detalheList();
            ProdList.addElement("Não há itens com o termo designado");
            jList2.setModel(ProdList);
            
            
        }else{

            //Adicionando a lista Detalhe no Model
        
            detalheList();
        
            //Adicionando elementos no list
            //Para o ArrayList, usa-se .size() ao invés de .length
        
            //A operação está "<" proque deste modo, ele verifica exatamente o valor da lista, pois antes de fica maior que a lista, a condição foi alcançada
            
            for(int i = 0; i < nomeEscolha.size(); i++ ){
            
                //Para buscar um item de um Array List, usa-se .get("index")
  
                ProdList.addElement(codProd[nomeEscolha.get(i)] +"     "+ nomeProd[nomeEscolha.get(i)] +"     R$ "+ precoProd[nomeEscolha.get(i)] +"     "+ qntdProd[nomeEscolha.get(i)] +"     "+ avalProd[nomeEscolha.get(i)]);
                
            }
        
            //Setando o Model para o jList1
        
            jList2.setModel(ProdList);
            
    
        }
        
     
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        //Limpeza do Model
        
        ProdList.clear();
        
        //Limpeza do Array responsável pelos Indices de Código e a variável de quantidade de Itens encontrados
        
        codEscolha.clear();
        qntd = 0;
        
        //Obtendo o Código digitado pelo usuário
        
        String codigoProd = jTextField2.getText();
        
        //Iniciando Verificação (Valor do Código)
        
        for(int i = 0; i < codProd.length; i++){
            
            //Verificando Semelhança com os Itens do Array Cod
            
            if(codigoProd.equals(codProd[i])){
                
                //Adicionando o Index do Item Semelhante para um Array List
                
                codEscolha.add(i);
                
                //Incrementando a Quantidade de Itens encontrados
                
                qntd += 1;
            }            
        }
        
        //Informando a quantidade de itens (Conversão de Int para String)
        
        jLabel1.setText("Quantidade de Itens: " + Integer.toString(qntd));
        
        //Verificação da Quantidade (Caso for 0, uma mensagem será exibida no jList)
        
        if(qntd == 0){
            
            detalheList();
            ProdList.addElement("Não há itens com o termo designado");
            jList2.setModel(ProdList);
            
            
        }else{
            
            //Adicionando a lista Detalhe no Model
        
            detalheList();
        
            //Adicionando elementos no list
            //Para o ArrayList, usa-se .size() ao invés de .length
        
            //A operação está "<" proque deste modo, ele verifica exatamente o valor da lista, pois antes de fica maior que a lista, a condição foi alcançada
            
            for(int i = 0; i < codEscolha.size(); i++){
                
                //Para buscar um item de um Array List, usa-se .get("index")
  
                ProdList.addElement(codProd[codEscolha.get(i)] +"     "+ nomeProd[codEscolha.get(i)] +"     R$ "+ precoProd[codEscolha.get(i)] +"     "+ qntdProd[codEscolha.get(i)] +"     "+ avalProd[codEscolha.get(i)]);
            
            }
            
            //Setando o Model no jList1
            
            jList2.setModel(ProdList);
            
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
        //Limpeza do Model
        
        ProdList.clear();
        
        //Limpeza do Array responsável pelos Indices de Preço e a variável de quantidade de Itens encontrados
        
        precoEscolha.clear();
        qntd = 0;
                
        //Armazenando o valor obtido na jTextField relacionado ao Preço do produto
        
        double precoProduto = Double.parseDouble(jTextField3.getText());
        
         //Iniciando Verificação (valor double do Preço)
        
        for(int i = 0; i < precoProd.length; i++){
            
            //Verificando Semelhança com os Itens do Array Preço
            
            if(precoProduto == precoProd[i]){
                
                //Adicionando o Index do Item Semelhante para um Array List
                
                precoEscolha.add(i);
                
                //Incrementando a Quantidade de Itens encontrados
                
                qntd += 1;
            }            
        }
        
        //Informando a quantidade de itens (Conversão de Int para String)
        
        jLabel1.setText("Quantidade de Itens: " + Integer.toString(qntd));
        
        //Verificação da Quantidade (Caso for 0, uma mensagem será exibida no jList)
        
        if(qntd == 0){
            
            detalheList();
            ProdList.addElement("Não há itens com o termo designado");
            jList2.setModel(ProdList);
           
            
        }else{
            
            //Adicionando a lista Detalhe no Model
        
            detalheList();
        
            //Adicionando elementos no list
            //Para o ArrayList, usa-se .size() ao invés de .length
        
            //A operação está "<" proque deste modo, ele verifica exatamente o valor da lista, pois antes de fica maior que a lista, a condição foi alcançada
            
            for(int i = 0; i < precoEscolha.size(); i++){
                
                //Para buscar um item de um Array List, usa-se .get("index")
  
                ProdList.addElement(codProd[precoEscolha.get(i)] +"     "+ nomeProd[precoEscolha.get(i)] +"     R$ "+ precoProd[precoEscolha.get(i)] +"     "+ qntdProd[precoEscolha.get(i)] +"     "+ avalProd[precoEscolha.get(i)]);
            
            }
            
            //Setando o Model no jList1
            
            jList2.setModel(ProdList);
            
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        //Limpeza do Model
        
        ProdList.clear();
        
        //Limpeza do Array responsável pelos Indices de Preço e a variável de quantidade de Itens encontrados
        
        qntdEscolha.clear();
        qntd = 0;
                
        //Armazenando o valor obtido na jTextField relacionado ao Preço do produto
        
        int qntdProduto = Integer.parseInt(jTextField4.getText());
        
         //Iniciando Verificação (valor double do Preço)
        
        for(int i = 0; i < qntdProd.length; i++){
            
            //Verificando Semelhança com os Itens do Array Preço
            
            if(qntdProduto == qntdProd[i]){
                
                //Adicionando o Index do Item Semelhante para um Array List
                
                qntdEscolha.add(i);
                
                //Incrementando a Quantidade de Itens encontrados
                
                qntd += 1;
            }            
        }
        
        //Informando a quantidade de itens (Conversão de Int para String)
        
        jLabel1.setText("Quantidade de Itens: " + Integer.toString(qntd));
        
        //Verificação da Quantidade (Caso for 0, uma mensagem será exibida no jList)
        
        if(qntd == 0){
            
            detalheList();
            ProdList.addElement("Não há itens com o termo designado");
            jList2.setModel(ProdList);
            
            
        }else{
            
            //Adicionando a lista Detalhe no Model
        
            detalheList();
        
            //Adicionando elementos no list
            //Para o ArrayList, usa-se .size() ao invés de .length
        
            //A operação está "<" proque deste modo, ele verifica exatamente o valor da lista, pois antes de fica maior que a lista, a condição foi alcançada
            
            for(int i = 0; i < qntdEscolha.size(); i++){
                
                //Para buscar um item de um Array List, usa-se .get("index")
  
                ProdList.addElement(codProd[qntdEscolha.get(i)] +"     "+ nomeProd[qntdEscolha.get(i)] +"     R$ "+ precoProd[qntdEscolha.get(i)] +"     "+ qntdProd[qntdEscolha.get(i)] +"     "+ avalProd[qntdEscolha.get(i)]);
            
            }
            
            //Setando o Model no jList1
            
            jList2.setModel(ProdList);
            
        }
        
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
        //Variável para armazenar as estrelas de avaliação
        
        String star = "";
        
        //Variável de conversão [Estrelas]
        
        int numToStar = Integer.parseInt(jTextField5.getText());
        
        if(numToStar >= 6 || numToStar <= 0){
            
            jTextField5.setText("Valor Inválido (Entre 1 e 5)");
            
            
        }else{
            
            //Estrutura de repetição para somar as estrelas de avaliação conforme o número informado
            
            for(int i = 0; i < numToStar; i++){
                
                star += "★";
  
            } 
            
        }
       
        //Limpeza do Model
        
        ProdList.clear();
        
        //Limpeza do Array responsável pelos Indices de Preço e a variável de quantidade de Itens encontrados
        
        avalEscolha.clear();
        qntd = 0;
                

        //Iniciando Verificação (valor double do Preço)
        
        for(int i = 0; i < avalProd.length; i++){
            
            //Verificando Semelhança com os Itens do Array Preço
            
            if(star.equals(avalProd[i])){
                
                //Adicionando o Index do Item Semelhante para um Array List
                
                avalEscolha.add(i);
                
                //Incrementando a Quantidade de Itens encontrados
                
                qntd += 1;
            }            
        }
        
        //Informando a quantidade de itens (Conversão de Int para String)
        
        jLabel1.setText("Quantidade de Itens: " + Integer.toString(qntd));
        
        //Verificação da Quantidade (Caso for 0, uma mensagem será exibida no jList)
        
        if(qntd == 0){
            
            detalheList();
            ProdList.addElement("Não há itens com o termo designado");
            jList2.setModel(ProdList);
            
            
        }else{
            
            //Adicionando a lista Detalhe no Model
        
            detalheList();
        
            //Adicionando elementos no list
            //Para o ArrayList, usa-se .size() ao invés de .length
        
            //A operação está "<" proque deste modo, ele verifica exatamente o valor da lista, pois antes de fica maior que a lista, a condição foi alcançada
            
            for(int i = 0; i < avalEscolha.size(); i++){
                
                //Para buscar um item de um Array List, usa-se .get("index")
  
                ProdList.addElement(codProd[avalEscolha.get(i)] +"     "+ nomeProd[avalEscolha.get(i)] +"     R$ "+ precoProd[avalEscolha.get(i)] +"     "+ qntdProd[avalEscolha.get(i)] +"     "+ avalProd[avalEscolha.get(i)]);
            
            }
            
            //Setando o Model no jList1
            
            jList2.setModel(ProdList);
            
        }
        
        
        
        
    }//GEN-LAST:event_jButton6ActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EstoqueFront().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
