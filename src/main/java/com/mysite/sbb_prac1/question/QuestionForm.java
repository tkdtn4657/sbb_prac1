package com.mysite.sbb_prac1.question;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QuestionForm {
    @NotBlank(message = "제목은 필수항목입니다.")
    @Size(max=200)
    private String subject;

    @NotBlank(message = "내용은 필수항목입니다.")
    private String content;
}