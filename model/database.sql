DROP TABLE IF EXISTS WeaponSkill;
DROP TABLE IF EXISTS Skill;
DROP TABLE IF EXISTS Weapon;
DROP TABLE IF EXISTS Character;

CREATE TABLE Characters (
                           id INT AUTO_INCREMENT PRIMARY KEY,
                           name VARCHAR(100),
                           hp_max INT,
                           hp INT,
                           def INT,
                           crit INT
);

CREATE TABLE Weapon (
                        id INT AUTO_INCREMENT PRIMARY KEY,
                        name VARCHAR(100),
                        speed INT
);

CREATE TABLE Skill (
                       id INT AUTO_INCREMENT PRIMARY KEY,
                       name VARCHAR(100),
                       damage INT
);

CREATE TABLE WeaponSkill (
                             weapon_id INT,
                             skill_id INT,
                             PRIMARY KEY (weapon_id, skill_id),
                             FOREIGN KEY (weapon_id) REFERENCES Weapon(id),
                             FOREIGN KEY (skill_id) REFERENCES Skill(id)
);