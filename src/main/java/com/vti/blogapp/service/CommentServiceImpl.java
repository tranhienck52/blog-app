package com.vti.blogapp.service;

import com.vti.blogapp.dto.CommentDto;
import com.vti.blogapp.form.CommentCreateForm;
import com.vti.blogapp.form.CommentUpdateForm;
import com.vti.blogapp.mapper.CommentMapper;
import com.vti.blogapp.repository.CommentRepository;
import com.vti.blogapp.repository.PostRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.Setter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CommentServiceImpl implements CommentService{
    private final CommentRepository commentRepository;
    private final PostRepository postRepository;

    @Override
    public Page<CommentDto> findAll(Pageable pageable) {
        return commentRepository.findAll(pageable)
                .map(CommentMapper::map);
    }

    @Override
    public Page<CommentDto> findByPostId(Long postId, Pageable pageable) {
        return commentRepository.findByPostId(postId,pageable)
                .map(CommentMapper::map);
    }

    @Override
    public CommentDto create(CommentCreateForm form, Long postId) {
        var comment = CommentMapper.map(form);
        var post = postRepository.findById(postId).get();
        comment.setPost(post);
        var saveComment = commentRepository.save(comment);
        return CommentMapper.map(saveComment);
    }

    @Override
    public CommentDto update(CommentUpdateForm form, Long id) {
        var comment = commentRepository.findById(id).get();
        CommentMapper.map(form, comment);
        var savedComment = commentRepository.save(comment);
        return CommentMapper.map(savedComment);
    }

    @Override
    public void deleteById(Long id) {
        commentRepository.deleteById(id);
    }

    @Override
    @Transactional
    public void deleteByEmail(String email) {
        commentRepository.deleteByEmail(email);
    }

}
