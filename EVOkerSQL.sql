drop table evokerplayers;
drop table evokerorganizer;
drop table evokerjudges;
drop table evokerlineup;
drop table evokercharacters;
drop table evokerplayerlist;

create table EVOkerCharacters(
char_id serial primary key,
char_name varchar,
wins int,
losses int
);

create table EVOkerLogin (
login_id serial primary key,
username varchar unique,
pass varchar,
user_type int
);

create table EVOkerPlayers (
player_id serial primary key,
win int,
loss int,
login_id int,
numChars int,
foreign key (login_id) references EVOkerLogin (login_id)
);

create table EVOkerLineup (
player_id int,
char_id int,
foreign key (player_id) references evokerplayers (player_id),
foreign key (char_id) references evokercharacters (char_id)
);

create table EVOkerJudges (
judge_id serial primary key,
numJudged int,
login_id int,
foreign key (login_id) references EVOkerLogin (login_id)
);

create table EVOkerOrganizer (
organizer_id serial primary key,
numRan int,
login_id int,
foreign key (login_id) references EVOkerLogin (login_id)
);

insert into evokercharacters (char_name) values ('Mario'), ('Donkey Kong'), ('Link'), ('Samus'), ('Dark Samus'), ('Yoshi'), ('Kirby'), ('Fox'), ('Pikachu'), ('Luigi'), 
('Ness'), ('Captain Falcon'), ('Jigglypuff'), ('Peach'), ('Daisy'), ('Bowser'), ('Ice Climbers'), ('Sheik'), ('Zelda'), ('Dr. Mario'), ('Pichu'), ('Falco'),
('Marth'), ('Lucina'), ('Young Link'), ('Ganondorf'), ('Mewtwo'), ('Roy'), ('Chrom'), ('Mr. Game & Watch'), ('Meta Knight'), ('Pit'), ('Dark Pit'), 
('Zero Suit Samus'), ('Wario'), ('Snake'), ('Ike'), ('Pokemon Trainer'), ('Diddy Kong'), ('Lucas'), ('Sonic'), ('King Dedede'), ('Olimar'), ('Lucario'),('R.O.B.'),
('Toon Link'),('Wolf'),('Villager'),('Mega Man'),('Wii Fit Trainer'),('Rosalina & Luma'),('Little Mac'),('Greninja'),('Palutena'),('Pac-Man'),('Robin'),('Shulk'),
('Bowser Jr.'),('Duck Hunt'),('Ryu'),('Ken'),('Cloud'),('Corrin'),('Bayonetta'),('Inkling'),('Ridley'),('Simon'),('Richter'),('King K. Rool'),('Isabelle'),
('Incineroar'),('Mii Brawler'),('Mii Swordfighter'),('Mii Gunner');

update evokercharacters set wins = 0, losses = 0;

select * from evokercharacters;

insert into EVOkerLogin (username, pass, user_type) values ('austin', 'pass', 3),('joel', 'pass', 3),('tim','pass', 1),('zaryn','pass', 1),('jacob','pass', 1),('dave','pass', 1),('hugo','pass', 1),
('jaron','pass', 1),('xander','pass', 1),('lewis','pass', 1),('anthony','pass', 1),('nick','pass', 1),('alex','pass', 1),('jwong','pass', 1),('sonicfox','pass', 1),('daigo','pass', 1),('majin','pass', 1),
('santa','pass', 2),('simon','pass', 2),('ramsey','yeschef', 2);

insert into evokerjudges (login_id) values (18), (19), (20);
update evokerjudges set numjudged = 0;

insert into evokerorganizer (login_id) values (1), (2);
update evokerorganizer set numran = 0;

insert into evokerplayers (login_id) values (3), (4), (5), (6), (7), (8), (9), (10), (11), (12), (13), (14), (15), (16), (17);

update evokerplayers set win = 0, loss = 0, numchars = 0;

create table EVOkerRuleset (
ruleset_id serial primary key,
timed int,
stock int,
supers int
);

create table EVOkerBanlist (
ruleset_id int,
char_id int,
foreign key (ruleset_id) references EVOkerRuleset (ruleset_id),
foreign key (char_id) references evokercharacters (char_id)
);

alter table evokertournament add tournament_date varchar;

create table EVOkerTournament (
tournament_id serial primary key,
tournament_name varchar,
tournament_organizer int,
tournament_judge int,
tournament_ruleset int,
tournament_date varchar,
foreign key (tournament_organizer) references evokerorganizer (organizer_id),
foreign key (tournament_judge) references evokerjudges (judge_id),
foreign key (tournament_ruleset) references evokerruleset (ruleset_id)
);


create table EVOkerPlayerList (
tournament_id int,
player_id int,
foreign key (tournament_id) references evokertournament (tournament_id),
foreign key (player_id) references evokerplayers (player_id)
);

create table current_tournaments(
organizer_id int,
tournament_id int,
foreign key (organizer_id) references evokerorganizer (organizer_id),
foreign key (tournament_id) references evokertournament (tournament_id)
);

create table EVOkerMatchup(
matchup_id serial,
player1 varchar,
player2 varchar,
tournament_id int,
foreign key (tournament_id) references evokertournament (tournament_id)
);

select * from evokerlineup;
select * from evokertournament;
select * from evokerplayers;
select * from evokerlogin;
select * from evokerruleset;
select * from evokerorganizer;
select * from current_tournaments;
select * from evokerjudges;
update evokerjudges set login_id=24 where judge_id=4;
insert into evokerlogin (username) values ('N/A');
update evokerorganizer set numran=3 where login_id=2;
delete from evokertournament;
update evokerlogin set pass='pass' where login_id=24;
update evokerlogin set user_type=2 where login_id=24;
update evokerplayers set numchars = 2 where player_id = 14;