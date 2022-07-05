package com.back_crud.crud.web.dto.responses;

import lombok.*;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Response<T> {

    private Status status;
    private T payload;
    private Object metadata;
    private Object message;


    public enum Status {
        OK, BAD_REQUEST, UNAUTHORIZED, VALIDATION_EXCEPTION, EXCEPTION, WRONG_CREDENTIALS, ACCESS_DENIED,
        NOT_FOUND, DUPLICATE_ENTITY, DUPLICATE_EMAIL, DUPLICATE_REFERENCE, DUPLICATE_TELEPHONE, DUPLICATE_NINEA,
        TOKEN_EXPIRED,
        FIRST_CONNECTION, DISABLED_ACCOUNT, INVALIDE_TOKEN, INVALIDE_URL, UNSUPPORTED_MEDIA_TYPE, DIRECTORY_NOT_FOUND
    }

    public static <T> Response<T> ok() {
        Response<T> response = new Response<>();
        response.setStatus(Status.OK);
        return response;
    }


    public static <T> Response<T> accessDenied() {
        Response<T> response = new Response<>();
        response.setStatus(Status.ACCESS_DENIED);
        return response;
    }

    public static <T> Response<T> exception() {
        Response<T> response = new Response<>();
        response.setStatus(Status.EXCEPTION);
        return response;
    }

    @Getter
    @Accessors(chain = true)
    @Builder
    public static class PageMetadata {
        private final int size;
        private final long totalElements;
        private final int totalPages;
        private final int number;

        public PageMetadata(int size, long totalElements, int totalPages, int number) {
            this.size = size;
            this.totalElements = totalElements;
            this.totalPages = totalPages;
            this.number = number;
        }
    }
}
