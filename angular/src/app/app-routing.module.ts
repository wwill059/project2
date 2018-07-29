import { NgModule } from '@angular/core';
import { Route, Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';

const routes: Route[] = [
    { path: 'home', component: HomeComponent }
];

@NgModule({
    imports: [
        RouterModule.forRoot(routes)
    ]
})

export class AppR { }
