package com.dev.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.dev.vo.MovieVO;
 
@Service
public interface MovieService {
    public List<MovieVO> selectMovie() throws Exception;
}