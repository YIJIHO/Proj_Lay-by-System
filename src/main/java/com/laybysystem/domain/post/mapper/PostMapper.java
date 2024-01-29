package com.laybysystem.domain.post.mapper;

import com.laybysystem.domain.post.dto.PostDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PostMapper {
    int insertPost(PostDTO post);
    PostDTO selectPostByPostDTO(int postSeq);
    int updatePost(PostDTO post);
    int deletePost(PostDTO post);
}
