use flightInfo;
CREATE TABLE IF NOT EXISTS airports
(
    id   INT AUTO_INCREMENT PRIMARY KEY,
    city VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS flights
(
    id                   INT AUTO_INCREMENT PRIMARY KEY,
    departure_airport_id INT      NOT NULL,
    arrival_airport_id   INT      NOT NULL,
    departure_datetime   DATETIME NOT NULL,
    return_datetime      DATETIME,
    fare                 INT      NOT NULL,
    FOREIGN KEY (departure_airport_id) REFERENCES airports (id),
    FOREIGN KEY (arrival_airport_id) REFERENCES airports (id)
);



INSERT INTO airports (city)
VALUES ('City1'),
       ('City2'),
       ('City3');



INSERT INTO flights (departure_airport_id, arrival_airport_id, departure_datetime, return_datetime, fare)
VALUES (1, 2, '2022-01-01T12:00:00', '2022-01-02T14:30:00', 500),
       (2, 3, '2022-02-01T09:45:00', '2022-02-03T11:15:00', 700),
       (3, 1, '2022-03-01T16:20:00', '2022-03-02T18:00:00', 600);

