import { StatusBuilderPage } from './app.po';

describe('statusbuilder App', () => {
  let page: StatusBuilderPage;

  beforeEach(() => {
    page = new StatusBuilderPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
