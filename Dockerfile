# Etapa de construcción
FROM openjdk:17-alpine as builder

# Establece el directorio de trabajo
WORKDIR /build

# Copia los archivos necesarios para la compilación
COPY pom.xml mvnw ./
COPY .mvn .mvn
COPY src src

# Prepara el entorno y compila el proyecto
RUN sed -i -e 's/\r$//' ./mvnw && \
    chmod +x mvnw && \
    ./mvnw clean package -DskipTests

# Etapa de ejecución
FROM openjdk:17-alpine

# Establece el directorio de trabajo
WORKDIR /app

# Copia solo el JAR de la etapa de construcción
COPY --from=builder /build/target/msvc-exchange-0.0.1-SNAPSHOT.jar ./

# Expone el puerto en el que se ejecutará la aplicación
EXPOSE 8001

# Define el punto de entrada para iniciar la aplicación
ENTRYPOINT ["java", "-jar", "msvc-exchange-0.0.1-SNAPSHOT.jar"]
