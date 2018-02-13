CREATE TABLE poll (
    id INT PRIMARY KEY auto_increment,
    description VARCHAR(32)
);

CREATE TABLE option (
    id INT PRIMARY KEY auto_increment,
    poll_id INT REFERENCES poll (poll_id),
    description VARCHAR(32)
);