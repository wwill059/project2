import { Task } from './task';

export class Goal {
    id: string;
    name: string;
    description?: string;
    isCompleted?: boolean;
    completeDate?: Date;
    tasks?: Task[];
}