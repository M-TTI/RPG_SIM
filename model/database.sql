-- Création de la table Attack
CREATE TABLE Attack (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(256) NOT NULL,
    base_damage INT NOT NULL
);

-- Création de la table Weapon
CREATE TABLE Weapon (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(256) NOT NULL,
    speed INT NOT NULL,
    strengh INT NOT NULL,
    agility INT NOT NULL,
    intelligence INT NOT NULL,
    id_attack1 INT,
    id_attack2 INT,
    FOREIGN KEY (id_attack1) REFERENCES Attack(id),
    FOREIGN KEY (id_attack2) REFERENCES Attack(id)
);

-- Création de la table Character
CREATE TABLE Characters (
    id INT PRIMARY KEY AUTO_INCREMENT,
    label VARCHAR(256) NOT NULL,
    name VARCHAR(256) NOT NULL,
    hp DECIMAL(10, 2) NOT NULL,
    defense INT NOT NULL,
    strengh INT NOT NULL,
    agility INT NOT NULL,
    intelligence INT NOT NULL,
    crit_chance DECIMAL(5, 2),
    id_weapon INT,
    FOREIGN KEY (id_weapon) REFERENCES Weapon(id)
);
