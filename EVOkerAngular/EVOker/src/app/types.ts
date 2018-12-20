export class Login {
loginId: number;
passWord: string;
userName: string;
userType: number;
}
export class Character {
    charID: number;
    charName: String;
    wins: number;
    losses: number;
}
export class Judge {
    judgeID: number;
    numJudged: number;
    judgeLogin: Login;
}
export class Player {
    playerID: number;
    wins: number;
    losses: number;
    login: Login;
    lineup: Character[];
}
export class Organizer {
    organizerID: number;
    orgLogin: Login;
    numRan: number;
}
export class Tournament {
    tournamentID: number;
    tournamentName: String;
    tournamentJudge: Judge;
    tournamentOrganizer: Organizer;
    tournamentDate: String;
    ruleset: Ruleset;
    tournamentBracket: Player[];
    matchups: Matchup[];
}

export class Ruleset {
    rulesetID: number;
    timed: number;
    stock: number;
    supers: number;
}

export class Matchup {
    matchup_id: number;
    player1: string;
    player2: string;
    tournament: Tournament;
}

export class AllTournaments {
    tournaments: Tournament[];
}
