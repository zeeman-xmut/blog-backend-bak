package cn.edu.xmut.blog.entity;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author Zeeman Zhang
 */
@Data
public abstract class BaseDTO implements Serializable {

    @Serial private static final long serialVersionUID = 1L;

    private Long id;
}
