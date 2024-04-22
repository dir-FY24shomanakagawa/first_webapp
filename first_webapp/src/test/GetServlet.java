package test;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

/**
 * Servlet implementation class GetServlet
 */
@WebServlet("/GetServlet")
public class GetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    request.setCharacterEncoding("UTF-8");//文字化けを防止するため

	    String q = request.getParameter("q");//引数にはパラメーターの名前（変数名）を文字列として指定
	    
	    //request.getParameter() で取得した値はすべてString型のデータとなる点に注意してください。
	    //値を数値として扱いたい場合は、いったんStringとして受け取ったあと、数値への変換処理が必要です。
	    //今回は、そのままStringとして扱いますので変換処理は不要
	    
	    
	    request.setAttribute("q", q);//以下の記述が、ビューにデータを渡す方法

	    RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/get_result.jsp");
	    rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
