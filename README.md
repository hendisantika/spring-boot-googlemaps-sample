# Spring Boot Google Maps Sample

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
    - Java 21
    - Spring Boot 3.5.7
    - Spring Data JPA
    - Thymeleaf (Template Engine)
    - ModelMapper 3.2.6
    - Lombok

- **Frontend:**
    - Bootstrap 5.3.8
    - jQuery 3.7.1
    - Font Awesome 7.0.1
    - Google Maps JavaScript API

- **Database:**
    - MySQL 8

## Prerequisites

Before running this application, make sure you have:

- Java 21 or higher installed
- Maven 3.6+ installed
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
mvn clean package
```

## Running the Application

### Using Maven:

```bash
mvn spring-boot:run
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

## Troubleshooting

### Application won't start

- Ensure MySQL is running and accessible
- Check database credentials in `application.properties`
- Verify Java 21 or higher is installed: `java --version`

### Map not loading

- Verify your Google Maps API key is valid and has the Maps JavaScript API enabled
- Check browser console for any API key errors

### Build failures

- Make sure Maven 3.6+ is installed: `mvn --version`
- Clear Maven cache: `mvn clean`
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
