## 📦 Projeto Web Services com Spring Boot e JPA / Hibernate

Projeto de estudo do curso de Java, do professor **Nélio Alves**, com o objetivo de aprender os fundamentos do desenvolvimento de aplicações web com Java usando **Spring Boot** e usdo do **JPA** e **Hibernate** para persistência de dados.

---

### 🎯 Objetivos do Projeto

- Criar um projeto **Spring Boot** com **Java 17**
- Implementar modelo de domínio orientado a objetos
- Dividir a aplicação em camadas: **Resource**, **Service** e **Repository**
- Configurar e utilizar banco de dados **H2** para testes
- Realizar operações **CRUD** (Create, Retrieve, Update, Delete)
- Tratar exceções de forma adequada

---

### 🛠️ Tecnologias

- Java 17
- Spring Boot
- Spring Data JPA
- H2 Database (teste)
- Maven
- Postman (testes de API)

---

## 🗂️ Estrutura do Projeto

O projeto segue a arquitetura **MVC** dividida nas seguintes camadas:

- **Model (Entidades)**: `User`, `Order`, `Product`, `Category`, `OrderItem`, `Payment`
- **Repository**: Interfaces que estendem `JpaRepository`
- **Service**: Lógica de negócio e regras de exceção
- **Resource (Controller)**: Endpoints da API REST

---

Com este projeto pude praticar a criação de API REST com Spring Boot, que até então eu só havia estudado a teoria. 🎯
