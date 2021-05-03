package idv.liucheyu.commonservice;

import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 * @author liucheyu
 */
@Service
public class ResponseServiceImpl implements ResponseService {

    @Override
    public ResponseEntity<ResponseData> send(Object data) {
        return new ResponseEntity(new ResponseData(data), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<ResponseData> send(Object data, HttpStatus httpStatus) {
        return new ResponseEntity(new ResponseData(data), httpStatus);
    }

    @Override
    public ResponseEntity<ResponseData> sendError(HttpStatus httpStatus, String message) {
        return new ResponseEntity(new ResponseData(httpStatus.value(), message, null), httpStatus);
    }


    @Override
    public ResponseEntity<EntityModel> sendHal(Object content, Link link) {
        return new ResponseEntity(buildEntityModel(content, link)
                , HttpStatus.OK);
    }

    @Override
    public ResponseEntity<CollectionModel> sendHalArray(Iterable content, Link link) {
        return new ResponseEntity(buildCollectionModel(content, link)
                , HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Object> sendHal(Object content) {
        return new ResponseEntity(content, HttpStatus.OK);
    }

    @Override
    public EntityModel<Object> buildEntityModel(Object content, Link link) {
        return EntityModel.of(content, link);
    }

    @Override
    public CollectionModel buildCollectionModel(Iterable content, Link link) {
        return CollectionModel.of(content, link);
    }
}
