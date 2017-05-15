import {Component, OnInit} from '@angular/core';
import {IReport} from './report';
import {ReportService} from './reports.service';


@Component({
  moduleId: module.id,
  templateUrl: "reports-list.component.html",
  styleUrls: ["reports-list.component.css"],
})

export class ReportsListComponent implements OnInit {
  reports: IReport[];
  errorMessage: string;

  constructor(
    private reportService: ReportService
  ) {}

  ngOnInit(): void {
    this.reportService.getReports()
      .subscribe(
        reports => {
          this.reports = reports;
        },
        error => this.errorMessage = <any>error
      );
  }
}
