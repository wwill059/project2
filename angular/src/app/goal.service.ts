import { Injectable } from '@angular/core';
import { Goal } from './goal';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
@Injectable({
  providedIn: 'root'
})
export class GoalService {

  constructor(private http: HttpClient, private router: Router) { }

  public viewGoal(goal: Goal) {
    this.http.get('/api/goal/' + goal.id).subscribe(
      (res) => {
        this.router.navigate(['goal', goal.id]);
      });
  }
}
