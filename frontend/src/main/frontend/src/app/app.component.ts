import { Component } from '@angular/core';
import {Message} from 'primeng/primeng';
import {MdSnackBar} from '@angular/material';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'app works!';
  msgs: Message[] = [];

  constructor(public snackBar: MdSnackBar) {
  }

  show () {
    let snackBarRef = this.snackBar.open("Message archived", "CLICK", {duration: 5000});
  }

}
