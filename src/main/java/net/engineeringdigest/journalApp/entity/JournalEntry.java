package net.engineeringdigest.journalApp.entity;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;

@Document(collection = "journal_entries")
@Data
@NoArgsConstructor
public class JournalEntry {

    @Id
    private ObjectId journalId;
    @NonNull
    private String journalTitle;
    private String journalContent;
    private LocalDateTime journalDate;

//    public LocalDateTime getJournalDate() {
//        return journalDate;
//    }
//
//    public void setJournalDate(LocalDateTime journalDate) {
//        this.journalDate = journalDate;
//    }
//
//
//    public ObjectId getJournalId() {
//        return journalId;
//    }
//
//    public void setJournalId(ObjectId journalId) {
//        this.journalId = journalId;
//    }
//
//    public String getJournalTitle() {
//        return journalTitle;
//    }
//
//    public void setJournalTitle(String journalTitle) {
//        this.journalTitle = journalTitle;
//    }
//
//    public String getJournalContent() {
//        return journalContent;
//    }
//
//    public void setJournalContent(String journalContent) {
//        this.journalContent = journalContent;
//    }
}
