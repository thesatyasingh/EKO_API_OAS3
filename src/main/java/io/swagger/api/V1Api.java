/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.26).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.InlineResponse200;
import io.swagger.model.InlineResponse2001;
import io.swagger.model.InlineResponse400;
import io.swagger.model.InlineResponse4001;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-06-26T11:47:57.236Z[GMT]")
@Validated
public interface V1Api {

    @Operation(summary = "Initiate a fund transfer to any bank account", description = "This is an example operation to show how fund transfers can be initiated", tags={ "FUND TRANSFER APIs" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", 
        		content = @Content(mediaType = "application/json",
        						   examples= {@ExampleObject(value = "{\"response_type_id\":1329,\"data\":{\"account\":234243534,\"client_ref_id\":\"Settlemet7206123420\",\"ifsc\":\"SBIN0000001\",\"txstatus_desc\":\"Initiated\",\"tx_status\":2,\"amount\":1045,\"tid\":12971397,\"balance\":35322.2,\"totalfee\":5},\"message\":\"Transaction initiated successfully\",\"status\":0,\"response_status_id\":0}")},
        							schema = @Schema(implementation = InlineResponse200.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", 
        		content = @Content(mediaType = "application/json", 
        				examples= {@ExampleObject(value = "{\"invalid_params\":{\"ifsc\":\"Please provide valid ifsc\"},\"response_type_id\":-1,\"message\":\"Please provide the value of the field\",\"status\":97,\"response_status_id\":1}")},
        						   schema = @Schema(implementation = InlineResponse400.class))) })
    @RequestMapping(value = "/v1/agent/{user_code}/settlement",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Object> v1AgentUserCodeSettlementPost(@Parameter(in = ParameterIn.PATH, description = "Your user code in Eko’s system", required=true, schema=@Schema()) @PathVariable("user_code") String userCode, @NotNull @Parameter(in = ParameterIn.QUERY, description = "Your EKOs unique cell number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "initiator_id", required = true) String initiatorId, @NotNull @Parameter(in = ParameterIn.QUERY, description = "Your unique transaction ID" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "client_ref_id", required = true) String clientRefId, @NotNull @Parameter(in = ParameterIn.QUERY, description = "Code of the service for fund transfer" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "service_code", required = true) Integer serviceCode, @NotNull @Parameter(in = ParameterIn.QUERY, description = "Payment mode you want to use to transfer money" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "payment_mode", required = true) Integer paymentMode, @NotNull @Parameter(in = ParameterIn.QUERY, description = "Beneficiary name (as in bank records)" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "recipient_name", required = true) String recipientName, @NotNull @Parameter(in = ParameterIn.QUERY, description = "Beneficiary bank account number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "account", required = true) String account, @NotNull @Parameter(in = ParameterIn.QUERY, description = "IFSC Code of receiver's bank" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "ifsc", required = true) String ifsc, @NotNull @Parameter(in = ParameterIn.QUERY, description = "Amount to transfer" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "amount", required = true) Integer amount, @NotNull @Parameter(in = ParameterIn.QUERY, description = "Sender's name" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "sender_name", required = true) String senderName, @Parameter(in = ParameterIn.HEADER, description = "Your unique API key" ,required=true,schema=@Schema()) @RequestHeader(value="developer_key", required=true) String developerKey, @Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key", required=true) String secretKey, @Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key_timestamp", required=true) String secretKeyTimestamp, @Parameter(in = ParameterIn.QUERY, description = "Payment Purpose" ,schema=@Schema()) @Valid @RequestParam(value = "tag", required = false) String tag, @Parameter(in = ParameterIn.QUERY, description = "Sender’s location information; eg- 28.78123,72.808912" ,schema=@Schema()) @Valid @RequestParam(value = "latlong", required = false) String latlong, @Parameter(in = ParameterIn.QUERY, description = "Beneficiary's bank account type" ,schema=@Schema()) @Valid @RequestParam(value = "beneficiary_account_type", required = false) Integer beneficiaryAccountType);


    @Operation(summary = "Transaction Enquiry", description = "Sample template for Transaction Enquiries", tags={ "FUND TRANSFER APIs" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", 
        			 description = "OK", 
        			 content = @Content(mediaType = "application/json",
				        			 	schema = @Schema(implementation = InlineResponse2001.class),
				        			 examples= {@ExampleObject(value = "{\"response_type_id\":1472,\"data\":{\"bank_ref_num\":\"8761099407\",\"account\":234243534,\"fee\":\"5.0\",\"client_ref_id\":\"Settlemet7206123420\",\"gst\":\"0.76\",\"sender_name\":\"Flipkart\",\"timestamp\":\"2019-11-01 17:50:44\",\"ifsc\":\"SBIN0000001\",\"beneficiary_account_type\":1,\"txstatus_desc\":\"Success\",\"tx_status\":\"0\",\"tid\":\"12971397\",\"amount\":\"1045.0\",\"payment_mode\":5,\"recipient_name\":\"Virender Singh\"},\"message\":\"Sucess! Enquiry success.\",\"status\":0,\"response_status_id\":0}")}			        					  
				        				
							 			 )),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", 
        			content = @Content(mediaType = "application/json", 
        							   schema = @Schema(implementation = InlineResponse4001.class),
        							   examples={@ExampleObject(value = "{\"invalid_params\":{\"tid\":\"Please provide a valid TID to know the status of the transaction.\"},\"status\":69,\"response_status_id\":1,\"response_type_id\":-1,\"message\":\"failed!inquired.tx.not.found\",\"data\":{\"tx_status\":1,\"txstatus_desc\":\"Failed\"}}")}
        							   )) })
    @RequestMapping(value = "/v1/transactions/{tid}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Object> v1TransactionsTidGet(@Parameter(in = ParameterIn.PATH, description = "tid or client_ref_id", required=true, schema=@Schema()) @PathVariable("tid") String tid, @NotNull @Parameter(in = ParameterIn.QUERY, description = "Id of the initiator" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "initiator_id", required = true) Integer initiatorId, @Parameter(in = ParameterIn.HEADER, description = "Your unique API key" ,required=true,schema=@Schema()) @RequestHeader(value="developer_key", required=true) String developerKey, @Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key", required=true) String secretKey, @Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key_timestamp", required=true) String secretKeyTimestamp);

}
