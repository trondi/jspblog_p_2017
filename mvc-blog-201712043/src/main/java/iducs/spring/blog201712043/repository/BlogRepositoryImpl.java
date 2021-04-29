package iducs.spring.blog201712043.repository;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import iducs.spring.blog201712043.domain.Blog;

@Repository
public class BlogRepositoryImpl implements BlogRepository {

	private SqlSession sqlSession;
	public BlogRepositoryImpl(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	private static String namespace = "iducs.spring.mvcblog.mapper.BlogMapper";	

	@Override
	public int create(Blog blog) {
		// TODO Auto-generated method stub
		int count = 0; 
		count = sqlSession.insert(namespace + ".create", blog);		
		return count;

	}

	@Override
	public Blog read(Blog blog) {
		return sqlSession.selectOne(namespace + ".read", blog.getId());
		
	}

	@Override
	public List<Blog> readList() {		
        return sqlSession.selectList(namespace + ".readList");
	}

	@Override
	public int update(Blog blog) {
		int count = 0;
		count = sqlSession.insert(namespace + ".update", blog);			
		return count;
	}

	@Override
	public int delete(Blog blog) {
		int count = 0;
		count = sqlSession.insert(namespace + ".delete", blog.getId());	
		return count;
	}

}
