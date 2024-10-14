//package net.engineeringdigest.journalApp.controller;
//
//import net.engineeringdigest.journalApp.entity.JournalEntry;
//import net.engineeringdigest.journalApp.service.JournalEntryService;
//import org.bson.types.ObjectId;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.time.LocalDateTime;
//import java.util.*;
//
//@RestController
//@RequestMapping("/journal_2")
//public class JournalEntryControllerV2 {
//
//    @Autowired
//    private JournalEntryService journalEntryService;
//
//    @GetMapping
//    public ResponseEntity<?> getJournalEntries() {
//        List<JournalEntry> all =  journalEntryService.getAllJournalEntries();
//        if(all != null && !all.isEmpty()) {
//            return new ResponseEntity<>(all, HttpStatus.OK);
//        }
//        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//    }
//
//    @PostMapping
//    public ResponseEntity<JournalEntry> createJournalEntry(@RequestBody JournalEntry journalEntry) {
//        try {
//            journalEntryService.saveEntry(journalEntry);
//            return new ResponseEntity<>(journalEntry, HttpStatus.CREATED);
//        } catch (Exception e) {
//            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//        }
//
//    }
//
//    @GetMapping("id/{myId}")
//    public ResponseEntity<JournalEntry> getJournalEntryById(@PathVariable ObjectId myId) {
//        //return journalEntryService.getJournalEntryById(myId).orElse(null);
//        Optional<JournalEntry> journalEntry = journalEntryService.getJournalEntryById(myId);
////        if(journalEntry.isPresent()) {
////            return new ResponseEntity<>(journalEntry.get(), HttpStatus.OK);
////        }
////        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        return journalEntry.map(entry -> new ResponseEntity<>(entry, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
//    }
//
//    @DeleteMapping("id/{myId}")
//    public ResponseEntity<?> deleteJournalEntryById(@PathVariable ObjectId myId) {
//         journalEntryService.deleteJournalEntryById(myId);
//         return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//    }
//
//    @PutMapping("id/{myId}")
//    public ResponseEntity<?> updateJournalEntryById(@PathVariable ObjectId myId, @RequestBody JournalEntry newJournalEntry) {
//        JournalEntry oldJournalEntry = journalEntryService.getJournalEntryById(myId).orElse(null);
//        if(oldJournalEntry != null) {
//            oldJournalEntry.setJournalTitle(newJournalEntry.getJournalTitle() != null && !newJournalEntry.getJournalTitle().equals("")? newJournalEntry.getJournalTitle() : oldJournalEntry.getJournalTitle());
//            oldJournalEntry.setJournalContent(newJournalEntry.getJournalContent() != null && !newJournalEntry.getJournalContent().equals("")? newJournalEntry.getJournalContent() : oldJournalEntry.getJournalContent());
//            journalEntryService.saveEntry(oldJournalEntry);
//            return new ResponseEntity<>(oldJournalEntry, HttpStatus.OK);
//        }
//        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//    }
//
//}
