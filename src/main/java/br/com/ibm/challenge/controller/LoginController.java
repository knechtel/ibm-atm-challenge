package br.com.ibm.challenge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class LoginController {

    @Autowired
    private RestTemplate restTemplate;


//    @PostMapping(value = "/api/public/login", consumes = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<?> autentica(@RequestBody LoginDTO loginDTO) {
//
//        RequestEntity<LoginDTO> request = RequestEntity
//                .post(URI.create("http://localhost:8080" + "/api/login"))
//                .contentType(MediaType.APPLICATION_JSON).body(loginDTO);
//        try {
//            ResponseEntity<String> response = restTemplate.exchange(request, String.class);
//            //return ResponseEntity.ok(response.getHeaders().get(TokenAuthenticationService.AUTH_HEADER_NAME).get(0));
//        } catch (Exception e) {
//            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
//        }
//
//        return null;
//
//    }
}
