import {Injectable} from '@angular/core';
import {Http, Response} from '@angular/http';
import {Observable} from 'rxjs/Observable';
import {IReport, IReportList} from './report';

import 'rxjs/add/operator/catch';
import 'rxjs/add/operator/do';
import 'rxjs/add/operator/map';

@Injectable()
export class ReportService {
  constructor(private http: Http)
  {}

  private reportsUrl = 'api/reports';

  getReports(): Observable<IReport[]> {
    return this.http.get(this.reportsUrl)
      .map((response: Response) => <IReportList> response.json())
      .do(data => console.log('All: ' +  JSON.stringify(data)))
      .catch(this.handleError);
  }

  private handleError(error: Response) {
    console.error(error);
    return Observable.throw(error.json().error || 'Server error');
  }

}
