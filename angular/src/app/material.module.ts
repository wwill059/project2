import { MatButtonModule, MatCheckboxModule, MatCardModule, MatSnackBarModule } from '@angular/material';
import { NgModule } from '@angular/core';

@NgModule({
    imports: [MatButtonModule, MatCheckboxModule, MatCardModule, MatSnackBarModule],
    exports: [MatButtonModule, MatCheckboxModule, MatCardModule, MatSnackBarModule],
})

export class MaterialModule {}
