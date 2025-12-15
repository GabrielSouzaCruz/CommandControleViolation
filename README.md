# CommandControleViolation

Este projeto apresenta uma **implementação propositalmente acoplada**, utilizada como contraponto ao uso do padrão de projeto Command.

O objetivo é evidenciar os **problemas arquiteturais** decorrentes da ausência do padrão, mantendo o mesmo domínio de automação residencial para fins comparativos.

---

## 🎯 Objetivo

- Demonstrar uma **violação arquitetural**
- Evidenciar alto acoplamento entre controle e dispositivos
- Comparar diretamente com a versão que utiliza o padrão Command
- Servir como base didática para análise crítica

---

## 🏗️ Estrutura do Projeto

```

src
├─ model
│  ├─ ControleRemotoSimples.java
│  ├─ Luz.java
│  ├─ Som.java
│  └─ ArCondicionado.java
└─ view
└─ Main.java

```

---

## 🧩 Características da Implementação

### ControleRemotoSimples
- Conhece diretamente todos os dispositivos
- Executa ações chamando métodos concretos dos receptores
- Possui métodos rígidos para cenários como "Modo Cinema"

### Problemas Evidenciados
- Alto acoplamento
- Violação do **DIP (Dependency Inversion Principle)**
- Violação do **OCP (Open/Closed Principle)**
- Ausência de histórico de ações
- Impossibilidade de reutilização de comandos
- Dificuldade de manutenção e expansão

---

## ▶️ Execução

Execute a classe:

```

view.Main

```

O console exibirá a execução direta das ações, evidenciando o acoplamento estrutural.

---

## 🧠 Análise Comparativa

Este projeto serve exclusivamente como **exemplo de má prática arquitetural**, permitindo comparar:

- Controle rígido vs controle desacoplado
- Código duplicado vs reutilização de comandos
- Dificuldade de expansão vs extensibilidade natural

---

## 📚 Referências

- GAMMA, E. et al. *Padrões de Projeto: Soluções Reutilizáveis de Software Orientado a Objetos*
- MARTIN, R. C. *Clean Architecture*
- FOWLER, M. *Refactoring*
