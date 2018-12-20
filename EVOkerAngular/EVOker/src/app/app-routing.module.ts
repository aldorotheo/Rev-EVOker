import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { EvokerjudgeComponent } from './components/evokerjudge/evokerjudge.component';
import { EvokerplayerComponent } from './components/evokerplayer/evokerplayer.component';
import { EvokerloginComponent } from './components/evokerlogin/evokerlogin.component';
import { EvokerorganizerComponent } from './components/evokerorganizer/evokerorganizer.component';
import { LineupComponent } from './components/lineup/lineup.component';
import { EditlineupComponent } from './components/editlineup/editlineup.component';
import { OrganizertournamentComponent } from './components/organizertournament/organizertournament.component';
import { JudgetournamentComponent } from './components/judgetournament/judgetournament.component';
import { PlayertournamentComponent } from './components/playertournament/playertournament.component';


const routes: Routes = [
  { path: '', redirectTo: '/login', pathMatch: 'full' },
  { path: 'judge', component: EvokerjudgeComponent },
  { path: 'organizer', component: EvokerorganizerComponent },
  { path: 'login', component: EvokerloginComponent },
  { path: 'player', component: EvokerplayerComponent},
  { path: 'lineup', component: LineupComponent},
  { path: 'editlineup', component: EditlineupComponent},
  { path: 'organizertournament', component: OrganizertournamentComponent},
  { path: 'playertournament', component: PlayertournamentComponent},
  { path: 'judgetournament', component: JudgetournamentComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
