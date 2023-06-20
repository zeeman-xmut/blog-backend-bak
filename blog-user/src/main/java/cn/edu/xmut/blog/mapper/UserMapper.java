package cn.edu.xmut.blog.mapper;

import cn.edu.xmut.blog.domain.UserDO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Zeeman Zhang
 */
@Mapper
public interface UserMapper extends BaseMapper<UserDO> {}
