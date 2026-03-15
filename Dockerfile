# Multi-stage build for Student Shuttles Application
FROM maven:3.8.4-openjdk-17 as builder

WORKDIR /build

# Copy project files
COPY pom.xml .
COPY src ./src

# Build application
RUN mvn clean package -DskipTests

# Final image
FROM openjdk:17-jdk-slim

WORKDIR /app

# Copy built jar from builder
COPY --from=builder /build/target/*.jar app.jar

# Expose port
EXPOSE 8080

# Health check
HEALTHCHECK --interval=30s --timeout=10s --start-period=40s --retries=3 \
  CMD curl -f http://localhost:8080/api/health || exit 1

# Run application
ENTRYPOINT ["java", "-jar", "app.jar"]
