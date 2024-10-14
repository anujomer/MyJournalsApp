//package net.engineeringdigest.journalApp.controller;
//
//import net.engineeringdigest.journalApp.entity.JournalEntry;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@RestController
//@RequestMapping("/_journal")
//public class JournalEntryController {
//
//    private Map<Long, JournalEntry> journalEntryMap = new HashMap<Long, JournalEntry>();
//
//    @GetMapping
//    public List<JournalEntry> getJournalEntries() {
//        return new ArrayList<JournalEntry>(journalEntryMap.values());
//    }
//
//    @PostMapping
//    public boolean createJournalEntry(@RequestBody JournalEntry journalEntry) {
//        journalEntryMap.put(journalEntry.getJournalId(), journalEntry);
//        return true;
//    }
//
//    @GetMapping("id/{myId}")
//    public JournalEntry getJournalEntryById(@PathVariable Long myId) {
//
//        return journalEntryMap.get(myId);
//
//    }
//
//    @DeleteMapping("id/{myId}")
//    public JournalEntry deleteJournalEntryById(@PathVariable Long myId) {
//        return journalEntryMap.remove(myId);
//    }
//
//    @PutMapping("id/{myId}")
//    public JournalEntry updateJournalEntryById(@PathVariable Long myId, @RequestBody JournalEntry journalEntry) {
//        return journalEntryMap.put(journalEntry.getJournalId(), journalEntry);
//    }
//
//}
