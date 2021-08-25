export interface Ticket {

    //some of these are handled by the backend and 
    //some of them will be hard coded
    //like todays date and hopefully the employeeId

    //need to figure out how to send the employee id without
    //having it in this ticket ts 
    id: number;
    ticketType: string;
    status: string;
    note: string;
    amount: string;
    employeeId: number;
    //have to learn how this works after getting it to 
    //sumbit
    //dateMade: Date;
}