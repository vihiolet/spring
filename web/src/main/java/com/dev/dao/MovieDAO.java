package com.dev.dao;
import java.util.List;

import com.dev.vo.MovieVO;
 
public interface MovieDAO {
    public List<MovieVO> selectMovie() throws Exception;
}