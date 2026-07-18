# Domínio

## Empresa

Representa a empresa que realiza as sondagens.

Uma empresa possui:
- usuários;
- clientes;
- obras.

---

## Cliente

Representa o contratante da obra.

Um cliente pode possuir diversas obras.

---

## Obra

Representa uma obra onde serão executados os serviços geotécnicos.

Uma obra possui:
- vários furos;
- um cliente;
- um responsável técnico.

---

## Furo

Representa um ponto de sondagem (SP-01, SP-02...).

Um furo possui:
- camadas do solo;
- ensaios SPT;
- leituras de LT;
- profundidade final;
- motivo do encerramento.

Um furo pertence a uma única obra.

---

## Camada

Representa uma mudança de material do solo.

Exemplo:
- 0,10 m → Entulho
- 1,15 m → Pedregulho amarelo escuro

Uma camada pertence a um único furo.

---

## Ensaio SPT

Representa os golpes registrados em uma profundidade.

Cada ensaio possui:
- profundidade;
- três valores de golpes.

---

## LT

Representa as leituras do nível d'água.

Cada LT possui:
- profundidade inicial;
- três leituras após 30 minutos.