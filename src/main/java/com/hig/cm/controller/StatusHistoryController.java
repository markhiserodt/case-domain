package com.hig.cm.controller;

import com.hig.cm.entity.Client;
import com.hig.cm.entity.StatusHistory;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SecurityScheme(
        name = "Authorization",
        type = SecuritySchemeType.HTTP,
        bearerFormat = "JWT",
        scheme = "bearer"
)
@RestController
@RequestMapping("/statusHistory")
public class StatusHistoryController {
    @SecurityRequirement(name = "Authorization")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Saved the case status history"),
            @ApiResponse(responseCode = "400", description = "Invalid status history object supplied", content = @Content),
    })
    @PostMapping(value = "/saveStatusHistory", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public StatusHistory saveStatusHistory(@RequestBody StatusHistory statusHistory) {
        return new StatusHistory();
    }
}
