import { Component, OnInit, Input } from '@angular/core';
import { Goal } from '../goal';
import { User } from '../user';
import { GoalService } from '../goal.service';
@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  @Input()goals: Goal[];
  @Input()user: User;
  constructor(private goalServ: GoalService) { }

  ngOnInit() {
  }

  public viewGoal(id: string) {
    this.goalServ.viewGoal(id);
  }

}
