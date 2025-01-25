# Etapa 1: Build do projeto com Gradle
FROM gradle:8.11.1-jdk21 AS build

# Definir diretório de trabalho
WORKDIR /usuarios.produtos.kotlin

# Copiar os arquivos de configuração do Gradle e o código-fonte
COPY --chown=gradle:gradle . .

# Rodar o Gradle para compilar a aplicação
RUN gradle clean build --no-daemon

# Etapa 2: Executar a aplicação
FROM openjdk:21

# Definir diretório de trabalho
WORKDIR /usuarios.produtos.kotlin

# Copiar o JAR do container de build
COPY --from=build /usuarios.produtos.kotlin/build/libs/*.jar app.jar

# Expor a porta onde a aplicação vai rodar
EXPOSE 8080

# Comando para rodar a aplicação
ENTRYPOINT ["java", "-jar", "/usuarios.produtos.kotlin/app.jar"]
