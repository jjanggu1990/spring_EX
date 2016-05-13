package madvirus.spring.chap01;

public class WriteArticleServiceImpl implements WriteArticleService {

    private ArticleDao articleDao;
    Article article;
    int i;
    public void setI(int i) {
		this.i = i;
	}
	public WriteArticleServiceImpl(){
    	
    }
    public WriteArticleServiceImpl(ArticleDao articleDao) {
        this.articleDao = articleDao;
    }

    public void write(Article article) {
        System.out.println("WriteArticleServiceImpl.write() 메서드 실행");
        articleDao.insert(article);
    }
    
    public void setArticleDao(ArticleDao articleDao){
    	this.articleDao=articleDao;
    }
}