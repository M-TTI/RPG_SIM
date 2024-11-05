INSERT INTO Attack (name, base_damage) VALUES
('Slash', 10),
('Punch', 15),
('Fireball', 20),
('Ice Blast', 18),
('Lightning Strike', 25);

INSERT INTO Weapon (name, speed, strengh, agility, intelligence, id_attack1, id_attack2) VALUES
--Warrior weapons
('Sword of Might',      1,      20, 0, 0,    1, 2),     -- strengh
('Staff of Wisdom',     2,      15, 5, 0,   3, 4),      -- strengh agility
('Bow of Precision',    3,      15, 0, 5,    1, 5),     -- strangh intelligence
--Hunter weapons
('Mace of Strength',    4,      0, 20, 0,   2, 1),      -- agility
('Wand of Elements',    5,      5, 15, 0,    3, 5);     -- agility strengh
('Staff of Wisdom',     6,      0, 15, 5,   3, 4),      -- agility intelligence
--Mage weapons
('Bow of Precision',    7,      0, 0, 20,    1, 5),     -- intelligence
('Mace of Strength',    8,      5, 0, 15,   2, 1),      -- intelligence strengh
('Wand of Elements',    9,      0, 5, 15,    3, 5);     -- intelligence agility

INSERT INTO Characters (label, name, hp, defense, strengh, agility, intelligence, crit_chance, id_weapon) VALUES
('Warrior', 'Aragorn',  250, 20,    30, 25, 15,     5.00, 1),
('Mage', 'Gandalf',     200, 15,    10, 15, 35,     10.00, 4),
('Hunter', 'Legolas',   225, 18,    10, 30, 20,     15.00, 7),


