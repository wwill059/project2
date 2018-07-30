import { NgModule } from '@angular/core';
import { Route, Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { GoalComponent } from './goal/goal.component';
import { LoginComponent } from './login/login.component';

const routes: Route[] = [
    { path: 'login', component: LoginComponent},
    { path: 'home', component: HomeComponent },
    { path: 'goal/:id', component: GoalComponent},
    { path: '', component: LoginComponent, pathMatch: 'full'},
];

@NgModule({
    imports: [
        RouterModule.forRoot(routes)
    ]
})

export class AppR { }
