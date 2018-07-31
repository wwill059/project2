import { Component, OnInit, Input } from '@angular/core';
import { Goal } from '../goal';
import { Task } from '../task';
import { MatSnackBar } from '@angular/material';


@Component({
  selector: 'app-goal',
  templateUrl: './goal.component.html',
  styleUrls: ['./goal.component.css'],
  providers: [MatSnackBar]
})
export class GoalComponent implements OnInit {

  @Input()goal: Goal;
  isCompleted = false;
  constructor(private snackbar: MatSnackBar) { }

  ngOnInit() {
  }

  public completeGoal() {
    this.snackbar.open('Congratulations, your goal is completed', 'Done', { duration: 2500});
    this.isCompleted = true;
  }

  public incompleteGoal() {
    this.snackbar.open('Goal not finished', 'Done', { duration: 2500});
    this.isCompleted = true;
  }

  public completeTask() {
    this.snackbar.open('Congratulations, your task is completed', 'Done', { duration: 2500});
    this.isCompleted = true;
  }

  public extendTask() {
    this.snackbar.open('Te task will be extended', 'Fix', { duration: 2500});
    this.isCompleted = true;
  }

  public deleteTask() {
    this.snackbar.open('THIS IS SPARTA, (spartian kick)', '', { duration: 2500});
    this.isCompleted = true;
  }
}
