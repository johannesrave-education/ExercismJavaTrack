import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {
    private LocalDateTime instant;

    public Gigasecond(LocalDate moment) {
        this.instant = moment.atStartOfDay();
    }

    public Gigasecond(LocalDateTime moment) {
        this.instant = moment;
    }

    public LocalDateTime getDateTime() {
        return instant.plusSeconds(1000000000l);
    }
}
