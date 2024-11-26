DROP TABLE IF EXISTS Weapons;
DROP TABLE IF EXISTS Characters;
DROP TABLE IF EXISTS Skills;

CREATE TABLE Skills (
                        id INT AUTO_INCREMENT PRIMARY KEY,
                        name VARCHAR(100),
                        damage INT
);

CREATE TABLE Weapons (
                         id INT AUTO_INCREMENT PRIMARY KEY,
                         name VARCHAR(100),
                         speed INT,
                         weapon_skill1 INT,
                         weapon_skill2 INT,
                         FOREIGN KEY (weapon_skill1) REFERENCES Skills(id),
                         FOREIGN KEY (weapon_skill2) REFERENCES Skills(id)
);

CREATE TABLE Characters (
                            id INT AUTO_INCREMENT PRIMARY KEY,
                            name VARCHAR(100),
                            hp FLOAT,
                            defense INT,
                            crit_chance FLOAT,
                            current_hp FLOAT,
                            weapon INT,
                            FOREIGN KEY (weapon) REFERENCES Weapons(id)
);
