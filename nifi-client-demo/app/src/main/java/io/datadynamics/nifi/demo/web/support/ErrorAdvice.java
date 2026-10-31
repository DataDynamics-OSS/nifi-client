package io.datadynamics.nifi.demo.web.support;

import io.datadynamics.nifi.client.v2.ApiException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * {@code SdkCalls.run} 밖에서 난 클라이언트 예외와 잘못된 입력을 오류 화면으로 보여 줍니다.
 * <p>
 * 응답 상태는 {@link IllegalArgumentException}이면 400, NiFi가 404를 돌려줬으면 404,
 * 그 밖의 {@link ApiException}은 NiFi 쪽 문제이므로 502(Bad Gateway)입니다.
 */
@ControllerAdvice
class ErrorAdvice {

    @ExceptionHandler({ApiException.class, IllegalArgumentException.class})
    ModelAndView failure(Exception e) {
        ModelAndView view = new ModelAndView("failure");
        view.addObject("failure", Failure.of(e));
        view.setStatus(e instanceof IllegalArgumentException ? HttpStatus.BAD_REQUEST
                : e instanceof ApiException a && a.getCode() == 404 ? HttpStatus.NOT_FOUND : HttpStatus.BAD_GATEWAY);
        return view;
    }
}
