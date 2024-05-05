package ParkingLot.controllers;

import ParkingLot.dtos.IssueTokenRequestDTO;
import ParkingLot.dtos.IssueTokenResponseDTO;
import ParkingLot.dtos.RequestStatus;
import ParkingLot.models.Token;
import ParkingLot.services.TokenService;

public class TokenController {
    private TokenService tokenService;
    public TokenController(TokenService tokenService){
        this.tokenService=tokenService;
    }
    //DTO-Data Transfer Object
    public IssueTokenResponseDTO issueToken(IssueTokenRequestDTO issueTokenRequestDTO){
        IssueTokenResponseDTO response=new IssueTokenResponseDTO();
        //call the Service
        try{
            Token token=tokenService.issueToken(
                    issueTokenRequestDTO.getGateId(),
                    issueTokenRequestDTO.getVehicleType(),
                    issueTokenRequestDTO.getVehicleNumber(),
                    issueTokenRequestDTO.getOwnerName()

            );
            response.setToken(token);
            response.setRequestStatus(RequestStatus.SUCCESS);
        }catch (Exception e){
            response.setRequestStatus(RequestStatus.FAILURE);
            response.setFailureMessage(e.getMessage());
        }

        return response;
    }
}
