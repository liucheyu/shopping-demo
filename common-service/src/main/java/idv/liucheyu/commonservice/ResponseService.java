package idv.liucheyu.commonservice;

import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * @author liucheyu
 */
public interface ResponseService {

    ResponseEntity<ResponseData> send(Object data);

    ResponseEntity<ResponseData> send(Object data, HttpStatus httpStatus);

    ResponseEntity<ResponseData> sendError(HttpStatus httpStatus, String message);

    /**
     * return response with Hal
     *
     * @param link
     * @return
     */
    ResponseEntity<EntityModel> sendHal(Object content, Link link);


    /**
     * return response with Hal
     *
     * @param link
     * @return
     */
    ResponseEntity<CollectionModel> sendHalArray(Iterable content, Link link);

    /**
     * return response
     *
     * @param content
     * @return
     */
    ResponseEntity<Object> sendHal(Object content);

    /**
     * build EntityModel
     * @param content
     * @return
     */
    EntityModel<Object> buildEntityModel(Object content, Link link);

    /**
     * build CollectionModel
     * @param content
     * @return
     */
    CollectionModel buildCollectionModel(Iterable content, Link link);

}
