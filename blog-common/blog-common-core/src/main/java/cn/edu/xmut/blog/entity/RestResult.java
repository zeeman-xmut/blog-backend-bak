package cn.edu.xmut.blog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import org.springframework.http.HttpStatus;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author Zeeman Zhang
 */
@AllArgsConstructor
@Data
public class RestResult<T> implements Serializable {

    @Serial private static final long serialVersionUID = 1L;
    private int status;
    private String message;
    private T data;

    private static <T> RestResult<T> restResult(HttpStatus status, String message, T data) {
        return new RestResult<>(status.value(), message, data);
    }

    public static <T> RestResult<T> ok() {
        return ok(null, null);
    }

    public static <T> RestResult<T> ok(String message) {
        return ok(message, null);
    }

    public static <T> RestResult<T> ok(T data) {
        return ok(null, data);
    }

    public static <T> RestResult<T> ok(String message, T data) {
        return restResult(HttpStatus.OK, message, data);
    }
}
