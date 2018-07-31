import { Component, OnInit, Input } from '@angular/core';
import { Goal } from '../goal';
import { User } from '../user';
import { GoalService } from '../goal.service';
import { Observable } from 'rxjs';
@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  @Input()goals: Observable<Goal[]>;
  @Input()user: User;
  constructor(private goalServ: GoalService) { }

  ngOnInit() {
    this.goals = this.goalServ.getAllGoals();
  }

  public viewGoal(id: string) {
    this.goalServ.viewGoal(id);
  }

}
