package com.mysite.sbb_prac1.question;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class QuestionController {

    private final QuestionService questionService;
    // private final QuestionRepository questionRepository; 이 값이 Service로 옮겨짐
    // 사라진 이유 : 리포지터리에 직접접근을 못하게 막기 위함
    @GetMapping("/question/list")
    public String list(Model model){
        List<Question> questionList = questionService.getList();
        model.addAttribute("questionList", questionList);
        return "question_list";
    }




}
