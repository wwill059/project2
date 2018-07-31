import { Injectable } from '@angular/core';
import { User } from './user';
import { Org } from './org';

@Injectable({
  providedIn: 'root'
})

export class SessionService {

  user: User;
  org: Org;
  constructor() { }

  public saveUser(user: User) {
    this.user = user;
  }

  public saveOrg(org: Org) {
    this.org = org;
  }
}
