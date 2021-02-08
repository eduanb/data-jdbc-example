Spring JDBC based example project.
The aim is to show how Spring Data JDBC can be used to read and join data from an already existing DB.

Run example:
```
docker-compose up -d
.mvnw spring-boot:run
(in a separate terminal)
curl localhost:8080
```
Expected output:
`[{"name":"Eduan","lastname":"Bekker","model":"Land Rover"}]`
