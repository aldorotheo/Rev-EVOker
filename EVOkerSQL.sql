drop table evokerplayers;
drop table evokerorganizer;
drop table evokerjudges;
drop table evokerlineup;
drop table evokercharacters;

create table EVOkerCharacters(
char_id serial primary key,
char_name varchar
);


create table EVOkerLineup (
lineup_id serial primary key,
char_1 int,
char_2 int,
char_3 int,
foreign key (char_1) references EVOkerCharacters (char_id),
foreign key (char_2) references EVOkerCharacters (char_id),
foreign key (char_3) references EVOkerCharacters (char_id)
);

create table EVOkerLogin (
login_id serial primary key,
username varchar unique,
pass varchar
);

create table EVOkerPlayers (
player_id serial primary key,
win int,
loss int,
lineup int,
login int,
foreign key (lineup) references EVOkerLineup (lineup_id),
foreign key (login) references EVOkerLogin (login_id)
);

create table EVOkerJudges (
judge_id serial primary key,
numJudged int,
login int,
foreign key (login) references EVOkerLogin (login_id)
);

create table EVOkerOrganizer (
organizer_id serial primary key,
numRan int,
login int,
foreign key (login) references EVOkerLogin (login_id)
);

insert into evokercharacters (char_name) values ('Mario'), ('Donkey Kong'), ('Link'), ('Samus'), ('Dark Samus'), ('Yoshi'), ('Kirby'), ('Fox'), ('Pikachu'), ('Luigi'), 
('Ness'), ('Captain Falcon'), ('Jigglypuff'), ('Peach'), ('Daisy'), ('Bowser'), ('Ice Climbers'), ('Sheik'), ('Zelda'), ('Dr. Mario'), ('Pichu'), ('Falco'),
('Marth'), ('Lucina'), ('Young Link'), ('Ganondorf'), ('Mewtwo'), ('Roy'), ('Chrom'), ('Mr. Game & Watch'), ('Meta Knight'), ('Pit'), ('Dark Pit'), 
('Zero Suit Samus'), ('Wario'), ('Snake'), ('Ike'), ('Pokemon Trainer'), ('Diddy Kong'), ('Lucas'), ('Sonic'), ('King Dedede'), ('Olimar'), ('Lucario'),('R.O.B.'),
('Toon Link'),('Wolf'),('Villager'),('Mega Man'),('Wii Fit Trainer'),('Rosalina & Luma'),('Little Mac'),('Greninja'),('Palutena'),('Pac-Man'),('Robin'),('Shulk'),
('Bowser Jr.'),('Duck Hunt'),('Ryu'),('Ken'),('Cloud'),('Corrin'),('Bayonetta'),('Inkling'),('Ridley'),('Simon'),('Richter'),('King K. Rool'),('Isabelle'),
('Incineroar'),('Mii Brawler'),('Mii Swordfighter'),('Mii Gunner');


select * from evokercharacters;

insert into EVOkerLogin (username, pass) values ('austin', 'pass'),('joel', 'pass'),('tim','pass'),('zaryn','pass'),('jacob','pass'),('dave','pass'),('hugo','pass'),
('jaron','pass'),('xander','pass'),('lewis','pass'),('anthony','pass'),('nick','pass'),('alex','pass'),('wong','pass'),('sonicfox','pass'),('daigo','pass'),('majin','pass'),
('santa','pass'),('simon','pass'),('ramsey','yeschef');
