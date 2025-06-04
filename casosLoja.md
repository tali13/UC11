## 🧪 ID: 001

### ✅ Caso de teste Login usuario administrador:


### 🎯 Descrição:
Testar se o login como adiministrador está funcionando corretamente com as informações corretas da loja desejada

### 🧰 Pré-requisitos:
- Usuário deve estar na tela de login
- O banco de dados da loja deve está funcionando corretamente

### 📝 Procedimentos (Passos para execução do teste):
1. Acessar a tela de login
2. Preencher os campos obrigatórios com dados válidos
3. Clicar no botão "Entrar"

### 🧾 Dados de Entrada:
| Campo            | Valor de Teste        |
|------------------|------------------------|
| Nome             | JoelmaDaSilva          |
| Email            | Joelma@outlook.com         |
| Senha            | J01041994               |
| Confirmar Senha  | J01041994                |

### 💡 Resultado Esperado:
O usuario deve poder entrar poder acessar sua conta administrativa e entrar no menu da loja seguido com a messagem "Bem vindo [nome do dono]"

### 📌 Resultado Obtido:
Usuário entrou na tela adiministrariva com sucesso e redirecionado corretamente.

### ✅ Status do Teste:
- [x] Aprovado
- [ ] Reprovado

---

## 🧪 ID: 002

### ✅ Caso de teste Login incorreto do usuario:


### 🎯 Descrição:
Testar se o login como adiministrador rejeita a entrada de usuário caso utilize um senha errada

### 🧰 Pré-requisitos:
- Usuário deve estar na tela de login
- O banco de dados da loja deve está funcionando corretamente

### 📝 Procedimentos (Passos para execução do teste):
1. Acessar a tela de login
2. Preencher os campos obrigatórios com dados invalidos
3. Clicar no botão "Entrar"

### 🧾 Dados de Entrada:
| Campo            | Valor de Teste        |
|------------------|------------------------|
| Nome             | Bruno Alves         |
| Email            | BrunoAlves@gmail.com         |
| Senha            | SkateMaster               |
| Confirmar Senha  | skat3mister                |

### 💡 Resultado Esperado:
O usuario deve ser recebido com a mensagem "Senha incorreta, porfavor digite-a novamente"

### 📌 Resultado Obtido:
Usuário teve a entrada negada
### ✅ Status do Teste:
- [x] Aprovado
- [ ] Reprovado

---

## 🧪 ID: 003

### ✅ Caso de teste Listagem de produtos na loja:


### 🎯 Descrição:
Verificar se o aplicativo exibe os produtos que estão disponiveis na loja.

### 🧰 Pré-requisitos:
- Usuário deve estar na tela de administração
- O banco de dados da loja deve está funcionando corretamente

### 📝 Procedimentos (Passos para execução do teste):
1. Acessar a tela de administração
2. Escolher o setor de produtos
3. Clicar no botão "Listar"
4. Selecionar o estoque disponivel


### 💡 Resultado Esperado:
O programa deve exibir os produtos de cada estoque do setor selecionado.

### 📌 Resultado Obtido:
O programa exibiu corretamente os produtos do estoque do setor desejado
### ✅ Status do Teste:
- [x] Aprovado
- [ ] Reprovado

---
## 🧪 ID: 004

### ✅ Caso de teste Fluxo de entradas de produtos:


### 🎯 Descrição:
Verificar se o produto foi inserido no estoque corretamente.

### 🧰 Pré-requisitos:

- Usuário deve estar na tela de administração
- O banco de dados da loja deve está funcionando corretamente

### 📝 Procedimentos (Passos para execução do teste):
1. Acessar a tela de administração
2. Selecionar a opção de fluxo de estoque
3. Selecionar a opção do produto desejado
4. Verificar se o produto está no setor correto



### 💡 Resultado Esperado:
O programa deve alertar caso um produto esteja fora do fluxo do estoque correto

### 📌 Resultado Obtido:
O programa mostrou os produtos do estoque do setor conforme o esperado.
### ✅ Status do Teste:
- [x] Aprovado
- [ ] Reprovado

---
