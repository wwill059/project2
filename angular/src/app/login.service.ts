import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor(private http: HttpClient) { }

  public void loginUser(user: string, pass: string) {
    let authObj: Object = {usernamee: user, password: pass};
    this.http.post('/auth', JSON.stringify(authObj))
        .subscribe({
          next(res) {  }
          error(err) {  }
        });
  }
}
