## 🧪 ID: 001

### ✅ Caso de teste Login usuario administrador:


### 🎯 Descrição:
Testar se o login como adiministrador está funcionando corretamente com as informações corretas da loja desejada

### 🧰 Pré-requisitos:
- Usuário deve estar na tela de login
- O banco de dados da loja deve está funcionando corretamente

### 📝 Procedimentos:
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

### 📝 Procedimentos:
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

### ✅ Caso de teste cadastro  do usuario:


### 🎯 Descrição:
Testar se o cadastro como adiministrador aceita a entrada de usuário caso utilize as informações corretas

### 🧰 Pré-requisitos:
- Usuário deve estar na tela de cadastro
- O banco de dados da loja deve está funcionando corretamente

### 📝 Procedimentos:
1. Acessar a tela de cadastro
2. Preencher os campos obrigatórios com dados validos
3. Clicar no botão "registrar"

### 🧾 Dados de Entrada:
| Campo            | Valor de Teste        |
|------------------|------------------------|
| Nome             | Bruno Alves         |
| Email            | BrunoAlves@gmail.com         |
| Senha            | SkateMaster               |
| Confirmar Senha  | SkateMaster                |

### 💡 Resultado Esperado:
O usuario deve ser redirecionado para a tela principal

### 📌 Resultado Obtido:
Usuário teve acesso ao painel pricipal
### ✅ Status do Teste:
- [x] Aprovado
- [ ] Reprovado

---
## 🧪 ID: 004

### ✅ Caso de teste cadastro errado  do usuario:


### 🎯 Descrição:
Testar se o cadastro como adiministrador rejeita a entrada de usuário caso utilize uma senha diferente na confirmação da senha

### 🧰 Pré-requisitos:
- Usuário deve estar na tela de cadastro
- O banco de dados da loja deve está funcionando corretamente

### 📝 Procedimentos:
1. Acessar a tela de cadastro
2. Preencher os campos obrigatórios com dados validos porem o campo de confirmar senha incorretanente
3. Clicar no botão "registrar"

### 🧾 Dados de Entrada:
| Campo            | Valor de Teste        |
|------------------|------------------------|
| Nome             | Bruno Alves         |
| Email            | BrunoAlves@gmail.com         |
| Senha            | SkateMaster               |
| Confirmar Senha  | skatemister                |

### 💡 Resultado Esperado:
O usuario deve ser receber a mensagem "Senha diferente da fornecida anteriormente"

### 📌 Resultado Obtido:
Usuário teve o acesso rejeitado
### ✅ Status do Teste:
- [x] Aprovado
- [ ] Reprovado

---
## 🧪 ID: 005

### ✅ Caso de teste excluir usuario cadastrado :


### 🎯 Descrição:
Testar se a opção de excluir usuario está funcionando corretamente

### 🧰 Pré-requisitos:
- Usuário deve estar na tela de configurações
- O banco de dados da loja deve está funcionando corretamente

### 📝 Procedimentos:
1. Acessar a tela de configurações
2. Preencher os campos obrigatórios com dados da conta
3. Clicar no botão "excluir conta " e confirmar

### 🧾 Dados de Entrada:
| Campo            | Valor de Teste        |
|------------------|------------------------|
| Senha            | SkateMaster               |

### 💡 Resultado Esperado:
O usuario deve ser receber a mensagem "Sua conta foi excluida"

### 📌 Resultado Obtido:
Usuário teve sucesso ao excluir sua conta administrativa
### ✅ Status do Teste:
- [x] Aprovado
- [ ] Reprovado

---
## 🧪 ID: 006

### ✅ Caso de teste atualizar usuario cadastrado :


### 🎯 Descrição:
Testar se a opção de atualizar está funcionando corretamente.

### 🧰 Pré-requisitos:
- Usuário deve estar na tela de configurações
- O banco de dados da loja deve está funcionando corretamente

### 📝 Procedimentos:
1. Acessar a tela de configurações
2. Preencher os campos obrigatórios com dados da conta
3. Clicar no botão "atualizar dados" e confirmar

### 🧾 Dados de Entrada:
| Campo            | Valor de Teste        |
|------------------|------------------------|
| Nome             | Bruno Alves         |
| Email            | BrunoAlves@gmail.com         |
| Senha            | SkateMaster               |
| Novo nome  | Bruno Santos                |
| Novo email  | BrunoSantos@gmail.com                |
| NovaSenha            | SkatePro               |


### 💡 Resultado Esperado:
O usuario deve ser receber a mensagem "Sua conta foi atualizada"

### 📌 Resultado Obtido:
Usuário teve sucesso ao atualizar sua conta administrativa
### ✅ Status do Teste:
- [x] Aprovado
- [ ] Reprovado

---
## 🧪 ID: 007

### ✅ Caso de teste atualizar usuario cadastrado com senha incorreta :


### 🎯 Descrição:
Testar se a opção de atualizar está rejeitando caso o usuario informe-a incorretamente.

### 🧰 Pré-requisitos:
- Usuário deve estar na tela de configurações
- O banco de dados da loja deve está funcionando corretamente

### 📝 Procedimentos:
1. Acessar a tela de configurações
2. Preencher os campos obrigatórios com dados da conta incorretamente
3. Clicar no botão "atualizar dados" e confirmar

### 🧾 Dados de Entrada:
| Campo            | Valor de Teste        |
|------------------|------------------------|
| Nome             | Bruno Alves         |
| Email            | BrunoAlves@gmail.com         |
| Senha            | skatemister               |
| Novo nome  | Bruno Santos                |
| Novo email  | BrunoSantos@gmail.com                |
| NovaSenha            | SkatePro               |


### 💡 Resultado Esperado:
O usuario deve ser receber a mensagem "Senha incorreta, tente novamente"

### 📌 Resultado Obtido:
Usuário foi rejeitado ao tentar atualizar a senha incorreta
### ✅ Status do Teste:
- [x] Aprovado
- [ ] Reprovado

---

## 🧪 ID: 008

### ✅ Caso de teste atualizar usuario cadastrado com email incorreto :


### 🎯 Descrição:
Testar se a opção de atualizar está rejeitando caso o usuario informe-a incorretamente.

### 🧰 Pré-requisitos:
- Usuário deve estar na tela de configurações
- O banco de dados da loja deve está funcionando corretamente

### 📝 Procedimentos:
1. Acessar a tela de configurações
2. Preencher os campos obrigatórios com dados da conta incorretamente
3. Clicar no botão "atualizar dados" e confirmar

### 🧾 Dados de Entrada:
| Campo            | Valor de Teste        |
|------------------|------------------------|
| Nome             | Bruno Alves         |
| Email            | BrinoAlves@gmail.com         |
| Senha            | SkateMaster               |
| Novo nome  | Bruno Santos                |
| Novo email  | BrunoSantos@gmail.com                |
| NovaSenha            | SkatePro               |


### 💡 Resultado Esperado:
O usuario deve ser receber a mensagem "email incorreto, tente novamente"

### 📌 Resultado Obtido:
Usuário foi rejeitado ao tentar atualizar a email incorreto
### ✅ Status do Teste:
- [x] Aprovado
- [ ] Reprovado

---


## 🧪 ID: 010

### ✅ Caso de teste Listagem de produtos na loja:


### 🎯 Descrição:
Verificar se o aplicativo exibe os produtos que estão disponiveis na loja.

### 🧰 Pré-requisitos:
- Usuário deve estar na tela de administração
- O banco de dados da loja deve está funcionando corretamente

### 📝 Procedimentos:
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
## 🧪 ID: 011

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
O programa mostrou os produtos do estoque do setor conforme o esperado.

### 📌 Resultado Obtido:
O programa gerou a informação do fluxo da area selecionada

### ✅ Status do Teste:
- [x] Aprovado
- [ ] Reprovado

---

## 🧪 ID: 012

### ✅ Caso de teste  Exibição dos produtos mais vendidos :


### 🎯 Descrição:
Verificar se o programa exibi os produtos que melhor performaram nas vendas.

### 🧰 Pré-requisitos:

- Usuário deve estar na tela de administração
- O banco de dados da loja deve está funcionando corretamente

### 📝 Procedimentos:
1. Acessar a tela de administração
2. Selecionar o setor desejado
3. Selecionar "produtos mais vendidos"



### 💡 Resultado Esperado:
O programa deve exibir uma lista com os produtos mais vendidos do setor.

### 📌 Resultado Obtido:
O programa gerou uma lista com os produtos que mais venderam no setor selecionado.

### ✅ Status do Teste:
- [x] Aprovado
- [ ] Reprovado

---

