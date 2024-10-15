INSERT INTO Attack (name, base_damage) VALUES
('Basic Slash', 10),
('Strong Punch', 15),
('Fireball', 20),
('Ice Blast', 18),
('Lightning Strike', 25);

INSERT INTO Weapon (name, speed, strengh, agility, intelligence, id_attack1, id_attack2) VALUES
('Sword of Might', 5, 8, 3, 2, 1, 2),
('Staff of Wisdom', 3, 4, 2, 10, 3, 4),
'Bow of Precision', 8, 5, 7, 3, 1, 5),
('Mace of Strength', 4, 10, 2, 3, 2, 1),
('Wand of Elements', 5, 3, 4, 8, 3, 5);

INSERT INTO Character (label, name, hp, defense, strengh, agility, intelligence, crit_chance, id_weapon) VALUES
('Warrior', 'Aragorn', 100, 20, 30, 25, 15, 5.00, 1),
('Mage', 'Gandalf', 80, 15, 10, 15, 35, 10.00, 2),
('Archer', 'Legolas', 90, 18, 25, 30, 20, 8.00, 3),
('Berserker', 'Thor', 120, 30, 40, 20, 10, 15.00, 4),
('Wizard', 'Saruman', 70, 10, 15, 15, 40, 12.00, 5);

