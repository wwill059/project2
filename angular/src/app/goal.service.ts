import { Injectable } from '@angular/core';
import { Goal } from './goal';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import { Observable, of } from 'rxjs';
import { DATA } from './data';

@Injectable({
  providedIn: 'root'
})
export class GoalService {


  baseUrl = 'http://localhost:8080/project2/api/';
  constructor(private http: HttpClient, private router: Router) { }

  public viewGoal(id: string) {
    this.http.get(this.baseUrl + 'goal/' + id)
        .subscribe(
          (res) => {
            this.router.navigate(['goal/' + id]);
      });
  }

  public getAllGoals(): Goal[] {
    return DATA;
  }

  public updateGoal(goal: Goal) {
    this.http.put<Goal>(this.baseUrl + 'goal/' + goal.id, goal);
  }

  public deleteGoal(goal: Goal): string {
    const numOfRows = this.http.delete<Goal>(this.baseUrl + 'goal/' + goal.id);
    return 'Deleted num of rows: ' + numOfRows;
  }

  public createGoal(goal: Goal): string {
    this.http.post<Goal>(this.baseUrl + 'goal', goal);
    return 'Dreated Goal: ' + goal.id + ' ' + goal.name;
  }
}
