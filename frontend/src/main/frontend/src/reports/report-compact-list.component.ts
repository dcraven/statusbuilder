import {Component, Injectable, Input} from '@angular/core';
import {IReport} from './report';


@Component({
  moduleId: module.id,
  selector: "report-compact-item",
  templateUrl: "report-compact-list.component.html",
  styleUrls: ["report-compact-list.component.css"],
})

export class ReportCompactListComponent {
  @Input() report: IReport;
}
