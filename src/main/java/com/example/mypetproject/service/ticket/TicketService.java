package com.example.mypetproject.service.ticket;

import com.example.mypetproject.model.MovieSession;
import com.example.mypetproject.model.Ticket;

public interface TicketService {

    Ticket addTicket(Long ticketPrice, MovieSession movieSession);

}
