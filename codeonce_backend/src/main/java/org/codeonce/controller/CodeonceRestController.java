package org.codeonce.controller;

import org.codeonce.domain.Req;
import org.codeonce.domain.Resp;
import org.codeonce.services.CodeonceSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@Api(value="Detecteur des ponctuations", description="Cette api donne le nombre des ponctuations dans un texte")
public class CodeonceRestController {

	@Autowired
	private CodeonceSerivce codeOnceSerivce;
	
	

	@PostMapping("/ponctuation")
	@ApiOperation(value = "Cette opération vous donne le nombre de ponctuations dans un texte")
	@ApiResponses(value = {
	    @ApiResponse(code = 200, message = "Successfully retrieved list"),
	    @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
	    @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
	    @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
	})
	ResponseEntity<Resp>NumbreOcc(@RequestBody Req req){
		 Resp resp = new Resp();
		resp.setPonctuations((codeOnceSerivce.Occurences((req.getText()))));
		return ResponseEntity.ok(resp);
	}
}
