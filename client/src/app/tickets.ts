export interface Ticket {
    ticket_id: number;
    status: string;
    note: string;
    ticketType: string;
    amount: string;
    dateMade: Date | undefined;
    dateResolved: Date | undefined;
    employeeId: number;
}