export interface IReport {
  id: number,
  title: string,
  statusItemList: IStatusItem[],
  modificationDate: string
}

export interface IReportList {
  reportsList: IReport[];
}

export interface IStatusItem {
  id: number,
  summary: string,
  details: string,
  status: string,
  creationDate: string,
  modifiedDate: string
}
