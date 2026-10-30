# MedalTracker

Aplicação de linha de comando desenvolvida em Java para cadastrar, consultar, atualizar e excluir registros de medalhas esportivas.

## Sobre o projeto

O MedalTracker foi desenvolvido para organizar um histórico pessoal de conquistas esportivas. Por meio de um menu interativo no terminal, o usuário pode registrar medalhas e gerenciar suas informações, incluindo ano, campeonato, categoria e cor.

O projeto tem como objetivo aplicar conceitos fundamentais da linguagem Java, programação orientada a objetos, manipulação de coleções, validação de entradas e organização de código em classes e pacotes.

## Funcionalidades

- **Cadastrar medalhas:** registrar ano, campeonato, categoria e cor.
- **Listar medalhas:** visualizar todas as medalhas cadastradas e seus respectivos dados.
- **Atualizar medalhas:** modificar as informações de uma medalha existente por meio de seu ID.
- **Excluir medalhas:** remover uma medalha cadastrada utilizando seu ID.
- **Mostrar quantidade de medalhas:** consultar o total de medalhas cadastradas, separado entre ouro, prata e bronze.
- **Validar entradas:** tratar entradas numéricas inválidas, impedir campos de texto vazios e limitar as cores às opções disponíveis.
- **Menu interativo:** navegar pelas funcionalidades até selecionar a opção de saída.

## Tecnologias utilizadas

- Java
- Java Collections Framework (`ArrayList`)
- Enumerações (`enum`)
- Interface de linha de comando (CLI)

## Arquitetura do projeto

```text
MedalTracker/
├── src/
│   └── br/com/medaltracker/
│       ├── Main.java
│       ├── model/
│       │   ├── Medalha.java
│       │   └── CorMedalha.java
│       ├── service/
│       │   └── MedalhaService.java
│       └── ui/
│           └── Menu.java
├── README.md
└── .gitignore
```

### Organização dos componentes

| Arquivo | Responsabilidade |
|---|---|
| `Main.java` | Ponto de entrada da aplicação. |
| `model/Medalha.java` | Representa uma medalha e seus atributos. |
| `model/CorMedalha.java` | Define as cores disponíveis: ouro, prata e bronze. |
| `service/MedalhaService.java` | Implementa as operações de cadastro, listagem, atualização e exclusão. |
| `ui/Menu.java` | Gerencia o menu do terminal e a interação com o usuário. |

## Requisitos

- Java Development Kit (JDK) instalado.
- Terminal ou prompt de comando.

## Como executar

Execute os comandos a seguir a partir da pasta raiz do projeto.

### 1. Compilar o código

```powershell
javac -d out src\br\com\medaltracker\Main.java src\br\com\medaltracker\model\CorMedalha.java src\br\com\medaltracker\model\Medalha.java src\br\com\medaltracker\service\MedalhaService.java src\br\com\medaltracker\ui\Menu.java
```

### 2. Executar a aplicação

```powershell
java -cp out br.com.medaltracker.Main
```

## Armazenamento de dados

Os registros são mantidos em memória durante a execução da aplicação. Ao encerrar o programa, as medalhas cadastradas são perdidas, pois não há persistência de dados.

## Objetivo acadêmico

O projeto permite praticar conceitos de programação orientada a objetos, encapsulamento, métodos, coleções, estruturas condicionais, laços de repetição, tratamento de entradas e organização de código em pacotes.

## Licença

Projeto desenvolvido para fins educacionais.