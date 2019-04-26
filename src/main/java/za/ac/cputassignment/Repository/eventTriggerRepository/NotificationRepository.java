package za.ac.cputassignment.Repository.eventTriggerRepository;

import za.ac.cputassignment.Repository.MainInterface.IRepository;
import za.ac.cputassignment.domain.eventTrigger.Notification;

import java.util.Set;

public interface NotificationRepository extends IRepository<Notification,String> {
    Set<Notification>getAll();
}
