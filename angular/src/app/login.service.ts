import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User } from './user';
import { Router } from '@angular/router';
import { SessionService } from './session.service';


@Injectable({
  providedIn: 'root'
})
export class LoginService {

  baseUrl = 'http://localhost:8080/project2/api/';
  constructor(private http: HttpClient, private sessService: SessionService) { }

  public loginUser(user: string, pass: string) {
    const authObj: Object = {username: user, password: pass};
    this.http.post(this.baseUrl + '/auth', JSON.stringify(authObj))
        .subscribe({
          next(res) { this.sessService.saveUser(res); },
          error(err) { console.error(err); }
        });
  }
}
