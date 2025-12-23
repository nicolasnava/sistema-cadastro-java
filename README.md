# 🔐 Sistema de Cadastro de Usuários - Java

Sistema de cadastro desenvolvido como projeto prático do curso **Nano Java da FIAP**, aplicando conceitos de estruturas de repetição, manipulação de strings e validações.

## 📋 Funcionalidades

- ✅ **Cadastro de usuário** com validações em tempo real
- ✅ **Validação de nome completo** (mínimo 2 palavras)
- ✅ **Validação de email** (formato correto com @ e .)
- ✅ **Validação de idade** (entre 18 e 120 anos)
- ✅ **Validação de senha** (exatamente 6 caracteres)
- ✅ **Listagem de usuário cadastrado**
- ✅ **Busca por email** (case-insensitive)
- ✅ **Estatísticas** do usuário
- ✅ **Menu interativo** com 5 opções

## 🛠️ Tecnologias Utilizadas

- **Linguagem:** Java 17
- **IDE:** IntelliJ IDEA Community
- **Conceitos aplicados:**
  - Estruturas de repetição (`for`, `while`, `do-while`)
  - Estruturas condicionais (`if/else`, `switch/case`)
  - Manipulação de Strings
  - Scanner para entrada de dados
  - Operadores lógicos (`&&`, `||`, `!`)
  - Validação de dados

## 🚀 Como Executar

### Pré-requisitos
- Java JDK 17 ou superior instalado
- IntelliJ IDEA (ou outra IDE Java)

### Passos
1. Clone o repositório:
```bash
git clone https://github.com/SEU_USERNAME/sistema-cadastro-java.git
```

2. Abra o projeto no IntelliJ IDEA

3. Execute o arquivo `ProjetoFinal.java`

4. Interaja com o menu no console!

## 📸 Screenshots

### Menu Principal
<img width="1365" height="730" alt="menu" src="https://github.com/user-attachments/assets/db340d0c-6358-4f05-a0ea-74f697fa7c5e" />


### Cadastro com Sucesso
<img width="1362" height="730" alt="cadastro salvo" src="https://github.com/user-attachments/assets/099ee105-1dc3-4b52-bf6b-e8b2beddb62f" />



## 💡 Conceitos Praticados

### Validações com Loops
```java
// Exemplo: Validação de email
while (posGmail == -1 || posPonto == -1 || posGmail > posPonto) {
    System.out.println("Email inválido!");
    gmail = leitor.nextLine();
    posGmail = gmail.indexOf("@");
    posPonto = gmail.indexOf(".");
}
```

### Manipulação de Strings
```java
// Extraindo primeiro nome
nome = nomeCompleto.substring(0, nomeCompleto.indexOf(" "));

// Extraindo domínio do email
dominioGmail = gmail.substring(gmail.indexOf("@") + 1);
```

## 📚 Aprendizados

- Escopo de variáveis em estruturas de repetição
- Importância de validações para uma boa UX
- Manipulação avançada de Strings
- Estrutura de menu interativo
- Clean code e organização

## 🎯 Próximos Passos

- [ ] Refatorar usando Orientação a Objetos (Classes)
- [ ] Implementar persistência de dados (arquivos)
- [ ] Adicionar múltiplos usuários (ArrayList)
- [ ] Criar validação de senha forte
- [ ] Implementar criptografia de senha

## 👨‍💻 Autor

**Nicolas Nava Rodrigues**
- LinkedIn: www.linkedin.com/in/nicolasnava
- GitHub: (https://github.com/nicolasnava)

---

💬 Sugestões e feedback são sempre bem-vindos!

```
