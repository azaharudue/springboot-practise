import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit {
  public submitted: boolean;
  roomsearch: FormGroup;
  constructor(){
    this.submitted  = false;
    this.roomsearch = new FormGroup({
      checkin : new FormControl(''),
      checkout: new FormControl('')
   });
  }
    ngOnInit(): void{

    }
    onSubmit({value, valid}: {value: RoomSearch, valid: boolean}): void {
    console.log(value);
    this.submitted = true;
  }

}
export interface RoomSearch{
  checkin: string;
  checkout: string;
}
