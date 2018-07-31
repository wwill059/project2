import { Component, OnInit, ViewEncapsulation, Output } from '@angular/core';
import { LoginService } from '../login.service';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css'],
  encapsulation: ViewEncapsulation.None
})
export class LoginComponent implements OnInit {
  @Output()user: string;
  @Output()pass: string;

  constructor(private loginService: LoginService) { }

  ngOnInit() {
  }

  public auth(user, pass) {
    // console.log(user + ' ' + pass);
    this.loginService.loginUser(user, pass);
  }

}
