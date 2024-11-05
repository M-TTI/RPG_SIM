
-- Insertion de personnages
INSERT INTO Characters (name, hp_max, hp, def, crit) VALUES
                                                         ('Hero', 100, 100, 10, 5),
                                                         ('Warrior', 120, 120, 15, 3),
                                                         ('Mage', 80, 80, 5, 10),
                                                         ('Rogue', 90, 90, 8, 15);

-- Insertion d'armes
INSERT INTO Weapon (name, speed) VALUES
                                     ('Sword', 10),
                                     ('Axe', 8),
                                     ('Staff', 12),
                                     ('Dagger', 15);

-- Insertion de compétences
INSERT INTO Skill (name, damage) VALUES
                                     ('Slash', 20),
                                     ('Cleave', 25),
                                     ('Fireball', 30),
                                     ('Backstab', 35);

-- Insertion des relations entre armes et compétences
INSERT INTO WeaponSkill (weapon_id, skill_id) VALUES
                                                  (1, 1),  -- Sword -> Slash
                                                  (1, 2),  -- Sword -> Cleave
                                                  (2, 2),  -- Axe -> Cleave
                                                  (3, 3),  -- Staff -> Fireball
                                                  (4, 4),  -- Dagger -> Backstab
                                                  (4, 1);  -- Dagger -> Slash