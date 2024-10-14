//package net.engineeringdigest.journalApp.controller;
//
//import net.engineeringdigest.journalApp.entity.JournalEntry;
//import net.engineeringdigest.journalApp.entity.User;
//import net.engineeringdigest.journalApp.service.JournalEntryService;
//import net.engineeringdigest.journalApp.service.UserService;
//import org.bson.types.ObjectId;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/journal")
//public class JournalEntryControllerV4 {
//
//    @Autowired
//    private JournalEntryService journalEntryService;
//    @Autowired
//    private UserService userService;
//    @GetMapping("{username}")
//    public ResponseEntity<?> getJournalEntriesOfUser(@PathVariable String username) {
//        User user = userService.findByUsername(username);
//        List<JournalEntry> all =  user.getJournalEntries();
//        if(all != null && !all.isEmpty()) {
//            return new ResponseEntity<>(all, HttpStatus.OK);
//        }
//        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//    }
//
//    @PostMapping("{username}")
//    public ResponseEntity<JournalEntry> createJournalEntry(@RequestBody JournalEntry journalEntry, @PathVariable String username) {
//        try {
//            journalEntryService.saveEntry(journalEntry, username);
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
//    @DeleteMapping("id/{username}/{myId}")
//    public ResponseEntity<?> deleteJournalEntryById(@PathVariable ObjectId myId, @PathVariable String username) {
//         journalEntryService.deleteJournalEntryById(myId, username);
//         return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//    }
//
//    @PutMapping("id/{username}/{myId}")
//    public ResponseEntity<?> updateJournalEntryById(
//            @PathVariable ObjectId myId,
//            @RequestBody JournalEntry newJournalEntry,
//            @PathVariable String username
//    ) {
//
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
