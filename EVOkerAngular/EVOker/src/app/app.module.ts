import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EvokerloginComponent } from './components/evokerlogin/evokerlogin.component';
import { EvokerplayerComponent } from './components/evokerplayer/evokerplayer.component';
import { EvokerjudgeComponent } from './components/evokerjudge/evokerjudge.component';
import { EvokerorganizerComponent } from './components/evokerorganizer/evokerorganizer.component';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { LoginService } from './services/login.service';
import { SessionServiceService } from './services/session-service.service';
import { LineupComponent } from './components/lineup/lineup.component';
import { OrganizertournamentComponent } from './components/organizertournament/organizertournament.component';
import { JudgetournamentComponent } from './components/judgetournament/judgetournament.component';
import { PlayertournamentComponent } from './components/playertournament/playertournament.component';
import { EditlineupComponent } from './components/editlineup/editlineup.component';

@NgModule({
  declarations: [
    AppComponent,
    EvokerloginComponent,
    EvokerplayerComponent,
    EvokerjudgeComponent,
    EvokerorganizerComponent,
    LineupComponent,
    OrganizertournamentComponent,
    JudgetournamentComponent,
    PlayertournamentComponent,
    EditlineupComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [LoginService, SessionServiceService, HttpClient],
  bootstrap: [AppComponent]
})
export class AppModule { }
