export interface Ticket {
    id: number;
    ticketType: string;
    status: string;
    note: string;
    amount: string;
    employeeId: number;
    dateMade: Date;
}