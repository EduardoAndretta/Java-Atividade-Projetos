# Java-Atividades-Projetos
Java - Apache NetBeans

<h2>写真【Photos】</h2>

<h1 aling="left">〖Urna Eletrônica・Electronic Vooting Machine〗</h1>

<img width="383" alt="Captura de tela 2021-08-20 001616" src="https://user-images.githubusercontent.com/82424514/137571767-66244c3f-d4be-4b6d-9b69-aced3a7f34ea.png"><img width="340" alt="Captura de tela 2021-08-20 001806" src="https://user-images.githubusercontent.com/82424514/137571742-c7c8792f-6553-4499-8d55-d7459fb888a1.png">


<h2>Funcionalidades (Por escrito) 〖Urna Eletrônica・Electronic Vooting Machine〗</h2>

▣ Clique no botão (Imagem do candidato (Redimensionada)/ação e informações em label sobre este)

▣ Botão de Resultado bloqueado inicialmente (Liberado apenas depois de apurar)

▣ Foco no textField (requestFocus())

▣ MessageBox (Botões de desativar e ativar, que contém mudança de cor conforme a ação)

▣ Botão de Reiniciar

▣ Bloqueio da urna após apurar

▣ Resultado (Quantidade de votos individual/Quantidade de votos total/Vencedor/Empate/Sem votos para candidatos)

▣ Votos de código aceitos por extenso (seis – Seis – 6) (Três – três – Tres – três – 3)

▣ A Prova de erros de digitação (Digite um valor válido)

<br><br>

<h1 aling="left">〖Tabela de Cadastro de Produtos・Table - Registration of products〗 </h1>

<img width="869" alt="Captura de tela 2021-10-01 002835" src="https://user-images.githubusercontent.com/82424514/137571716-b8214287-c24b-44f5-8e32-5d950504350b.png">
<img width="872" alt="Captura de tela 2021-10-01 002912" src="https://user-images.githubusercontent.com/82424514/137571718-a73026b5-2a3a-4ced-90e3-3fbaa4d30490.png">

<h2>Funcionalidades (Por escrito) 〖Tabela de Cadastro de Produtos・Table - Registration of products〗</h2>

<h3>Regra de Negócio (Simples)</h3>

▣ O código não pode ser igual (Isso porque ele servirá para localizar Itens e realizar alterações)

</h3>Funcionalidades de Verificação e Entrada de Dados</h3>
<br>
<h3>Inserção</h3>

▣ Verificação da Integridade do código (Não pode ser igual, caso for, será informado erro)

▣ Verificação dos dados recebidos (Caso for vazio / Espaços em branco, receberá erro)

▣ Reposição de alguns caracteres para manter o sistema limpo (Vírgula -> Ponto / Espaçamento -> “ “ )

▣ Verificação do número de itens adicionados ao Array (Não pode ser maior que 10)
<br>
<h3>Alteração</h3>

▣ Sistema de códigos internos para verificação dos dados informados

▣ Verificação dos dados recebidos (Apenas o código não pode faltar/ Se não houver nenhum item além do código, o programa aponta o erro)

▣ Reposição de alguns caracteres para manter o sistema limpo (Vírgula -> Ponto / Espaçamento -> “ “ )

▣ Verificação da Existência do Código informado (Caso não houver, irá informar erro)

▣ Verificação dos campos informados, realizando uma alteração dinâmica (Apenas nos itens informados)
<br>
<h3>Listar</h3>

▣ Verificação da quantidade de itens inseridos no Array (Deve ser 10, caso não for, aponta erro)
<br>
<h3>Soma Estoque</h3>
	
▣ Verificação da quantidade de itens inseridos no Array (Deve ser 10, caso não for, aponta erro)
<br>
<h3>Soma Estoque (Individual)</h3>

▣ Verificação da quantidade de itens inseridos no Array (Deve ser 10, caso não for, aponta erro)

▣ Verificação da existência do código (Caso não existir, aponta erro)

▣ Verificação dos dados recebidos (Caso for vazio / Espaços em branco, receberá erro)
<br>
<h3>Pesquisa</h3>

▣ Sistema de códigos internos para verificação dos dados informados

▣ Verificação dos dados recebidos (Para a pesquisa funcionar, apenas um dos dados é necessário / Pesquisa com filtro)

▣ Verificação dos dados recebidos (Caso todos forem vazios / Espaços em branco, receberá erro)

▣ Verificação dos valores dos itens (Caso não existe, ocorrerá uma mensagem de item não encontrado/Importante citar que se um dos campos encontrar algum item, será exibido mesmo que o outro não tenha sido encontrado)
Verificação (Notificações e Sons)

▣ Verificam através de um método se a variável que coordena a ativação dos elementos informados está valendo um valor ou não (Com base nisso, o som/MessageBox será exibido ou não)
<br>
<h3>Tabela</h3>

▣ Verifica a integridade da tabela (Se há colunas ou não) [caso for a primeira vez, irá adicionar as colunas]
<br>	
<h3>	Funcionalidades (Em resumo) </h3>

1.	Inserção de dados

2.	Alteração de dados (De forma dinâmica)

3.	Pesquisa de dados (De forma dinâmica e filtrada)

4.	Soma de estoque (Individual e completa)

5.	Notificações e Sons (Podendo ser desabilitadas a qualquer momento)

6.	Tabela (Em uma guia diferente e manipulável [Tamanho das cédulas])

7.	BlackMode simples

8.	Mensagem informativa de erro/sucesso/inexistente

9.	Quantidade remanescente de itens a serem adicionados no array

10.	Exibição de todos os tipos de erros através das Notificações (MessageBox)

11.	jTextField que incluem preços/códigos/quantidades podem receber apenas [0^9,.] (Números, ponto e vírgula)

12.	Correção de vírgula e espaços em branco entre números (jTexField que recebem apenas numerais)

