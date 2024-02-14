//package com.hig.cm.controller;
//
//import com.hig.cm.entity.CaseContact;
//import io.swagger.v3.oas.annotations.media.Content;
//import io.swagger.v3.oas.annotations.responses.ApiResponse;
//import io.swagger.v3.oas.annotations.responses.ApiResponses;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/contactDetails")
//public class CaseContactController {
//
//    @ApiResponses(value = {
//        @ApiResponse(responseCode = "200", description = "Found the contact", content = @Content),
//        @ApiResponse(responseCode = "400", description = "Invalid id supplied", content = @Content),
//        @ApiResponse(responseCode = "404", description = "Contact not found", content = @Content),
//    })
//    @GetMapping("/byCaseId/{id}")
//    public CaseContact getCaseContactById(@RequestParam String id) {
//        return new CaseContact();
//    }
//
//    @ApiResponses(value = {
//        @ApiResponse(responseCode = "200", description = "Found the case", content = @Content),
//        @ApiResponse(responseCode = "400", description = "Invalid contact supplied", content = @Content),
//    })
//    @PostMapping("/addContact")
//    public CaseContact addCaseContact(@RequestBody CaseContact caseContact) {
//        return new CaseContact();
//    }
//
//    @ApiResponses(value = {
//        @ApiResponse(responseCode = "200", description = "Found the case", content = @Content),
//        @ApiResponse(responseCode = "400", description = "Invalid contact supplied", content = @Content),
//        @ApiResponse(responseCode = "404", description = "Cannot find contact to update", content = @Content),
//    })
//    @PutMapping("/updateContact")
//    public CaseContact updateCaseContact(@RequestBody CaseContact caseContact) {
//        return new CaseContact();
//    }
//}
