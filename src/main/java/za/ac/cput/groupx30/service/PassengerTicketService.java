package za.ac.cput.groupx30.service;

/**
 * Author: Shaheed_Cloete(213239442)
 * Desc: Service Interface for PassengerTicket
 * Date: 31 July 2021
 */

import za.ac.cput.groupx30.entity.PassengerTicket;
import za.ac.cput.groupx30.service.IService;

import java.util.Set;

public interface PassengerTicketService extends IService<PassengerTicket, String>{
    Set<PassengerTicket> getAll();
}
