import { Component, OnInit } from '@angular/core';
import { Goal } from '../goal';
import { GoalService } from '../goal.service';
@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  goals: Goal[];
  constructor(private goalServ: GoalService) { }

  ngOnInit() {
  }

  public viewGoal(goal: Goal) {
    this.goalServ.viewGoal(goal);
  }

}
