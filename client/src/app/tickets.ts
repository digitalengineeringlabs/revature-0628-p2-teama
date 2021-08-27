export interface Ticket {
    ticket_id: number;
    status: string;
    note: string;
    ticketType: string;
    amount: string;
    dateMade: Date | undefined;
    lastModified: Date | undefined;
    employeeId: number;
}