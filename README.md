# Spring Boot Google Maps Sample

[![Java CI with Maven](https://github.com/hendisantika/spring-boot-googlemaps-sample/actions/workflows/maven.yml/badge.svg)](https://github.com/hendisantika/spring-boot-googlemaps-sample/actions/workflows/maven.yml)
![Java](https://img.shields.io/badge/Java-25-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.1.1-brightgreen)

A Spring Boot web application that integrates with Google Maps API to track and visualize places you've visited, want to
visit, and favorite locations around the world.

## Features

- Interactive Google Maps integration
- Track visited places with different sentiments (loved it, liked it, want to go, etc.)
- View statistics about:
    - Total places visited
    - Countries visited
    - Places you want to visit
    - Favorite places
- Responsive web interface using Bootstrap 5
- Real-time map interactions with custom markers
- Reverse geocoding to get location details

## Tech Stack

- **Backend:**
    - Java 25
    - Spring Boot 4.1.1
    - Spring Data JPA
    - Thymeleaf (Template Engine)
    - ModelMapper 3.2.7
    - Lombok

- **Frontend:**
    - Bootstrap 5.3.8
    - jQuery 4.0.0
    - Font Awesome 7.3.0
    - Google Maps JavaScript API

- **Database:**
    - MySQL 8

## Prerequisites

Before running this application, make sure you have:

- Java 25 or higher installed
- Maven 3.10+ (optional — the bundled Maven Wrapper `./mvnw` downloads it for you)
- MySQL 8+ installed and running
- Google Maps API Key ([Get one here](https://developers.google.com/maps/documentation/javascript/get-api-key))

## Configuration

### 1. Database Setup

The application will automatically create the database if it doesn't exist. By default, it uses:

- **Database name:** `gmaps`
- **Username:** `root`
- **Password:** `root`
- **Port:** `3306`

If you need to change these settings, update the `src/main/resources/application.properties` file:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/gmaps?createDatabaseIfNotExist=true&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=Asia/Jakarta&useSSL=false&allowPublicKeyRetrieval=true
spring.datasource.username=root
spring.datasource.password=root
```

### 2. Google Maps API Key

Update the `src/main/resources/application.properties` file with your Google Maps API key:

```properties
gmaps.api.key=YOUR_GOOGLE_MAPS_API_KEY_HERE
```

## Installation

1. Clone the repository:

```bash
git clone https://github.com/hendisantika/spring-boot-googlemaps-sample.git
cd spring-boot-googlemaps-sample
```

2. Make sure MySQL is running on your system

3. Update the Google Maps API key in `application.properties`

4. Build the project:

```bash
./mvnw clean package
```

## Running the Application

### Using Maven:

```bash
./mvnw spring-boot:run
```

### Using the JAR file:

```bash
java -jar target/spring-boot-googlemaps-sample-0.0.1-SNAPSHOT.jar
```

The application will start on `http://localhost:8080`

## Usage

1. Open your browser and navigate to `http://localhost:8080`
2. You'll see the main page with:
    - An embedded Google Maps view
    - Statistics showing places visited, countries visited, places to visit, and favorite places
3. Click on the map to:
    - Mark places you've visited
    - Add places you want to visit
    - Mark favorite locations
    - Get reverse geocoding information for any location

## API Endpoints

- `GET /` - Main homepage with statistics
- `GET /map` - Interactive map page

## Project Structure

```
src/main/java/com/hendisantika/springbootgooglemapssample/
├── config/          # Configuration classes
├── controller/      # REST controllers
├── dto/            # Data Transfer Objects
├── entity/         # JPA entities
├── repository/     # Data repositories
└── service/        # Business logic services

src/main/resources/
├── static/         # Static resources (CSS, JS)
├── templates/      # Thymeleaf templates
└── application.properties
```

## Key Components

### Entities

- **PlaceSense**: Represents a user's feeling about a place
- **Place**: Location information (name, coordinates, country)
- **Sense**: Enumeration of feelings (YES_LOVED_IT, YES_LIKED_IT, NO_WANNA_GO, etc.)
- **LatLng**: Geographic coordinates

### Controllers

- **GmapsController**: Handles web requests for the homepage and map page

### Services

- **PlaceSenseService**: Manages place sense statistics and operations

## Development

The application includes Spring Boot DevTools for hot reloading during development. Any changes to templates or static
resources will be automatically reflected without restarting the application.

## Build Information

- **Group ID**: com.hendisantika
- **Artifact ID**: spring-boot-googlemaps-sample
- **Version**: 0.0.1-SNAPSHOT

## Continuous Integration

GitHub Actions ([`.github/workflows/maven.yml`](.github/workflows/maven.yml)) builds and tests the project with
Temurin JDK 25 on every push and pull request to `main`, and can be triggered manually via *workflow_dispatch*.
On pushes to `main` it also submits the Maven dependency graph to GitHub so Dependabot alerts stay accurate.

## Dependency Updates

Dependabot ([`.github/dependabot.yml`](.github/dependabot.yml)) keeps dependencies up to date:

| Ecosystem      | Schedule                        | Grouping                                                  | Commit prefix |
|----------------|---------------------------------|-----------------------------------------------------------|---------------|
| Maven          | Daily, 05:00 Asia/Jakarta       | Spring Boot, WebJars, Maven plugins, other minor/patch    | `build(deps)` |
| GitHub Actions | Weekly (Monday), 05:00 Asia/Jakarta | All actions in a single PR                            | `ci(deps)`    |

## Troubleshooting

### Application won't start

- Ensure MySQL is running and accessible
- Check database credentials in `application.properties`
- Verify Java 25 or higher is installed: `java --version`

### Map not loading

- Verify your Google Maps API key is valid and has the Maps JavaScript API enabled
- Check browser console for any API key errors

### Build failures

- Make sure JDK 25 is active: `./mvnw --version`
- Clear build output: `./mvnw clean`
- Delete `.m2/repository` and rebuild

## License

This project is open source and available for educational purposes.

## Author

**Hendi Santika**

- Email: hendisantika@gmail.com
- Telegram: @hendisantika34
- Website: hendisantika.com

## Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

## Acknowledgments

- Spring Boot team for the excellent framework
- Google Maps Platform for the mapping capabilities
- Bootstrap and Font Awesome for the UI components
