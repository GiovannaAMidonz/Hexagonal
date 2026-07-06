# Projeto Hexagonal - Primeiro Contato com Arquitetura Hexagonal

## 📖 Sobre o Projeto

Este projeto foi desenvolvido com o objetivo de estudar e aplicar os conceitos da Arquitetura Hexagonal (Ports and Adapters) utilizando Java 17 e Spring Boot.

O principal foco deste projeto é compreender como desacoplar as regras de negócio das tecnologias externas, permitindo que a aplicação seja mais flexível, testável e de fácil manutenção.

---

## 🏗️ O que é Arquitetura Hexagonal?

A Arquitetura Hexagonal, proposta por Alistair Cockburn, busca isolar a regra de negócio do sistema de elementos externos como:

- Banco de dados
- APIs externas
- Filas de mensageria
- Frameworks
- Interfaces Web

A comunicação entre a camada de negócio e os recursos externos ocorre através de:

### Ports (Portas)

Interfaces que definem contratos que a aplicação precisa para funcionar.

Exemplo:

```java
public interface FindAddressByZipCodeOutputPort {
    Address find(String zipCode);
}
```
## ▶️ Como Executar o Projeto

### Pré-requisitos

Antes de iniciar, certifique-se de possuir as seguintes ferramentas instaladas:

- Java 17
- Gradle
- Git
- IntelliJ IDEA (opcional)
- MongoDB 
- Apache Kafka 

---

### Clonando o Repositório

Execute o comando abaixo:

```bash
git clone https://github.com/seu-usuario/nome-do-repositorio.git
