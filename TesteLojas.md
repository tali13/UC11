# 📘✒️ PLANO DE TESTE - Administrador Loja

---

## 1. 🎯 Objetivo dos Testes

### O objetivo deste plano de teste é garantir que as funcionalidades do aplicativo Administrador Loja funcione corretamente, as funções testadas serão : Entrada e saída de produtos, verificação de local exato de produtos, listagem de produtos disponíveis, número de vendas, lista de produtos mais vendidos,criação de usuario administrativo. Os teste devem visar a eficiência e a precisão das funcionalidades para com o usuario 
---

## 2. :octocat: Escopo dos Testes

### ✔️ O que será testado

Liste aqui todas as funcionalidades que serão testadas:

| Funcionalidade               | Descrição                                        |
|-----------------------------|--------------------------------------------------|
| Criação de usuario administrador        |Criação de um usuario que poderá administrar a loja|
| Exclusão de usuario administrador        |excluir o usuario do aplicativo|
| Atualizar usuário administrador        |Atualiza as informações do administrador da loja|
| Logar administrador       |Entra na conta cadastrada do administrador|
| Listagem de produtos        | Usuário poderá visualizar os produtos disponiveis e indisponiveis na loja             |
| Visualização de fluxo de entrada e saida de produtos           | Usuário poderá visualizar se os produtos estão em seus devidos locais        |
| Exibição dos produtos mais vendidos        | Usuário poderá visualizar uma lista com os produtos que melhor performaram em vendas             |

### ❌ O que **não** será testado

Liste funcionalidades que estão fora do escopo deste plano de teste:

| Funcionalidade fora do escopo  | Justificativa                            |
|-------------------------------|-------------------------------------------|
| Estética do aplicativop                  | Não será testado a estética geral do aplicativo          |
| Segurança            | Não será testada a segurança pois ainda está em fase de desenvolvimento   |
| Desempenho                  | Será testado em uma futura fase do desenvolvimento         |


---

## 3. ✅ Critérios de Sucesso

Especifique os critérios para considerar o teste como **bem-sucedido**:

| Funcionalidade           | Critério de sucesso                                 |
|--------------------------|-----------------------------------------------------|
| Criação de usuario administrador     | O usuario poderá controlar todos os elementos da loja através do usuario administrador     |
| Exclusão de usuario administrador        |O usuário poderá excluir caso queira sua conta de administrador|
| Atualizar usuário administrador        |O usuário poderá atualizar caso queira sua conta de administrador|
| Logar administrador       |O usuário poderá entrar em sua conta de administrador|
| Listagem de produtos     | Esta exibindo corretamente a listagem de produtos do setor     |
|  Visualização de fluxo de entrada e saida de produtos        |Apresenta o devido lugar dos produtos          |
| Exibição dos produtos mais vendidos      | Esta exibindo corretamente a listagem de produtos com maior desempenho de vendas                          |



---

## 4. 📌 Estratégia de Teste

Descreva a abordagem dos testes que serão realizados:

### Tipos de Testes Utilizados:

- [x] Testes Funcionais
- [ ] Testes de Interface (UI)
- [x] Testes de Usabilidade

### Método de Execução:

- [x] Manual
- [ ] Automatizado
- [ ] Híbrido

---

## 5. 💡 Recursos Necessários

### Equipamentos:

| Equipamento        | Especificações mínimas                     |
|--------------------|--------------------------------------------|
| Celular Android| Versão 12 ou superior                      |
| Celular IOS    | Versão 14 ou superior                      |
| Computador     | Navegador Chrome/Opera atualizado       |


### Ferramentas:

| Ferramenta             | Finalidade                             |
|------------------------|----------------------------------------|
| NetBeans              | Testes automatizados                   |
| Jira           | Para rastreamento de bugs     |

### Equipe Envolvida:

| Função                 | Quantidade | Nome(s) (opcional)       |
|------------------------|------------|--------------------------|
| Testador               |      3      |   Claudia array, Rogéria da silva, Irene da cunha                     |
| Desenvolvedor          |      2      |   Jake dobberman, Charlie Oliveira                       |


---

## 6. 💂 Plano de Execução

- Execução Manual: Os testes serão executados manualmente nos dispositivos móveis e desktop, verificando a interação do usuário com a interface e o comportamento das funcionalidades.
- Ambiente de Teste: O ambiente de teste será a versão de desenvolvimento do aplicativo, instalada nos dispositivos móveis Android e iOS e desktop.

### Etapas de Execução:

1. Preparação dos ambientes de teste.
2. Instalação da versão de teste do sistema.
3. Execução dos casos de teste manuais.
4. Registro de defeitos encontrados.
5. Análise de resultados.

---

## 7. 📆 Cronograma

Organize o tempo das etapas do teste.

| Atividade                  | Data de Início | Data de Término |
|---------------------------|----------------|-----------------|
| Planejamento do Teste     |  18 de Setembro de 2030              | 30 de Setembro de 2030 |
| Preparação do Ambiente    | 1 de Outubro de 2030               | 3 de Outubro de 2030|
| Execução dos Testes       | 4 de Outubro de 2030                | 21 de Outubro de 2030|
| Documentação dos Resultados |22 de Outubro de 2030              | 25  de Outubro de 2030|

---

## 8. ⚠️ Riscos e Mitigações

Liste possíveis problemas que podem afetar os testes, com planos de ação.

| Risco Identificado                      | Possível Impacto                   | Estratégia de Mitigação                     |
|----------------------------------------|-----------------------------------|---------------------------------------------|
|Incompatibilidade com iOS antigo   | Aplicativo não abre em alguns aparelhos | Testar em diferentes versões do iOS      |
|Incompatibilidade com Android antigo   | Aplicativo não abre em alguns aparelhos | Testar em diferentes versões do Adroid      |
|Falta de dispositivos de teste     | Atraso nos testes manuais         | Uso de emuladores                           |
|Mal funcionamento de servidor     | Atraso na entrega dos teste         | Uso de servidores locais                          |

---
