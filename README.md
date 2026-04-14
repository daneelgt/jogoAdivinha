# 🎮 Jogo Adivinha o Número

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Concluído-brightgreen?style=for-the-badge)

Um jogo de console interativo desenvolvido em **Java** que desafia o raciocínio do usuário. O projeto utiliza lógica de repetição, condicionais e geração de valores pseudo-aleatórios para criar uma experiência divertida diretamente no terminal.

---

## ✨ Funcionalidades

* **Interação Dinâmica:** O sistema reconhece o nome do jogador e fornece feedbacks personalizados.
* **Geração Aleatória:** Desafios gerados via `java.util.Random`.
* **Tratamento de Erros:** Validação para números fora do intervalo (1 a 10).
* **Sistema de Replay:** Permite iniciar novas partidas sem encerrar a execução.

---

## 🛠️ Tecnologias e Conceitos

* **Linguagem:** Java 17+
* **Scanner:** Para captura de dados via teclado.
* **Random:** Para a lógica do número secreto.
* **Estruturas de Repetição:** Loop `while` para manter o estado do jogo.
* **Métodos Personalizados:** Implementação de um helper de print para código mais limpo.

---

## 🚀 Como Executar

Para rodar o projeto localmente, siga os passos abaixo:

1. **Clone o repositório:**
   ```bash
   git clone [https://github.com/daneelgt/jogoAdivinha.git](https://github.com/daneelgt/jogoAdivinha.git)
2. **Acesse o diretório:**
    ```bash
    cd jogoAdivinha
3. **Compile o arquivo principal:**
    ```bash
    javac AdivinhaONumero.java
4. **Inicie o jogo:**
   ```bash
   java AdivinhaONumero

---

## 📝 Estrutura Lógica

  Entrada: O usuário insere o nome e seus palpites.

  Processamento: O sistema compara a tentativa com o numero_correto.

  Saída: Mensagens personalizadas indicando vitória, quase acerto ou erro por teimosia.

⭐ Se gostou do projeto, sinta-se à vontade para dar um fork ou sugerir melhorias!

Desenvolvido por daneelgt. ```
