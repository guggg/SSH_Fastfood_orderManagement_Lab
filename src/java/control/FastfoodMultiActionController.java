package control;

import dao.FastfoodDAO;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
import po.Fastfood;


public class FastfoodMultiActionController extends MultiActionController{
    
    private FastfoodDAO fastfoodDAO;
    
    public void setFastfoodDAO(FastfoodDAO fastfoodDAO) {
        this.fastfoodDAO = fastfoodDAO;
    }
    
    
    // create() 建立 Food 資料...
    public ModelAndView create(HttpServletRequest req, 
                                      HttpServletResponse resp) throws Exception {
        // 取得參數
        String name = req.getParameter("name");
        String price = req.getParameter("price");
        String amount = req.getParameter("amount");
        // 建立 Food 物件實體
        Fastfood fastFood = new Fastfood();
        fastFood.setName(name);
        fastFood.setPrice(Integer.parseInt(price));
        fastFood.setAmount(Integer.parseInt(amount));
        // 新增 Food 至資料庫
        fastFood = fastfoodDAO.create(fastFood);
        // 注入 food 物件並分派至 firstfood.jsp
        return new ModelAndView("fastfood", "msg", fastFood);
    }
    
    // query() 查詢所有 Food 資料...
    public ModelAndView query(HttpServletRequest req, 
                                      HttpServletResponse resp) throws Exception {
        // 查詢 Food 所有資料
        List<Fastfood> list = fastfoodDAO.query();
        // 注入 list 物件分派至 firstfood.jsp
        return new ModelAndView("fastfood", "msg", list);
    }
    
    public ModelAndView get(HttpServletRequest req, 
                                      HttpServletResponse resp) throws Exception {
        String id = req.getParameter("id");
        Fastfood fastfood = fastfoodDAO.get(Integer.parseInt(id));
        return new ModelAndView("fastfood", "msg", fastfood);
    }
    
    
    
    public ModelAndView update(HttpServletRequest req, 
                                      HttpServletResponse resp) throws Exception {
    
        return new ModelAndView("fastfood", "msg", "update()");
    }
    
    public ModelAndView delete(HttpServletRequest req, 
                                      HttpServletResponse resp) throws Exception {
    
        return new ModelAndView("fastfood", "msg", "delete()");
    }
}
