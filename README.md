# Test Example - Spring Boot REST API

## Description

Ce projet est une API REST développée avec Spring Boot. Elle propose des guides pour la connexion de prises et l'installation d'interrupteurs électriques, avec des étapes détaillées et des conseils de sécurité.

## Fonctionnalités

- Exposition d'une API REST sur `/api/interrupteurs`.
- Guides pour la connexion d'une prise et l'installation d'un interrupteur simple.
- Structure des guides : nom, description, image, étapes, conseils.

## Prérequis

- Java 17 ou supérieur
- Maven

## Installation

1. Cloner le projet :
   ```bash
   git clone <url-du-repo>
   ```
2. Se placer dans le dossier du projet :
   ```bash
   cd test-example
   ```
3. Compiler le projet :
   ```bash
   ./mvnw clean install
   ```

## Exécution

Pour lancer l'application :

```bash
./mvnw spring-boot:run
```

L'API sera accessible sur : `http://localhost:8080/api/interrupteurs`

## Exemple de requête

```http
GET http://localhost:8080/api/interrupteurs
```

## Tests

Pour exécuter les tests unitaires :

```bash
./mvnw test
```

## Structure du projet

- `src/main/java/com/example/restservice/RestServiceApplication.java` : point d'entrée
- `src/main/java/com/example/restservice/controller/ConnectionController.java` : contrôleur principal
- `src/main/java/com/example/restservice/model/Connection.java` : modèle de données
- `src/test/java/com/example/demo/DemoApplicationTests.java` : tests

## Auteur

Christophe72
