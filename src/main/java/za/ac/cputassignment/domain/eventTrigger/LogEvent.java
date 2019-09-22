package za.ac.cputassignment.domain.eventTrigger;

import java.util.Objects;

public class LogEvent {

    private String email;
    private String event;

    private LogEvent(){}

    private LogEvent(Builder builder)
    {
        this.email =builder.email;
        this.event =builder.event;
    }

    public String getEmail() {
        return email;
    }

    public String getEvent() {
        return event;
    }

    public static class Builder{
        private String email;
        private String event;

        public Builder setEmail(String email)
        {
            this.email=email;
            return this;
        }

        public Builder setEvent(String event)
        {
            this.event =event;
            return this;
        }

        public Builder copy(LogEvent logEvent)
        {
            this.event =logEvent.event;
            this.email =logEvent.email;
            return this;
        }

        public LogEvent build()
        {
            return new LogEvent(this);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LogEvent logEvent = (LogEvent) o;
        return email.equals(logEvent.email) &&
                Objects.equals(event, logEvent.event);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }

    @Override
    public String toString() {
        return "LogEvent{" +
                "email='" + email + '\'' +
                ", event='" + event + '\'' +
                '}';
    }
}
