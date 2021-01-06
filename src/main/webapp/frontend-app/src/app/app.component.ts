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
  rooms: Room[];
  constructor(){
    this.submitted  = false;
    this.roomsearch = new FormGroup({
      checkin : new FormControl(''),
      checkout: new FormControl('')
   });
    this.rooms = ROOMS;
  }
    ngOnInit(): void{

    }
    onSubmit({value, valid}: {value: RoomSearch, valid: boolean}): void {
    console.log(value);
    this.submitted = true;
  }
  reserveRoom(value: string): void {
    console.log(`Room id for reservation: ${value}`);

  }

}
export interface RoomSearch{
  checkin: string;
  checkout: string;
}
export interface Room{
  id: string;
  roomNumber: string;
  price: string;
  links: string;
}
const ROOMS: Room[] = [
  {
    id: '556444442',
    roomNumber: '401',
    price: '120',
    links: ''
  },
  {
    id: '8648464784',
    roomNumber: '410',
    price: '100',
    links: ''
  },
  {
    id: '5648451',
    roomNumber: '233',
    price: '80',
    links: ''
  }
];
