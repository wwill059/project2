import { Goal } from './goal';

export const DATA: Goal[] = [
    {
        id: '1',
        name: 'Complete New Year\'s resolution',
        completeDate: '12/31/18',
        tasks: [
            {
                name: 'Lose Weight',
                dueDate: '08/01/18'
            }, {
                name: 'Get a Job',
                dueDate: '06/15/18'
            }
        ]
     }, {
         id: '2',
         name: 'Move into new apartment',
         completeDate: '08/18/18',
         tasks: [
             {
                 name: 'Move my food',
                 dueDate: '08/18/18'
             }, {
                 name: 'Hang out with my kayaking friends',
                 dueDate: '09/01/18'
             }
         ]
     }
    ];
