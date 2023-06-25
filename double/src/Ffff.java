

import java.time.LocalDate;
        import java.time.format.DateTimeFormatter;
        import java.util.ArrayList;
        import java.util.List;

class Record {
    private int id;
    private LocalDate date;

    public Record(int id, LocalDate date) {
        this.id = id;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }
}

public class Ffff {
    public static void main(String[] args) {
        // Example objects with a date property
        List<Record> records = new ArrayList<>();
        records.add(new Record(1, LocalDate.parse("2023-05-01")));
        records.add(new Record(2, LocalDate.parse("2023-05-15")));
        records.add(new Record(2, LocalDate.parse("2023-05-16")));
        records.add(new Record(2, LocalDate.parse("2023-05-17")));
        records.add(new Record(3, LocalDate.parse("2023-05-25")));

        // Date range to compare in string format
        String startDateStr = "2023-05-10";
        String endDateStr = "2023-05-20";

        // Parse the string dates into LocalDate objects
        LocalDate startDate = LocalDate.parse(startDateStr);
        LocalDate endDate = LocalDate.parse(endDateStr);

        // Retrieve records falling between the specified date range
        List<Record> filteredRecords = new ArrayList<>();

        for (Record record : records) {
            LocalDate recordDate = record.getDate();

            if (recordDate.isAfter(startDate) && recordDate.isBefore(endDate)) {
                filteredRecords.add(record);
            }
        }

        // Print the filtered records
        for (Record record : filteredRecords) {
            System.out.println("Record ID: " + record.getId() + ", Date: " + record.getDate());
        }
    }
}
