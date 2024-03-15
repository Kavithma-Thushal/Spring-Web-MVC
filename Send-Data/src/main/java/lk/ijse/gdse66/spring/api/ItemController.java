package lk.ijse.gdse66.spring.api;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Kavithma Thushal
 * @project : Spring-Web-MVC
 * @since : 3:54 PM - 3/7/2024
 **/
@RestController
@RequestMapping("/items")
public class ItemController {

    // Consume --> Accept --> Request
    // Produce --> Return --> Response

    /**
     * -------------------- consumes --------------------
     * Specify MIME type that a handler method can consume
     * Spring check content-type header of incoming requests (content type of request body)
     * Spring route the request to the appropriate handler method
     **/

    /**
     * -------------------- produces --------------------
     * Specify MIME type that a handler method can generate as the response (content type of response body)
     * Depending on the Accept header sent in request header
     * Spring route the request to the appropriate handler method
     **/

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public String saveItemJson() {
        return "saveItemJson() - I accept only application/json";
    }

    @PostMapping(consumes = MediaType.APPLICATION_XML_VALUE)
    public String saveItemXML() {
        return "saveItemXML() - I accept only application/xml";
    }

    @PostMapping(consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String saveItemUrlEncoded() {
        return "saveItemUrlEncoded() - I accept only application/x-www-form-urlencoded";
    }

    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String saveItemMultipartFormData() {
        return "saveItemMultipartFormData() - I accept only multipart/form-data";
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public String getItemAsJson() {
        return "getItemAsJson()";
    }

    @GetMapping(produces = MediaType.APPLICATION_FORM_URLENCODED_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public String getItems() {
        return "getItems()";
    }

    @GetMapping(headers = {"content-type=application/json", "accept=application/xml"})
    public String GetItemASXml() {
        return "GetItemsAsXml()";
    }
}