export interface Ticket {
    ticket_id: number;
    status: string;
    note: string;
    ticketType: string;
    amount: number;
    dateMade: Date | undefined;
    dateResolved: Date | undefined;
    employee_id: number;
}
