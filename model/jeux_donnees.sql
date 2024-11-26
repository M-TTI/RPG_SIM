-- Insertion de compétences
INSERT INTO Skills (name, damage) VALUES
                                      ('Slash', 20),
                                      ('Cleave', 25),
                                      ('Fireball', 30),
                                      ('Backstab', 35);

-- Insertion d'armes
INSERT INTO Weapons (name, speed, weapon_skill1, weapon_skill2) VALUES
                                      ('Sword', 10, 1, 4),
                                      ('Axe', 8, 1, 2),
                                      ('Staff', 12, 3, 2),
                                      ('Dagger', 15, 4, 2);

-- Insertion de personnages
INSERT INTO Characters (name, hp, defense, crit_chance, current_hp, weapon) VALUES
                                                         ('Warrior', 120, 13, 5, 120, 1),
                                                         ('Mage', 80, 5, 15, 80, 3),
                                                         ('Rogue', 90, 10, 10, 90, 4);