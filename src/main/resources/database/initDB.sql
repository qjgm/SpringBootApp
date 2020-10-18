CREATE TABLE IF NOT EXISTS viruses
(
    id INTEGER PRIMARY KEY ,
    type ENUM('red', 'blue', 'green', 'yellow'),
    name VARCHAR(20) NOT NULL ,
    probability_transmission VARCHAR(10) NOT NULL ,
    average_duration VARCHAR(20) NOT NULL ,
    mortality VARCHAR(20)  NOT NULL ,
    probability_re-infection VARCHAR(20)  NOT NULL
);
CREATE TABLE IF NOT EXISTS population
(
    id INTEGER PRIMARY KEY ,
    deseases VARCHAR(20) NOT NULL ,
    virus VARCHAR(20) NOT NULL ,
    infection_date VARCHAR(20)  NOT NULL ,
    virus_stage VARCHAR(20) NOT NULL ,
    life_termination_date VARCHAR(20)  NOT NULL
);