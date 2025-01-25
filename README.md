# lojinha-virtual

Projeto destinado ao estudo de microsserviços e teste de novas tecnologias
Arquitetura de camadas

### Linguagens Utilizadas

- Java 17
- Kotlin 

### Estrutura do projeto

```
lojinha-virtual/
│-- usuarios-produtos-kotlin/   # Microsserviço de usuários e produtos (Kotlin + JPA)
│   ├── src/
│   ├── build.gradle.kts
│   └── Dockerfile
│
│-- pedidos-java/               # Microsserviço de pedidos (Java + Hibernate)
│   ├── src/
│   ├── pom.xml
│   └── Dockerfile
│
│-- feedbacks-kotlin/              # Microsserviço de feedbacks (kotlin + Hibernate)
│   ├── src/
│   ├── build.gradle.kts
│   └── Dockerfile
│
│-- docker-compose.yml            
│-- README.md
```

### Microsserviço de Usuarios e Produtos 

- Cadastra Clientes e Produtos
- Altera Clientes e Produtos
- Remove Clientes e Produtos
- autentica e autoriza usuarios

### Microsserviço de Pedidos
- Faz pedidos com validação de estoque
- gera eventos para atualização via kafka

### Microsserviço de feedbacks
- envia feedback e avaliação
- publicação de eventos de feedback via kafka

Pedidos e feedbacks se comunicam com Usuarios e Produtos

### Tecnologias usadas
- Banco relacional (PostgresSQL)
- Apache Kafka
- JPA
- Hibernate
- Jwt
- SpringBoot