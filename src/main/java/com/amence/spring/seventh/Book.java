package com.amence.spring.seventh;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by Amence on 2016/12/23.
 */

@Component("book")
@Scope("prototype")
public class Book {

}
