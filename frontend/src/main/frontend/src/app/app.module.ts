import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

import { AppComponent } from './app.component';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {MdSnackBarModule} from '@angular/material';
import {RouterModule} from '@angular/router';
import {ReportsListComponent} from '../reports/reports-list.component';
import {NavBarComponent} from '../shared/nav-bar.component';
import {ReportService} from '../reports/reports.service';
import {ReportCompactListComponent} from '../reports/report-compact-list.component';

@NgModule({
  declarations: [
    AppComponent,
    ReportsListComponent,
    NavBarComponent,
    ReportCompactListComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    MdSnackBarModule,
    BrowserAnimationsModule,
    RouterModule.forRoot([
      { path: 'reports', component: ReportsListComponent }
    ])
  ],
  providers: [ReportService],
  bootstrap: [AppComponent]
})
export class AppModule { }
